import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { MatCalendarCellClassFunction } from '@angular/material/datepicker';
import { Artist } from '../../artist';
import { ConfirmationDialogComponent } from '../../confirmation-dialog/confirmation-dialog.component';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { MatSnackBar } from '@angular/material/snack-bar';
import { InsertConfimationSnackBarComponent } from '../../insert-confimation-snack-bar/insert-confimation-snack-bar.component';


@Component({
  selector: 'app-artist-edit',
  templateUrl: './artist-edit.component.html',
  styleUrls: ['./artist-edit.component.css']
})
export class ArtistEditComponent {
  artist: Artist = {} as Artist;
  artistForm: FormGroup;

  constructor(
    private fb: FormBuilder,
    private dialog: MatDialog,
    private router: Router,
    private _snackBar: MatSnackBar
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

  openSnackBar(success: boolean) {
    let styleSnackBar = success ? "success-snackbar" : "error-snackbar"
    this._snackBar.openFromComponent(InsertConfimationSnackBarComponent, {
      duration: 10000,
      verticalPosition: "top",
      horizontalPosition: "center",
      data: "Success",
      panelClass: styleSnackBar
    });
  }

  openDialog2() {
    const dialogRef = this.dialog.open(ConfirmationDialogComponent,{
      data:{
        message: 'Are you sure want to insert?',
        buttonText: {
          ok: 'Save',
          cancel: 'Cancel'
        }
      }
    }
    );
  
    dialogRef.afterClosed().subscribe((confirmed: boolean) => {
      if (confirmed) {
        console.log("Confirmed")
        this.router.navigate(['artist'])
        this.openSnackBar(false)
      }
    });
  }

}
