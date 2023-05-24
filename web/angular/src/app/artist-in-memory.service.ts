import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Artist } from './artist';
import { InMemoryDatabase } from './artists/inMemoryDatabase';

@Injectable({
  providedIn: 'root'
})
export class ArtistInMemoryService {

  inMemoryDatabase = new InMemoryDatabase();

  constructor() { }

  getAll() : Observable<Artist[]> {
    return this.inMemoryDatabase.getAll();
  }

  getById(id: any) : Observable<Artist> {
    return this.inMemoryDatabase.getById(id);
  }

  setArtist(value: Artist) {
    this.inMemoryDatabase.setArtist(value);
  }

  updateArtist(value: Artist){
    this.inMemoryDatabase.updateArtist(value);
  }

  deleteById(id: any){
    this.inMemoryDatabase.deleteById(id);
  }
}
 