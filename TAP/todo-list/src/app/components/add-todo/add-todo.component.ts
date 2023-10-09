import { Component } from '@angular/core';
import { Todo } from 'src/app/models/todo.model';
import { TodoService } from '../todo/todo.service';

@Component({
  selector: 'app-add-todo',
  templateUrl: './add-todo.component.html',
  styleUrls: ['./add-todo.component.scss']
})
export class AddTodoComponent {
  todo: Todo = {
    title: "",
    description: "",
    isDone: false
  }

  constructor(private todoService: TodoService) {}

  addTodo(): void {
    this.todoService.addTodo(this.todo).subscribe()
  }
}
