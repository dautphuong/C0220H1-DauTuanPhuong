import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: "./child.component.html",
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  @Input()
  valueFromParent: string;

  @Output()
  eventChild = new EventEmitter();

  constructor() {
  }

  ngOnInit(): void {
  }

  changeValueParent(): void {
    this.eventChild.emit('Hello parent');
  }

}
