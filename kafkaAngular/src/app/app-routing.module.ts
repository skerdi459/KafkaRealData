import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DataKafkaComponent } from './component/data-kafka.component';


const routes: Routes = [
  {path: '', component:DataKafkaComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
