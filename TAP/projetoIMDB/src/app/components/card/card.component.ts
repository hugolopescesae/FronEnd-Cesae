import { Component, OnInit } from '@angular/core';
import { Movie, MovieSearchResponse } from 'src/app/models/movie.model';
import { MovieService } from 'src/app/movie/movie.service';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss']
})
export class CardComponent implements OnInit {
  movies: Movie[] = [];
  searchMovie: string = "";

  constructor(private movieService: MovieService) {}

  ngOnInit(): void {
    this.getMovieByTitle();
  }

  getMovieByTitle(page: number = 1):void {
    this.movieService.getMovieByTitle(this.searchMovie, page)
    .subscribe((movieSearchResponse: MovieSearchResponse): void => {
      console.log(movieSearchResponse.Search)
      this.movies = movieSearchResponse.Search;
    })
  }
}
