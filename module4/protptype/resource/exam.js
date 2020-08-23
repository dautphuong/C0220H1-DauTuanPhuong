function submit_final() {
    if (confirm('You are finish ?')) {
        button_onclick();
        location.replace("http://localhost:63342/module4/protptype/result-exam.html");
    }
}

var checkArr = [];//kết quả giả khi chọn A,B,...

function button_onclick() {
    // var correct, Total, point, pointQuestion, totalPoint;
    // Total = 0;
    // correct = 0;
    // point = 0.5;
    // pointQuestion = 0.0;
    // totalPoint = 0.0;



    //kiểm tra đáp án 1
    // if ((document.getElementById("Cau1A").value === document.getElementById("text1").value))
    //     document.getElementById("C1A").style.color = 'red';
    // if ((document.getElementById("Cau1B").value === document.getElementById("text1").value))
    //     document.getElementById("C1B").style.color = 'red';
    // if ((document.getElementById("Cau1C").value === document.getElementById("text1").value))
    //     document.getElementById("C1C").style.color = 'red';
    // if ((document.getElementById("Cau1D").value === document.getElementById("text1").value))
    //     document.getElementById("C1D").style.color = 'red';


    oElement = document.getElementById("text1");
    if (oElement) {
        // Total = Total + 1;
        // totalPoint += point;
        document.getElementById("Cau1A").disabled = true;
        if ((document.getElementById("Cau1A").value === document.getElementById("text1").value) &&
            (document.getElementById("Cau1A").checked)) {
            // correct = correct + 1;
            // pointQuestion += point;
            // document.getElementById("C1A").style.color = 'blue';
            checkArr.push('A');
        }
        document.getElementById("Cau1B").disabled = true;
        if ((document.getElementById("Cau1B").value === document.getElementById("text1").value) &&
            (document.getElementById("Cau1B").checked)) {

            checkArr.push('B');
        }
        document.getElementById("Cau1C").disabled = true;
        if ((document.getElementById("Cau1C").value === document.getElementById("text1").value) &&
            (document.getElementById("Cau1C").checked)) {

            checkArr.push('C');
        }
        document.getElementById("Cau1D").disabled = true;
        if ((document.getElementById("Cau1D").value === document.getElementById("text1").value) &&
            (document.getElementById("Cau1D").checked)) {


            checkArr.push('D');
        }

    }

    //kiểm tra đáp án 2
    // if ((document.getElementById("Cau2A").value === document.getElementById("text2").value))
    //     document.getElementById("C2A").style.color = 'red';
    // if ((document.getElementById("Cau2B").value === document.getElementById("text2").value))
    //     document.getElementById("C2B").style.color = 'red';
    // if ((document.getElementById("Cau2C").value === document.getElementById("text2").value))
    //     document.getElementById("C2C").style.color = 'red';
    // if ((document.getElementById("Cau2D").value === document.getElementById("text2").value))
    //     document.getElementById("C2D").style.color = 'red';


    oElement = document.getElementById("text2");
    if (oElement) {

        document.getElementById("Cau2A").disabled = true;
        if ((document.getElementById("Cau2A").value === document.getElementById("text2").value) &&
            (document.getElementById("Cau2A").checked)) {

            checkArr.push('A');
        }
        document.getElementById("Cau2B").disabled = true;
        if ((document.getElementById("Cau2B").value === document.getElementById("text2").value) &&
            (document.getElementById("Cau2B").checked)) {

            checkArr.push('B');
        }
        document.getElementById("Cau2C").disabled = true;
        if ((document.getElementById("Cau2C").value === document.getElementById("text2").value) &&
            (document.getElementById("Cau2C").checked)) {

            checkArr.push('C');

        }
        document.getElementById("Cau2D").disabled = true;
        if ((document.getElementById("Cau2D").value === document.getElementById("text2").value) &&
            (document.getElementById("Cau2D").checked)) {

            checkArr.push('D');

        }


    }


    //nộp bài
    // document.getElementById("buttonFinish").disabled = true;

    //hiện thị kết quả
    // document.getElementById("result").innerHTML = " You answered correctly <b style='color:blue'>" + correct + "/" + Total + "</b> question." +
    //     "</br></br>Your score is <b style='color:blue'>" + pointQuestion + "/" + totalPoint + "</b>";
}


function finalResult() {
    var correct, Total, point, pointQuestion, totalPoint, resultQ;
    Total = 0;
    correct = 0;
    point = 0.5;
    pointQuestion = 0.0;
    totalPoint = 0.0;
    resultQ = '';


    //hiển thị đáp án 1
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
        resultQ = checkArr.shift();

        console.log(resultQ);

        if ((document.getElementById("Cau1A").value === document.getElementById("text1").value) === resultQ) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C1A").style.color = 'blue';
        }
        document.getElementById("Cau1B").disabled = true;
        if ((document.getElementById("Cau1B").value === document.getElementById("text1").value) === resultQ) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C1B").style.color = 'blue';
        }
        document.getElementById("Cau1C").disabled = true;
        if ((document.getElementById("Cau1C").value === document.getElementById("text1").value) === resultQ) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C1C").style.color = 'blue';
        }
        document.getElementById("Cau1D").disabled = true;
        if ((document.getElementById("Cau1D").value === document.getElementById("text1").value) === resultQ) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C1D").style.color = 'blue';
        }

    }

    //hiển thị đáp án 2
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
        resultQ = checkArr.shift();


        if ((document.getElementById("Cau2A").value === document.getElementById("text2").value) === resultQ) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C2A").style.color = 'blue';
        }
        document.getElementById("Cau2B").disabled = true;
        if ((document.getElementById("Cau2B").value === document.getElementById("text2").value) === resultQ) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C2B").style.color = 'blue';
        }
        document.getElementById("Cau1C").disabled = true;
        if ((document.getElementById("Cau1C").value === document.getElementById("text2").value) === resultQ) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C2A").style.color = 'blue';
        }
        document.getElementById("Cau2D").disabled = true;
        if ((document.getElementById("Cau2D").value === document.getElementById("text2").value) === resultQ) {
            correct = correct + 1;
            pointQuestion += point;
            document.getElementById("C2D").style.color = 'blue';
        }

    }






    //hiện thị kết quả
    document.getElementById("result").innerHTML = " You answered correctly <b style='color:blue'>" + correct + "/" + Total + "</b> question." +
        "</br></br>Your score is <b style='color:blue'>" + pointQuestion + "/" + totalPoint + "</b>";
}
