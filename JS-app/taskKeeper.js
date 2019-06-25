
    //window.onload=display();
    var today = new Date();
    var date = today.getDate() + '-' + (today.getMonth() + 1) + '-' + today.getFullYear();
    var newid = 0;
    var tasks = []

   

    var task = document.querySelector('#addbtn')

    //functions for adding element in array dynamically
        Storage.prototype.pushArrayItem = function (tasks, newTaskobj) {
        var array = this.getArray(tasks)
        array.push(newTaskobj)
        this.setItem(tasks, JSON.stringify(array))
        console.log("stored")
    }
    Storage.prototype.getArray = function (tasks) {
        var thisArray = [];
        var fetchArrayObject = this.getItem(tasks);
        if (typeof fetchArrayObject !== 'undefined') {
            if (fetchArrayObject !== null) { thisArray = JSON.parse(fetchArrayObject); }
        }
        return thisArray;
    }

    var tasksArray = localStorage.getArray("");
    console.log(tasksArray)
    //checking priority through radio buttons
    var priority;
    var radio1 = (document.getElementById('high').onclick = function () {
        priority = 1;
    })
    var radio2 = (document.getElementById('mid').onclick = function () {
        priority = 2;
    })
    var radio3 = (document.getElementById('low').onclick = function () {
        priority = 3;
    })
    
    //adding new task into to-do list
    task.addEventListener("click", addTask)
    function addTask() {
        var status = "incomplete"
        var getTaskname = document.getElementById('new-task').value
        var newTaskobj = {
            'name': getTaskname,
            'status': false,
            'deleted': false,
            'priority': priority,
            'dateOfTask': date
        };
        newid++;
        
       
        console.log(getTaskname)
    
      
        localStorage.pushArrayItem("", newTaskobj);
        tasksArray=localStorage.getArray("");
        display()
        //localStorage.pushArrayItem(tasksArray, newTaskobj);
        // location.reload(true)
    }
    // newTaskobj.tasksArr.push(task)



    console.log(tasksArray)
    var demo = localStorage.getArray(tasks);
   

    function display() {
        var ul = document.getElementById('listOftasks')
        console.log("inside display taskarray"+"")
        var str = ""
        for (var i = 0; i < tasksArray.length; i++) {
            if(tasksArray[i].status==true){
                
            }
           if(tasksArray[i].deleted==true){
               continue;
           }
            if (tasksArray[i].deleted==false && tasksArray[i].priority == 1) {
                //document.querySelector('#label' + i).style.backgroundColor = "green"
                str = str + '<li id="ele' + i + '"><label style="background-color:red" id="label' + i + '" class="strikethrough"><input type="checkbox" id="checkbox_id' + i + '"class="checkTask" />'
                str = str + tasksArray[i].priority + " " + tasksArray[i].name +
                    '<button align="right" type="button" id=delBtn_id' + i + ' class="delete"></label>Delete</button></li>';
                ul.innerHTML = str;
            }
            if (tasksArray[i].deleted==false && tasksArray[i].priority == 2) {
                //document.querySelector('#label' + i).style.backgroundColor = "red"
                str = str + '<li id="ele' + i + '"><label style="background-color:green" id="label' + i + '" class="strikethrough"><input type="checkbox" id="checkbox_id' + i + '"class="checkTask" />'
                str = str + tasksArray[i].priority + " " + tasksArray[i].name +
                    '<button align="right" type="button" id=delBtn_id' + i + ' class="delete"></label>Delete</button></li>';
                ul.innerHTML = str;
            }
            if (tasksArray[i].deleted==false && tasksArray[i].priority == 3) {
                
                str = str + '<li id="ele' + i + '"><label style="background-color:yellow" id="label' + i + '" class="strikethrough"><input type="checkbox" id="checkbox_id' + i + '"class="checkTask" />'
                str = str + tasksArray[i].priority + " " + tasksArray[i].name +
                    '<button align="right" type="button" id=delBtn_id' + i + ' class="delete"></label>Delete</button></li>';
                ul.innerHTML = str;
            }
            //display()

            console.log(tasksArray[i].name)

        }

        
        //delete task
        var dltBtn = document.querySelectorAll(".delete")
        console.log(dltBtn)
        dltBtn.forEach(element => {
            console.log(element)
            element.addEventListener("click", function () {
                //var tasksArray = localStorage.getArray(tasks);
                var str = element.id
                console.log(str);
                var id = str.split("id")
                var index = parseInt(id[1])
                console.log(index);
                console.log("hello")
                console.log(tasksArray[index]);
                tasksArray[index].deleted = true;
                console.log(tasksArray[index]);
                var temp=[];
                temp.push(tasksArray)
                localStorage[""]=JSON.stringify(tasksArray);
                console.log(localStorage.getArray(""))
                console.log(tasksArray)
                element.parentElement.style.display = "none";
                // scanAgain();
                
            })
        })

        // function scanAgain() {
        //     //var newArr = localStorage.getArray(tasksArray)
        //     for (i = 0; i < tasksArray.length; i++) {
        //         if (tasksArray[i].deleted == true) {
        //             localStorage.pushArrayItem(tasks, tasksArray);
        //         } else {
        //             localStorage.pushArrayItem(tasks, tasksArray);
        //         }
        //     }
        //     display()
        // }
        //strike task
        var chkBtn = document.querySelectorAll(".checkTask")
        chkBtn.forEach(element => {
            console.log(element)
            if (element.type == 'checkbox') {
                element.addEventListener("click", function () {
                    var str = element.id
                    var id = str.split("id")
                    var index = parseInt(id[1])
                    tasksArray[index].status=true;
                    var strike = element.nextSibling
                    console.log(element.parentElement.innerText)
                    element.parentElement.innerHTML = '<strike>' + element.parentElement.innerText + '</strike>';
                    localStorage[""]=JSON.stringify(tasksArray);
                 })
            }
        })


        //Sort by priority function
        var sort = document.querySelector('#sortbtn')
        sort.addEventListener("click", sortBy)
        function sortBy() {
            var value = document.getElementsByTagName('select')[0].value;

            if (value.toString() == "high") {
                tasksArray.sort(function (a, b) {
                    return a.priority - b.priority
                })
                for (var i = 0; i < tasksArray.length; i++) {
                    localStorage.pushArrayItem(tasksArray, tasksArray[i])
                }
            }

            if (value.toString() == "low") {
                tasksArray.sort(function (a, b) {
                    return b.priority - a.priority
                })
                for (var i = 0; i < tasksArray.length; i++) {
                    localStorage.pushArrayItem(tasksArray, tasksArray[i])
                }
            }
            display()
        }

    }
    display()
