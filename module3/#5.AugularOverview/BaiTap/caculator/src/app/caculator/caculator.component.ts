import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-caculator',
  templateUrl: './caculator.component.html',
  styleUrls: ['./caculator.component.css']
})
export class CaculatorComponent implements OnInit {
  output: number;
  num1: number;
  num2: number;
  operator = '+';


  constructor() {
  }

  onFirstChange(value) {
    this.num1 = Number(value);
  }

  onSecondChange(value) {
    this.num2 = Number(value);
  }

  onSelectChange(value) {
    this.operator = value;
  }
  calculate() {
    switch (this.operator) {
      case '+':
        this.output = this.num1 + this.num2;
        break;
      case '-':
        this.output = this.num1 - this.num2;
        break;
      case '*':
        this.output = this.num1 * this.num2;
        break;
      case '/':
        this.output = this.num1 / this.num2;
        break;
    }
  }

  ngOnInit(): void {
  }

}
