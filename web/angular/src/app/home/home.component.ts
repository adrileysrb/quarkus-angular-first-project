import { Component } from '@angular/core';
import { ArtistDialogComponent } from '../artists/artist-dialog/artist-dialog.component';
import { MatDialog } from '@angular/material/dialog';
import { ConfirmationDialogComponent } from '../confirmation-dialog/confirmation-dialog.component';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  
  constructor(private dialog: MatDialog) {
  }

  public openDialog(){
    const dialogRef = this.dialog.open(ArtistDialogComponent,{
      width:"50%",
      height:"75%",
    });
 }

 openDialog2() {
    const dialogRef = this.dialog.open(ConfirmationDialogComponent,{
      data:{
        message: 'Are you sure want to delete?',
        buttonText: {
          ok: 'Save',
          cancel: 'No'
        }
      }
    });
  
    dialogRef.afterClosed().subscribe((confirmed: boolean) => {
      if (confirmed) {
        console.log("Confirmed")
      }
    });
  }

}
