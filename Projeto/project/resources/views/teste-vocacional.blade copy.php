@php
    $numPergunta = 1;
@endphp

@extends('layouts.main_layout')

@section('content')

    <section class="teste-vocacional">

        <div class="progress-bar">
            <div class="progress"></div>
        </div>        

        <form id="form-teste">
            {{-- Chamar as perguntas do teste vocacional --}}
            @foreach ($perguntas as $index => $pergunta)
                <div class="form-section">
                    <div class="pergunta" data-pergunta-id="{{ $pergunta->id }}" data-step="{{ $index }}">
                        <div class="questao">
                            <p>{{ $numPergunta++ }} - {{ $pergunta->questao }}</p>
                        </div>
                        <div class="pergunta-base">
                            <p>Concordas com esta afirmação?</p>
                        </div>
                        <div class="resposta">
                            <label class="resposta-label">
                                <input type="radio" name="resposta_{{ $pergunta->id }}" value="sim">
                                <span class="resposta-text">Sim</span>
                            </label>
                            <label class="resposta-label">
                                <input type="radio" name="resposta_{{ $pergunta->id }}" value="nao">
                                <span class="resposta-text">Não</span>
                            </label>
                        </div>
                        <div class="btns-form">
                            {{-- Se for a primeira pergunta botão anterior não vai existir --}}
                            @if ($index === 0)
                            <button class="previous"></button>
                            {{-- Se não for a primeira pergunta botão anterior vai existir --}}
                            @else
                            <button class="pushable previous">
                                <span class="shadow"></span>
                                <span class="edge"></span>
                                <span class="front2">
                                  Anterior
                                </span>
                              </button>
                            @endif

                            {{-- Se for última pergunta tem um botão de submeter --}}
                            @if ($index === count($perguntas)-1)
                            <button class="pushable submit">
                                <span class="shadow"></span>
                                <span class="edge"></span>
                                <span class="front2">
                                  Submeter
                                </span>
                              </button>
                            {{-- Se não for a última pergunta tem um botão seguinte --}}
                            @else
                            <button class="pushable next">
                                <span class="shadow"></span>
                                <span class="edge"></span>
                                <span class="front2">
                                  Seguinte
                                </span>
                              </button>
                            @endif
                        </div>
                    </div>
                </div>
                @endforeach
        </form>
    </section>
    
@endsection




{{-- @php
    $numPergunta = 1;
@endphp

@extends('layouts.master')

@section('content')

    <section>
        <h1>Teste Vocacional</h1>

        <form id="form-teste">
            @foreach ($perguntas as $index => $pergunta)
                <div class="form-section">
                    <div class="pergunta" data-pergunta-id="{{ $pergunta->id }}" data-step="{{ $index }}">
                        <div class="questao">
                            <p>{{ $numPergunta++ }} - {{ $pergunta->questao }}</p>
                        </div>
                        <div class="resposta">
                            <label class="resposta-sim">
                                <input type="radio" name="resposta_{{ $pergunta->id }}" value="sim"> Sim
                            </label class="resposta-nao">
                            <label>
                                <input type="radio" name="resposta_{{ $pergunta->id }}" value="nao"> Não
                            </label>
                        </div>
                        <div class="btns-form">
                            <button class="btn-link previous">Anterior</button>
                            @if ($index === count($perguntas)-1)
                                <button class="btn-link submit">Submeter</button>

                            @else
                                <button class="btn-link next">Seguinte</button>
                            @endif
                        </div>
                    </div>
                </div>
                @endforeach
        </form>
    </section>
    
@endsection
 --}}