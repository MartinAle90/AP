import { PersonaService } from './../../service/persona.service';
import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/model/persona.model';
import { Acerca } from 'src/app/model/acerca';
import { AcercaService } from 'src/app/service/acerca.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-acerca',
  templateUrl: './acerca.component.html',
  styleUrls: ['./acerca.component.css']
})
export class AcercaComponent implements OnInit {
  persona: persona = new persona("", "", "");
  acerca: Acerca[] = [];


  constructor(public personaService: PersonaService, private acercaS: AcercaService, private tokenService: TokenService) { }
  isLogged = false;


  ngOnInit(): void {
    this.personaService.getPersona().subscribe(data => {this.persona = data});
    this.cargarAcerca();
    if(this.tokenService.getToken()){
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }

  cargarAcerca(): void{
    this.acercaS.lista().subscribe(
      data =>{
        this.acerca = data;
      }
    )
  }

  delete(id?: number){
    if( id != undefined){
      this.acercaS.delete(id).subscribe(
        data => {
          this.cargarAcerca();
        }, err => {
          alert("No se pudo eliminar");
        }
      )
    }
  }

}
