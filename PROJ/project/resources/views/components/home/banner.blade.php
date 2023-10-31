<section class="banner">
    <h1>
        Aqui podes </span class="other-color">decidir o teu futuro.</span>
    </h1>

    <h2>Temos um teste vocacional para te ajudar a escolher o teu percurso formativo.</h2>

    @if (!session()->has('email'))
    <a href="{{ route('login') }}" class="button-link">Faz login para aceder ao teste</a>
    @else
    <a href="{{ route('teste-vocacional-intro') }}" class="button-link">Aceder ao teste vocacional</a>
    @endif
</section>