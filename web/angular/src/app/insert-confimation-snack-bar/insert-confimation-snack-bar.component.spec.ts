import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InsertConfimationSnackBarComponent } from './insert-confimation-snack-bar.component';

describe('InsertConfimationSnackBarComponent', () => {
  let component: InsertConfimationSnackBarComponent;
  let fixture: ComponentFixture<InsertConfimationSnackBarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InsertConfimationSnackBarComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InsertConfimationSnackBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
