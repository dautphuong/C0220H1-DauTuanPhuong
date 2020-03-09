function Bai1() {
    let a=[5,10,15,20,25,30,4,7,1,0];
    let count=0;
    for(let i=0;i<a.length;i++){
        if(a[i]<=10){
            count++;
        }
    }
    alert(count + ' so nguyen lon hon hoac bang 10');
}

function Bai2() {
    let a=[2,5,6,4,8,7,9,11,15,13];
    let max=a[0];
    let index=0;
    for(let i=1;i<a.length;i++){
        if(a[i]>max){
            max=a[i];
            index=i;
        }
    }
    alert('So '+max+' vi tri '+index+' la gia tri lon nhat');
}

function Bai3() {
    let a=[2,5,2,4,8,7,9,11,15,13];
    let max=a[0];
    let sum=0;
    for(let i=1;i<a.length;i++){
        if(a[i]>max){
            max=a[i];
        }
        sum+=a[i];
    }
    let tb=sum/a.length;
    alert('Gia tri lon nhat la '+max +'.Trung binh la '+tb);
}

function Bai4() {
    let a=[];
    let b=[];
    let n=prompt('Nhap so phan tu mang');
    for(let i=0;i<n;i++){
        a[i]=prompt('Nhap phan tu thu '+(i+1));
    }
    b=a.reverse();
    alert(b)
}

function Bai5() {
    let a='2-31-2-3-231-2-3';
    let b=[];let j=0;
    for(let i=0;i<a.length;i++){
        if(a[i]==='-'){
            b[j++]=a[i]+a[i+1];
        }
    }
    alert(b.join());
}

function Bai6() {
    let a=[5,7,11,12,26,32];
    let V=prompt('Nhap V');
    let flag=false;
    for(let i=0;i<a.length;i++){
        if(V==a[i]){
            flag=true;
        }
    }
   if(flag){
       alert(V +' is in the array');
   }else{
       alert(V+' is not in the array');
   }
}

function Bai7() {
    let a=[5,7,15,9,26,18];
    let V=prompt('Nhap V');
    for(let i=0;i<a.length;i++){
        if(V==a[i]){
            for(let j=i;j<a.length;j++){
                a[j]=a[j+1];
            }
        }
    }
    a.length=a.length-1;
    alert(a.join());
}

function Bai8() {
    let a=[27,6,5,14,13,21,17,18];
    a.sort(function(a, b){return b-a});
    alert(a.join());
}

function Bai9() {
    let a=[2,4,6,8,10];
    let b=[1,3,5,7,9];
    let c=a.concat(b);
    alert(c.join());
}