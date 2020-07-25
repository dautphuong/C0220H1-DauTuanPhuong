import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateHopDongComponent } from './create-hop-dong.component';

describe('CreateHopDongComponent', () => {
  let component: CreateHopDongComponent;
  let fixture: ComponentFixture<CreateHopDongComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateHopDongComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateHopDongComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
