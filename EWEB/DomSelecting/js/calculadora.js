let button = document.getElementById("inputButton");

button.addEventListener("click", function(){
    
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;
    let simbolo = document.getElementById("operacao").value;
    let resultado = document.getElementById("resultado");

    switch (simbolo){
        case "+": 
            resultado.value = parseInt(num1) + parseInt(num2);
            break;
        case "-": 
            resultado.value = num1 - num2;
            break;
        case "/": 
            resultado.value = num1 / num2;
            break;
        case "*": 
            resultado.value = num1 * num2;
            break;
        default: 
            resultado.value = ("Operação Inválida");
            break;
    }
})