import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {Student} from '../student';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})

export class ReactiveFormComponent implements OnInit {

  studentForm: FormGroup;
  student: Student;

  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    // this.studentForm = new FormGroup({
    //   name: new FormControl('',
    //     [Validators.required, Validators.pattern('^[a-zA-Z]+$')]),
    //   dateOfBirth: new FormControl('', this.checkValidateAge)
    // });
    this.studentForm = this.fb.group({
      name: ['tien',
        [Validators.required, Validators.pattern('^[a-zA-Z]+$')]],
      dateOfBirth: ['2k', this.checkValidateAge]
    });

    // this.studentForm.value.name = 'Tienabc';

    this.studentForm.patchValue({name: 'Tienabc'});
  }

  onSubmit() {
    console.log(this.studentForm.value);
    this.convertToStudent(this.studentForm.value);
  }

  checkValidateAge(formControl: AbstractControl) {
    return formControl.value > 2000 ? {abc: true} : null;
  }

  convertToStudent(init?: Partial<Student>) {
    Object.assign(this, init);
    console.log('Student');
    console.log(init);
  }
}
