import {Injectable} from '@angular/core';
import {Student} from './student';
import {StudentListModule} from './student-list.module';

@Injectable()
export class StudentService {
  studentList: Student[];

  constructor() {
    this.studentList = new Array<Student>();
    this.studentList.push(new Student(1, 'Tien', '2k'));
    this.studentList.push(new Student(2, 'Khanh', '2k1'));
    this.studentList.push(new Student(3, 'Long', '2k2'));
  }

  findAll(): Student[] {
    return this.studentList;
  }

  findById(id: number): Student {
    // connect to backend: apiname
    return this.studentList.find(student => student.id === id);
  }
}
