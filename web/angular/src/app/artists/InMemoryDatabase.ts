
import { Observable, of } from 'rxjs';
import { Artist } from "../artist";

export class InMemoryDatabase{

    inMemoryDatabase: Artist[] = [
        {id: 1, name: "teste 1", bio: "isso é um teste 1", createdDate: new Date("2017-01-16") },
        {id: 2, name: "teste 2", bio: "isso é um teste X 2", createdDate: new Date("2012-02-11") },
        {id: 3, name: "teste 3", bio: "isso é um teste X 3", createdDate: new Date("2020-09-14") },
        {id: 4, name: "teste 4", bio: "isso é um teste 4", createdDate: new Date("2015-02-06") }
      ];

    getAll(): Observable<Artist[]>{
        return of(this.inMemoryDatabase);
    }
}
