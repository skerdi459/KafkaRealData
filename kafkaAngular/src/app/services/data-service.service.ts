import { Injectable } from '@angular/core';
import { SocketClientService } from './socketConfig/socketClientService.service';
import { Topic } from '../model/topic';
import { Observable } from 'rxjs';

const url='http://localhost:8085'

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  constructor(private socketClient:SocketClientService) { }
  getAallData():Observable<Topic[]>{
    return this.socketClient
        .onMessage('/topic/data/all')
  }

  getFileName(filename:string){
    return this.socketClient._send(`/topic/filename/${filename}`)
  }

}
