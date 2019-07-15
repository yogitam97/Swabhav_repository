import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './Home/Home.component';
import { AboutComponent } from './About/About.component';
import { CareerComponent } from './Career/Career.component';

export const routes: Routes = [
    {path:"", redirectTo:"/home", pathMatch:"full"},
    { path: 'home', component: HomeComponent },
    { path: 'about', component: AboutComponent },
    { path: 'career', component: CareerComponent },
    {path:'career/:id', component:CareerComponent}];
