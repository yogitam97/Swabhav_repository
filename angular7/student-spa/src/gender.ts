import { Pipe, PipeTransform } from '@angular/core';
@Pipe({
    name: 'genderPipe'
})
export class genderPipe implements PipeTransform{
    transform(isMale:boolean):string{
        if(isMale){
            return "Male"
        }
        else{
            return "Female"
        }
    }
}