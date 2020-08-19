import {Component, OnInit} from '@angular/core';
import {Student} from '../student';
import {StudentService} from '../student.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  studentList: Student[];

  constructor(private studentService: StudentService, private router: Router) {
    // this.studentList = studentService.findAll();
    this.studentService.findAll().subscribe(
      next => {
        this.studentList = next;
      }, error => {
        this.studentList = new Array();
      }, () => {
        console.log('Get list successfully!');
      }
    );
  }

  ngOnInit(): void {
  }

  goUpdate(id: number): void {
    console.log('student-update/' + id);
    this.router.navigateByUrl('student-list/student-update/' + id);
  }

}
