import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ArtistsComponent } from './artists/artists.component';

import {MatTableModule} from '@angular/material/table';
import { HttpClientModule } from '@angular/common/http';
import { MatSortModule } from '@angular/material/sort';
import {MatFormFieldModule} from '@angular/material/form-field';
import { MatPaginatorModule } from '@angular/material/paginator';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import {MatInputModule} from '@angular/material/input';
import { ReactiveFormsModule  } from '@angular/forms';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatButtonModule} from '@angular/material/button';
import { MatNativeDateModule } from '@angular/material/core';
import { MenuComponent } from './menu/menu.component';
import {MatSidenavModule} from '@angular/material/sidenav';
import { MatToolbarModule } from '@angular/material/toolbar';
import {MatMenuModule} from '@angular/material/menu';
import {MatListModule} from '@angular/material/list';
import {MatExpansionModule} from '@angular/material/expansion';
import {MatIconModule} from '@angular/material/icon';
import { AppRoutingModule } from './app-routing.module';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';
import {MatDialogModule} from '@angular/material/dialog';
import { ArtistDialogComponent } from './artists/artist-dialog/artist-dialog.component';
import { ArtistEditComponent } from './artists/artist-edit/artist-edit.component';
import { ConfirmationDialogComponent } from './confirmation-dialog/confirmation-dialog.component';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import { InsertConfimationSnackBarComponent } from './insert-confimation-snack-bar/insert-confimation-snack-bar.component';


@NgModule({
  declarations: [
    AppComponent,
    ArtistsComponent,
    MenuComponent,
    HomeComponent,
    ArtistDialogComponent,
    ArtistEditComponent,
    ConfirmationDialogComponent,
    InsertConfimationSnackBarComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    MatTableModule,
    MatSortModule,
    FormsModule,
    BrowserAnimationsModule,
    MatFormFieldModule,
    MatPaginatorModule,
    MatInputModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatButtonModule,
    MatNativeDateModule,
    MatSidenavModule,
    MatToolbarModule,
    MatMenuModule,
    MatListModule,
    MatExpansionModule,
    MatIconModule,
    AppRoutingModule,
    RouterModule,
    MatDialogModule,
    MatSnackBarModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
