import { Component } from '@angular/core'

@Component({
    selector: 'aurionpro-blueball',
    templateUrl: './blueball.component.html'
})

export class BlueBallComponent {
    count = 5;
    isDisable:boolean=false;
    show:boolean=true;
    isReplay:boolean=false;
    setColor: string[] = new Array(50);
    randomNo = Math.floor(Math.random() * 50);
    timeLeft: number = 30;
    interval;

    startTimer() {
        this.show=false;
        this.interval = setInterval(() => {
            if (this.timeLeft > 0) {
                this.timeLeft--;
            } if (this.timeLeft == 0) {
                this.timeLeft = 0;
                alert("Timeout")
                clearInterval(this.interval);
            }
        }, 1000)
    }

    constructor() {
        console.log(this.randomNo)
        for (var i = 1; i < 50; i++) {
            this.setColor[i] = "gainsboro";
        }
    }
    arrayButtons(n: number): any[] {
        return Array(n);
    }
    play(id) {
        this.count--;
        if (id > this.randomNo) {
            this.setColor[id] = "rgb(101, 224, 85)"
        }
        if (id < this.randomNo) {
            this.setColor[id] = "rgb(245, 49, 49)"
        }
        if (id == this.randomNo) {
            this.setColor[id] = "rgb(108, 49, 245)"
            alert("You won!!!")
            this.isDisable=true;
            clearInterval(this.interval);
            this.isReplay=true;
        }
        this.checkAttempts(this.count);
    }
    checkAttempts(count) {
        if (count == 0) {
            alert("You have exceeded the attempts")
            this.isDisable=true;
            this.isReplay=true;
        }
    }
    playAgain(){
        location.reload();
    }
}