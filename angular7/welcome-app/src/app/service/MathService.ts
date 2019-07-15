import { resolve,reject } from 'q';
import { Injectable } from '@angular/core';
@Injectable()
export class MathService{
    constructor(){
    
    }
        cubeEvenNo(no){
            return new Promise((resolve,reject)=>{
                if(no%2==0){
                    resolve(no*no*no)
                }
                else{
                    reject("NOT_EVEN")
                }
            })
        }
}