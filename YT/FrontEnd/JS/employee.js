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
        },
        error: function (xhr, exception){
            alert("error at saved.!")
        }
    })
}