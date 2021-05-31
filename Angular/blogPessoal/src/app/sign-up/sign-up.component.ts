import { AuthService } from './../service/auth.service';
import { Component, OnInit } from '@angular/core';
import { User } from '../model/User';
import { Router } from '@angular/router';


@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

  user: User = new User
  confirmarSenha: string
  tipoUsuario: string

  constructor(
    private authService: AuthService,
    private router: Router
  ) { }

  ngOnInit() {
    window.scroll(0, 0)
  }

  confirmSenha(event:any) {
    this.confirmarSenha = event.target.value
  }

  tipoUser(event:any) {
    this.tipoUsuario = event.target.value
  }

  cadastrar() {
    this.user.tipo = this.tipoUsuario

    if(this.user.senha != this.confirmarSenha) {
      alert("as senhas não coincidem")
    }
    else {
      this.authService.cadastar(this.user).subscribe((resp: User) => {
        this.user = resp
        this.router.navigate(['/login'])
        alert('Usuário cadastrado com sucesso!')
      })
    }
  }
}
