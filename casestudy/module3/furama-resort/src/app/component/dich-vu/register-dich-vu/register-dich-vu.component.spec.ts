import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RegisterDichVuComponent } from './register-dich-vu.component';

describe('RegisterDichVuComponent', () => {
  let component: RegisterDichVuComponent;
  let fixture: ComponentFixture<RegisterDichVuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RegisterDichVuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RegisterDichVuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
