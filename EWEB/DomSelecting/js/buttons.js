let container = document.getElementById("container");

for (let i=1;i<=100;i++){
    let myButton = document.createElement("button");
    myButton.innerText = "Hello World "+i;
    container.appendChild(myButton);
}

