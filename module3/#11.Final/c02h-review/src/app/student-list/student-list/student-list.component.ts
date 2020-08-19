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

  studentListAPI: Student[];
  studentList: Student[] = new Array();
  curPage = 1;
  keywordId: string;
  keywordName: string;
  index = 1;
  regexId: string;
  regexName: string;

  constructor(private studentService: StudentService, private router: Router) {
    // this.studentList = studentService.findAll();
    this.studentService.findAll().subscribe(
      next => {
        this.studentListAPI = next;
      }, error => {
        this.studentList = new Array();
      }, () => {
        console.log('Get list successfully!');

        for (let i = 0; i < this.studentListAPI.length; i++) {
          // if (this.studentListAPI[i].id.match("regex1") && this.studentListAPI[i].name.match("regex2") {
          this.studentList.push(this.studentListAPI[i]);
          this.studentList[i].no = this.index++;
          // }
        }
      }
    );
  }

  ngOnInit(): void {
  }

  goUpdate(id: number): void {
    console.log('student-update/' + id);
    this.router.navigateByUrl('student-list/student-update/' + id);
  }

  search(): void {
    this.regexId = this.keywordId;
    this.regexName = this.keywordName;
    for (let i = 0; i < this.studentListAPI.length; i++) {
      // if (this.studentListAPI[i].id.match("regex1") && this.studentListAPI[i].name.match("regex2") {
      this.studentList[i].no = this.index++;
      this.studentList.push(this.studentListAPI[i]);
      // }
    }
  }

}
