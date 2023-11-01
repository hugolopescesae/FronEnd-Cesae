<?php

namespace App\Http\Controllers;

use Illuminate\Support\Facades\DB;
use Illuminate\Http\Request;

class VocationalTestController extends Controller
{

    public function vocacionaltestIntro() {
        $data = [
            'title' => 'Teste Vocacional - Introdução'
        ];

        return view('teste-vocacional-intro', $data);
    }


    public function vocationaltest()
    {

        $data = [
            'title' => 'Teste vocacional'
        ];

        $perguntas = DB::table('pergunta')
            ->select('pergunta.id', 'pergunta.questao')
            ->inRandomOrder() // Perguntas aparecem de forma aleatória
            ->get();

        return view('teste-vocacional', compact('perguntas'), $data);
    }


    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        //
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        //
    }

    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(string $id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
    }
}
