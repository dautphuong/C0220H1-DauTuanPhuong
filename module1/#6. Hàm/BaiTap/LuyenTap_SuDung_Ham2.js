//Bài 1: Viết hàm tính bình phương của một số bất kỳ được đưa vào.
function Bai1() {
    function square(num) {
        return num * num;
    }

    let num = prompt('Nhap gia tri');
    alert('Result: ' + square(num));
}
//Bài 2: Viết hàm tính diện tích, hàm tính chu vi hình tròn.
function Bai2() {
    function acreage(r) {
        return 3.14 * r * r;
    }

    function perimeter(r) {
        return 2 * 3.14 * r;
    }

    let r = prompt('Nhap ban kinh');
    alert('Dien tich hinh tron ' + acreage(r) +
        '\nChu vi hinh tron ' + perimeter(r));
}
//Bài 3: Viết hàm tính giai thừa của một số nguyên bất kỳ được đưa vào.
function Bai3() {
    function factorial(num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    let num = prompt('Nhap gia tri');
    alert(num + '! =' + factorial(num));
}
//Bài 4: Viết hàm kiểm tra xem ký tự nhập vào có phải là ký tự số không. Nếu là ký tự số hàm trả về true, ngược lại trả về false.
function Bai4() {
    function checkNum(num) {
        if (num * 1 >= 0 || num * 1 < 0) {
            return true;
        }
        return false;
    }

    let str = prompt('Nhap chuoi');
    if (checkNum(str)) {
        alert(str + ' la ki tu so');
    } else {
        alert(str + ' khong phai ki tu so');
    }
}
//Bài 5: Viết hàm nhận vào 3 số nguyên bất kỳ, trả về số nguyên có giá trị nhỏ nhất.
function Bai5() {
    function min(a, b, c) {
        if (a < b) {
            if (a < c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b < c) {
                return b;
            } else {
                return c;
            }
        }
    }

    let a = prompt('Gia tri thu nhat');
    let b = prompt('Gia tri thu hai');
    let c = prompt('Gia tri thu ba');
    alert('Gia tri nho nhat la ' + min(a, b, c));
}
//Bài 6: Viết hàm nhận vào một số, kiểm tra xem nếu số đưa vào có phải là nguyên dương không.
//Nếu là nguyên dương trả về true, ngược lại trả về false.
function Bai6() {
    function positive_int(num) {
        if (num == parseInt(num)) {
            if (num * 1 > 0) {
                return true;
            } else {
                return false
            }
        }
        return false;
    }

    let num = prompt('Nhap so nguyen');
    if (positive_int(num)) {
        alert(num + ' la so nguyen duong');
    } else {
        alert(num + ' khong phai so nguyen duong');
    }
}
//Bài 7: Viết hàm truyền vào 2 số nguyên bất kì, thực hiện đổi chỗ hai số nguyên đó.
function Bai7() {
    let a = Number(prompt("Nhập a"));
    let b = Number(prompt("Nhập b"));
    let obj = {
        valA: a,
        valB: b,
    };
    SwitchVal(obj);
    alert("a = " + obj.valA + " và b = " + obj.valB);
    function SwitchVal(obj) {
        let temp = obj.valA;
        obj.aVal = obj.valB;
        obj.bVal = temp;
    }
}
//Bài 8: Viết hàm truyền vào mảng số nguyên bất kỳ, sau đó đảo ngược mảng số nguyên đó.
function Bai8() {
    function reverse(array) {
        return array.reverse();
    }
    let array=[1,2,3,4,5,6,7,8,9];
    alert(reverse(array));
}
//Bài 9: Viết hàm truyền vào một mảng ký tự, và một ký tự bất kỳ, kiểm tra xem ký tự bất kỳ đó có nằm trong mảng không.
//Nếu có trả về số lần xuất hiện của ký tự đó, nếu không trả về -1.
function Bai9() {
    function checkChar(array,char) {
        let count=0;
        for(let i=0;i<array.length;i++){
            if(char==array[i]){
                count++;
            }
        }
        return (count);
    }
    let array=['a','b','c','d','e','f','a','e'];
    let char=prompt('Nhap ki tu');
    alert('So lan xuat hien trong mang '+checkChar(array,char));
}