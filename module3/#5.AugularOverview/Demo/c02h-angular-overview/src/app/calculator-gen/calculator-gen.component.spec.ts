import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculatorGenComponent } from './calculator-gen.component';

describe('CalculatorGenComponent', () => {
  let component: CalculatorGenComponent;
  let fixture: ComponentFixture<CalculatorGenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CalculatorGenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CalculatorGenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
