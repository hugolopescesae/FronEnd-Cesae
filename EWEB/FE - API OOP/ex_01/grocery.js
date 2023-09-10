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

const loadStarWarsFilm = async () => {
    const res = await fetch("https://swapi.dev/api/films/1");
    const data = await res.json();
    console.log(data);

    let filmName = document.createElement("h1");
    filmName.innerText = data.title;

    document.body.append(filmName);
}

loadStarWarsFilm();

String.prototype.toLowerAndWeekend = function (){
    return `Estamos quase de fim de semana ${this.toLowerCase()}`
}

let myName = "Hugo";

console.log(myName.toLowerAndWeekend());
