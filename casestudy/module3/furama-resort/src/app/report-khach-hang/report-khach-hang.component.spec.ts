import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReportKhachHangComponent } from './report-khach-hang.component';

describe('ReportKhachHangComponent', () => {
  let component: ReportKhachHangComponent;
  let fixture: ComponentFixture<ReportKhachHangComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReportKhachHangComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReportKhachHangComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
