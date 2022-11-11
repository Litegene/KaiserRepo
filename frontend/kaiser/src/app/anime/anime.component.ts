import { Component, OnInit } from '@angular/core';
import { AnimeService, Anime } from '../service/anime.service';

@Component({
  selector: 'app-anime',
  templateUrl: './anime.component.html',
  styleUrls: ['./anime.component.css']
})
export class AnimeComponent implements OnInit {

  anime: Anime[];
  constructor(private animeService: AnimeService) { }

  ngOnInit(): void {
    this.animeService.getAnime().
      then(anime => this.anime = anime);
  }

}
