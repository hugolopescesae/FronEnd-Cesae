import {Component, Input} from '@angular/core';

@Component({
  selector: 'app-blogpost',
  templateUrl: './blogpost.component.html',
  styleUrls: ['./blogpost.component.scss']
})
export class BlogpostComponent {
  @Input() h5: string = ""
  @Input() p1: string = ""
  @Input() p2: string = ""
  @Input() a : string = ""
}
