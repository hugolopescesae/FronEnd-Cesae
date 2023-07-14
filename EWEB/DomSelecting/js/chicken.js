let myImg = document.querySelector("img")

function button() {
    if (myImg.getAttribute("src") == "https://devsprouthosting.com/images/egg.jpg") {
        myImg.setAttribute("src", "https://devsprouthosting.com/images/chicken.jpg")
    }else{
        myImg.setAttribute("src", "https://devsprouthosting.com/images/egg.jpg")
    }
}
