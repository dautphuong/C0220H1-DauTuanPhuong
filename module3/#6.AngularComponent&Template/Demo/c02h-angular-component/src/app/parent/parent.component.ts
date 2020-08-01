import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ["./parent.component.css"]
})
export class ParentComponent implements OnInit {
  valueToChild = 'hello child!';

  valueFromChild: string;

  constructor() {
  }

  ngOnInit(): void {
  }

  changeValueChild(): void {
    this.valueToChild = 'OK! Changed child.';
  }

  receivedFromChild(value): void {
    this.valueFromChild = value;
  }
}
