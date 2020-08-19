import {Injectable} from '@angular/core';
import {Student} from './student';
import {StudentListModule} from './student-list.module';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable()
export class StudentService {
  API_URL = 'http://localhost:3000/studentList';

  // studentList: Student[];

  constructor(private httpClient: HttpClient) {
    // this.studentList = new Array<Student>();
    // this.studentList.push(new Student(1, 'Tien', '2k'));
    // this.studentList.push(new Student(2, 'Khanh', '2k1'));
    // this.studentList.push(new Student(3, 'Long', '2k2'));
  }

  findAll(): Observable<Student[]> {
    return this.httpClient.get<Student[]>(this.API_URL);
    // return this.studentList;
  }

  findById(id: number): Observable<Student> {
    return this.httpClient.get<Student>(this.API_URL + '/' + id);
    // connect to backend: apiname
    // return this.studentList.find(student => student.id === id);
  }

  updateStudent(student: Student): Observable<void> {
    return this.httpClient.patch<void>(this.API_URL + '/' + student.id, student);
  }

}
