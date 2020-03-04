function Bai1() {
    let browser = prompt('Please type your ?');
    switch (browser) {
        case 'Edge':
            alert("You 've got the Edge!");
            break;
        case 'Chrome':
        case 'FireFox':
        case 'Safari':
        case 'Opera':
            alert('Okay we support these browser too');
            break;
        default:
            alert('We hope that this pge look ok!');
    }
}

function Bai2() {
    let a = prompt('a?');
    switch (a * 1) {
        case 0:
            alert(0);
            break;
        case 1:
            alert(1);
            break;
        case 2:
        case 3:
            alert('2,3');
            break;
    }
}

function Bai3() {
    let value = prompt('Type a number');
    switch ((value > 0) ? 1 : (value < 0) ? -1 : 0) {
        case 1 :
            alert(1);
            break;
        case -1:
            alert(-1);
            break;
        default :
            alert(0);
    }

}