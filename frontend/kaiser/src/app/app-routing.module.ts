import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AnimeComponent } from './anime/anime.component';
import { BookDataComponent } from './book-data/book-data.component';
import { MovieComponent } from './movie/movie.component';
import { StudentsGradeComponent } from './studentsGrade/studentsGrade.component';
import { TeacherComponent } from './teacher/teacher.component';
import { VideolikesComponent } from './videolikes/videolikes.component';

const routes: Routes = [
  { path: 'books', component: BookDataComponent },
  { path: 'anime', component: AnimeComponent },
  { path: 'movie', component: MovieComponent},
  { path: 'studentsGrade', component: StudentsGradeComponent},
  { path: 'teacher', component: TeacherComponent},
  { path: 'videolikes', component: VideolikesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
