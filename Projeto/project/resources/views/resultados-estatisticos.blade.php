@extends('layouts.main_layout')

@section('content')

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultados Estatísticos</title>
</head>
<body>
<main class="resultados-estatisticos">
    <section class="container">
        <h1>Resultados Estatísticos</h1>

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

<script>
    const categoriaSelect = document.getElementById("categoriaSelect");
    const concelhoSelect = document.getElementById("concelhoSelect");
    const generoSelect = document.getElementById("generoSelect");
    const resultadosTable = document.getElementById("resultados");


    // Dados da primeira linha
    const headerRow = resultadosTable.insertRow();
    const headers = ["Área de Estudo", "Distrito", "Género", "Percentagens", "", ""];
    headers.forEach(headerText => {
        const th = document.createElement("th");
        th.textContent = headerText;
        headerRow.appendChild(th);
    });

    const dadosExemplo = [
    { Categoria: "Agricultura", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "15%", GeneroMasculino: "32%", GeneroFeminino: "68%" },
    { Categoria: "Agricultura", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "15%", GeneroMasculino: " 68%", GeneroFeminino: "32%" },
    { Categoria: "Agricultura", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "15%", GeneroMasculino: "49%", GeneroFeminino: "51%" },
    { Categoria: "Agricultura", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "15%", GeneroMasculino: "40%", GeneroFeminino: "60%" },
    { Categoria: "Agricultura", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "15%", GeneroMasculino: "65%", GeneroFeminino: "35%" },
    { Categoria: "Agricultura", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "15%", GeneroMasculino: "30%", GeneroFeminino: "70%" },
    { Categoria: "Artes e Humanidades", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "10%", GeneroMasculino: "70%", GeneroFeminino: "30%" },
    { Categoria: "Artes e Humanidades", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "10%", GeneroMasculino: "35%", GeneroFeminino: "65%" },
    { Categoria: "Artes e Humanidades", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "10%", GeneroMasculino: "51%", GeneroFeminino: "49%" },
    { Categoria: "Artes e Humanidades", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "10%", GeneroMasculino: "45%", GeneroFeminino: "55%" },
    { Categoria: "Artes e Humanidades", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "10%", GeneroMasculino: "25%", GeneroFeminino: "75%" },
    { Categoria: "Artes e Humanidades", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "10%", GeneroMasculino: "15%", GeneroFeminino: "85%" },
    { Categoria: "Ciências", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "12%", GeneroMasculino: "55%", GeneroFeminino: "45%" },
    { Categoria: "Ciências", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "12%", GeneroMasculino: "35%", GeneroFeminino: "65%" },
    { Categoria: "Ciências", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "12%", GeneroMasculino: "68%", GeneroFeminino: "32%" },
    { Categoria: "Ciências", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "12%", GeneroMasculino: "32%", GeneroFeminino: "68%" },
    { Categoria: "Ciências", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "12%", GeneroMasculino: "47%", GeneroFeminino: "53%" },
    { Categoria: "Ciências", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "12%", GeneroMasculino: "42%", GeneroFeminino: "58%" },
    { Categoria: "Ciências Sociais, Comércio e Direito", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "8%", GeneroMasculino: "56%", GeneroFeminino: "44%" },
    { Categoria: "Ciências Sociais, Comércio e Direito", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "8%", GeneroMasculino: "31%", GeneroFeminino: "69%" },
    { Categoria: "Ciências Sociais, Comércio e Direito", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "8%", GeneroMasculino: "27%", GeneroFeminino: "73%" },
    { Categoria: "Ciências Sociais, Comércio e Direito", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "8%", GeneroMasculino: "58%", GeneroFeminino: "42%" },
    { Categoria: "Ciências Sociais, Comércio e Direito", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "8%", GeneroMasculino: "41%", GeneroFeminino: "59%" },
    { Categoria: "Ciências Sociais, Comércio e Direito", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "8%", GeneroMasculino: "63%", GeneroFeminino: "37%" },
    { Categoria: "Educação", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "14%", GeneroMasculino: "30%", GeneroFeminino: "70%" },
    { Categoria: "Educação", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "14%", GeneroMasculino: "70%", GeneroFeminino: "30%" },
    { Categoria: "Educação", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "14%", GeneroMasculino: "63%", GeneroFeminino: "37%" },
    { Categoria: "Educação", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "14%", GeneroMasculino: "25%", GeneroFeminino: "75%" },
    { Categoria: "Educação", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "14%", GeneroMasculino: "36%", GeneroFeminino: "64%" },
    { Categoria: "Educação", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "14%", GeneroMasculino: "30%", GeneroFeminino: "70%" },
    { Categoria: "Engenharia, Indústria e Construção", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "9%", GeneroMasculino: "50%", GeneroFeminino: "50%" },
    { Categoria: "Engenharia, Indústria e Construção", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "9%", GeneroMasculino: "49%", GeneroFeminino: "51%" },
    { Categoria: "Engenharia, Indústria e Construção", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "9%", GeneroMasculino: "26%", GeneroFeminino: "74%" },
    { Categoria: "Engenharia, Indústria e Construção", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "9%", GeneroMasculino: "53%", GeneroFeminino: "47%" },
    { Categoria: "Engenharia, Indústria e Construção", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "9%", GeneroMasculino: "21%", GeneroFeminino: "79%" },
    { Categoria: "Engenharia, Indústria e Construção", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "9%", GeneroMasculino: "48%", GeneroFeminino: "52%" },
    { Categoria: "Saúde e Proteção Social", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "16%", GeneroMasculino: "27%", GeneroFeminino: "73%" },
    { Categoria: "Saúde e Proteção Social", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "16%", GeneroMasculino: "25%", GeneroFeminino: "75%" },
    { Categoria: "Saúde e Proteção Social", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "16%", GeneroMasculino: "75%", GeneroFeminino: "25%" },
    { Categoria: "Saúde e Proteção Social", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "16%", GeneroMasculino: "43%", GeneroFeminino: "57%" },
    { Categoria: "Saúde e Proteção Social", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "16%", GeneroMasculino: "21%", GeneroFeminino: "79%" },
    { Categoria: "Saúde e Proteção Social", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "16%", GeneroMasculino: "55%", GeneroFeminino: "45%" },
    { Categoria: "Serviços", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "16%", GeneroMasculino: "60%", GeneroFeminino: "40%" },
    { Categoria: "Serviços", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "16%", GeneroMasculino: "40%", GeneroFeminino: "60%" },
    { Categoria: "Serviços", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "16%", GeneroMasculino: "46%", GeneroFeminino: "54%" },
    { Categoria: "Serviços", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "16%", GeneroMasculino: "78%", GeneroFeminino: "22%" },
    { Categoria: "Serviços", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "16%", GeneroMasculino: "24%", GeneroFeminino: "76%" },
    { Categoria: "Serviços", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "16%", GeneroMasculino: "40%", GeneroFeminino: "60%" }
        // ... outros dados ...
    ];

    function atualizarResultados() {
        const categoriaSelecionada = categoriaSelect.value;
        const concelhoSelecionado = concelhoSelect.value;
        const generoSelecionado = generoSelect.value;

        const resultadosFiltrados = dadosExemplo.filter(item =>
            (categoriaSelecionada === "Todas" || item.Categoria === categoriaSelecionada) &&
            (concelhoSelecionado === "Todos" || item.Concelho === concelhoSelecionado) &&
            (generoSelecionado === "Todos" || item.Genero === generoSelecionado)
        );

        resultadosTable.innerHTML = "";

        resultadosFiltrados.forEach(item => {
            const row = resultadosTable.insertRow();
            const cellCategoria = row.insertCell(0);
            const cellConcelho = row.insertCell(1);
            const cellGenero = row.insertCell(2);
            const cellPercentagemTotal = row.insertCell(3);
            const cellGeneroMasculino = row.insertCell(4);
            const cellGeneroFeminino = row.insertCell(5);

            cellCategoria.textContent = item.Categoria;
            cellConcelho.textContent = item.Concelho;
            cellGenero.textContent = item.Genero;
            cellPercentagemTotal.textContent = item.PercentagemTotal;
            cellGeneroMasculino.textContent = item.GeneroMasculino;
            cellGeneroFeminino.textContent = item.GeneroFeminino;
        });
    }

    categoriaSelect.addEventListener("change", atualizarResultados);
    concelhoSelect.addEventListener("change", atualizarResultados);
    generoSelect.addEventListener("change", atualizarResultados);

    atualizarResultados();

</script>
</body>
</html>
@endsection