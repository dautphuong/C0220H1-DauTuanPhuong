//submit index
function check() {
    if (confirm('You are finish ?')) {

        var question_01 = document.myform.question_01.value;
        var question_02 = document.myform.question_02.value;
        var question_03 = document.myform.question_03.value;
        var question_04 = document.myform.question_04.value;

        var queryString = "?" + question_01 + "&" + question_02 + "&" + question_03 + "&" + question_04;
        window.open("result.html" + queryString, "_self");
    }
}

//submit index for time up
function final() {
    var question_01 = document.myform.question_01.value;
    var question_02 = document.myform.question_02.value;
    var question_03 = document.myform.question_03.value;
    var question_04 = document.myform.question_04.value;
    var queryString = "?" + question_01 + "&" + question_02 + "&" + question_03 + "&" + question_04;
    window.open("result.html" + queryString);
}
