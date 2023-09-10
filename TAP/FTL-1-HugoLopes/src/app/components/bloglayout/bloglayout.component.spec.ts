import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BloglayoutComponent } from './bloglayout.component';

describe('BloglayoutComponent', () => {
  let component: BloglayoutComponent;
  let fixture: ComponentFixture<BloglayoutComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BloglayoutComponent]
    });
    fixture = TestBed.createComponent(BloglayoutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
