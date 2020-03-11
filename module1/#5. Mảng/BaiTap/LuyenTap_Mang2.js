//Bài 1: Viết chương trình khởi tạo mảng 2 chiều, gồm một bộ các phần tử có sẵn,  in ra các phần tử trong mảng.
function Bai1() {
    let a = [
        [1, 2, 1, 24],
        [8, 11, 9, 4],
        [7, 0, 7, 27],
        [7, 4, 28, 14],
        [3, 10, 26, 7]
    ];
    for (var i = 0; i < a.length; i++) {
        document.write("row " + i + "<br>");
        for (var j = 0; j < a[i].length; j++) {
            document.write(a[i][j] + "<br>");
        }
    }
}

//Bài 2: Viết một chương trình để in các ký tự trong một mảng theo thứ tự đảo ngược.
function Bai2() {
    let a = ['c', 's', 'c', '2', '6', '1'];
    a.reverse();
    alert(a.join(''));
}

//Bài 3: Viết một chương trình khai báo một mảng ký tự và kích thước của mảng. Chương trình này đếm số ký tự số trong mảng.
function Bai3() {
    let a = ['c', 's', 'c', '25', '-6', '1'];
    let count = 0;

    for (let i = 0; i < a.length; i++) {
        if (a[i] * 1 >= 0 || a[i] * 1 < 0) {
            count++;
        }
    }
    alert('So ki tu so trong mang ' + count);
}

//Bài 4: Viết một chương trình để đếm số từ trong một chuỗi
function Bai4() {
    let count = 0;
    let notCounted = true;
    let str = prompt('Nhap chuoi');
    for (let i = 0; i < str.length; i++) {
        if (str.charAt(i) != ' ') {
            if (notCounted) {
                count++;
                notCounted = false;
            }
        } else {
            notCounted = true;
        }
    }
    alert('So tu trong chuoi ' + count);
}

//Bài 5: Viết một chương trình nhập vào 2 chuỗi, sau đó kiểm tra xem hai chuỗi có giống nhau hay không.
function Bai5() {
    let a = prompt('Nhap chuoi a');
    let b = prompt('Nhap chuoi b');
    if (a != b) {
        alert('Hai chuoi khong giong nhau');
    } else {
        alert('Hai chuoi giong nhau');
    }
}

//Bài 6: Viết chương trình nhập vào một mảng ký tự, tìm tất cả các ký tự trong mảng là (-) và thay thế các ký tự này bởi ký tự ( _ )
function Bai6() {
    let a = ['c', 's', '-', '25', '-', '-6', '1', '-'];
    for (let i = 0; i < a.length; i++) {
        if (a[i] === '-') {
            a[i]='_';
        }
    }
    alert(a.join(''));
}