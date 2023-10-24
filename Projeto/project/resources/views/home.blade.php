@extends('layouts.main_layout')

@section('content')

<main>

    <x-home.banner/>

    @if (!session()->has('email'))
    <section>
        <div class="container">
            <x-home.registration-cards/>
        </div>
    @else
    <section>
        <div class="container">
            <h1>Bem-vind@ à Plataforma BRP - Jornadas da Juventude do Ensino Profissional</h1>
            <p class="text-center"></p>
            <img class="w-50 m-auto d-block" src="{{ asset('images/home-image.png') }}" alt="icon">
        </div>
    </section>
    @endif

    </section>
</main>


@endsection