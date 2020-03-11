//Bài 1- Viết chương trình khởi tạo mảng số nguyên gồm 10 phần tử.
//Chương trình thực hiện tính và hiển thị xem có bao nhiêu số nguyên lớn hơn hoặc bằng 10.
function Bai1() {
    let a = [5, 10, 15, 20, 25, 30, 4, 7, 1, 0];
    let count = 0;
    for (let i = 0; i < a.length; i++) {
        if (a[i] <= 10) {
            count++;
        }
    }
    alert(count + ' so nguyen lon hon hoac bang 10');
}

//Bài 2- Viết chương trình khởi tạo mảng số nguyên gồm 10 phần tử khác nhau.
//Chương trình hiển thị ra được phần tử có giá trị lớn nhất trong mảng và vị trí của phần tử đó.
function Bai2() {
    let a = [2, 5, 6, 4, 8, 7, 9, 11, 15, 13];
    let max = a[0];
    let index = 0;
    for (let i = 1; i < a.length; i++) {
        if (a[i] > max) {
            max = a[i];
            index = i;
        }
    }
    alert('So ' + max + ' vi tri ' + index + ' la gia tri lon nhat');
}

//Bài 3- Viết chương trình khởi tạo mảng số nguyên.
//Hiển hiện giá trị lớn nhất trong mảng đó. In ra giá trị trung bình của các phần tử trong mảng.
function Bai3() {
    let a = [2, 5, 2, 4, 8, 7, 9, 11, 15, 13];
    let max = a[0];
    let sum = 0;
    for (let i = 1; i < a.length; i++) {
        if (a[i] > max) {
            max = a[i];
        }
        sum += a[i];
    }
    let tb = sum / a.length;
    alert('Gia tri lon nhat la ' + max + '.Trung binh la ' + tb);
}

//Bài 4- Viết chương trình khởi tạo/nhập vào một mảng số nguyên và đảo ngược các phần tử trong mảng đó.
function Bai4() {
    let a = [];
    let b = [];
    let n = prompt('Nhap so phan tu mang');
    for (let i = 0; i < n; i++) {
        a[i] = prompt('Nhap phan tu thu ' + (i + 1));
    }
    b = a.reverse();
    alert(b)
}

//Bài 5- Viết chương trình đếm số nguyên âm trong một chuỗi
function Bai5() {
    let a = '2-31-2-3-231-2-3';
    let b = [];
    let j = 0;
    for (let i = 0; i < a.length; i++) {
        if (a[i] === '-') {
            b[j++] = a[i] + a[i + 1];
        }
    }
    alert(b.join());
    alert('so nguyen am '+(b.length));
}

//Bài 6- Viết chương trình khởi tạo/nhập vào một mảng số nguyên gồm 10 phần tử, nhập/tạo phần tử số nguyên V.
// hương trình tìm xem V có nằm trong mảng số nguyên không?
function Bai6() {
    let a = [5, 7, 11, 12, 26, 32];
    let V = prompt('Nhap V');
    let flag = false;
    for (let i = 0; i < a.length; i++) {
        if (V == a[i]) {
            flag = true;
        }
    }
    if (flag) {
        alert(V + ' is in the array');
    } else {
        alert(V + ' is not in the array');
    }
}

//Bài 7- Viết chương trình khởi tạo/nhập vào một mảng số nguyên gồm 10 phần tử, nhập/tạo phần tử số nguyên V.
//Chương trình kiểm tra xem V có thuộc mảng đã cho không, nếu V thuộc mảng đã cho xoá V khỏi mảng
function Bai7() {
    let a = [5, 7, 15, 9, 26, 18];
    let V = prompt('Nhap V');
    for (let i = 0; i < a.length; i++) {
        if (V == a[i]) {
            for (let j = i; j < a.length; j++) {
                a[j] = a[j + 1];
            }
        }
    }
    a.length = a.length - 1;
    alert(a.join());
}

//Bài 8- Viết chương trình khởi tạo/nhập vào một mảng số nguyên gồm 10 phần tử.
//Chương trình sắp xếp mảng theo thứ tự giảm dần và hiển thị ra mảng đã được sắp xếp.
function Bai8() {
    let a = [27, 6, 5, 14, 13, 21, 17, 18];
    a.sort(function (a, b) {
        return b - a
    });
    alert(a.join());
}

//Bài 9- Viết chương trình khởi tạo/nhập vào 2 mảng số nguyên gọi là mảng a và b.
//Chương trình sẽ lưu các phần tử được nối từ hai mảng b và a vào mảng c. Hiển thị mảng c.
function Bai9() {
    let a = [2, 4, 6, 8, 10];
    let b = [1, 3, 5, 7, 9];
    let c = a.concat(b);
    alert(c.join());
}