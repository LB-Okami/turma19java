import { PostagemEditComponent } from './edit/postagem-edit/postagem-edit.component';
import { TemaDeleteComponent } from './delete/tema-delete/tema-delete.component';
import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TemaEditComponent } from './edit/tema-edit/tema-edit.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { ThemeComponent } from './theme/theme.component';
import { PostagemDeleteComponent } from './delete/postagem-delete/postagem-delete.component';

const routes: Routes = [
  {path: '', redirectTo: 'login', pathMatch: 'full'},

  {path: 'login', component: LoginComponent},
  {path: 'sign-up', component: SignUpComponent},

  {path: 'home', component: HomeComponent},
  {path: 'theme', component: ThemeComponent},

  {path: 'theme-edit/:id', component: TemaEditComponent},
  {path: 'theme-delete/:id', component: TemaDeleteComponent},

  {path: 'postagem-edit/:id', component: PostagemEditComponent},
  {path: 'postagem-delete/:id', component: PostagemDeleteComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
