// Declare Variables
let button1 = document.getElementById("button1");
let button2 = document.getElementById("button2");
let button3 = document.getElementById("button3");

// EventListener in each button
button1.addEventListener("click", changeColor);
button2.addEventListener("click", changeColor);
button3.addEventListener("click", changeColor);

// Function to change BackgroundColor 
function changeColor() {
    const changeColor = randomColor();
    this.style.backgroundColor = changeColor;
}

// Function to create rgb (random color inputs)
const randomColor = function() {
    const r = Math.floor(Math.random() * 255);
    const g = Math.floor(Math.random() * 255);
    const b = Math.floor(Math.random() * 255);
    return `rgb(${r}, ${g}, ${b})`;
}
