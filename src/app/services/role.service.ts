import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Role } from '../model/Role';
import {HttpHeaders} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RoleService {
  url ='http://localhost:3000/roles';
  httpOptions = {
    headers: new HttpHeaders({
    'Content-Type': 'application/json'
    })
    }
  constructor(private http: HttpClient) { }
  getRole(){
    return this.http.get<Role[]>(this.url);
  }
  addRole (role: Role): Observable<Role> {
    return this.http.post<Role>(this.url, role,
    this.httpOptions);
  }
  deleteRole (role: Role | number):
Observable<Role> { const id = typeof role === 'number'
? role : role.id; const url=this.url+'/'+id;
return this.http.delete<Role>(url);
}

getRoleById(id: number): Observable<Role> {
  return this.http.get<Role>(this.url +'/'+ id); }
 
updateRole (id: number, role: Role): Observable<Role> {
    return this.http.put<Role>(this.url+'/'+ id, role,
    this.httpOptions);
    }

}
