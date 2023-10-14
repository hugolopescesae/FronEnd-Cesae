import { Component } from '@angular/core';
import { MovieService } from 'src/app/movie/movie.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})

export class HomeComponent {
  constructor(private movieService: MovieService) {}
  
} 