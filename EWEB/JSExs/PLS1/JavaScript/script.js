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
function returnDay(day){
    array = ["Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"] 
    switch (day){
        case 1: return (array[0]);
        case 2: return (array[1]);
        case 3: return (array[2]);
        case 4: return (array[3]);
        case 5: return (array[4]);
        case 6: return (array[5]);
        case 7: return (array[6]);
        default: return null;
    }
}
function calculator(num1, num2, operacao) {
    switch (operacao){
        case "soma": return (num1+num2);
        break;
        case "subtração": return (num1-num2);
        break;
        case "multiplicação": return (num1*num2);
        break;
        case "divisão": return (num1/num2);
        break;
        default: return ("Introduza uma operação válida!");
        break;
    }
}*/
