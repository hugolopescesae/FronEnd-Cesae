import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImagesgalleryComponent } from './imagesgallery.component';

describe('ImagesgalleryComponent', () => {
  let component: ImagesgalleryComponent;
  let fixture: ComponentFixture<ImagesgalleryComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ImagesgalleryComponent]
    });
    fixture = TestBed.createComponent(ImagesgalleryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
