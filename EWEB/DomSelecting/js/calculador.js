let num1 = document.getElementById("num1")

let num2 = document.getElementById("num2")

let text = document.getElementById("text")

switch (text) {
    case "/": console.log(num1/num2)
    break;
    case "*": console.log(num1*num2)
    break;
    case "+": console.log(num1+num2)
    break;
    case "-": console.log(num1-num2)
    break;
    default: console.log ("Introduza um símbolo de operação válida!")
}

