
const formTest = document.querySelector('#form-teste');
/* const formRegistration = document.querySelector('#form-registration-student');
const formLogin = document.querySelector('#form-login'); */

formTest.addEventListener('submit', function (e) {
    e.preventDefault()
});



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
        const questaoDiv = document.querySelector(".teste-feedback");
        if(step == 0) {
            questaoDiv.innerText = "";
        }else if(step % 20 == 0) {
            questaoDiv.innerText = `Já respondeu a ${step} perguntas`; 
        }else{
            questaoDiv.innerText = "";
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



    const nextButtons = document.querySelectorAll(".next");
    const previousButtons = document.querySelectorAll(".previous");

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

    // Adicione evento de clique às respostas
    const respostaButtons = document.querySelectorAll(".pergunta input[type=radio]");
    respostaButtons.forEach((respostaButton) => {
        respostaButton.addEventListener("click", function () {
            nextStep();
        });
    });

});


