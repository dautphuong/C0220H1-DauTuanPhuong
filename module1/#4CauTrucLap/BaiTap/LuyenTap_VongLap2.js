let result = document.getElementById('result');
result.value = "";


//f(0)= 0. f(1)= 1. f(2)= 1.
// f(n)= f(n-1) +f(n-2) với n > 2.
function Bai1() {
    let n = prompt('N');
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
    let number = prompt('Nhap so nguyen duong');
    let GT = 1;
    for (let i = 1; i <= number; i++) {
        GT *= i;
    }
    result.innerText = 'Result :' + GT;
}

function Bai3() {
    let a = prompt('Do dai 1 canh ke goc vuong') * 1;
    //goc duoi trai

    for (let i = 0; i < a; i++) {
        for (let j = 0; j <= i; j++) {
            result.value += '*';
        }
        result.value += '\n';
    }
    result.value += '\n\n';
    //goc tren trai

    for (let i = 0; i < a; i++) {
        for (let j = i; j < a; j++) {
            result.value += '*';
        }
        result.value += '\n';
    }
    result.value += '\n\n';
    //goc duoi phai
    for (let i = 0; i < a; i++) {
        for (let j = 0; j < a + 1; j++) {
            if (j >= a - i) {
                result.value += '*';
            } else
                result.value += ' ';
        }
        result.value += '\n';
    }
    result.value += '\n\n';
    //goc tren phai
    for (let i = 0; i < a; i++) {
        for (let j = 0; j <= a; j++) {
            if (j <= i) {
                result.value += ' ';
            } else
                result.value += '*';
        }
        result.value += '\n';
    }
    result.value += '\n\n';

    console.log(result.value);
}

function Bai4() {
    let n = prompt('Nhap chieu rong');
    let m = prompt('Nhap chieu dai');
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < m; j++) {
            if (i === 0 || j === 0 || i === n - 1 || j === m - 1) {
                result.value += '*';
            } else {
                result.value += ' ';
            }
        }
        result.value += '\n';
    }
    document.write(result.value);
}

//Bài 5: Viết chương trình tính lãi ngân hàng (lãi mẹ đẻ lại con)
//khi biết số tiền ban đầu, số tháng cho vay và lãi xuất hàng tháng.
function Bai5() {
    let amount = prompt('So tien vay') * 1;
    let month = prompt('So thang') * 1;
    let interestRate = prompt('Lai suat hang thang') / 100;
    let nMonth = month;
    let total = amount;
    while (nMonth > 0) {
        total += total * interestRate;
        nMonth--;
    }
    alert('Tien lai sau ' + month + ' thang la ' + (total - amount));

}


function Bai6() {
    let a, b, size = 10;

    for (a = size / 2; a <= size; a = a + 2) {

        for (b = 1; b < size - a; b = b + 2)
            result.value += " ";

        for (b = 1; b <= a; b++)
            result.value += "*";


        for (b = 1; b <= size - a; b++)
            result.value += " ";


        for (b = 1; b <= a - 1; b++)
            result.value += "*";

        result.value += "\n";
    }

    for (a = size; a >= 0; a--) {

        for (b = a; b < size; b++)
            result.value += " ";


        for (b = 1; b <= ((a * 2) - 1); b++)
            result.value += "*";

        result.value += "\n";
    }

    console.log(result.value);
}