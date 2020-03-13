let result = document.getElementById('result');
result.value = "";
//Bài 1: Sử dụng vòng lặp để đếm từ 1 đến 100. Khi số là 99, hiển thị hộp thoại thông báo là đã hoàn thành.
function Bai1() {
    for (let i = 1; i < 100; i++) {
        result.value += i + '\t';
    }
    result.innerText = result.value + 'Hoan Thanh';
}

//Bài 2: Sử dụng hàm prompt() để lấy thông tin nhiệt độ hiện tại được nhập bởi người truy cập.
//Nếu nhiệt độ nhập vào trên 100, yêu cầu người dùng giảm nhiệt độ. Nếu nhiệt độ dưới 20, yêu cầu người dùng tăng nhiệt độ.
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

//Bài 3: Hiển thị ra 20 số trong dãy fibonacci đầu tiên.
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

//Bài 4: Tìm số đầu tiên trong dãy fibonacci chia hết cho 5.
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

//Bài 5: Tính tổng của 20 số đầu tiên trong dãy fibonacci.
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
//Bài 6: Tính tổng của 30 số chia hết cho 7 đầu tiên trong các số tự nhiên.
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
//Bài 7: Hãy viết một chương trình in ra các số từ 1 đến 100. Nhưng nếu số chia hết cho 3 thì in ra "Fizz", 5 thì in ra "Buzz" thay vì in ra số đó.
//Và nếu số đó chia hết cho cả 3 và 5 thì in ra chữ "FizzBuzz".
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

//Bài 8: Game đoán số
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