import { Component } from '@angular/core';
import { Card } from "../../models/cards.models";

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html',
  styleUrls: ['./cards.component.scss']
})
export class CardsComponent {
  cards: Card[] =[
    {
      title: "Title 1",
      description: "Description 1",
      image: "https://w.wallhaven.cc/full/ne/wallhaven-negpyr.jpg"
    },
    {
      title: "Title 2",
      description: "Description 2",
      image: "https://w.wallhaven.cc/full/0p/wallhaven-0pkjze.jpg"
    },
    {
      title: "Title 3",
      description: "Description 3",
      image: "https://w.wallhaven.cc/full/4g/wallhaven-4g72yl.jpg"
    }
  ]
}
