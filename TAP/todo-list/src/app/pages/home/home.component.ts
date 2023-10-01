import { Component } from '@angular/core';
import { TodoService } from 'src/app/components/todo/todo.service';
import { Todo } from 'src/app/models/todo.model';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  todos: Todo[] = [];

  constructor(private todoService: TodoService) {
    this.todoService.getTodos()
      .subscribe((todos: Todo[]): void => {
        this.todos = todos;
      })
  }

  getTodos():void {
    this.todoService.getTodos() 
      .subscribe((todos: Todo[]): void => {
      this.todos = todos;
    })
  }

  deleteTodo(id: number): void {
    this.todoService.deleteTodo(id)
    .subscribe((todos: Todo[]): void => {
      this.getTodos();
    }) 
  }
}
