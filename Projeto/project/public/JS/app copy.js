const forms = document.querySelectorAll('form');
/* const formRegistration = document.querySelector('#form-registration-student');
const formLogin = document.querySelector('#form-login'); */


// Prevent default in all forms
forms.forEach((form) => {
    form.addEventListener('submit', function(e) {
        e.preventDefault()
    });
});

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
    console.log(totalPerguntas);
    let currentStep = 0;

    const showStep = (step) => {
        perguntas.forEach(function (pergunta, index) {
            if (index === step) {
                pergunta.style.display = "block";
            } else {
                pergunta.style.display = "none";
            }
        });
    };

    // Função para avançar para a próxima pergunta se houver uma disponível (ou seja, se currentStep for menor que o número total de perguntas).
    const nextStep = () => {
        if (currentStep < totalPerguntas - 1) {
            currentStep++;
            showStep(currentStep);
        }
    };


    // Função chamada para retroceder para a pergunta anterior, desde que currentStep seja maior que 0.
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


    // Evento de click sobre os botão next
    nextButtons.forEach((nextButton) => {
        nextButton.addEventListener("click", function () {
            nextStep();
        });
    });


    // Evento de click sobre o botão previout
    previousButtons.forEach((previousButton) => {
        previousButton.addEventListener("click", function () {
            previousStep();
        });
    });

    showStep(currentStep);
});



const hamburger = document.querySelector(".hamburger");
const navLinks = document.querySelector(".nav-links");
const links = document.querySelectorAll(".nav-links li");

hamburger.addEventListener('click', ()=>{
   //Animate Links
    navLinks.classList.toggle("open");
    links.forEach(link => {
        link.classList.toggle("fade");
    });

    //Hamburger Animation
    hamburger.classList.toggle("toggle");
});



