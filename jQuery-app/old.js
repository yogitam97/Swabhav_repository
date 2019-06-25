$(document).ready(function () {

    var studentArr = []

    //retrieve data from the server
    $('#displayBtn').click(function () {
        var getData = (function () {
            $.ajax({
                async: true,
                type: "GET",
                url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/",
                success: (function (response) {
                    $('#count').text(response.length)
                    console.log(response)
                    studentArr = response
                    console.log(studentArr.length)
                    display()
                })
            })
        })();
    })
    //display function
    var display = (function () {
        var heading = '<table id="students" class="table table-dark"><thead><th>ID</th><th>Rollno</th><th>Name</th><th>Email</th><th>Age</th><th>Date</th><th>Gender</th></thead>'
        var str = ""
        console.log(studentArr.length)
        for (var i = 0; i < studentArr.length; i++) {
            if (studentArr[i].isMale == true) {
                studentArr[i].isMale = "Male"
            }
            else {
                studentArr[i].isMale = "Female"
            }
            str = str + '<tr><td>' + studentArr[i].id + '</td><td>' + studentArr[i].rollNo + '</td><td>' + studentArr[i].name + '</td><td>' + studentArr[i].email + '</td><td>' + studentArr[i].age + '</td><td>' + studentArr[i].date + '</td><td>' + studentArr[i].isMale + '</td></tr>'
        }
        $('#table').html(heading + str + '</table>')
    })

    //adding data to the server
    $('#addBtn').click(function () {

        var selected;
        if ($('#male').is(":checked")) {
            selected = true
        }
        else {
            selected = false
        }

        var newObj = {
            "rollNo": $('#rollno').val(),
            "name": $('#name').val(),
            "age": parseInt($('#age').val()),
            "email": $('#email').val(),
            "date": $('#date').val(),
            "isMale": selected
        }

        $.ajax({
            type: "POST",
            url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/",
            data: newObj,
            success: (function (response) {
                console.log(response)
                getData()
            }),
            failure: (function () {
                consol.log("error occured")
            })
        })
    })

})