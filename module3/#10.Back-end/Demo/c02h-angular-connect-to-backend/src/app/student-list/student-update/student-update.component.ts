import {Component, OnInit} from '@angular/core';
import {Student} from '../student';
import {FormControl, FormGroup} from '@angular/forms';
import {StudentService} from '../student.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {InstructorService} from '../../instructor-list/instructor.service';

@Component({
  selector: 'app-student-update',
  templateUrl: './student-update.component.html',
  styleUrls: ['./student-update.component.css']
})
export class StudentUpdateComponent implements OnInit {

  student: Student;
  studentForm: FormGroup;
  id: number;

  constructor(private studentService: StudentService, private activatedRoute: ActivatedRoute,
              private instructorService: InstructorService, private router: Router) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = Number(paramMap.get('id'));

      // this.student = this.studentService.findById(id);
      this.studentService.findById(id).subscribe(
        next => {
          console.log('observable process');
          this.student = next;
          this.id = this.student.id;
          this.studentForm.patchValue(
            {
              name: this.student.name,
              dateOfBirth: this.student.dateOfBirth
            });
        }, error => {
          this.student = new Student();
        });
    });

    console.log('initial form');
    this.studentForm = new FormGroup({
      name: new FormControl(''),
      dateOfBirth: new FormControl('')
    });
  }

  submitStudentForm(): void {
    this.student = Object.assign({}, this.studentForm.value);
    this.student.id = this.id;
    console.log(this.student);

    this.studentService.updateStudent(this.student).subscribe(
      next => {
        console.log('Update process!');
      }, error => {
        console.log('Update failed!');
      }
    );

    this.router.navigateByUrl('/');
  }

}
