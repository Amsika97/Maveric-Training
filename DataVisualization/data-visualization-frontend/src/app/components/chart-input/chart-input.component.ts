import { Component, EventEmitter, Input, Output } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { TranscationServiceService } from 'src/app/services/transcation-service.service';

@Component({
  selector: 'app-chart-input',
  templateUrl: './chart-input.component.html',
  styleUrls: ['./chart-input.component.css']
})
export class ChartInputComponent {
  bank: string = ''; 
  startDate: string = ''; 
  endDate: string = '';
  filterParam: string = "";



  @Output() dataEvent = new EventEmitter<any>();
  @Input() chartName = '';


  constructor(private transaction: TranscationServiceService, private route: ActivatedRoute){
    this.route.params.subscribe((params: Params) => {
      this.filterParam = params['filterParam'];
      //console.log('chart input Filter Value:', this.filterParam);
    });
  }

  getData(){
    if(this.filterParam=="FILTER_TXN_BY_EXPANSE" || this.filterParam=="FILTER_TXN_BY_CARD" || this.filterParam=="FILTER_TXN_BY_GENDER"){
      //console.log('call if  getChartData ()');
      this.getChartData() ;
    }
    else{
      //console.log('call else getInstitrudeChartData ()');
     this.getInstitrudeChartData();
    }
  }



  getChartData() {
    const dataToSend = {
      bank: this.bank,
      type:this.filterParam,
      chartType: this.chartName,
      fromDate: this.startDate,
      toDate: this.endDate,
    };
    
    this.dataEvent.emit(dataToSend);
  }

  getInstitrudeChartData() {
    const sendData = {
     
      chartType: this.chartName,
      fromDate: this.startDate,
      toDate: this.endDate,
    };
    
    this.dataEvent.emit(sendData);
  }
}
