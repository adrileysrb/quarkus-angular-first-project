import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ArtistInsertComponent } from './artist-insert.component';

describe('ArtistInsertComponent', () => {
  let component: ArtistInsertComponent;
  let fixture: ComponentFixture<ArtistInsertComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ArtistInsertComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ArtistInsertComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
