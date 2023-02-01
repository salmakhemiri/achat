import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Role } from '../model/Role';
import { RoleService } from '../services/role.service';

@Component({
  selector: 'app-role',
  templateUrl: './role.component.html',
  styleUrls: ['./role.component.css']
})
export class RoleComponent implements OnInit {
  listRole!:Role[];
  role!: Role;
    constructor(private roleService: RoleService, private ac: ActivatedRoute, private router :Router) { }
  
    ngOnInit(): void {
      this.role=new Role();
      this.roleService.getRole().subscribe(
        (data)=> this.listRole=data);  
  
      }
    deleteRole(id:number){
      this.roleService.deleteRole(id).subscribe(res => {
      console.log('Role deleted!');
      this.router.navigateByUrl('/home');})
    }
  
      save(){
        this.roleService.addRole(this.role).subscribe (res => {
        console.log('Role created!');
        this.router.navigateByUrl('/home');})
        ;
        }

}
