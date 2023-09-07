function carregarPagina() {
    console.log("A página está a carregar!")
}

let button = document.getElementById("estaFeito");

button.addEventListener("mouseover", apanharSol)

function apanharSol() {
    alert("vou apanhar sol")
}

document.addEventListener("keydown", function(event) {
    if (event.key === "Enter") {
      event.preventDefault();
      alert("Não te esqueças de entregar o trabalho.");
    }
});
