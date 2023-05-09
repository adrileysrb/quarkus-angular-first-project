import { Component } from '@angular/core';
import { User } from './user';
import { MatCalendarCellClassFunction } from '@angular/material/datepicker';
import { Artist } from '../../artist';
import { FormBuilder, FormGroup } from '@angular/forms';
import { MatDialogRef} from '@angular/material/dialog';

@Component({
  selector: 'app-artist-dialog',
  templateUrl: './artist-dialog.component.html',
  styleUrls: ['./artist-dialog.component.css']
})
export class ArtistDialogComponent {
  artist: Artist = {} as Artist;
  artistForm: FormGroup;

  constructor(
    private fb: FormBuilder,
    private dialogRef: MatDialogRef<ArtistDialogComponent>
  ){
    this.artistForm = this.fb.group({
      id: '',
      name: '',
      bio: '',
      createdDate: '',
    });
    
  }

  onFormSubmit() {
    if (this.artistForm.valid) {
      console.log(this.artistForm.value)
      this.dialogRef.close(true)
    }
  }

  dateClass: MatCalendarCellClassFunction<Date> = (cellDate, view) => {
    // Only highligh dates inside the month view.
    if (view === 'month') {
      const date = cellDate.getDate();

      // Highlight the 1st and 20th day of each month.
      return date === 1 || date === 20 ? 'example-custom-date-class' : '';
    }

    return '';
  };
  
}
