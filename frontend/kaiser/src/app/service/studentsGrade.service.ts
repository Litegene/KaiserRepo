import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class StudentsGradeService {

  constructor(private http: HttpClient) {}

  rootURL = '/api';

  //Get
  getStudentsDtoList() {
    return this.http.get(this.rootURL + '/getStudentDtoList');
  }


  //Post
//   addUser(user: any, id: number) {
// 	user.id = id;
// 	return this.http.post(this.rootURL + '/user', user);
//   }

}
