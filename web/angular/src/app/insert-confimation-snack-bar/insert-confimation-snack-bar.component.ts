import { Component, Inject, ViewEncapsulation, inject } from '@angular/core';
import {MAT_SNACK_BAR_DATA, MatSnackBarRef} from '@angular/material/snack-bar';


@Component({
  selector: 'app-insert-confimation-snack-bar',
  templateUrl: './insert-confimation-snack-bar.component.html',
  styleUrls: ['./insert-confimation-snack-bar.component.css']
})
export class InsertConfimationSnackBarComponent {
  
  constructor(
    public snackBarRef: MatSnackBarRef<InsertConfimationSnackBarComponent>,
    @Inject(MAT_SNACK_BAR_DATA) public data: any
  ){}

}
