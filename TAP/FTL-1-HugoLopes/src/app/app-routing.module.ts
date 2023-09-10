import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { GalleryComponent } from './pages/gallery/gallery.component';
import { BlogComponent } from './pages/blog/blog.component';
import { ContactusComponent } from './pages/contactus/contactus.component';

const routes: Routes = [
  {path:"",component:HomeComponent},
  {path:"Gallery",component:GalleryComponent},
  {path:"Blog",component:BlogComponent},
  {path:"ContactUs",component:ContactusComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }