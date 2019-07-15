import { IStudent } from './IStudent'
import {Component} from '@angular/core'

@Component({
    selector:'aurionpro-student',
    templateUrl:'./student.component.html'
})

export class StudentComponent{
    student:IStudent;
    courses:ICourses[];
    height:String="100px";
    width:String="100px";
    constructor(){
        this.student={ 
            name:"Yogita",
            cgpa:7.5,
            location:"Navi Mumbai",
            profilepic:"../../assets/user.png"   
        }
    }
    public get ConvertCGPAToColor(){
        if(this.student.cgpa>8){
            return 'red';
        }
        if(this.student.cgpa>6 && this.student.cgpa<8){
            return 'green';
        }
        return 'blue';

    }

 loadCourses(e){
        this.courses=[{
            name:"Java",
            course_id:101
        },
    {
        name:"Angular",
        course_id:102
    }]
    }

    nameChange(newValue){
        console.log(newValue)
        this.student.name=newValue;
    }
}