import { Component } from '@angular/core';
import { MovieSearchResponse } from 'src/app/models/movie.model';
import { MovieService } from 'src/app/movie/movie.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})

export class HomeComponent {
  constructor(private movieService: MovieService) {
    this.getMovieByTitle();
  }

  getMovieByTitle() {
    this.movieService.getMovieByTitle("harry")
    .subscribe((movieSearchResponse: MovieSearchResponse): void => {
      console.log(movieSearchResponse.Search)
    })
  }
}