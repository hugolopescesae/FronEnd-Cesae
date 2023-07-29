let button = document.getElementById("aprendidoButton")

button.addEventListener("click", addAprendidos);

function addAprendidos() {
  let listaItems = document.querySelectorAll("#listaAprendizado li");
  listaItems.forEach(element => {
    element.innerText += " - aprendido";
  });
}