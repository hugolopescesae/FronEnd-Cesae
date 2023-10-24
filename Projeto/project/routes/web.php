<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\UserController;
use App\Http\Controllers\VocationalTestController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/



Route::fallback(function () {
    $data = [
        'title' => 'Página não encontrada'
    ];

    return view('fallback', $data);
});

Route::get('/', [UserController::class, 'home'])->name('home');

Route::get('/page2', [UserController::class, 'page2'])->name('page2');

Route::get('/sobre-nos', [UserController::class, 'sobreNos'])->name('sobre-nos');

Route::get('/contactos', [UserController::class, 'contactos'])->name('contactos');



Route::get('/ex', [UserController::class, 'ex'])->name('ex');

Route::get('/search', function (Request $request) {
    /* dd($request); */
    return $request->name . ' ' .$request->city;
});


// Route with Middleware
// Routes in app
Route::middleware('CheckLogin')->group(function() {
    Route::get('/teste-vocacional-intro', [UserController::class, 'vocacionaltestIntro'])->name('teste-vocacional-intro');
    Route::get('/teste-vocacional', [VocationalTestController::class, 'vocationaltest'])->name('teste-vocacional');
    Route::get('/teste-vocacional-resultados', [UserController::class, 'testeVocacionalResultados'])->name('teste-vocacional-resultados'); 
    Route::get('/logout', [UserController::class, 'logout'])->name('logout');
    Route::get('/resultados-estatisticos', [UserController::class, 'resultadosInstituicao'])->name('resultados-instituicao');

});

// Routes out app
Route::middleware('CheckLogout')->group(function() {
    Route::get('/registo-estudante', [UserController::class, 'registrationStudent'])->name('registo-estudante');
    Route::get('/registo-instituicao', [UserController::class, 'registrationCompany'])->name('registo-instituicao');
    Route::get('/login', [UserController::class, 'login'])->name('login');
    Route::post('/login_submit', [UserController::class, 'login_submit'])->name('login_submit');
});