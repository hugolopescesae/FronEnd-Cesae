let button = document.getElementById("button1");
let body = document.querySelector("body");

button.addEventListener("click", paragraph);

function paragraph() {
    let p = document.createElement("p");
    p.innerText = "É só mais um esforço para o curso de Front-end e a seguir vou de férias";
    body.appendChild(p);

    let pFinal = document.querySelector("p")

    let btn1 = document.createElement("button");
    btn1.innerText = "+";
    body.appendChild(btn1);
    btn1.addEventListener("click", function(){
        pFinal.style.fontSize = large;
    })

    let btn2 = document.createElement("button");
    btn2.innerText = "-";
    body.appendChild(btn2);
    btn2.addEventListener("click", function(){
        pFinal.style.fontSize = small;
    })
}
