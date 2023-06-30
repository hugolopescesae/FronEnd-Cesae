/*alert("Hello World")

let myLuckyNumber = 10;
let myName = "Hugo";

alert(myName + " " + myLuckyNumber);



const message=" TASTE THE RAINBOW! ";

let whisper=message.toLowerCase().trim();

console.log(whisper);



const word = "skateboard";

let facialHair = word.slice(5);

facialHair = facialHair.replace("o","e");

console.log(facialHair);



let primeiroNome = prompt("Qual é o teu primeiro nome?");

console.log(primeiroNome);

let ultimoNome = prompt("Qual é o teu último nome?");

console.log(ultimoNome);

alert("Olá, " + primeiroNome +" "+ ultimoNome);



let diaDaSemana = prompt("Qual é o dia da semana?");

if (diaDaSemana == "Sexta") {
    alert("yay")
}else{
    alert("Não conheço esse dia!")
}



let password = prompt("Introduza uma password com pelo menos 6 caracteres:")

if (password.length < 6) {
    alert("Palavra passe com menos de 6 caracteres!")
}else{
    alert("Excelente escolha de password!")
}



let diaDaSemana = prompt("Qual é o dia da semana?");

switch (diaDaSemana.toLowerCase()) {
    case "segunda":
        alert("O dia escolhido foi a Segunda-Feira!")        
        break;
    case "terça":
        alert("O dia escolhido foi a Terça-Feira!")        
        break;
    case "quarta":
        alert("O dia escolhido foi a Quarta-Feira!")        
        break;
    case "quinta":
        alert("O dia escolhido foi a Quinta-Feira!")        
        break;
    case "sexta":
        alert("O dia escolhido foi a Sexta-Feira!")        
        break;
    case "sábado":
        alert("O dia escolhido foi a Sábado-Feira!")        
        break;
    case "domingo":
        alert("O dia escolhido foi a Domingo-Feira!")        
        break;       
    default: alert("Insira um dia válido!")
        break;
}


//1
let planetas = ["Mercúrio", "Vénus", "Terra", "Mart", "Júpiter", "Saturno", "Urano", "Neptuno", "Plutão"]

//2
planetas[3] = "Marte"

console.log(planetas[3])

//3
planetas.pop("Plutão")

console.log(planetas[8])

//4
planetas[9] = "yaaay"

console.log(planetas[9])

//5
console.log(planetas)


//1
const airplaneSeats = [
    ["Ruth","Anthony","Stevie"],
    ["Amelia","Pedro","Maya"],
    ["Xavier","Ananya","Luis"],
    ["Luke",null,"Deniz"],
    ["Rin","Sakura","Francisco"]
];

//2
airplaneSeats[3][1] = "Hugo";

console.log(airplaneSeats)

//1
let product = { name:"Hugo", inStock:true, price:1.99, color: ["Vermelho", "Azul", "Verde"]}

//2
console.log(product.price)

console.log(product.color[2])

//3
product.price = 2.55;

console.log(product.price)


//1
for (let i = 0;i < 6;i++){
    console.log("Da ba dee da ba daa")
}

//2
for (let i = 25;i >= 0;i=i-5){
    console.log(i)
}


//1
const people = ["Scooby", "Velma", "Daphne", "Shaggy", "Fred"];

//2
for(let i = 0;i < people.length;i++){
    console.log(i, people[i])
}


let i = 0;
let lista = [i];
let codigo = 0;

while (lista.length < 100){
    lista [i] = prompt("Introduza a tarefa "+(i+1));
    codigo = lista [i];
    i++;
    if (codigo == 0){
        break;
    }
}
console.log(lista);


function printHeart(){
    alert("<3");
}
*/

