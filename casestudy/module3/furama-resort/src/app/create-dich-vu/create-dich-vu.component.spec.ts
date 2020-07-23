import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateDichVuComponent } from './create-dich-vu.component';

describe('CreateDichVuComponent', () => {
  let component: CreateDichVuComponent;
  let fixture: ComponentFixture<CreateDichVuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateDichVuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateDichVuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
