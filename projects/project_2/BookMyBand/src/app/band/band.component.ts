import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-band',
  templateUrl: './band.component.html',
  styleUrls: ['./band.component.css']
})
export class BandComponent implements OnInit {
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  title: string ="Pop";
  event: string[] =["hyderbad","warangal"]

}
