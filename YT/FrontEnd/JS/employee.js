getAllEmployees();

function saveEmployee(){

    let name = $('#name').val();
    let address = $('#address').val();
    let number = $('#mobile').val();

    // console.log(name);
    $.ajax({
        method:"POST",
        contentType: "application/json",
        url:"http://localhost:8080/api/v1/emp/saveEmp",
        async:true,
        data: JSON.stringify({
            "empID":"",
            "empName": name,
            "empAddress" : address,
            "empMNumber" : number
        }),
        success: function (data){
            alert("employee saved.!")
            getAllEmployees();
        },
        error: function (xhr, exception){
            alert("error at saved.!")
        }
    })
}

function updateEmployee(){

    let empID= $('#empID').val()
    let name = $('#name').val();
    let address = $('#address').val();
    let number = $('#mobile').val();

    // console.log(name);
    $.ajax({
        method:"PUT",
        contentType: "application/json",
        url:"http://localhost:8080/api/v1/emp/updateEmp",
        async:true,
        data: JSON.stringify({
            "empID":empID,
            "empName": name,
            "empAddress" : address,
            "empMNumber" : number
        }),
        success: function (data){
            alert("employee updated.!")
            getAllEmployees();
        },
        error: function (xhr, exception){
            alert("error at update.!")
        }
    })
}

function deleteEmployee(){

    let empID= $('#empID').val()

    $.ajax({
        method:"DELETE",
        url:"http://localhost:8080/api/v1/emp/deleteEmp/"+empID,
        async:true,
        success: function (data){
            alert("employee deleted.!")
            getAllEmployees();
        },
        error: function (xhr, exception){
            alert("error at delete.!")
        }
    })
}

function getAllEmployees(){

    $.ajax({
        method:"GET",
        url:"http://localhost:8080/api/v1/emp/getAllEmp",
        async:true,
        success: function (data){

            if (data.code==="00"){
                $('#empTable').empty();
                for (let emp of data.content){
                    let empID = emp.empID
                    let name = emp.empName
                    let address = emp.empAddress
                    let number = emp.empMNumber

                    var row = `<tr>
                                        <td>${empID}</td>
                                        <td>${name}</td>
                                        <td>${address}</td>
                                        <td>${number}</td>
                                      </tr>`;
                    $('#empTable').append(row)
                }
            }
        },
        error: function (xhr, exception){
            alert("error at load.!")
        }
    })
}

$(document).ready(function (){
    $(document).on('click','#empTable tr', function (){
        var col0 = $(this).find('td:eq(0)').text();
        var col1 = $(this).find('td:eq(1)').text();
        var col2 = $(this).find('td:eq(2)').text();
        var col3 = $(this).find('td:eq(3)').text();

        $('#empID').val(col0);
        $('#name').val(col1);
        $('#address').val(col2);
        $('#mobile').val(col3);
    })
})