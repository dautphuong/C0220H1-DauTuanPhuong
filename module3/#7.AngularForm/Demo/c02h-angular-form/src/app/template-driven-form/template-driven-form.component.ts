import { Component, OnInit } from '@angular/core';
import {Student} from '../student';

@Component({
  selector: 'app-template-driven-form',
  templateUrl: './template-driven-form.component.html',
  styleUrls: ['./template-driven-form.component.css']
})
export class TemplateDrivenFormComponent implements OnInit {

  student: Student;

  constructor() {
  }

  ngOnInit(): void {
    this.student = new Student(1, 'Khanh', '2k');
  }

  onSubmit(form) {
    console.log('aaaaaaaaaaa');
    console.log('Form ' + form.value.name);
    console.log('Object ' + this.student.name);
  }
}
