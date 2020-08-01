import {Component} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
})

export class CalculatorComponent {
  number1 = 2;
  number2 = 8;
  result: number;

  sum(): void {
    this.result = Number(this.number1) + Number(this.number2);
  }

  changeValue2(value): void {
    this.number2 = value;
  }
}
