import { Injectable } from '@angular/core';
import {InstructorListModule} from './instructor-list.module';

@Injectable({
  providedIn: InstructorListModule
})
export class InstructorService {

  constructor() { }
}
