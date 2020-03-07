function custom() {
    let number = document.getElementById('number');
    let fromCurrency = document.getElementById('fromCurrency');
    let toCurrency = document.getElementById('toCurrency');
    let result = document.getElementById('result');
    let money = parseInt(number.value);
    let n_money;

    if (fromCurrency.value === "VN") {
        if (toCurrency.value === "VN") {
            n_money = money;
        } else if (toCurrency.value === "USD") {
            n_money = money / 23000;
        }
    } else if (fromCurrency.value === "USD") {
        if (toCurrency.value === "VN") {
            n_money = money * 23000;
        } else if (toCurrency.value === "USD") {
            n_money = money;
        }
    }
    result.innerText = 'Result :' + n_money;
}