const form = document.querySelector("form");
const product = document.querySelector("#product");
const qty = document.querySelector("#qty");
const list = document.querySelector("#list");

form.addEventListener("submit", function (e){
    e.preventDefault();
    const newLi1 = document.createElement("li");
    newLi1.innerText = `${product.value} - ${qty.value}`;
    list.append(newLi1);
    form.reset();
    console.log("Submetido a tempo!")
})