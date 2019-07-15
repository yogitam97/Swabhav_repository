import { Component } from '@angular/core'
import { MathService } from '../service/MathService'
import { NumberFactService } from '../service/NumbersApiService';

@Component({
    selector: 'aurionpro-multibinding',
    templateUrl: './multibinding.component.html'
})
export class BindingComponent {
    result: any
   
    constructor(private MathSvc: MathService,private NumberSvc:NumberFactService) {
     
    }
    cubeEvenNo(no) {
        this.MathSvc.cubeEvenNo(no)
            .then((r) => {
                this.result = r;
            })
            
    }
    getFact(no){
        if(no==null){
            this.result="";
            return;
        }
        this.NumberSvc.getFact(no)
        .then((r)=>{
            this.result=r;
        })
        .catch((e)=>{
            this.result=e;
        })
    }

}