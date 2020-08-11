import {Component, OnInit} from '@angular/core';
import {Student} from '../student';
import {FormControl, FormGroup} from '@angular/forms';
import {StudentService} from '../student.service';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {InstructorService} from '../../instructor-list/instructor.service';

@Component({
  selector: 'app-student-update',
  templateUrl: './student-update.component.html',
  styleUrls: ['./student-update.component.css']
})
export class StudentUpdateComponent implements OnInit {

  student: Student;
  studentForm: FormGroup;

  constructor(private studentService: StudentService, private activatedRoute: ActivatedRoute,
              private instructorService: InstructorService) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = Number(paramMap.get('id'));
      console.log('param 2 ' + paramMap.get('name'));
      this.student = this.studentService.findById(id);
    });

    this.studentForm = new FormGroup({
      name: new FormControl(this.student.name),
      dateOfBirth: new FormControl(this.student.dateOfBirth)
    });
  }

  submitStudentForm(): void {
    console.log('Update student successfully!');
  }

}
