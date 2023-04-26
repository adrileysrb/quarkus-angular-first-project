import { Component, OnInit, ViewChild } from '@angular/core';
import { ArtistsService } from '../artists.service';
import { MatTableDataSource } from '@angular/material/table';
import { Artist } from '../artist';
import { MatSort } from '@angular/material/sort';
import { MatPaginator } from '@angular/material/paginator';


@Component({
  selector: 'app-artists',
  templateUrl: './artists.component.html',
  styleUrls: ['./artists.component.css']
})
export class ArtistsComponent implements OnInit{
  
  dataSource = new MatTableDataSource<Artist>();

  displayedColumns: string[] = ['id', 'name', 'bio', 'createdDate'];

  
  constructor(private artistService: ArtistsService){}
 
  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;

  ngOnInit(): void {
    this.artistService.getAll().subscribe({
      next: (v) => {
        console.log(v)
        this.dataSource = new MatTableDataSource<Artist>(v)
      },
      error: (e) => console.error(e),
      complete: () => {
        console.info('complete') 
        this.dataSource.paginator = this.paginator;
        this.dataSource.sort = this.sort 
      }
    })
    
  }

  

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }
  

}
