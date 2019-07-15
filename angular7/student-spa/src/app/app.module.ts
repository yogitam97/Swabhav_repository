import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule }   from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentService } from './Service/StudentService';
import { DisplayComponent } from './Display/display.component';
import { HttpClientModule } from '@angular/common/http';
import { genderPipe } from 'src/gender';
import { AddComponent } from './Add/Add.component';
import { EditComponent } from './Edit/Edit.component';
import { FilterPipe } from './Display/searchFilter';


@NgModule({
  declarations: [
    AppComponent,
    DisplayComponent,
    AddComponent,
    EditComponent,
    genderPipe,
    FilterPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [StudentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
