var urlData= "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"
var fetchData=function(){
    return new Promise(function(resolve,reject){
        $.ajax({
            async: true,
            type: "GET",
            url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/",

            success: (function (response) {
                $('#count').text(response.length)
                resolve(response)
                
            })
        })
    })
}

var postData=function(newObj){
    return new Promise(function(resolve,reject){
        $.ajax({
            type: "POST",
            url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/",
            data: newObj,
            success: (function (response) {
                resolve(response)
                // getData()
            }),
            failure: (function () {
                consol.log("error occured")
            })
        })
    })
}

var deleteData=function(id){
    return new Promise((resolve,reject)=>{
        $.ajax({
            url:urlData+"/"+id,
            type:"DELETE",
            success:function(response){
                console.log("success")
            },
            failure:function(){
                console.log("error")
            }
        })
    })
}

var editData=function(id,newObj){
    return new Promise(function(resolve,reject){
        $.ajax({
            url:urlData+"/"+id,
            type:"PUT",
            data:newObj,
            success:function(response){
                console.log("success")
            },
            failure:function(){
                console.log("error")
            }
        })
    })
}