import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
@Injectable()
export class StudentService{
    url:string = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/";
    constructor(private http:HttpClient){
        
    }
    getData(){
        return this.http.get(this.url)
        .toPromise()   
    }
    getDataById(id){
        return this.http.get(this.url+id)
        .toPromise()
    }
    postData(obj){
        return this.http.post(this.url,obj)
        .toPromise() 
    }
    deleteData(id){
        return this.http.delete(this.url+id)
        .toPromise() 
    }
    editData(id,obj){
        return this.http.put(this.url+id,obj)
        .toPromise() 
    }
}