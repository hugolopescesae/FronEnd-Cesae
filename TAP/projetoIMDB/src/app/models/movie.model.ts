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