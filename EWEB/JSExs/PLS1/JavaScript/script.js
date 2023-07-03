/* 
1 -----------
function multiply(num1, num2) {
    console.log(num1*num2);
}

2 -----------
function isShortsWeather(temperature) {
    if (typeof temperature == "number"){
        if (temperature > 25){
            return true;
        }else{
            return false;
        }
    }else{
        return ("Introduza apenas números!")
    }
}

3 ------------
function lastElement(array) {
    if (array.length == 0){
        return null;
    }else{
        return array[array.length-1];
    }
}

4 -------------
function capitalize(word) {
    if (typeof word == "string"){
        word = word[0].toUpperCase() + word.slice(1);
        return word;
    }else{
        return ("Introduza apenas Strings!")
    }
}

5 -------------
function sumArray(array) {
    let soma = 0;
    for (i=0;i < array.length;i++){
        soma = soma + array[i];
    }
    return soma;
}

6 -------------
function returnDay(day) {
    switch(day){
        case 1: return ("Segunda");
        case 2: return ("Terça");
        case 3: return ("Quarta");
        case 4: return ("Quinta");
        case 5: return ("Sexta");
        case 6: return ("Sábado");
        case 7: return ("Domingo");
        default: return null;
    }
}
function calculator(num1, num2, operacao) {
    if (operacao === "soma"){
        return (num1+num2);
    }else if(operacao === "subtração"){
        return (num1-num2);
    }else if(operacao === "multiplicação"){
        return (num1*num2);
    }else if(operacao === "divisão"){
        return (num1/num2);
    }else{
        return ("Introduza uma operação válida!")
    }
}*/