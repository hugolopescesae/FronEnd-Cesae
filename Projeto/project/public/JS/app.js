const formTest = document.querySelector('#form-teste');
/* const formRegistration = document.querySelector('#form-registration-student');
const formLogin = document.querySelector('#form-login'); */

if (formTest !== null) {
    formTest.addEventListener('submit', function (e) {
        e.preventDefault()
    });
}



/* const forms = document.querySelectorAll('form');

// Prevent default in all forms
forms.forEach((form) => {
    form.addEventListener('submit', function(e) {
        e.preventDefault()
    });
});
 */
/* // Success message in registration user
formRegistration.addEventListener('submit', function(e) {
    displaySuccessMessage();
});

// Function to create a success message
function displaySuccessMessage() {
    formRegistration.innerHTML = `
    <div class="success-message">
        <p>Registo efectuado com sucesso! <i class="fa-solid fa-check" style="color: #009903;"></i>
        <br><br>
        <a href="{{ route('login') }}"<button class="btn-link">Login</button></a>
    </div>`;
}
 */



// Evento com função que só ocorre quando a página estiver totalmente carregada através do uso do DOMContentLoaded
document.addEventListener("DOMContentLoaded", function () {
    const perguntas = document.querySelectorAll(".pergunta");
    const totalPerguntas = perguntas.length;
    let currentStep = 0;
    const progressBar = document.querySelector(".progress");
    
    const showStep = (step) => {
        perguntas.forEach(function (pergunta, index) {
            if (index === step) {
                pergunta.style.display = "block";
            } else {
                pergunta.style.display = "none";
            }
        });

        // Atualiza a barra de progresso
        const progressWidth = ((step + 1) / totalPerguntas) * 100;
        progressBar.style.width = progressWidth + "%";

        // Sinalizar que passou de um x número de perguntas
        const body = document.querySelector(".teste-vocacional");
        const animation = document.querySelector(".animation-questions");
        const animationP = document.querySelector("#animationP");
        const animationImg = document.querySelector("#imagegif");
        
        if (step == 0) {
            body.style.display = "block";
            animation.style.display = "none";
        } else if (step % 20 == 0) {
            body.style.display = "none";
            animation.style.display = "block";
            animationP.innerHTML = `Já respondeste a ${ step } perguntas`;
            animationImg.style.display = "block";
            setTimeout(function(){
                body.style.display = "block";
                animation.style.display = "none";
            }, 2500);
        }
    };

    const nextStep = () => {
        if (currentStep < totalPerguntas - 1) {
            currentStep++;
            showStep(currentStep);
        }
    };

    const previousStep = () => {
        if (currentStep > 0) {
            currentStep--;
            showStep(currentStep);
        }
    };

    const previousButtons = document.querySelectorAll(".previous");

    // Eliminar botão anterior da 1ª pergunta
    previousButtons[0].disabled = true;
    previousButtons[0].classList.add('btn-disabled')
    previousButtons[0].style.backgroundColor = 'transparent'
    previousButtons[0].style.border = 'none'

    // Evento de clique sobre o botão previous
    previousButtons.forEach((previousButton) => {
        previousButton.addEventListener("click", function () {
            previousStep();
        });
    });

    showStep(currentStep);

    // Adicionar o evento de clique às respostas (respostas funcionam como next button)
    const respostaButtons = document.querySelectorAll(".pergunta input[type=radio]");
    respostaButtons.forEach((respostaButton) => {
        respostaButton.addEventListener("click", function () {
            nextStep();
        });
    });
});






const categoriaSelect = document.getElementById("categoriaSelect");
    const concelhoSelect = document.getElementById("concelhoSelect");
    const generoSelect = document.getElementById("generoSelect");
    const resultadosTable = document.getElementById("resultados");

    // Dados da primeira linha
    const headerRow = resultadosTable.insertRow();
    const headers = ["Área de Estudo", "Distrito", "Género", "Percentagem Total"];
    headers.forEach(headerText => {
        const th = document.createElement("th");
        th.textContent = headerText;
        headerRow.appendChild(th);
    });

    const dadosExemplo = [
    { Categoria: "Agricultura", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "85%", GeneroMasculino: "32%", GeneroFeminino: "68%" },
    { Categoria: "Agricultura", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "15%", GeneroMasculino: " 68%", GeneroFeminino: "32%" },
    { Categoria: "Agricultura", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "85%", GeneroMasculino: "49%", GeneroFeminino: "51%" },
    { Categoria: "Agricultura", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "15%", GeneroMasculino: "40%", GeneroFeminino: "60%" },
    { Categoria: "Agricultura", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "85%", GeneroMasculino: "65%", GeneroFeminino: "35%" },
    { Categoria: "Agricultura", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "15%", GeneroMasculino: "30%", GeneroFeminino: "70%" },
    { Categoria: "Artes e Humanidades", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "95%", GeneroMasculino: "70%", GeneroFeminino: "30%" },
    { Categoria: "Artes e Humanidades", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "5%", GeneroMasculino: "35%", GeneroFeminino: "65%" },
    { Categoria: "Artes e Humanidades", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "20%", GeneroMasculino: "51%", GeneroFeminino: "49%" },
    { Categoria: "Artes e Humanidades", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "80%", GeneroMasculino: "45%", GeneroFeminino: "55%" },
    { Categoria: "Artes e Humanidades", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "20%", GeneroMasculino: "25%", GeneroFeminino: "75%" },
    { Categoria: "Artes e Humanidades", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "80%", GeneroMasculino: "15%", GeneroFeminino: "85%" },
    { Categoria: "Ciências", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "82%", GeneroMasculino: "55%", GeneroFeminino: "45%" },
    { Categoria: "Ciências", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "18%", GeneroMasculino: "35%", GeneroFeminino: "65%" },
    { Categoria: "Ciências", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "18%", GeneroMasculino: "68%", GeneroFeminino: "32%" },
    { Categoria: "Ciências", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "82%", GeneroMasculino: "32%", GeneroFeminino: "68%" },
    { Categoria: "Ciências", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "60%", GeneroMasculino: "47%", GeneroFeminino: "53%" },
    { Categoria: "Ciências", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "40%", GeneroMasculino: "58%", GeneroFeminino: "58%" },
    { Categoria: "Ciências Sociais, Comércio e Direito", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "50%", GeneroMasculino: "56%", GeneroFeminino: "44%" },
    { Categoria: "Ciências Sociais, Comércio e Direito", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "50%", GeneroMasculino: "31%", GeneroFeminino: "69%" },
    { Categoria: "Ciências Sociais, Comércio e Direito", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "50%", GeneroMasculino: "27%", GeneroFeminino: "73%" },
    { Categoria: "Ciências Sociais, Comércio e Direito", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "50%", GeneroMasculino: "58%", GeneroFeminino: "42%" },
    { Categoria: "Ciências Sociais, Comércio e Direito", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "50%", GeneroMasculino: "41%", GeneroFeminino: "59%" },
    { Categoria: "Ciências Sociais, Comércio e Direito", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "50%", GeneroMasculino: "63%", GeneroFeminino: "37%" },
    { Categoria: "Educação", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "50%", GeneroMasculino: "50%", GeneroFeminino: "70%" },
    { Categoria: "Educação", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "50%", GeneroMasculino: "50%", GeneroFeminino: "30%" },
    { Categoria: "Educação", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "50%", GeneroMasculino: "50%", GeneroFeminino: "37%" },
    { Categoria: "Educação", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "50%", GeneroMasculino: "50%", GeneroFeminino: "75%" },
    { Categoria: "Educação", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "50%", GeneroMasculino: "45%", GeneroFeminino: "64%" },
    { Categoria: "Educação", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "50%", GeneroMasculino: "55%", GeneroFeminino: "70%" },
    { Categoria: "Engenharia, Indústria e Construção", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "51%", GeneroMasculino: "50%", GeneroFeminino: "50%" },
    { Categoria: "Engenharia, Indústria e Construção", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "49%", GeneroMasculino: "49%", GeneroFeminino: "51%" },
    { Categoria: "Engenharia, Indústria e Construção", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "51%", GeneroMasculino: "26%", GeneroFeminino: "74%" },
    { Categoria: "Engenharia, Indústria e Construção", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "51%", GeneroMasculino: "53%", GeneroFeminino: "47%" },
    { Categoria: "Engenharia, Indústria e Construção", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "49%", GeneroMasculino: "21%", GeneroFeminino: "79%" },
    { Categoria: "Engenharia, Indústria e Construção", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "51%", GeneroMasculino: "48%", GeneroFeminino: "52%" },
    { Categoria: "Saúde e Proteção Social", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "50%", GeneroMasculino: "27%", GeneroFeminino: "73%" },
    { Categoria: "Saúde e Proteção Social", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "50%", GeneroMasculino: "25%", GeneroFeminino: "75%" },
    { Categoria: "Saúde e Proteção Social", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "50%", GeneroMasculino: "75%", GeneroFeminino: "25%" },
    { Categoria: "Saúde e Proteção Social", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "50%", GeneroMasculino: "43%", GeneroFeminino: "57%" },
    { Categoria: "Saúde e Proteção Social", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "50%", GeneroMasculino: "21%", GeneroFeminino: "79%" },
    { Categoria: "Saúde e Proteção Social", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "50%", GeneroMasculino: "55%", GeneroFeminino: "45%" },
    { Categoria: "Serviços", Concelho: "Braga", Genero: "Masculino", PercentagemTotal: "60%", GeneroMasculino: "50%", GeneroFeminino: "40%" },
    { Categoria: "Serviços", Concelho: "Braga", Genero: "Feminino", PercentagemTotal: "40%", GeneroMasculino: "50%", GeneroFeminino: "60%" },
    { Categoria: "Serviços", Concelho: "Porto", Genero: "Masculino", PercentagemTotal: "40%", GeneroMasculino: "50%", GeneroFeminino: "54%" },
    { Categoria: "Serviços", Concelho: "Porto", Genero: "Feminino", PercentagemTotal: "60%", GeneroMasculino: "50%", GeneroFeminino: "22%" },
    { Categoria: "Serviços", Concelho: "Lisboa", Genero: "Masculino", PercentagemTotal: "60%", GeneroMasculino: "50%", GeneroFeminino: "76%" },
    { Categoria: "Serviços", Concelho: "Lisboa", Genero: "Feminino", PercentagemTotal: "40%", GeneroMasculino: "40%", GeneroFeminino: "60%" }
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

            cellCategoria.textContent = item.Categoria;
            cellConcelho.textContent = item.Concelho;
            cellGenero.textContent = item.Genero;
            cellPercentagemTotal.textContent = item.PercentagemTotal;
        });
    }

    categoriaSelect.addEventListener("change", atualizarResultados);
    concelhoSelect.addEventListener("change", atualizarResultados);
    generoSelect.addEventListener("change", atualizarResultados);

    atualizarResultados();
