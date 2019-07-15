import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core'
@Component({
    selector: 'btn-toggle',
    templateUrl: './multibinding.component.html'
})
export class ButtonToggleComponent implements OnInit{
    @Input()
    valueForText:String;
    @Output()
    stateChange:EventEmitter<String>
    @Output()
    onColor:String
    status:boolean=false
    constructor(){
        console.log("inside constructor")
        this.valueForText=" ";
        this.stateChange=new EventEmitter<String>()
    }
    ngOnInit(): void {
        console.log("inside onInit")
        console.log(this.valueForText)
        
    }
    clickHandler(e){
        console.log(e)
        console.log("clicked")
        if(this.status==false){
            this.status=true
            this.onColor="green"
            this.valueForText="OFF"
            this.stateChange.emit("Statechange firing:ON")
        }
        else{
            this.status=false
            this.onColor="red"
            this.valueForText="ON"
            this.stateChange.emit("Statechange firing:OFF")
        }
    }
    
}