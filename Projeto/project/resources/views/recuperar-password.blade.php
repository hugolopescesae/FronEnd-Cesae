
@extends('layouts.main_layout')

@section('content')

<div class="container container-form">
    <div class="formulario">
        <div class="row">
            <div class="col-lg-7 form">
                <form action="" class="form-login">
                    <h2>Recuperar palavra-passe</h2>
                    <div class="row form-group">
                            <div class="form-group">
                                <label for="email">Email</label>
                                <input type="text" class="form-control" id="email" name="primeiroNome" placeholder="Email" required>
                            </div>
                    </div>
                    <div class="form-recup-pw">
                        <a href=""><p>Recuperar palavra-passe<p></a>
                    </div>
                    <button class="button-link form-margin">Recuperar password</button>
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