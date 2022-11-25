import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class TeacherService {

  constructor(private http: HttpClient) {}

  rootURL = '/api';

  //Get
  getTeacherList() {
    return this.http.get(this.rootURL + '/listTeachers');
  }


  //Post
  // addTeacher(teachername: TeacherNames) {
	// return this.http.post<TeacherNames>(this.rootURL + '/saveTeacherNames', teachername);
  // }

}
