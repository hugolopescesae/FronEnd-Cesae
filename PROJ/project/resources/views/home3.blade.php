@extends('layouts.main_layout')

@section('content')

    <section class="test">
        <a href="{{ route('teste-vocacional') }}" class="btn-link btn-large btn-radius">Teste Vocacional</a>
        <p>Estás no 9º ano e não sabes o que queres seguir ou não tens a certeza?
            Temos um teste vocacional elaborado por uma equipa de psicólogos da CUF para te ajudar a decidir.
        </p>
    </section>
    
    <section>
        <div class="row cards">
            @foreach ($cards as $card)
                <x-card 
                    route="{{ $card['route'] }}"
                    image="{{ $card['image'] }}"
                    title="{{ $card['title'] }}"
                    description="{{ $card['description'] }}"
                    btnText="{{ $card['btnText'] }}"
                />
            @endforeach
        </div>
    </section>


    
        
@endsection