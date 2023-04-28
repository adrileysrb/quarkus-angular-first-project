import { Component, OnInit, ViewChild } from '@angular/core';
import { ArtistsService } from '../artists.service';
import { MatTableDataSource } from '@angular/material/table';
import { Artist } from '../artist';
import { MatSort } from '@angular/material/sort';
import { MatPaginator } from '@angular/material/paginator';
import { AbstractControl, FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-artists',
  templateUrl: './artists.component.html',
  styleUrls: ['./artists.component.css']
})
export class ArtistsComponent implements OnInit{
  
  dataSource = new MatTableDataSource<Artist>();

  displayedColumns: string[] = ['id', 'name', 'bio', 'createdDate'];
  
  formControl = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    bio: new FormControl(),
    createdDate: new FormControl()
  })


  filteredValues: Artist = {
    id: undefined,
    name: '',
    bio:  ''
  };


  constructor(private artistService: ArtistsService, formBuilder: FormBuilder){

    this.dataSource.filterPredicate = ((data, filter) => {
      const a = !filter.id || data.id === filter.id;
      const b = !filter.name || data.name.toLowerCase().includes(filter.name);
      return a && b;
    }) as (PeriodicElement: any, string: any) => boolean;

    this.formControl = formBuilder.group({ 
      id: [''],
      name:  [''],
      bio:  [''],
      createdDate: ['']
    });
    
  }
 
  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;

  ngOnInit(): void {
    
    this.artistService.getAll().subscribe({
      next: (v) => {
        //console.log(v)
        this.dataSource = new MatTableDataSource<Artist>(v)
      },
      error: (e) => console.error(e),
      complete: () => {
        console.info('complete') 
        this.dataSource.paginator = this.paginator;
        this.dataSource.sort = this.sort 
        this.dataSource.filterPredicate = this.filterTable();
        this.dataSource.filter = JSON.stringify(this.filteredValues);
      }
    })

    this.formControl.get("id")!.valueChanges.subscribe(
      (idFilterValue) => {
      this.filteredValues['id'] = idFilterValue;
      this.dataSource.filter = JSON.stringify(this.filteredValues);
    });

    this.formControl.get("name")!.valueChanges.subscribe((nameFilterValue) => {
      this.filteredValues['name'] = nameFilterValue;
      this.dataSource.filter = JSON.stringify(this.filteredValues);
    });

    this.formControl.get("bio")!.valueChanges.subscribe(
      (bioFilterValue) => {
        this.filteredValues['bio'] = bioFilterValue;
        this.dataSource.filter = JSON.stringify(this.filteredValues);
      }
    );

    this.formControl.get("createdDate")!.valueChanges.subscribe(
      (createdDateFilterValue) => {
        console.log(createdDateFilterValue)
        //this.filteredValues['createdDate'] = createdDateFilterValue;
        //this.dataSource.filter = JSON.stringify(this.filteredValues);
      }
    );
    
  }
  
  filterTable() {
    const myFilterPredicate = function (
      data: Artist,
      filter: string
    ): boolean {
      //console.log(data, filter);
      let searchString = JSON.parse(filter);
      console.log(searchString.id)
      if(searchString.id == undefined || searchString.id == ""){
        return (
          data?.bio
            ?.toString()
            .trim()
            .toLowerCase()
            .indexOf(searchString.bio) != -1 &&
          data?.name
            ?.toString()
            .trim()
            .toLowerCase()
            .indexOf(searchString.name.toLowerCase()) != -1
        ); 
      }
      return (
        data?.id == searchString.id &&
        data?.bio
          ?.toString()
          .trim()
          .toLowerCase()
          .indexOf(searchString.bio) != -1 &&
        data?.name
          ?.toString()
          .trim()
          .toLowerCase()
          .indexOf(searchString.name.toLowerCase()) != -1
      );
    };
    return myFilterPredicate;
  }

}
