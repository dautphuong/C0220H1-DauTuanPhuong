function submit_final() {
    if (confirm('You are finish ?')) {
        button_onclick();
    }
}


function button_onclick() {
    var correct, Total, point, pointQuestion, totalPoint;
    Total = 0;
    correct = 0;
    point = 0.5;
    pointQuestion = 0.0;
    totalPoint = 0.0;



    //kiểm tra đáp án 1
    if ((document.getElementById("Cau1A").value === document.getElementById("text1").value))
        document.getElementById("C1A").style.color = 'red';
    if ((document.getElementById("Cau1B").value === document.getElementById("text1").value))
        document.getElementById("C1B").style.color = 'red';
    if ((document.getElementById("Cau1C").value === document.getElementById("text1").value))
        document.getElementById("C1C").style.color = 'red';
    if ((document.getElementById("Cau1D").value === document.getElementById("text1").value))
        document.getElementById("C1D").style.color = 'red';


    oElement = document.getElementById("text1");
    if (oElement) {
        Total = Total + 1;
        totalPoint += point;
        document.getElementById("Cau1A").disabled = true;
        if ((document.getElementById("Cau1A").value === document.getElementById("text1").value) &&
            (document.getElementById("Cau1A").checked)) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C1A").style.color = 'blue';
        }
        document.getElementById("Cau1B").disabled = true;
        if ((document.getElementById("Cau1B").value === document.getElementById("text1").value) &&
            (document.getElementById("Cau1B").checked)) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C1A").style.color = 'blue';
        }
        document.getElementById("Cau1C").disabled = true;
        if ((document.getElementById("Cau1C").value === document.getElementById("text1").value) &&
            (document.getElementById("Cau1C").checked)) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C1A").style.color = 'blue';
        }
        document.getElementById("Cau1D").disabled = true;
        if ((document.getElementById("Cau1D").value === document.getElementById("text1").value) &&
            (document.getElementById("Cau1D").checked)) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C1A").style.color = 'blue';
        }

    }

    //kiểm tra đáp án 2
    if ((document.getElementById("Cau2A").value === document.getElementById("text2").value))
        document.getElementById("C2A").style.color = 'red';
    if ((document.getElementById("Cau2B").value === document.getElementById("text2").value))
        document.getElementById("C2B").style.color = 'red';
    if ((document.getElementById("Cau2C").value === document.getElementById("text2").value))
        document.getElementById("C2C").style.color = 'red';
    if ((document.getElementById("Cau2D").value === document.getElementById("text2").value))
        document.getElementById("C2D").style.color = 'red';


    oElement = document.getElementById("text2");
    if (oElement) {
        Total = Total + 1;
        totalPoint += point;
        document.getElementById("Cau2A").disabled = true;
        if ((document.getElementById("Cau2A").value === document.getElementById("text2").value) &&
            (document.getElementById("Cau2A").checked)) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C1A").style.color = 'blue';
        }
        document.getElementById("Cau2B").disabled = true;
        if ((document.getElementById("Cau2B").value === document.getElementById("text2").value) &&
            (document.getElementById("Cau2B").checked)) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C1A").style.color = 'blue';
        }
        document.getElementById("Cau2C").disabled = true;
        if ((document.getElementById("Cau2C").value === document.getElementById("text2").value) &&
            (document.getElementById("Cau2C").checked)) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C1A").style.color = 'blue';

        }
        document.getElementById("Cau2D").disabled = true;
        if ((document.getElementById("Cau2D").value === document.getElementById("text2").value) &&
            (document.getElementById("Cau2D").checked)) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C1A").style.color = 'blue';

        }


    }


    //nộp bài
    // document.getElementById("buttonFinish").disabled = true;

    // hiện thị kết quả
    document.getElementById("result").innerHTML = " You answered correctly <b style='color:blue'>" + correct + "/" + Total + "</b> question." +
        "</br></br>Your score is <b style='color:blue'>" + pointQuestion + "/" + totalPoint + "</b>";
}


