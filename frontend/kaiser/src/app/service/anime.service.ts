import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export interface Anime {
  name;
  releaseDate;
  rating;
}

@Injectable({
  providedIn: 'root'
})
export class AnimeService {

  constructor(private http: HttpClient) {}

  getAnime() {
    return this.http.get<any>('assets/anime.json')
      .toPromise()
      .then(res => <Anime[]>res.data)
      .then(data => { return data; });
    }
}
