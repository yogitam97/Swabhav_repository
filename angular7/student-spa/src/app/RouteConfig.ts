import { Routes } from "@angular/router";
import { DisplayComponent } from './Display/display.component';
import { AddComponent } from './Add/Add.component';
import { EditComponent } from './Edit/Edit.component';

export const routes:Routes=[{
    path:'display',component:DisplayComponent
},
{path:'add',component:AddComponent},
{path:'edit/:id',component:EditComponent}]