let button = document.getElementById("button1");
let body = document.querySelector("body");
let p;

button.addEventListener("click", paragraph);

function paragraph() {
    p = document.createElement("p");
    p.innerText = "É só mais um esforço para o curso de Front-end e a seguir vou de férias";
    body.appendChild(p);

    
}

button.addEventListener("click", createbuttons);

function createbuttons() {
    let createButton1 = document.createElement("button");
    createButton1.innerText = "+"
    body.appendChild(createButton1);

    createButton1.addEventListener("click", increaseSize);

    function increaseSize(){
        let tamanhoAtual = window.getComputedStyle(p).fontSize;
        let tamanhoNovo = parseFloat(tamanhoAtual) * 1.2; // Aumenta em 20%
        p.style.fontSize = tamanhoNovo + "px";
        p.style.textAlign = "center";
    }

    let createButton2 = document.createElement("button");
    createButton2.innerText = "-"
    body.appendChild(createButton2);

    createButton2.addEventListener("click", decreaseSize);

    function decreaseSize(){
        let tamanhoAtual = window.getComputedStyle(p).fontSize;
        let tamanhoNovo = parseFloat(tamanhoAtual) * 0.8; // Aumenta em 20%
        p.style.fontSize = tamanhoNovo + "px";
        p.style.textAlign = "right";
    }
}