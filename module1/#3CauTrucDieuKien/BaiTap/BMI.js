let hight = document.getElementById('hight');
let weight = document.getElementById('weight');
let result = document.getElementById('result');

function Cal() {
    let BMI = weight.value / hight.value;
    if (BMI < 18.5) {
        result.innerText = 'UnderWeight';
    } else if (BMI < 25) {
        result.innerText = 'Normal';
    } else if (BMI < 30) {
        result.innerText = 'OverWeight';
    } else {
        result.innerText = 'Obese';
    }
}