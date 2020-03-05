let result=document.getElementById('result');
result.value="";
//f(0)= 0. f(1)= 1. f(2)= 1.
// f(n)= f(n-1) +f(n-2) với n > 2.
function Bai1() {
    let n=prompt('N');
    let a = [];
    for (let i = 0; i < n; i++) {
        if (i > 2) {
            a[i] = a[i - 1] + a[i - 2];
        } else {
            a[i] = i;
        }
        result.value += a[i] + ' ';
    }
    result.innerText = result.value;
}

function Bai2() {
    let number=prompt('Nhap so nguyen duong');
    let GT=1;
    for(let i=1;i<=number;i++){
        GT*=i;
    }
    result.innerText='Result :'+GT;
}

function Bai3() {
    let a=prompt('Do dai 1 canh ke goc vuong')*1;
    //goc duoi trai
    let count=0;
    for(let i=0;i<a;i++){
        for(let j=0;j<=count;j++){
            result.value+='*';
        }
        result.value+='\n';
        if(count++===a)break;
    }
    result.value+='\n\n';
    //goc tren trai
    count=a;
    for(let i=0;i<a;i++){
        for(let j=count;j>0;j--){
            result.value+='*';
        }
        result.value+='\n';
        if(count--===0)break;
    }
    result.value+='\n\n';
    //goc duoi phai

    //goc tren phai



    console.log(result.value);
}