@extends('layouts.main_layout')

@section('content')

<main>
    <section class="form-message">
    <div class="message">
        <h1>BRP - Jornadas da Juventude Formação Profissional</h1>
        <p class="text-center">Entra em contacto connosco aqui.</p>
        <form>
        <div class="form-image">
            <img src="{{ asset('images/message.gif') }}" alt="icon">
        </div>
        <input type="text" placeholder="Nome" required>
        <input type="text" placeholder="Email" required>
        <input type="text" placeholder="Assunto" required>
        <textarea placeholder="Mensagem" required></textarea>
        <div class="center">
            <button class=button-link>Enviar</button>
        </div>
        </form>
    </div>
    </section>
</main>

@endsection