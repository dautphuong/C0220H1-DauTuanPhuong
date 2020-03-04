//Bài 1: Viết chương trình nhập điểm của một sinh viên cho các môn: Vật lý, Hóa học, và Sinh học.
// Sau đó hiển thị điểm trung bình và tổng của những điểm này.
function run1() {
    document.writeln('Bai 1 :' + '<br/>');
    let Sinh, Ly, Hoa;
    Sinh = parseInt(prompt('Diem Sinh :'));
    Ly = parseInt(prompt('Diem Ly :'));
    Hoa = parseInt(prompt('Diem Hoa :'));

    let DTB, sum;
    sum = Sinh + Ly + Hoa;
    DTB = sum / 3;

    document.writeln('Tong =' + sum + '<br/>');
    document.writeln('Diem trung binh =' + DTB);
}

//Bài 2:  Viết chương trình nhập một giá trị là độ 0C (Celsius) và chuyển nó sang độ 0F (Fahrenheit).
//[Hướng dẫn: C/5 = (F-32)/9]

function run2() {
    document.writeln('Bai 2 :' + '<br/>');
    let C, F;
    C = parseInt(prompt('Nhap 0C'));
    F = (C * 9) / 5 + 32;
    document.writeln('0F =' + F);
}

//Bài 3: Viết chương trình tính diện tích hình tròn
//Bài 4: Viết chương trình chu vi hình tròn
function run3() {
    document.writeln('Bai 3 :' + '<br/>');
    let n = 3.14, r, A, C;
    r = prompt('Nhap ban kinh :');
    A = n * r * r;
    C = 2 * r * n;
    document.writeln('Dien tich hinh tron =' + A + '<br/>');
    document.writeln('Chu vi hinh tron =' + C);
}
