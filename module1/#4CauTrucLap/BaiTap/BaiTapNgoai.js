// Bài 1 :nhập chuỗi ra true nếu đối xứng (abcba ->true)
// Bai 2:nhập chuỗi mã hóa theo yêu cầu (aabccaabb ->a2b1c2a2b2)
// Bài 3:Nhập 1 số kiểm tra có phải số chính phương (số chính phương có căn bâc 2 của nó = số nguyên)
// Bài 4:Nhập 1 sô kiểm tra có phải số nguyên tố ko ?
alert
function Bai1() {
    let string = prompt('Nhap chuoi');
    let result = "";
    for (let i = string.length - 1; i >= 0; i--) {
        result += string[i];
    }
    if (string === result) {
        alert('True');
    } else {
        alert('False');
    }
}

function Bai1_2() {
    let string = prompt('Nhap chuoi');
    let flag=true;
    let mid=parseInt((string.length/2));
    for(let i=0;i<mid;i++){
        if(string.charAt(i)!==string.charAt(string.length-i-1)){
            flag=false;break;
        }
    }
    alert(flag);
}


function Bai2() {
    let string = prompt('Nhap chuoi');
    let result = "";
    for (let i = 0; i < string.length; i++) {
        let count = 1;
        for (let j = i; j < string.length; j++) {
            if (string.charAt(j) === string.charAt(j + 1)) {
                count++;
            } else {
                break;
            }
        }
        if (string.charAt(i) === string.charAt(i - 1)) {
            continue;
        }
        result += string.charAt(i) + count;
    }
    alert(result);
}

function Bai2_2() {
    let str = prompt('Nhap chuoi');
    let result = "";
    let count=1;
    for(let i=0;i<str.length;i++){
        if(str[i]===str[i+1]){
            count++;
        }else{
            result+=str[i]+count;
            count=1;
        }
    }
    alert(result);
}


function Bai3() {
    let number = prompt('N') * 1;
    if (Math.sqrt(number) === parseInt(Math.sqrt(number))) {
        alert(true);
    } else {
        alert(false);
    }
}

function Bai4() {
    let number = prompt('Input a number ') * 1;
    let flag = true;

    for (let i = 2; i < number / 2; i++) {
        if (number % i === 0) {
            flag = false;
        }
    }
    alert(flag);
}

