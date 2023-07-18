const color = ["red", "orange", "yellow", "green", "blue", "indigo", "violet"];
let span = document.querySelectorAll("span")

for (i = 0;i <span.length;i++){
    span[i].style.color = color[i];
}
