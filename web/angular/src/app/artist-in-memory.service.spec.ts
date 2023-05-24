import { TestBed } from '@angular/core/testing';

import { ArtistInMemoryService } from './artist-in-memory.service';

describe('ArtistInMemoryService', () => {
  let service: ArtistInMemoryService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ArtistInMemoryService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
