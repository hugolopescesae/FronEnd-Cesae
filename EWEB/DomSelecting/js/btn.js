let btn = document.querySelector("button");

function color1(){
    let min = Math.ceil(0);
    let max = Math.floor(255);
    return Math.floor(Math.random() * (max - min));
}

function color2(){
    let min = Math.ceil(0);
    let max = Math.floor(255);
    return Math.floor(Math.random() * (max - min));
}

function color3(){
    let min = Math.ceil(0);
    let max = Math.floor(255);
    return Math.floor(Math.random() * (max - min));
}

btn.addEventListener("click", function(){
    /* body.style.backgroundColor = "rgb("+color1()+","+color2()+","+color3()+")"; */
    body.style.backgroundColor = `rgb(${color1()}, ${color2()}, ${color3()})`;
})
