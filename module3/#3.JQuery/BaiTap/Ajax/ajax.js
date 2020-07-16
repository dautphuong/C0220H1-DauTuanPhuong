$(document).ready(function () {
    $.ajax({
        type: "GET", //GET, DELETE, PUT...
        url: "https://spring-student-api.herokuapp.com/info?apiKey=eaf118ab-babf-43ed-a788-b66d2f0ca00c",
        contentType: "text",
        dataType: "json",
        // dataType: "text",
        success: function (result) {
            console.log(result);
            var html_string = '';
            $.each(result, function (i,item) {
                html_string += '<tr><td>' + item.id + '</td>' +
                    '<td>' + item.fullName + '</td>' +
                    '<td>' + item.gender + '</td>' +
                    '<td>' + item.birthDate + '</td>' +
                    '<td>' + item.phoneNumber + '</td>' +
                    '<td>' + item.address + '</td></tr>';
            });
            $("#item").html(html_string);
        },
        fail: function (result) {
        }
    });
});
