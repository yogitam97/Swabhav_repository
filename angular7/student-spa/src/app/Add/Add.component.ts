import { Component } from '@angular/core';
import { Student } from '../Student';
import { StudentService } from '../Service/StudentService';

@Component({
    selector:'add',
    templateUrl:'./Add.component.html'
})
export class AddComponent{
    student=new Student()
    constructor(private StudentSvc:StudentService){
        console.log("inside constructor")
    }
    ngOnInit():void{

    }
    submit(){
        this.StudentSvc.postData(this.student)
        .then((r)=>{
            console.log(r)
        })
        .catch((e)=>{
            console.log(e)
        })
    }
}