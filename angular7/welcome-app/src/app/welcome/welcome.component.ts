import {Component} from '@angular/core'
@Component({ 
    selector:'aurionpro-welcome',
    templateUrl:'welcome.component.html'
})
export class WelcomeComponent{
    msg:String
    myText:String
    constructor(){
        this.myText="ON"
        this.msg="Welcome to my Aurionpro Component"
    }

    clickHandler(e){
        console.log(e)
    }
}