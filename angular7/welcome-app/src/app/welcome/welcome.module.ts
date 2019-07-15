import { NgModule } from "@angular/core";
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from '../app-routing.module';
import { FormsModule } from '@angular/forms';
import { WelcomeComponent } from '../welcome/welcome.component';
import { StudentComponent } from '../student/student.component'
import { BlueBallComponent } from '../blueball/blueball.component'
import { BindingComponent } from '../welcome/multibinding.component'
import { MathService } from '../service/MathService'
import { HttpClientModule } from '@angular/common/http';
import { NumberFactService } from '../service/NumbersApiService';
import { ButtonToggleComponent } from './btn.toggle.component';
import { RatingComponent } from './btn.rating.component';


@NgModule({
    declarations: [
        WelcomeComponent,
        StudentComponent,
        BlueBallComponent,
        BindingComponent,
        ButtonToggleComponent,
        RatingComponent
      ],
      imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule,
        HttpClientModule
      ],
      providers: [MathService,NumberFactService,],
      bootstrap: [WelcomeComponent]
})

export class Welcomemodule{

}