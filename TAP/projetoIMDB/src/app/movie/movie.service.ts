import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { MovieSearchResponse } from '../models/movie.model';

@Injectable({
  providedIn: 'root'
})

export class MovieService {

  private domain: string = "https://www.omdbapi.com" // OMDB Domain
  private apikey: string = "8b7fe278" // Auth Key OMDB

  constructor(private http: HttpClient) { }

  getMovieByTitle(title: string, page: number): Observable<MovieSearchResponse> { // A função procura um filme pelo título e retorna todos resultados da pesquisa
    return this.http.get<MovieSearchResponse>(`${this.domain}?apikey=${this.apikey}&s=${title}&page=${page}`)
  }
  
}
