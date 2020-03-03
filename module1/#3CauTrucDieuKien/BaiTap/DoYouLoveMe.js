let btnNo=document.getElementById('btnNo');

function ClickYes() {
    alert('Great! I love you too!');
}

function ClickNo() {
    let x = Math.random() * window.innerWidth;
    let y = Math.random() * window.innerHeight;
    btnNo.style.left = x + 'px';
    btnNo.style.top = y + 'px';
}