function custom() {
    var number=document.getElementById('number');
    var fromCurrency=document.getElementById('fromCurrency');
    var toCurrency=document.getElementById('toCurrency');
    var result = document.getElementById('result');
    var money=parseInt(number.value);
    var n_money;
    if(fromCurrency.value==="VN"){
        if(toCurrency.value==="VN"){
            n_money=money;
        }else if(toCurrency.value==="USD"){
            n_money=money/23000;
        }
    }else if(fromCurrency.value==="USD"){
        if(toCurrency.value==="VN"){
            n_money=money*23000;
        }else if(toCurrency.value==="USD"){
            n_money=money;
        }
    }
    result.innerText=n_money;
}