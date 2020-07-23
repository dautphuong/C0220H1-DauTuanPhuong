import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListDichVuComponent } from './list-dich-vu.component';

describe('ListDichVuComponent', () => {
  let component: ListDichVuComponent;
  let fixture: ComponentFixture<ListDichVuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListDichVuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListDichVuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
