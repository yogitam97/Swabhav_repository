import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
@Injectable()
export class NumberFactService{
    
    constructor(private http:HttpClient){
        
    }
    getFact(no){
        return this.http.get("http://numbersapi.com/"+no,{responseType:'text'})
        .toPromise()   
    }
}