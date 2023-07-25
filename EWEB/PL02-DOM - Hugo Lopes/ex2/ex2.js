let button = document.getElementById("button1");
let body = document.querySelector("body");

button.addEventListener("click", paragraph);

function paragraph() {
    let p = document.createElement("p");
    p.innerText = "É só mais um esforço para o curso de Front-end e a seguir vou de férias";
    body.appendChild(p);
}