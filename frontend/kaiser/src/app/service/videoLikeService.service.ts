import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export interface videoLikes {
    name;
    likes;
  }

@Injectable({
  providedIn: 'root'
})
export class VideoLikeService {

  constructor(private http: HttpClient) {}

  rootURL = '/api';

  //Get
  getVideoList() {
    return this.http.get(this.rootURL + '/videoLikeListDto');
  }


  //Post
  // addTeacher(teachername: TeacherNames) {
	// return this.http.post<TeacherNames>(this.rootURL + '/saveTeacherNames', teachername);
  // }

}