import { Component, Input} from '@angular/core'
@Component({
    selector: 'btn-rating',
    templateUrl: './btn.rating.component.html'
})
export class RatingComponent{
    @Input()
    rating:number;
}