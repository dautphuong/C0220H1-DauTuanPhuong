import {Component, OnInit} from '@angular/core';
import {FormArray, FormBuilder, FormGroup, ValidatorFn} from "@angular/forms";

@Component({
  selector: 'app-dynamic-form',
  templateUrl: './dynamic-form.component.html',
  styleUrls: ['./dynamic-form.component.css']
})
export class DynamicFormComponent implements OnInit {

  demoForm: FormGroup;

  arrayItems: {
    id: number;
    title: string;
  }[]


// tslint:disable-next-line:variable-name
  constructor(private _formBuilder: FormBuilder
  ) {
    this.demoForm = this._formBuilder.group({
      demoArray: this._formBuilder.array(
        [])
    });
  }


  ngOnInit() {
    this.arrayItems = [{id: 1, title: 'a'}, {id: 2, title: 'b'},];
  }

  get demoArray() {
    return this.demoForm.get('demoArray') as FormArray;
  }


}
