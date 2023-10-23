export interface Movie {
    Title: string,
    Year: string,
    imdbID: string,
    Type: string,
    Poster: string
}

export interface MovieSearchResponse {
    Response: string;
    totalResults: string;
    Search: Movie[];
}

export interface Ratings {
    Source: string;
    Value: string;
}

export interface MovieDetails {
    Title: string;
    Year: string;
    Rated: string;
    Realeased: string;
    Runtime: string;
    Genre: string;
    Director: string;
    Writer: string;
    Actors: string;
    Plot: string;
    Language: string;
    Country: string;
    Awards: string;
    Poster: string;
    Ratings: Ratings[];
    Metascore: string;
    imdbRating: string;
    imdbVotes: string;
    imdbID: string;
    Type: string;
    DVD: string;
    BoxOffice: string;
    Production: string;
    Website: string;
    Response: string;
}