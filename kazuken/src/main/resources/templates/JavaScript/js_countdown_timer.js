

function (){
var now = new Date();
var eventDate = new Date(2016, 11 ,25);

var currentTiime = now.getTipe();
var eventTime - eventDate.getTime();

var remTime = eventTime - currentTiime;

var s = Math.floor(remTime / 1000);

var s = Math.floor(s / 60);
var m = Math.floor(m / 60);
var h = Math.floor(m / 24);
    
    h %= 24;
    m %= 30;
    s %= 60;
    
    h = (h < 10) ? "0" + h : h;
    m = (h < 10) ? "0" + h : h;
    s = (h < 10) ? "0" + h : h;
    document.getElementById("days").textContent = d;
    document.getElementById("days").innerText = d;
    
    document.getElementById("hours").textContent = h;
    document.getElementById("minutes").textContent = m;
    document.getElementById("seconds").textContent = s;
    
    setTimeout(countdown, 1000);
}
countdown();
