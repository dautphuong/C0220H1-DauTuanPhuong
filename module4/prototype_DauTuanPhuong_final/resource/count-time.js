//đặt thời gian = phút
var timeSet = 1;

var seconds = timeSet * 60;


//bộ đếm thời gian bài thi
function secondPassed() {
    var minutes = Math.round((seconds - 30) / 60);
    var remainingSeconds = seconds % 60;
    if (remainingSeconds < 10) {
        remainingSeconds = "0" + remainingSeconds;
    }
    document.getElementById('time').innerHTML = minutes + ":" + remainingSeconds;
    if (seconds == 0) {
        clearInterval(countdownTimer);
        document.getElementById('time').innerHTML = "final!";
        final();
    } else {
        seconds--;
    }
}

var countdownTimer = setInterval('secondPassed()', 1000);

function workTime() {
    let timeStop = timeSet * 60 - seconds;
    var minutesStop = Math.round((timeStop - 30) / 60);
    var remainingSecondsStop = timeStop % 60;
    if (remainingSecondsStop < 10) {
        remainingSecondsStop = "0" + remainingSecondsStop;
    }
    document.getElementById('timeStop').innerHTML = minutesStop + ":" + remainingSecondsStop;
}
