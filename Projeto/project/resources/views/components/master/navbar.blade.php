<nav class="navbar sticky-top navbar-expand-lg">
    <div class="container-fluid">
      <div class="links-registration-992">
        <button class="btn-link btn-user" type="submit">
            <i class="fas fa-user"></i>
        </button>
        <button class="btn-link btn-user" type="submit">
            <i class="fas fa-sign-in-alt"></i>
        </button>
      </div>
        <a class="navbar-brand" href="{{ route('home') }}">
            <img src="{{ asset('images/logo.png') }}" alt="Logo" class="d-inline-block align-text-top">
        </a>
        <button class="navbar-toggler order-first" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
            <i class="fas fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0" id="navbarLinks">
                <li class="nav-item">
                    <a class="navlink link-active" aria-current="page" href="{{ route('home') }}">Home <i
                            class="fas fa-home"></i></a>
                </li>
                <li class="nav-item">
                    <a class="navlink" href="{{ route('sobre-nos') }}">Sobre nós</a>
                </li>
                @if (session()->has('email'))
                <li class="nav-item">
                    <a class="navlink" href="{{ route('teste-vocacional-intro') }}">Teste vocacional</a>
                </li>
                @endif
                <li class="nav-item">
                    <a class="navlink" href="{{ route('contactos') }}">Contactos</a>
                </li>
            </ul>
          </div>
        </div>
    </div>
    <div class="links-registration">
        @if (!session()->has('email'))
            <a class="btn-link btn-user" href="{{ route('login') }}">
                <i class="fas fa-user"><span class="mx-1">Login</span></i>
            </a>
            <a class="btn-link btn-user" href="{{ route('registo-estudante') }}">
                <i class="fas fa-sign-in-alt"><span class="mx-1">Registar</span></i>
            </a>
        @else
            <a class="btn-link btn-user" href="{{ route('login') }}">
                <i class="fas fa-user"><span class="mx-1">{{ session()->get('primeiroNome') }}</span></i>
            </a>
            <a class="btn-link btn-user" href="{{ route('logout') }}">
                <i class="fa-solid fa-right-from-bracket"><span class="mx-1">Logout</span></i>
            </a>
         @endif
        
    </div>
</nav>