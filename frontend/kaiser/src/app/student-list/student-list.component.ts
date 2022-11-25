import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { BehaviorSubject, tap } from 'rxjs';
import { StudentListService } from '../service/student-list.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent{

  constructor(private http: HttpClient) {
    this.serverMessageSubject= new BehaviorSubject<any>(null);
  }
  serverMessageSubject: BehaviorSubject<any>;

  ngoninit() {
    this.getData();
  }

  getData() {
    this.http
      .get<any>('http://localhost:8080/studentsList')
      .pipe(
        tap((result: any) => {
          console.log(result);
        })
      )
      .subscribe((data) => {
        console.log(data);
});
}
}

