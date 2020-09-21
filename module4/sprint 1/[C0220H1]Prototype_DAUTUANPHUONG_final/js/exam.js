var answerArr = [];
var queryString = decodeURIComponent(window.location.search);
queryString = queryString.substring(1);
var queries = queryString.split("&");
for (var i = 0; i < queries.length; i++) {
    answerArr.push(queries[i]);
}
button_onclick(answerArr);

function button_onclick(answerArr) {
    var correct, Total, point, pointQuestion, totalPoint;
    Total = 0;
    correct = 0;
    point = 2.5;
    pointQuestion = 0.0;
    totalPoint = 0.0;
    var answer;


    //check correct answer 1
    if ((document.getElementById("Cau1A").value === document.getElementById("text1").value))
        document.getElementById("C1A").style.color = 'red';
    if ((document.getElementById("Cau1B").value === document.getElementById("text1").value))
        document.getElementById("C1B").style.color = 'red';
    if ((document.getElementById("Cau1C").value === document.getElementById("text1").value))
        document.getElementById("C1C").style.color = 'red';
    if ((document.getElementById("Cau1D").value === document.getElementById("text1").value))
        document.getElementById("C1D").style.color = 'red';


    //check answer 1
    answer = answerArr.shift();
    oElement = document.getElementById("text1");
    if (oElement) {
        Total = Total + 1;
        totalPoint += point;
        document.getElementById("Cau1A").disabled = true;
        if ((document.getElementById("Cau1A").value === document.getElementById("text1").value) &&
            document.getElementById("text1").value == answer) {
            correct = correct + 1;
            pointQuestion += point;
        }
        document.getElementById("Cau1B").disabled = true;

        if ((document.getElementById("Cau1B").value === document.getElementById("text1").value) &&
            document.getElementById("text1").value == answer) {
            correct = correct + 1;
            pointQuestion += point;
        }
        document.getElementById("Cau1C").disabled = true;
        if ((document.getElementById("Cau1C").value === document.getElementById("text1").value) &&
            document.getElementById("text1").value == answer) {
            correct = correct + 1;
            pointQuestion += point;
        }
        document.getElementById("Cau1D").disabled = true;
        if ((document.getElementById("Cau1D").value === document.getElementById("text1").value) &&
            document.getElementById("text1").value == answer) {
            correct = correct + 1;
            pointQuestion += point;
        }

        //check tick answer 1
        if (document.getElementById("Cau1A").value == answer) {
            document.getElementById("Q1A").style.visibility = "visible";
            document.getElementById("C1A").style.color = 'green';
        }
        if (document.getElementById("Cau1B").value == answer) {
            document.getElementById("Q1B").style.visibility = "visible";
            document.getElementById("C1B").style.color = 'green';

        }
        if (document.getElementById("Cau1C").value == answer) {
            document.getElementById("Q1C").style.visibility = "visible";
            document.getElementById("C1C").style.color = 'green';
        }
        if (document.getElementById("Cau1D").value == answer) {
            document.getElementById("Q1D").style.visibility = "visible";
            document.getElementById("C1D").style.color = 'green';
        }
        answer = '';
    }

    //check correct answer 2
    if ((document.getElementById("Cau2A").value === document.getElementById("text2").value))
        document.getElementById("C2A").style.color = 'red';
    if ((document.getElementById("Cau2B").value === document.getElementById("text2").value))
        document.getElementById("C2B").style.color = 'red';
    if ((document.getElementById("Cau2C").value === document.getElementById("text2").value))
        document.getElementById("C2C").style.color = 'red';
    if ((document.getElementById("Cau2D").value === document.getElementById("text2").value))
        document.getElementById("C2D").style.color = 'red';

    //check answer 2

    answer = answerArr.shift();
    oElement = document.getElementById("text2");
    if (oElement) {
        Total = Total + 1;
        totalPoint += point;
        document.getElementById("Cau2A").disabled = true;
        if ((document.getElementById("Cau2A").value === document.getElementById("text2").value) &&
            document.getElementById("text2").value == answer) {
            correct = correct + 1;
            pointQuestion += point;
        }
        document.getElementById("Cau2B").disabled = true;
        if ((document.getElementById("Cau2B").value === document.getElementById("text2").value) &&
            document.getElementById("text2").value == answer) {
            correct = correct + 1;
            pointQuestion += point;
        }
        document.getElementById("Cau2C").disabled = true;
        if ((document.getElementById("Cau2C").value === document.getElementById("text2").value) &&
            document.getElementById("text2").value == answer) {
            correct = correct + 1;
            pointQuestion += point;

        }
        document.getElementById("Cau2D").disabled = true;
        if ((document.getElementById("Cau2D").value === document.getElementById("text2").value) &&
            document.getElementById("text2").value == answer) {
            correct = correct + 1;
            pointQuestion += point;

        }
        //check tick answer 2

        if (document.getElementById("Cau2A").value == answer) {
            document.getElementById("Q2A").style.visibility = "visible";
            document.getElementById("C2A").style.color = 'green';
        }
        if (document.getElementById("Cau2B").value == answer) {
            document.getElementById("Q2B").style.visibility = "visible";
            document.getElementById("C2B").style.color = 'green';
        }
        if (document.getElementById("Cau2C").value == answer) {
            document.getElementById("Q2C").style.visibility = "visible";
            document.getElementById("C2C").style.color = 'green';
        }
        if (document.getElementById("Cau2D").value == answer) {
            document.getElementById("Q2D").style.visibility = "visible";
            document.getElementById("C2D").style.color = 'green';
        }
        answer = '';
    }
    //check correct answer 3
    if ((document.getElementById("Cau3A").value === document.getElementById("text3").value))
        document.getElementById("C3A").style.color = 'red';
    if ((document.getElementById("Cau3B").value === document.getElementById("text3").value))
        document.getElementById("C3B").style.color = 'red';
    if ((document.getElementById("Cau3C").value === document.getElementById("text3").value))
        document.getElementById("C3C").style.color = 'red';
    if ((document.getElementById("Cau3D").value === document.getElementById("text3").value))
        document.getElementById("C3D").style.color = 'red';
    //check answer 3

    answer = answerArr.shift();
    oElement = document.getElementById("text3");
    if (oElement) {
        Total = Total + 1;
        totalPoint += point;
        document.getElementById("Cau3A").disabled = true;
        if ((document.getElementById("Cau3A").value === document.getElementById("text3").value) &&
            document.getElementById("text3").value == answer) {
            correct = correct + 1;
            pointQuestion += point;
        }
        document.getElementById("Cau3B").disabled = true;

        if ((document.getElementById("Cau3B").value === document.getElementById("text3").value) &&
            document.getElementById("text3").value == answer) {
            correct = correct + 1;
            pointQuestion += point;
        }
        document.getElementById("Cau3C").disabled = true;
        if ((document.getElementById("Cau3C").value === document.getElementById("text3").value) &&
            document.getElementById("text3").value == answer) {
            correct = correct + 1;
            pointQuestion += point;
        }
        document.getElementById("Cau3D").disabled = true;
        if ((document.getElementById("Cau3D").value === document.getElementById("text3").value) &&
            document.getElementById("text3").value == answer) {
            correct = correct + 1;
            pointQuestion += point;
        }
        //check tick answer 3

        if (document.getElementById("Cau3A").value == answer) {
            document.getElementById("Q3A").style.visibility = "visible";
            document.getElementById("C3A").style.color = 'green';
        }
        if (document.getElementById("Cau3B").value == answer) {
            document.getElementById("Q3B").style.visibility = "visible";
            document.getElementById("C3B").style.color = 'green';
        }
        if (document.getElementById("Cau3C").value == answer) {
            document.getElementById("Q3C").style.visibility = "visible";
            document.getElementById("C3C").style.color = 'green';
        }
        if (document.getElementById("Cau3D").value == answer) {
            document.getElementById("Q3D").style.visibility = "visible";
            document.getElementById("C3D").style.color = 'green';
        }
        answer = '';
    }
    //check correct answer 4
    if ((document.getElementById("Cau4A").value === document.getElementById("text4").value))
        document.getElementById("C4A").style.color = 'red';
    if ((document.getElementById("Cau4B").value === document.getElementById("text4").value))
        document.getElementById("C4B").style.color = 'red';
    if ((document.getElementById("Cau4C").value === document.getElementById("text4").value))
        document.getElementById("C4C").style.color = 'red';
    if ((document.getElementById("Cau4D").value === document.getElementById("text4").value))
        document.getElementById("C4D").style.color = 'red';
    //check answer 4

    answer = answerArr.shift();
    oElement = document.getElementById("text4");
    if (oElement) {
        Total = Total + 1;
        totalPoint += point;
        document.getElementById("Cau4A").disabled = true;
        if ((document.getElementById("Cau4A").value === document.getElementById("text4").value) &&
            document.getElementById("text4").value == answer) {
            correct = correct + 1;
            pointQuestion += point;
        }
        document.getElementById("Cau4B").disabled = true;

        if ((document.getElementById("Cau4B").value === document.getElementById("text4").value) &&
            document.getElementById("text4").value == answer) {
            correct = correct + 1;
            pointQuestion += point;
        }
        document.getElementById("Cau4C").disabled = true;
        if ((document.getElementById("Cau4C").value === document.getElementById("text4").value) &&
            document.getElementById("text4").value == answer) {
            correct = correct + 1;
            pointQuestion += point;
        }
        document.getElementById("Cau4D").disabled = true;
        if ((document.getElementById("Cau4D").value === document.getElementById("text4").value) &&
            document.getElementById("text4").value == answer) {
            correct = correct + 1;
            pointQuestion += point;
        }
        //check tick answer 4

        if (document.getElementById("Cau4A").value == answer) {
            document.getElementById("Q4A").style.visibility = "visible";
            document.getElementById("C4A").style.color = 'green';
        }
        if (document.getElementById("Cau4B").value == answer) {
            document.getElementById("Q4B").style.visibility = "visible";
            document.getElementById("C4B").style.color = 'green';
        }
        if (document.getElementById("Cau4C").value == answer) {
            document.getElementById("Q4C").style.visibility = "visible";
            document.getElementById("C4C").style.color = 'green';
        }
        if (document.getElementById("Cau4D").value == answer) {
            document.getElementById("Q4D").style.visibility = "visible";
            document.getElementById("C4D").style.color = 'green';
        }
        answer = '';
    }


    // show results
    document.getElementById("result").innerHTML = " You answered correctly <b style='color:blue'>" + correct + "/" + Total + "</b> question." +
        "</br></br>Your score is <b style='color:blue'>" + pointQuestion + "/" + totalPoint + "</b>";
}


