import { Component } from "@angular/core";
import { StudentService } from '../Service/StudentService';
import { Student } from '../Student';

@Component({
selector:'display',
templateUrl:'./display.component.html'
})

export class DisplayComponent{
    result:any
    student:any
    length:number
    constructor(private StudentSvc:StudentService){
        this.getData()
    }
    getData(){
        this.StudentSvc.getData()
        .then((r)=>{
            this.result=r;
            this.length=this.result.length;
            console.log(this.length)
        })
        .catch((e)=>{
            this.result=e;
        })
    }
    getDataById(id){
        this.StudentSvc.getDataById(id)
        .then((r)=>{
            this.student=r;
            console.log(this.student)
        })
        .catch((e)=>{
            this.student=e;
        })
    }
    deleteData(id){
        console.log(id)
        this.StudentSvc.deleteData(id)
        .then((r)=>{
            this.getData()
            console.log(this.result)
        })
        .catch((e)=>{
            console.log(e)
        })
    }
}