import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Artist } from 'src/app/artist';

const baseUrl = 'http://localhost:8080/';

@Injectable({
  providedIn: 'root'
})
export class ArtistsService {

  constructor(private http: HttpClient) { }

  getAll() : Observable<Artist[]> {
    return this.http.get<Artist[]>(baseUrl + "artists");
  }

  get(id: any) : Observable<Artist[]> {
    return this.http.get<Artist[]>(`${baseUrl}/${id}`);
  }

}
