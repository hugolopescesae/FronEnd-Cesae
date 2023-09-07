let button = document.getElementById("aprendidoButton")

button.addEventListener("click", addAprendidos, );

function addAprendidos() {
  let listaItems = document.querySelectorAll("#listaAprendizado li");
  listaItems.forEach(element => {
    element.innerText += "-aprendido";
  });
}

let button2 = document.getElementById("adicionarButton")

button2.addEventListener("click", adicionarItem);

function adicionarItem() {
  let novoItem = prompt("Digita algo que já tenhas aprendido: ");

  if (novoItem) {
  let lista = document.getElementById("listaAprendizado");
  let novoListItem = document.createElement("li");
  novoListItem.innerText = novoItem;
  lista.appendChild(novoListItem);
  }
}

