import { Component } from "@angular/core";
import { ActivatedRoute, Router } from '@angular/router';
import { StudentService } from '../Service/StudentService';
import { Student } from '../Student';
@Component({
    selector:'edit',
    templateUrl:'./Edit.component.html'
})
export class EditComponent{
    id:any
    studentArr:Object
    student:any={}
    gender:string
    constructor(private router:Router,private route: ActivatedRoute,private StudentSvc:StudentService ) {
        this.route.paramMap.subscribe(param => {
            this.id = param.get('id');
            console.log(this.id)
            this.getStudent(this.id)   
        })
    }
    getStudent(id){
        this.StudentSvc.getDataById(this.id)
        .then((r)=>{
            this.studentArr=r;
            this.student=this.studentArr[0]
            console.log(r)
            if(this.student.isMale){
                this.gender="true"
            }
            else{
                this.gender="false"
            }
    })
}
    submit(){
      if(this.gender=="true"){
          this.student.isMale=true
      }
      else{
          this.student.isMale=false
      }
    this.StudentSvc.editData(this.id,this.student)
    .then((r)=>{
        this.router.navigate(['/display'])
    })
    }
  
}