import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AnimeComponent } from './anime/anime.component';
import { BookDataComponent } from './book-data/book-data.component';
import { MovieComponent } from './movie/movie.component';

const routes: Routes = [
  { path: 'books', component: BookDataComponent },
  { path: 'anime', component: AnimeComponent },
  { path: 'movie', component: MovieComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
