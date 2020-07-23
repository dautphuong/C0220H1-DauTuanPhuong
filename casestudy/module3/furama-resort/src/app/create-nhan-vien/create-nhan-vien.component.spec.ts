import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateNhanVienComponent } from './create-nhan-vien.component';

describe('CreateNhanVienComponent', () => {
  let component: CreateNhanVienComponent;
  let fixture: ComponentFixture<CreateNhanVienComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateNhanVienComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateNhanVienComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
