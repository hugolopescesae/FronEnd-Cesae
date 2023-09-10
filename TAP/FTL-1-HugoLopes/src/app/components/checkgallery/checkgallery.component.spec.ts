import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CheckgalleryComponent } from './checkgallery.component';

describe('CheckgalleryComponent', () => {
  let component: CheckgalleryComponent;
  let fixture: ComponentFixture<CheckgalleryComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CheckgalleryComponent]
    });
    fixture = TestBed.createComponent(CheckgalleryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
