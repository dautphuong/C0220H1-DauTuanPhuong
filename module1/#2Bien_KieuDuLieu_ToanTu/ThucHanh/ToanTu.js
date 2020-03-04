let inputWidth;
let inputHeight;

inputWidth = prompt('Enter the Width :');
inputHeight = prompt('Enter the Height');

let Width = parseInt(inputWidth);
let Height = parseInt(inputHeight);

let area = Width * Height;//tinh dien tich hinh chu nhat
document.writeln('The area is :' + area);