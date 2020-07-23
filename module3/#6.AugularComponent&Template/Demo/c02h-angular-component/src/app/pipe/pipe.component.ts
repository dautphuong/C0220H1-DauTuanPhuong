import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-pipe',
  templateUrl: './pipe.component.html',
  styleUrls: ['./pipe.component.css']
})
export class PipeComponent implements OnInit {
  namePerson = 'vo Ngoc quan';
  money = 5000000000000;

  constructor() {
  }

  ngOnInit(): void {
  }

}
