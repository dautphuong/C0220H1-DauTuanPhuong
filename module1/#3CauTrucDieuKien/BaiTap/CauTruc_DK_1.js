function Bai1() {
    let a=prompt('Nhap a :');
    let b=prompt('Nhap b :');
    if(a%b===0){
        alert('a chia het cho b');
    }else{
        alert('a khong chia het cho b');
    }
}

function Bai2() {
    let age=prompt('Nhap tuoi :');
    if(age<15){
        alert('Khong du dieu kien vao hoc lop 10');
    }else{
        alert('Du dieu kien vao hoc lop 10');
    }
}

function Bai3() {
    let number=parseInt(prompt('Nhap so nguyen :'));
    //toFixed
    if(number>0){
        alert('Gia tri '+number+' lon hon 0');
    }else if(number === 0){
        alert('Gia tri bang 0');
    }else{
        alert('Gia tri '+number+' nho hon 0');
    }
}

function Bai4() {
    let num1=prompt('a =')*1;
    let num2=prompt('b =')*1;
    let num3=prompt('c =')*1;
    if(num1>num2){
        if(num1>num3){
            alert(num1+' la gia tri lon nhat');
        }else{
            alert(num3+' la gia tri lon nhat');
        }
    }else{
        if(num2>num3){
            alert(num2+' la gia tri lon nhat');
        }else{
            alert(num3+' la gia tri lon nhat');
        }
    }
}

function Bai5() {
    let dMieng =prompt('Diem kiem tra Mieng ');
    let d15p =prompt('Diem kiem tra 15p ');
    let dGiuaKi =prompt('Diem kiem tra giua ki ');
    let dCuoiKi =prompt('Diem kiem tra cuoi ki ');
    let total=(dMieng*1+d15p*1+dGiuaKi*2+dCuoiKi*3)/7;
    alert(total);
    if(total>8 && dCuoiKi>6){
        alert('Hoc sinh Gioi');
    }else if(total>6 && dCuoiKi>4){
        alert('Hoc sinh Kha');
    }else if(total>4 && dCuoiKi>1){
        alert('Hoc sinh Trung Binh');
    }else{
        alert('Hoc sinh Kem');
    }
}

function Bai7() {
    let time=prompt('Nhap so phut goi :');
    let money=25000;
    let cost=0;

    if(time<50){
        cost=cost+time*600;
    }else if(time<200){
        cost+=50*600+(time-50)*400;
    }else{
        cost+=50*600+150*400+(time-200)*200;
    }

    money+=cost;
    alert('Cuoc dien thoai :'+money);
}



