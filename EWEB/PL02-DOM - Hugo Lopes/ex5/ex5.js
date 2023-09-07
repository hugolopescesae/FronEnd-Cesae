let button = document.getElementById("aprendidoButton")

button.addEventListener("click", addAprendidos, {once:true});

function addAprendidos() {
  let listaItems = document.querySelectorAll("#listaAprendizado li");
  listaItems.forEach(element => {
    element.innerText += " - aprendido";
  });
}