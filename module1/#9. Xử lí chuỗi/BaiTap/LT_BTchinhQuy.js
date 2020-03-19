//Bài 1: Kiểm tra chuỗi đưa vào có đúng dạng dd/mm/yyyy
function Bai1() {
    let str = prompt('Nhap chuoi (dd//mm//yyy)')
    let filter = /^[\d]{2}\/[\d]{2}\/[\d]{4}$/;
    if (!filter.test(str)) {
        alert('String is invalid!');
    } else {
        alert('Email is valid');
    }
}

//Bài 2: Đếm số từ trong một chuỗi
function Bai2() {
    let str = prompt('Nhap chuoi');
    alert('So tu trong chuoi: ' + str.length);
}

//Bài 3: Đếm số nguyên âm/phụ âm trong một chuỗi
function Bai3() {
    let str = prompt('Nhap chuoi');
    let nguyenam = /^[aăâeêioôơuưy]$/i;//i khong phan biet chu hoa chu thuong
    let phuam = /^[bcdđghklmnpqrstvx]$/i;
    let count1 = 0;
    let count2 = 0;
    for (let i = 0; i < str.length; i++) {
        if (nguyenam.test(str[i])) {
            count1++;
        }
        if (phuam.test(str[i])) {
            count2++;
        }
    }
    alert('So nguyen am: ' + count1 + '\nSo phu am: ' + count2);
}

//Bài 4: Kiểm tra mã số bảo mật hợp lệ
function Bai4() {
    let idCard = prompt('Enter Id Card');

    let filter = /^([0-9]{9})$/;
    if (!filter.test(idCard)) {
        alert('idCard is invalid!');
    } else {
        alert('idCard is valid');
    }

}