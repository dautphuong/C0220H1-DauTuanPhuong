function Bai1() {
    let oC=prompt('Nhap 0C ');
    let oF=oC*9/5+32;
    alert('0F ='+oF);
}

function Bai2() {
    let m=prompt('Nhap met ');
    let ft=m*3.2808;
    alert('Feet ='+ft);
}

function Bai3() {
    let a=prompt('Nhap canh a');
    let S=a*a;
    alert('Dien tich hinh vuong :'+S);
}

function Bai4() {
    let a=prompt('Nhap canh a');
    let b=prompt('Nhap canh a');
    let S=a*b;
    alert('Dien tich hinh chu nhat :'+S);
}

function Bai5() {
    let a=prompt('Nhap canh a');
    let b=prompt('Nhap canh a');
    let S=(a*b)/2;
    alert('Dien tich tam giac vuong :'+S);
}

function Bai6() {
    let num1=prompt('Nhap so thu nhat')*1;
    let num2=prompt('Nhap so thu hai')*1;
    let result=-num2/num1;
    alert(num1+'x + '+num2+' = 0 => x='+result);
}

function Bai7() {
    let num1=prompt('Nhap so thu nhat')*1;
    let num2=prompt('Nhap so thu hai')*1;
    let num3=prompt('Nhap so thu ba')*1;
    if(num1===0){
        if(num2===0){
            if(num3===0){
                alert('Phuong trinh vo so nghiem');
            }else{
                alert('Phuong trinh vo nghiem');
            }
        }else{
            alert('Phuong trinh co nghiem la :'+(-num3/num2));
        }
    }else{
        let  del=num2*num2-4*num1*num3;
        if(del<0){
            alert('Phuong trinh vo nghiem');
        }else if(del>0){
            alert('Phuong trinh co 2 nghiem '+(-num2-Math.sqrt(del))/(2*num1)+' va '+(-num2+Math.sqrt(del))/(2*num1));
        }
    }
}

function Bai8() {
    let age=prompt('Nhap tuoi 1 nguoi');
    if(age>0&&age<120){
        alert(age+ 'la tuoi mot nguoi');
    }else{
        alert('Khong phai tuoi mot nguoi');
    }
}

function Bai9() {
    let num1=prompt('Canh A')*1;
    let num2=prompt('Canh B')*1;
    let num3=prompt('Canh C')*1;
    if(num1>0&&num2>0&&num3>0){
        if(num1+num2>num3&&num2+num3>num1&&num1+num3>num2){
            alert('3 so thuc la canh cua tam giac')
        }else{
            alert('3 so khong phai canh cua tam giac');
        }
    }else{
        alert('3 so khong phai canh cua tam giac');
    }
}

let oldN=0;
function Bai10() {
    let newN=prompt('So cu '+ oldN+' Nhap so dien ')*1;
    let cost=prompt('Nhap gia dien')*1;
    let total;
    if(newN<oldN){
        alert('So moi khong the nho hon so cu');
    }else{
        total=(newN-oldN)*cost;
        oldN=newN;
    }
    alert('Gia dien :'+total);
}

function Bai12() {
    let amount =prompt('So tien vay')*1;
    let month =prompt('So thang')*1;
    let interestRate=prompt('Lai suat hang thang')/100;
    let nMonth=month;
    let total=amount;
    while(nMonth>0){
        total+=total*interestRate;
        nMonth--;
    }
    alert('Tien lai sau '+month +' thang la '+(total-amount));

}

