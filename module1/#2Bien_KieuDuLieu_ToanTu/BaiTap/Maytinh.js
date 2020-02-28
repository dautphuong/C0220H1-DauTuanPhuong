var nb1=document.getElementById('num1');
var nb2=document.getElementById('num2');
var result=document.getElementById('result');


function Addition() {
    result.innerText=nb1.value*1 + nb2.value*1;
}

function Subtraction() {
    result.innerText=nb1.value-nb2.value;
}

function Mutiplication() {
    result.innerText=nb1.value*nb2.value;
}

function Division() {
    result.innerText=nb1.value/nb2.value;
}




