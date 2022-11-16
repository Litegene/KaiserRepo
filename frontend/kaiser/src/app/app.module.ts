import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BookDataComponent } from './book-data/book-data.component';
import {TableModule} from 'primeng/table';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AnimeComponent } from './anime/anime.component';
import { MovieComponent } from './movie/movie.component';
import { StudentsGradeComponent } from './studentsGrade/studentsGrade.component';

@NgModule({
  declarations: [
    AppComponent,
    BookDataComponent,
    AnimeComponent,
    MovieComponent,
    StudentsGradeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    TableModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
