import { Component, OnInit } from '@angular/core';
import {Student} from '../student';

@Component({
  selector: 'app-directive-ex',
  templateUrl: './directive-ex.component.html',
  styleUrls: ['./directive-ex.component.css']
})
export class DirectiveExComponent implements OnInit {

  arrStudent: Student[];
  constructor() { }

  ngOnInit(): void {
    this.arrStudent = new Array<Student>();
    // this.arrStudent.push(new Student(1, 'Tien'));
    // this.arrStudent.push(new Student(2, 'Khanh'));
  }

}
