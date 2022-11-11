import { Component, OnInit } from '@angular/core';
import { Movie, MovieService } from '../service/movie.service';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {

  movie: Movie[];
  constructor(private movieService: MovieService) { }

  ngOnInit(): void {
    this.movieService.getMovie().
      then(movie => this.movie = movie);
  }

}
