function objDate() {
    //new Date(year, month, day, hours, minutes, seconds, milliseconds);
    let today = new Date();
    let birthday = new Date(1999, 7, 14);
    let Seconds = Math.floor((today.getTime() - birthday.getTime()) / 1000);
    let minutes = Math.floor(Seconds / 60);
    let hours = Math.floor(minutes / 60);
    let day = Math.floor(hours / 24);
    let month = Math.floor(day / 30);
    let year = Math.floor(month / 12);

    alert('Tôi đã sống: ' + (year) + ' năm'
        + '\nTôi đã sống: ' + (month) + ' tháng'
        + '\nTôi đã sống: ' + (day) + ' ngày'
        + '\nTôi đã sống: ' + (hours) + ' giờ'
        + '\nTôi đã sống: ' + (minutes) + ' phút'
        + '\nTôi đã sống: ' + (Seconds));
}

function objMath() {
    document.write(Math.floor(Math.random() * 11) + '<br>');
    document.write(Math.floor(Math.random() * 401) + '<br>');
    document.write(Math.floor(Math.random() * (101 - 50) + 50) + '<br>');
    let number = [5, 7, 2, 9]
    let minInNumbers = Math.min.apply(Math, number);
    document.write('Min: '+minInNumbers);
    let r=prompt('ban kinh');
    let Area=Math.PI*r*r;
    alert('Area= '+Area);
}

function objString() {
    let str="Tôi yêu ngôn ngữ lập trình Javascript";
    let count=0;
    for(let i=0;i<str.length;i++){
        if(str[i]==='a'){
            count++;
        }
    }
    document.write('So lan xuat hien a: '+count+'<br>');
    let array=str.split('');
    console.log(array);
    document.write('So luong tu trong chuoi: '+str.length+'<br>');
    let txt=str.replace("Javascript","Typescript");
    document.write(txt);
}