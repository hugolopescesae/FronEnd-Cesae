import { Component } from '@angular/core';
import { Image } from "../../models/image.models";

@Component({
  selector: 'app-imagesgallery',
  templateUrl: './imagesgallery.component.html',
  styleUrls: ['./imagesgallery.component.scss']
})
export class ImagesgalleryComponent {
    images: Image[] = [
      {
        src: "https://imageio.forbes.com/specials-images/imageserve/5d35eacaf1176b0008974b54/0x0.jpg?format=jpg&crop=4560,2565,x790,y784,safe&width=1200"
      },
      {
        src: "https://carwow-uk-wp-3.imgix.net/18015-MC20BluInfinito-scaled-e1666008987698.jpg"
      },
      {
        src: "https://www.usnews.com/cmsmedia/12/be/5c7f3dfb4a12ab0795a9ba8144b5/2023-acura-integra-a-spec-2.jpg"
      },
      {
        src: "https://www.topgear.com/sites/default/files/2022/07/13.jpg"
      },
      {
        src: "https://i.insider.com/641a0d7f8a514c001825b3c3?width=750&format=jpeg&auto=webp"
      },
      {
        src: "https://hips.hearstapps.com/hmg-prod/images/dw-burnett-pcoty22-8260-1671143390.jpg"
      },
      {
        src: "https://cdn.jdpower.com/Average%20Weight%20Of%20A%20Car.jpg"
      },
      {
        src: "https://www.autocar.co.uk/sites/autocar.co.uk/files/images/car-reviews/first-drives/legacy/10-porsche-718-cayman-gt4-rs-top-10.jpg"
      }
    ]
}
