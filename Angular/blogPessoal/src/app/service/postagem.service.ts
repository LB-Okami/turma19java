import { environment } from 'src/environments/environment.prod';
import { Postagem } from './../model/Postagem';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PostagemService {

  constructor(
    private http: HttpClient
    ) { }

    tokens = {
      headers: new HttpHeaders().set('Authorization', `${environment.token}`)
    }

    getAllPostagens(): Observable<Postagem[]> {
      return this.http.get<Postagem[]>(`${environment.server}/postagens`, this.tokens)
    }

    getByIdPostagem(id: number): Observable<Postagem> {
      return this.http.get<Postagem>(`${environment.server}/postagens/id/${id}`, this.tokens)
    }

    postPostagem(postagem: Postagem): Observable<Postagem> {
      return this.http.post<Postagem>(`${environment.server}/postagens`, postagem, this.tokens)
    }

    putPostagem(postagem: Postagem): Observable<Postagem> {
      return this.http.put<Postagem>(`${environment.server}/postagens`, postagem, this.tokens)
    }

    deletePostagem(id: number) {
      return this.http.delete(`${environment.server}/postagens/delete/${id}`, this.tokens)
    }
}
