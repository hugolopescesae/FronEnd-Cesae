@extends('layouts.main_layout')

@section('content')

<main>
    <x-home.banner/>

    <div class="container">
        {{-- Se user não estiver logado --}}
        @if (!session()->has('email'))
            <x-home.registration-cards/>

        {{-- Se user estiver logado --}}
        @else
            <x-home.welcome-message/>
        @endif
    </div>
</main>


@endsection