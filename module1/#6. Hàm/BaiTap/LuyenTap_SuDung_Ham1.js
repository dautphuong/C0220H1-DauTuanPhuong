//Bài 1: Tạo hàm alertMessage() hiển thị hộp thoại chứa chuỗi  "Xin chao".
//Gọi hàm từ trong phần <body> của trang web.
function alertMessage() {
    alert('Xin chao!');
}

//Bài 2: Tạo hàm nhận vào một đối số dạng số, tăng giá trị đối số đó lên 1 và trả lại giá trị cho lời gọi hàm.
//Gọi hàm từ trong phần <body> của trang web và hiển thị kết quả lên màn hình.
function increment(num) {
    return Number(num) + 1;
}

function Bai2() {
    let n = prompt('Nhap n');
    alert(increment(n));
}

//Bài 3: Tạo hàm nhận vào hai tham số. Nếu giá trị của tham số thứ nhất lớn hơn tham số thứ hai,
//hiển thị hộp thoại thông báo cho người dùng.
//Nếu giá trị của tham số thứ nhất nhỏ hơn hoặc bằng tham số thứ hai, trả về tổng của hai tham số.

function sum(x, y) {
    if (x > y) {
        return 'Input Again!';
    } else {
        return (x * 1 + y * 1);
    }
}

function Bai3() {
    let a = prompt('Nhap so thu nhat');
    let b = prompt('Nhap so thu hai');
    alert('Result: ' + sum(a, b));
}
//Bài 4: Thêm các hàm alert() vào những vị trí thích hợp trong đoạn mã sau
//để bạn có thể nhìn thấy giá trị của biến result trước và sau lời gọi hàm.
function Result() {
    function addNumbers() {
        let firstNum = 4;
        let secondNum = 8;
        result = firstNum + secondNum;
        return result;
    }

    let result = 0;
    alert(result);
    result = addNumbers();
    alert(result);
}
//Bài 5: Trong hàm này, duyệt qua mảng thứ nhất để tìm tên ngôi sao.
//Nếu tìm thấy, trả lại giá trị tương ứng với chỉ số đó ở mảng thứ hai
function findStar() {
    let str = prompt('Nhap ngoi sao can tim');
    let star = ['Polaris', 'Aldebaran', 'Deneb', 'Vega', 'Altair', 'Dubhe', 'Regulus'];
    let constellation = ['Ursa Minor', 'Tarurus', 'Cygnus', 'Lyra', 'Aquila', 'Ursa Major', 'Leo']
    for (let i = 0; i < star.length; i++) {
        if (str === star[i]) {
            alert(constellation[i]);
            break;
        } else {
            if (i === star.length - 1) {
                alert('Ngoi sao khong ton tai');
            }
        }

    }
}