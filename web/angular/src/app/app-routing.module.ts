import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { ArtistsComponent } from './artists/artists.component';
import { HomeComponent } from './home/home.component';
import { ArtistEditComponent } from './artists/artist-edit/artist-edit.component';
import { ArtistInsertComponent } from './artists/artist-insert/artist-insert.component';


const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'artist', component: ArtistsComponent },
  { path: 'home', component: HomeComponent },
  { path: 'artist/artist-edit/:artistId', component: ArtistEditComponent },
  { path: 'artist/artist-insert', component: ArtistInsertComponent }
 // { path: 'detail/:id', component: HeroDetailComponent },
  //{ path: 'heroes', component: HeroesComponent }
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes),
    CommonModule
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {
  
 }
