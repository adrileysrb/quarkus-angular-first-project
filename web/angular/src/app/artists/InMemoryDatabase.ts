
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

    getById(id: any) : Observable<Artist> {
        var result: Artist = {}
        for(var artist of this.inMemoryDatabase){
            if(artist.id == id){
                result = artist
            }
        }
        return of(result)
    }

    setArtist(value: Artist) {
        value.id = this.inMemoryDatabase.length + 1
        this.inMemoryDatabase.push(value);
    }

    updateArtist(value: Artist) {
        for(var artist of this.inMemoryDatabase){
            if(artist.id == value.id && value.id != undefined){
                this.inMemoryDatabase[value.id - 1] = value
            }
        }
    }

    deleteById(id: any){
        this.inMemoryDatabase = this.inMemoryDatabase.filter((artist) => artist.id != id)
    }
    
}
