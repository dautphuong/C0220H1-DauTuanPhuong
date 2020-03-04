var nb1 = document.getElementById('num1');
var nb2 = document.getElementById('num2');
var result = document.getElementById('result');

//phep cong
function Addition() {
    result.innerText = nb1.value * 1 + nb2.value * 1
}

//phep tru
function Subtraction() {
    result.innerText = nb1.value - nb2.value;
}

//phep nhan
function Mutiplication() {
    result.innerText = nb1.value * nb2.value;
}

//phep chia
function Division() {
    result.innerText = nb1.value / nb2.value;
}

//cong_tru_nhan_chia
function caculation(cal) {
    switch (cal) {
        case '+' :
            result.innerText = nb1.value * 1 + nb2.value * 1;
            break;
        case '-' :
            result.innerText = nb1.value - nb2.value;
            break;
        case '*' :
            result.innerText = nb1.value * nb2.value;
            break;
        case '/' :
            result.innerText = nb1.value / nb2.value;
            break;
    }
}

//Cach dung evol
function caculation1(cal) {
    result.innerText = eval(nb1.value + cal + nb2.value);
}


