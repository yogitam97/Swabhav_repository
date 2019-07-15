import { Component } from "@angular/core";
import { ActivatedRoute } from '@angular/router';

@Component({
    selector: 'career',
    templateUrl: './Career.component.html'
})
export class CareerComponent {
    id: String
    constructor(private route: ActivatedRoute, ) {
        this.route.paramMap.subscribe(param => {
            this.id = param.get('id');
            console.log(this.id)
        })


    }
}