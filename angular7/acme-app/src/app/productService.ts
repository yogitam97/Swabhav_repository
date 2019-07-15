import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class productService{
    constructor(private http:HttpClient){

    }
    getProducts(){
        return this.http.get('../assets/data.json')
        .toPromise()
    }
}