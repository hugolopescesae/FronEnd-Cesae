import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Todo } from 'src/app/models/todo.model';

@Injectable({
  providedIn: 'root'
})
export class TodoService {
  private url: string = "http://todoapicesae2023-env.eba-hmwuhkz3.eu-north-1.elasticbeanstalk.com"

  constructor(private http: HttpClient) { }

  public getTodos(): Observable<Todo[]> {
    return this.http.get<Todo[]>(`${this.url}/todos`)
  }
  
  public deleteTodo(id: number): Observable<Todo[]> {
    return this.http.delete<Todo[]>(`${this.url}/todos/${id}`)
  }
}
