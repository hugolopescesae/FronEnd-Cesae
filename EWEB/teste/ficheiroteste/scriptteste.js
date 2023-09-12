let passwords = [1234, 'sara1986', 2023];
let userPassword = prompt("Qual é a password?");

let verifyPassword = passwords.includes(userPassword);

if(verifyPassword){
    alert("Password Correta")
}else{
    alert("Password Incorreta")
}