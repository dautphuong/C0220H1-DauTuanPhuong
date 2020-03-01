function Bai1() {
    let a=prompt('a :');
    let b=prompt('b :');
    let result=(a+b<4)?'Below':'Over';
    alert(result);
}

function Bai2() {
    let login=prompt('UserName ?');
    let message = (login === 'Employee') ? 'Hello' :
        (login === 'Director') ? 'Greetings' :
            (login === '') ?
                'No login' :
                '';
    alert(message);
}