import { Component, OnInit } from '@angular/core';
import { DataServiceService } from '../services/data-service.service';
import { Topic } from '../model/topic';
import { MatTableDataSource } from '@angular/material/table';

@Component({
  selector: 'app-data-kafka',
  templateUrl: './data-kafka.component.html',
  styleUrls: ['./data-kafka.component.css']
})
export class DataKafkaComponent implements OnInit {

  constructor(private service:DataServiceService) { }
 
  Topic:Topic
  displayedColumns: string[] = [ 'id','record','filename'];
  dataSource :Topic[]=[];
  filters = {
    keyword: ''
  }

 
  ngOnInit(): void {
     this.getAllData();
  }
  getAllData(){
    this.service.getAallData().subscribe(
     
      Topic=>{
        console.log("ja, keut")
        console.log("kjo eshte"+Topic)
        this.dataSource=this.applyFilter(Topic);
        
       
        
      }
    )
  }
  applyFilter(topic:Topic[]){
    return topic.filter((e)=>{
      console.log(e)
      return e.fileName.toLowerCase().includes(this.filters.keyword.toLocaleLowerCase())
    })
    
  }
  
}
  

