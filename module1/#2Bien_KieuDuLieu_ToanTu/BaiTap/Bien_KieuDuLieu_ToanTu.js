//Bai 1
function run1() {
    document.writeln('Bai 1 :'+'<br/>');
    let Sinh, Ly, Hoa;
    Sinh = parseInt(prompt('Diem Sinh :'));
    Ly = parseInt(prompt('Diem Ly :'));
    Hoa = parseInt(prompt('Diem Hoa :'));

    let DTB, sum;
    sum = Sinh + Ly + Hoa;
    DTB = sum / 3;

    document.writeln('Tong =' + sum +'<br/>');
    document.writeln('Diem trung binh =' + DTB);
}

//Bai2
function run2() {
    document.writeln('Bai 2 :'+'<br/>');
    let C,F;
    C=parseInt(prompt('Nhap 0C'));
    F=(C*9)/5+32;
    document.writeln('0F ='+F);
}

//Bai3 +Bai 4
function run3() {
    document.writeln('Bai 3 :'+'<br/>');
    let n=3.14,r,A,C;
    r=prompt('Nhap ban kinh :');
    A=n*r*r;
    C=2*r*n;
    document.writeln('Dien tich hinh tron ='+A+'<br/>');
    document.writeln('Chu vi hinh tron ='+C);
}
