import { Component } from '@angular/core';
import { BlogPost } from "../../models/blogpost.models";

@Component({
  selector: 'app-bloglayout',
  templateUrl: './bloglayout.component.html',
  styleUrls: ['./bloglayout.component.scss']
})
export class BloglayoutComponent {
  blogLayout : BlogPost[] = [
    {
      h5: "Post Blog 1 ",
      p1: "15/09/2023",
      p2: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam dapibus elit fermentum urna imperdiet, in mattis erat fringilla. Aenean et eros dignissim, scelerisque mauris vitae, pellentesque nibh. Nulla vel nunc nunc. Duis elementum ligula pulvinar, maximus mauris sit amet, elementum odio. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nunc blandit, tortor id malesuada consectetur, dolor magna venenatis enim, imperdiet egestas tellus quam a lorem. Suspendisse ut urna gravida, ultricies velit id, semper velit. Phasellus ultrices sapien ut purus facilisis sodales. Ut quis convallis eros. Etiam ut libero imperdiet, faucibus sem a, mattis ipsum. Integer condimentum, ligula nec vehicula scelerisque, enim mauris fermentum dolor, sed porta ante nisi varius massa. Ut nec ex sit amet turpis euismod tempus quis vitae lectus.\n" +
        "\n" +
        "Fusce id pretium sem, at sagittis ligula. Maecenas non dui nisi. Praesent quis nisl eleifend, pretium dui ac, ultrices lacus. Nunc tristique sollicitudin purus.",
      a: "Hugo Lopes"
    },
    {
      h5: "Post Blog 2",
      p1: "16/09/2023",
      p2: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam euismod euismod dolor ut rhoncus. Nunc tincidunt ex vel mattis luctus. Quisque scelerisque elit eu ipsum accumsan egestas. Nunc ac augue dignissim, mattis nulla vitae, sodales dui. Cras lobortis ante leo, ac sodales mauris congue ac. Maecenas at nunc ac eros feugiat elementum. Quisque laoreet aliquam leo, sit amet fringilla elit. In hac habitasse platea dictumst. Aliquam sed felis sed risus tincidunt hendrerit in vel urna. In rhoncus lorem quis mattis blandit. Suspendisse tincidunt, ligula vitae blandit maximus, ante quam congue quam, non consectetur ex elit a lorem. Etiam laoreet volutpat aliquet. Nunc ultrices quam dolor, ac consequat purus congue gravida. Curabitur gravida orci a lectus sagittis placerat. Proin sollicitudin ultricies libero. Etiam quis eros id neque laoreet ultricies.\n" +
        "\n" +
        "Sed finibus quam id justo ullamcorper sollicitudin. Sed pulvinar in metus sit amet commodo. Vestibulum lacinia nibh quis sodales facilisis. Donec maximus.",
      a: "Sérgio Nogueira"
    }
  ]
}
