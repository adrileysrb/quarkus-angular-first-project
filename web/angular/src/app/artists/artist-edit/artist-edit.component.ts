import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { MatCalendarCellClassFunction } from '@angular/material/datepicker';
import { Artist } from '../../artist';

@Component({
  selector: 'app-artist-edit',
  templateUrl: './artist-edit.component.html',
  styleUrls: ['./artist-edit.component.css']
})
export class ArtistEditComponent {
  artist: Artist = {} as Artist;
  artistForm: FormGroup;

  constructor(
    private fb: FormBuilder
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
