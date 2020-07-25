import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListKhachHangComponent } from './list-khach-hang.component';

describe('ListKhachHangComponent', () => {
  let component: ListKhachHangComponent;
  let fixture: ComponentFixture<ListKhachHangComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListKhachHangComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListKhachHangComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
