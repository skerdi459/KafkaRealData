import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {MatButtonModule} from '@angular/material/button';

import { HttpClient,HttpClientModule } from '@angular/common/http';
import {MatTableModule} from '@angular/material/table';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { DataKafkaComponent } from './component/data-kafka.component';





@NgModule({
  declarations: [
    AppComponent,
  
    DataKafkaComponent 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatButtonModule, 
    MatTableModule, 
    HttpClientModule,
    FormsModule,
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
