import {Component, OnInit} from '@angular/core';
import {Student} from '../student';
import {StudentService} from '../student.service';
import {ActivatedRoute, ParamMap} from '@angular/router';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {

  student: Student = new Student();

  constructor(private studentService: StudentService, private activatedRoute: ActivatedRoute) {
    // this.student = studentService.findById(3);
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = Number(paramMap.get('id'));

      this.studentService.findById(id).subscribe(
        (next) => {
          this.student = next;
        }
      );
    });
  }

  ngOnInit(): void {
  }

}
