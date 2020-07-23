import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateHopDongChiTietComponent } from './create-hop-dong-chi-tiet.component';

describe('CreateHopDongChiTietComponent', () => {
  let component: CreateHopDongChiTietComponent;
  let fixture: ComponentFixture<CreateHopDongChiTietComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateHopDongChiTietComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateHopDongChiTietComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
