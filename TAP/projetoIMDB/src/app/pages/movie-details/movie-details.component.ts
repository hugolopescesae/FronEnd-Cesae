import { Component, OnInit } from '@angular/core';
import { MovieDetails } from 'src/app/models/movie.model';
import { MovieService } from 'src/app/movie/movie.service';

@Component({
  selector: 'app-movie-details',
  templateUrl: './movie-details.component.html',
  styleUrls: ['./movie-details.component.scss']
})
export class MovieDetailsComponent implements OnInit {
  movie: MovieDetails = {
    Title: '',
    Year: '',
    Rated: '',
    Realeased: '',
    Runtime: '',
    Genre: '',
    Director: '',
    Writer: '',
    Actors: '',
    Plot: '',
    Language: '',
    Country: '',
    Awards: '',
    Poster: '',
    Ratings: [],
    Metascore: '',
    imdbRating: '',
    imdbVotes: '',
    imdbID: '',
    Type: '',
    DVD: '',
    BoxOffice: '',
    Production: '',
    Website: '',
    Response: ''
  };

  constructor(private movieService: MovieService) {}

  ngOnInit(): void {
    this.getMovieById();
  }

  getMovieById(): void {
    this.movieService.getMovieById("tt0099785")
    .subscribe((movieDetails: MovieDetails): void => {
      this.movie = movieDetails;
    })
  }
}
