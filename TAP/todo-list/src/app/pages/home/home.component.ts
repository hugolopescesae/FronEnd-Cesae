import { Component } from '@angular/core';
import { Todo } from 'src/app/models/todo.model';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  todos: Todo[] = [
    {
      id: 1,
      title: "title 1",
      description: "description 1",
      isDone: false,
    },
    {
      id: 2,
      title: "title 2",
      description: "description 2",
      isDone: false,
    },
  ]
}
