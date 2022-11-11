import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export interface Movie {
  name;
  releaseDate;
  rating;
}

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  constructor(private http: HttpClient) {}

  getMovie() {
    return this.http.get<any>('assets/movie.json')
      .toPromise()
      .then(res => <Movie[]>res.data)
      .then(data => { return data; });
    }
}
