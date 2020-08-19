import {Component, OnInit} from '@angular/core';
import {Student} from '../student';
import {StudentService} from '../student.service';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {

  student: Student;

  constructor(private studentService: StudentService) {
    this.student = studentService.findById(3);
  }

  ngOnInit(): void {
  }

}
