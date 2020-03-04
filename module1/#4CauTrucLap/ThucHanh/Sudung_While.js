function Bai1() {
    let num = prompt("Enter a number: ") * 1;
    let total = 0;
    while (num !== -1) {
        alert(num);
        total += num;
        num = prompt("Enter a number: ") * 1;
    }
    alert('Sum =' + (total));
}

function Bai2() {
    let i = 1;

    while (i < 100) {
        //phân thân vòng lặp
        document.write("<hr width = " + i + "%>");
        i++;
    }
}