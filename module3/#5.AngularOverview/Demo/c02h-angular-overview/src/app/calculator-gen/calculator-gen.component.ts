import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator-gen',
  templateUrl: './calculator-gen.component.html',
  styleUrls: ['./calculator-gen.component.css']
})
export class CalculatorGenComponent implements OnInit {
  number1 = 2;
  number2 = 8;
  result: number;

  constructor() {
  }

  ngOnInit(): void {
  }

  sum(): void {
    this.result = Number(this.number1) + Number(this.number2);
  }

  changeValue2(value): void {
    this.number2 = value;
  }
}
