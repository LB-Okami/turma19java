import { Observable } from 'rxjs';
import { environment } from './../../environments/environment.prod';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Tema } from '../model/Tema';

@Injectable({
  providedIn: 'root'
})
export class TemaService {

constructor(
  private http: HttpClient
) { }

  tokens = {
    headers: new HttpHeaders().set('Authorization', `${environment.token}`)
  }

  getAllTema(): Observable<Tema[]> {
    return this.http.get<Tema[]>(`${environment.server}/tema`, this.tokens)
  }

  getByIdTema(id: number): Observable<Tema> {
    return this.http.get<Tema>(`${environment.server}/tema/${id}`, this.tokens)
  }

  postTema(tema: Tema): Observable<Tema> {
    return this.http.post<Tema>(`${environment.server}/tema`, tema, this.tokens)
  }

  putTema(tema: Tema): Observable<Tema> {
    return this.http.put<Tema>(`${environment.server}/tema`, tema, this.tokens)
  }

  deleteTema(id: number) {
    return this.http.delete(`${environment.server}/tema/delete/${id}`, this.tokens)
  }
}
