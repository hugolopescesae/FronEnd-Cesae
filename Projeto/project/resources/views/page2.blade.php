@extends('layouts.master')

@section('content')

<h1>I'm a page with a link to Home Page Using Route Name</h1>

<a href="{{ route('home') }}">Home</a>


@php
    $hello = 'Hello World';
@endphp

<h1>{{ $hello }}</h1>


<h2>{{ $myVar }}</h2>
<h2>Informação a colocar nos contactos</h2>
<ul>
    <li>{{ $contactInfo['name'] }}</li>
    <li>{{ $contactInfo['phone'] }}</li>
</ul>



<h2>With if and else</h2>
@if (count($contacts)==0)
    <p>No contacts found!</p>
@else
    @foreach ($contacts as $item)
    <table>
        <tr>
            <td>{{ $item['id'] }} |</td>
            <td>{{ $contactInfo['name'] }} - {{ $item['name'] }} | </td>
            <td>{{ $contactInfo['phone'] }} - {{ $item['phone'] }} </td>
        </tr>
    </table>
    @endforeach
@endif


<!--Ou: -->
<h2>With unless and else</h2>
@unless(count($contacts)==0)
    @foreach ($contacts as $item)
    <table>
        <tr>
            <td>{{ $item['id'] }} |</td>
            <td>{{ $contactInfo['name'] }} - {{ $item['name'] }} | </td>
            <td>{{ $contactInfo['phone'] }} - {{ $item['phone'] }} </td>
        </tr>
    </table>
    @endforeach

    @else
    <p>No contacts found</p>
@endunless

@endsection