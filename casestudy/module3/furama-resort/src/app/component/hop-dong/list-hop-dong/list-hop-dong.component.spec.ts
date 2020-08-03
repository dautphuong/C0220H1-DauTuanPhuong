import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListHopDongComponent } from './list-hop-dong.component';

describe('ListHopDongComponent', () => {
  let component: ListHopDongComponent;
  let fixture: ComponentFixture<ListHopDongComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListHopDongComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListHopDongComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
