import { Component } from '@angular/core';
import { User } from './user';

@Component({
  selector: 'app-artist-dialog',
  templateUrl: './artist-dialog.component.html',
  styleUrls: ['./artist-dialog.component.css']
})
export class ArtistDialogComponent {
  user: User = new User("", "");

  onSubmitTemplateBased() {
    console.log("Template has been submited!")
  }
}
