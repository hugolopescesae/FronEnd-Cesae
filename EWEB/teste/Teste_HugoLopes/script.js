/* 
1. Tendo em conta o funcionamento da Web, para que serve o JS?(1V)

Tendo em conta o funcionamento da WEB, o JavaScript serve para dar dinamismo, animação, movimento e funcionalidades ao website. O mesmo funciona como um músculo perante a utilização de HTML(Estrutura base de website) e CSS(Estilização de elementos), criando assim um dinamismo no website. O JavaScript, num website, tem variadas funcionalidades tais como: Animar elementos do HTML, criação de elementos mediante certos movimentos ou ações, ligação com certas partes do back-end. */


/* 
2. Imagina que o site do Cesae tem uma parte para os estudantes fazerem login. Quero colocar um formulárioque aparecerá  na  HomePage  aos  estudantes  após  fazerem  login.  Este elemento  servirá  para  que  eles  possam  colocarofeedback  para  melhoramento  do  cursofrequentado.De acordo com o que estudámos, o elemento input será criado no html ou em JS? Justifique.(1V)

De acordo com o que estudámos, o elemento input seria criado no JavaScript através de uma função (function.addEventListener) que seria acionada após o login ser efetuado. A função antes mencionada iria criar um "forms" que de seguida seria adicionado a estrutura HTML do website(append()) e visivel para o utilizador, se o mesmo possuir o login efetuado. */


/* 
3. Considere o seguinte código:

1.1 - V
1.2 - F
1.3 - F
1.4 - F
1.5 - 15
1.6 - V
1.7 - num1 = '1';
1.8 - boolean; 
*/


/* 
4. Considere o seguinte código:
4.1 - 
    passwords.push("passTeste");
4.2 - 
    let passwords = [1234, 'sara1986', 2023];
    let userPassword = prompt("Qual é a password?");
    let verifyPassword = false;

    passwords.forEach(element => {
        if(userPassword == element){
            verifyPassword = true;
        }    
    });

    if(verifyPassword){
        alert("Password correta");
    }else{
        alert("Password incorreta")
    }
*/


/* 
5. Considere o seguinte código: 
5.1 -
    const studentGrades = [
    {
        "studentName" : "Rita",
        "grade" : 16,
        nameAndGrade(){
            return `A ${this.studentName} tem nota ${this.grade}`
        }
    },
    {
        "studentName" : "Luís",
        "grade" : 20,
    },
    {
        "studentName" : "João",
        "grade" : 18,
    },
    {
        "studentName" : "André",
        "grade" : 15,
    },
    {
        "studentName" : "Luísa",
        "grade" : 19,
    }
    ];

    studentGrades.forEach(element => {
    console.log(`A nota de ${element.studentName} é ${element.grade}`)
    });
5.2 -
    studentGrades[5] = indefined;
5.3 - V 
*/


/* 
6. Tendo como base o seguinte código HTML:
6.1 - 
    let myH2 = document.querySelector(".achievements");
    myH2.innerText = ("Os meus ensinamentos para a vida");

6.2 - 
    let myLis = document.querySelectorAll("li");
    for (let element of myLis){
        element.innerText += " - com sucesso!"
    }
6.3 - 
    const form = document.querySelector("form");
    let myList = document.querySelector("ul");

    form.addEventListener("submit", function(e){
        e.preventDefault();
        let myInput = document.querySelector("input").value;
        let newLi = document.createElement("li")
        newLi.textContent = myInput;
        myList.append(newLi);
    })
*/


/* 
7. Utilize  a  API  do  StarWars https://swapi.dev/.  Se  eu  usar  o  endpoint  vehicles  com  o  id  16, que veículo recebo?(1V)
    {
        "name": "TIE bomber",
        "model": "TIE/sa bomber",
        "manufacturer": "Sienar Fleet Systems",
        "cost_in_credits": "unknown",
        "length": "7.8",
        "max_atmosphering_speed": "850",
        "crew": "1",
        "passengers": "0",
        "cargo_capacity": "none",
        "consumables": "2 days",
        "vehicle_class": "space/planetary bomber",
        "pilots": [],
        "films": [
            "https://swapi.dev/api/films/2/",
            "https://swapi.dev/api/films/3/"
        ],
        "created": "2014-12-15T12:33:15.838000Z",
        "edited": "2014-12-20T21:30:21.675000Z",
        "url": "https://swapi.dev/api/vehicles/16/"
    }
*/