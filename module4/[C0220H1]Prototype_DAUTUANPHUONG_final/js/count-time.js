//set time = minutes
var timeSet = 1;

var seconds = timeSet * 60;


// exam timer
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


