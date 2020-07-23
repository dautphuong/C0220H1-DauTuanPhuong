import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateKhachHangComponent } from './create-khach-hang.component';

describe('CreateKhachHangComponent', () => {
  let component: CreateKhachHangComponent;
  let fixture: ComponentFixture<CreateKhachHangComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateKhachHangComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateKhachHangComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
