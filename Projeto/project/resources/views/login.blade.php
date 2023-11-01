
@extends('layouts.main_layout')

@section('content')

<div class="container container-form">
    <div class="formulario">
        <div class="row">
            <div class="col-lg-7 form">
                <form action="{{ route('login_submit') }}" method="POST" class="form-login">
                    @csrf
                    <h2>Login</h2>
                    <div class="row form-group">
                            <div class="form-group">
                                <label for="email">Email</label>
                                <input type="text" class="form-control" id="email" name="email" placeholder="Email" value="{{ old('email') }}">
                                @error('email')
                                    {{-- Apanhar o 1º erro, para isso pomos [0] --}}
                                    <div class="text-danger">{{ $errors->get('email')[0] }}</div>
                                @enderror
                            </div>
                            <div class="form-group">
                                <label for="password">Password</label>
                                <input type="password" class="form-control" id="password" name="password" placeholder="Password" value="{{ old('password') }}">
                                @error('password')
                                {{-- Apanhar o 1º erro, para isso pomos [0] --}}
                                    <div class="text-danger">{{ $errors->get('password')[0]}}</div>
                                @enderror
                            </div>
                    </div>
                    <div class="form-recup-pw">
                        <a href="{{ route('recuperar-password') }}"><p>Recuperar palavra-passe<p></a>
                    </div>
                    <button class="button-link form-margin">Entrar</button>
                    @if(session()->has('login_error'))
                    <div class="text-danger text-center p-3">
                        {{ session()->get('login_error') }}
                    </div>
                    @endif
                </form>
            </div>
            <div class="col-lg-5 section">
                <h3>Ainda não tem registo?</h3>
                <a class="button-link" href="{{ route('registo-estudante') }}">Faça o registo</a>
            </div>

        </div>
    </div>
</div>



 
@endsection