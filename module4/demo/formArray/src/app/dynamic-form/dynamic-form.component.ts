import {Component, OnInit} from '@angular/core';
import {FormArray, FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-dynamic-form',
  templateUrl: './dynamic-form.component.html',
  styleUrls: ['./dynamic-form.component.css']
})
export class DynamicFormComponent implements OnInit {

  examForm: FormGroup;
  answerArr = new FormArray([]);

  constructor(private fb: FormBuilder) {
    this.examForm = this.fb.group({
      answer: this.answerArr
    });
  }


  ngOnInit(): void {
    this.createArrAnswer();
  }

  // tslint:disable-next-line:typedef
  createArrAnswer() {
    // tslint:disable-next-line:prefer-for-of
    for (let i = 0; i < 5; i++) {
      this.answerArr.push(new FormControl(''));
    }
  }

  // tslint:disable-next-line:typedef
  onSubmit() {

  }
}
