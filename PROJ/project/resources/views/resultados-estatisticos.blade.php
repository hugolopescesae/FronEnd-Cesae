@extends('layouts.main_layout')

@section('content')

<main class="resultados-estatisticos">
    <div class="container">
        <h1>Resultados Estatísticos</h1>
        <p>A seguir tem os resultados estatísticos dos estudantes do 9º ano que realizaram o teste vocacional. Pode consultar os resultados estatísticos por área de estudo, género e localização (distrito, concelho ou freguesia)</p>

        <div class="resultados">
            <div class="row">
                <div class="col-xxl-3 col-xl-6 col-md-6 card_resultados_box">
                    <div class="card_resultados_tv">
                        <p class="card_resultados_tv_titulo">Agricultura <br> 64%</p>
                        <div class="card_resultados_tv_content">
                            <p class="card_resultados_tv_generoM">M <br> 20%</p>
                            <p class="card_resultados_tv_generoF">F <br> 80%</p> 
                        </div>
                    </div>
                </div>
                <div class="col-xxl-3 col-xl-6 col-md-6 card_resultados_box">
                    <div class="card_resultados_tv">
                        <p class="card_resultados_tv_titulo">Artes e Humanidades <br> 58%</p>
                        <div class="card_resultados_tv_content">
                            <p class="card_resultados_tv_generoM">M <br> 65%</p>
                            <p class="card_resultados_tv_generoF">F <br> 35%</p> 
                        </div>
                    </div>
                </div>
                <div class="col-xxl-3 col-xl-6 col-md-6 card_resultados_box">
                    <div class="card_resultados_tv">
                        <p class="card_resultados_tv_titulo">Ciências <br> 56%</p>
                        <div class="card_resultados_tv_content">
                            <p class="card_resultados_tv_generoM">M <br> 55%</p>
                            <p class="card_resultados_tv_generoF">F <br> 45%</p> 
                        </div>
                    </div>
                </div>
                <div class="col-xxl-3 col-xl-6 col-md-6 card_resultados_box">
                    <div class="card_resultados_tv">
                        <p class="card_resultados_tv_titulo">Ciências Sociais, Comércio e Direito <br> 43%</p>
                        <div class="card_resultados_tv_content">
                            <p class="card_resultados_tv_generoM">M <br> 74%</p>
                            <p class="card_resultados_tv_generoF">F <br> 26%</p> 
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xxl-3 col-xl-6 col-md-6 card_resultados_box">
                    <div class="card_resultados_tv">
                        <p class="card_resultados_tv_titulo">Educação <br> 38%</p>
                        <div class="card_resultados_tv_content">
                            <p class="card_resultados_tv_generoM">M <br> 38%</p>
                            <p class="card_resultados_tv_generoF">F <br> 62%</p> 
                        </div>
                    </div>
                </div>
                <div class="col-xxl-3 col-xl-6 col-md-6 card_resultados_box">
                    <div class="card_resultados_tv">
                        <p class="card_resultados_tv_titulo">Engenharias, Indústria e Construção <br> 33%</p>
                        <div class="card_resultados_tv_content">
                            <p class="card_resultados_tv_generoM">M <br> 70%</p>
                            <p class="card_resultados_tv_generoF">F <br> 30%</p> 
                        </div>
                    </div>
                </div>
                <div class="col-xxl-3 col-xl-6 col-md-6 card_resultados_box">
                    <div class="card_resultados_tv">
                        <p class="card_resultados_tv_titulo">Saúde e Proteção Social <br> 30%</p>
                        <div class="card_resultados_tv_content">
                            <p class="card_resultados_tv_generoM">M <br> 28%</p>
                            <p class="card_resultados_tv_generoF">F <br> 72%</p> 
                        </div>
                    </div>
                </div>
                <div class="col-xxl-3 col-xl-6 col-md-6 card_resultados_box">
                    <div class="card_resultados_tv">
                        <p class="card_resultados_tv_titulo">Serviços <br> 23%</p>
                        <div class="card_resultados_tv_content">
                            <p class="card_resultados_tv_generoM">M <br> 25%</p>
                            <p class="card_resultados_tv_generoF">F <br> 75%</p> 
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>



    <section class="container">
                <div id="filtros-container">
            <div class="filtro-section">
                <label for="categoria" class="filter-label">Filtrar por Categoria:</label>
                <select id="categoriaSelect">
                    <option value="Todas">Todas as Categorias</option>
                    <option value="Agricultura">Agricultura</option>
                    <option value="Artes e Humanidades">Artes e Humanidades</option>
                    <option value="Ciências">Ciências</option>
                    <option value="Ciências Sociais, Comércio e Direito">Ciências Sociais, Comércio e Direito</option>
                    <option value="Educação">Educação</option>
                    <option value="Engenharia, Indústria e Construção">Engenharia, Indústria e Construção</option>
                    <option value="Saúde e Proteção Social">Saúde e Proteção Social</option>
                    <option value="Serviços">Serviços</option>
                </select>
            </div>

            <div class="filtro-section">
                <label for="concelho" class="filter-label">Filtrar por Distrito:</label>
                <select id="concelhoSelect">
                    <option value="Todos">Todos os Distritos</option>
                    <option value="Braga">Braga</option>
                    <option value="Porto">Porto</option>
                    <option value="Lisboa">Lisboa</option>
                </select>
            </div>

            <div class="filtro-section">
                <label for="genero" class="filter-label">Filtrar por Género:</label>
                <select id="generoSelect">
                    <option value="Todos">Todos os Géneros</option>
                    <option value="Masculino">Masculino</option>
                    <option value="Feminino">Feminino</option>
                </select>
            </div>
        </div>
    </section>
    <section class="container">
        <div class="results">
            <h1>Resultados de Pesquisa</h1>
            <table id="resultados">
                <tr>
                    <th>Categoria</th>
                    <th>Concelho</th>
                    <th>Género</th>
                    <th>Percentagem Total</th>
                    <th>Género Masculino</th>
                    <th>Género Feminino</th>
                </tr>
            </table>
        </div>
    </section>
</main>


@endsection