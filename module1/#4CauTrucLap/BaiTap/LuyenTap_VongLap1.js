let result = document.getElementById('result');
result.value = "";

function Bai1() {
    for (let i = 1; i < 100; i++) {
        result.value += i + '\t';
    }
    result.innerText = result.value + 'Hoan Thanh';
}


function Bai2() {
    let oC = prompt('Nhiet do hien tai');
    if (oC > 100) {
        result.innerText = 'Nhiet do hon 100oC yeu cau giam nhiet do';
    } else if (oC < 20) {
        result.innerText = 'Nhiet do duoi 20oC yeu cau tang nhiet do';
    } else {
        result.innerText = 'Nhiet do hien tai ' + oC + ' oC';
    }
}


//f(0)= 0. f(1)= 1. f(2)= 1.
// f(n)= f(n-1) +f(n-2) với n > 2.
function Bai3() {
    let a = [];
    for (let i = 0; i < 20; i++) {
        if (i > 2) {
            a[i] = a[i - 1] + a[i - 2];
        } else {
            a[i] = i;
        }
        result.value += a[i] + ' ';
    }
    result.innerText = result.value;
}


function Bai4() {
    let a = [];
    let i = 0;
    do {
        if (i > 2) {
            a[i] = a[i - 1] + a[i - 2];
        } else {
            a[i] = i;
        }
    } while (a[i++] % 5 !== 0);
    result.innerText = a[i - 1];
}


function Bai5() {
    let b = [];
    let sum = 0;
    for (let i = 0; i < 20; i++) {
        if (i > 2) {
            b[i] = b[i - 1] + b[i - 2];
        } else {
            b[i] = i;
        }
        sum += b[i];
    }
    result.innerText = 'Result :' + sum;
}

function Bai6() {
    let count = 0;
    let i = 0;
    let sum = 0;
    while (count !== 20) {
        if (i % 7 === 0) {
            sum += i;
            count++;
        }
        i++;
    }
    result.innerText = 'Sum =' + sum;
}

function Bai7() {
    for (let i = 1; i <= 100; i++) {
        if(i%3!==0&&i%5!==0){
            result.value+=i+'\t';
        }else{
            if(i%3===0){
                result.value+='Fizz';
            }
            if(i%5===0){
                result.value+='Buzz';
            }
            result.value+='\t';
        }
    }
    result.innerText=result.value;
}


function Bai8() {
    let n=prompt('Nhap khoang muon doan ')*1;
    let random=Math.floor(Math.random()*(n+1));
    alert(random);
    let input=prompt('Nhap gia tri muon doan')*1;
    let count=0;

    do{
        if(input===random){
            alert('Bingo');break;
        }else{
            input=prompt('Choi lai lan '+(count+1))*1;
        }
    }while(count++!==2);

}