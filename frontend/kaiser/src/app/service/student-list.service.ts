import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable, tap } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentListService {

  constructor(private http: HttpClient) {
    this.serverMessageSubject= new BehaviorSubject<any>(null);
  }
  serverMessageSubject: BehaviorSubject<any>;


  Ngoninit() {

  }

  public getData() {
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
