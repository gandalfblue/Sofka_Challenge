import { Component, OnInit } from '@angular/core';
import { PostService } from 'src/app/servicios/post.service';
import { GetService } from 'src/app/servicios/get.service';


@Component({
  selector: 'app-front',
  templateUrl: './front.component.html',
  styleUrls: ['./front.component.css']
})
export class FrontComponent implements OnInit {

  //Variables que se declaran de manera global
  user!: any;
  res: any;
  res3: any;
  res4: any;
  res5: any;
  content: any;
  content2: any;
  content3: any;
  content4 = Array();
  content5!: any[];
  content6: any[] = [{}];
  urlapi: string = "http://localhost:8080/api/preguntas/nivel/";
  urlapi2: string = "http://localhost:8080/api/users/";
  codigoRespuesta!: number;
  res2: any;
  nivel: number = 1;
  pregunta!: string;
  respuesta_falsa3!: string;
  respuesta_falsa2!: string;
  respuesta_falsa1!: string;
  respuestaverdadera !: string;
  numeropregunta!: any;
  selectanswer: string = "";
  numero!: number;
  total: number = 0;
  totalpagado: number = 0;
  mostrartotal!: any;
  mostrartotalpagado!: any;
  consecutivonivel!: any;
  nombre!: any;
  username!: any;
  username2: string = "";
  cedula!: any;
  rango = Array();
  mostrar: number = 2;

  constructor(private read: GetService, private post: PostService) { }

  //Metodo que se ejecuta al cargar la pagina, sirve para hacer get a los datos iniciales
  //como todos los usuarios almacenados, las preguntas del nivel inicial
  ngOnInit(): void {
    this.cedula = localStorage.getItem("cedula");
    this.nombre = localStorage.getItem("nombre");
    this.username = localStorage.getItem("username");
    this.mostrartotal = localStorage.getItem("mostrartotal");
    this.mostrartotalpagado = localStorage.getItem("mostrartotalpagado");
    this.consecutivonivel = localStorage.getItem("nivel");
    this.nivel = Number(this.consecutivonivel);
    this.total = Number(this.mostrartotal);
    this.totalpagado = Number(this.mostrartotalpagado);

    if (this.nombre == null && this.cedula == null && this.username == null) {
      this.cedula = "";
      this.nombre = "";
      this.username = "";
    }

    this.res = this.read.codigoRespuesta(this.urlapi, this.nivel).subscribe(datos => {
      this.content = datos.status;
      console.log(this.content);
      if (this.content == 200) {
        this.leer();

      } else {
        console.log("No se pudo traer datos");
      }

    });

    this.res3 = this.read.leerTodos(this.urlapi2).subscribe(data => {
      this.content5 = Object.values(data);
      this.ranking();
    });
  }

  //Metodo que srive para hacer un get a la base de datos
  leer() {

    this.res2 = this.read.leer(this.urlapi, this.nivel).subscribe(datos2 => {
      this.content2 = datos2;
      this.randomnumber();
    });
  }

  //Metodo que sirve para traer los 3 puntajes mayores que esta almacenado en la databse
  ranking() {

    var numeros = new Array();
    this.content5.forEach(element => {

      numeros.push(element.puntos_total);

    });

    var recorrido = 3
    if (numeros.length <= 3) {
      recorrido = numeros.length;
    }
    for (let i = 0; i < recorrido; i++) {
      let max = Math.max(...numeros);
      let index = numeros.indexOf(max);
      this.rango.push(this.content5[index]);
      this.content5.splice(index, 1);
      numeros.splice(index, 1);
    };
  }

  //Metodo que sirve para seleccionar la pregunta de manera aleatoria
  randomnumber() {

    setTimeout(function () {
    }, 5000);
    this.numero = Math.floor(Math.random() * this.content2.length);
    this.content3 = Object.values(this.content2[this.numero]);
    for (let dato = 4; dato < this.content3.length; dato++) {
      this.content4.push(this.content3[dato])

    }
    this.pregunta = this.content2[this.numero].pregunta;
    this.respuestaverdadera = this.content2[this.numero].respuestaverdadera;
    return this.content2[this.numero];
  }

  //Metodo que sirve para escoger la respuesta, si selecciona la respuesta correcta
  //continua al siguiente nivel, si selecciona la respuesta incorrecta termina el juego
  radioChangeHandler(event: any) {
    console.log(this.nivel);
    this.selectanswer = event.target.value;

    if (this.nivel >= 1 && this.nivel <= 5) {
      if (this.selectanswer == this.respuestaverdadera) {
        console.log("ingreso al if del while")
        this.total += 200000;
        this.nivel += 1;
        this.totalpagado += this.total;
        window.localStorage["cedula"] = this.cedula;
        window.localStorage["nombre"] = this.nombre;
        window.localStorage["username"] = this.username;

      } else {

        this.agregar();
        this.total = 0;
        this.nivel = 1;
        window.localStorage["mostrartotal"] = this.total.toString();
        window.localStorage["nivel"] = this.nivel.toString();
        window.localStorage["mostrartotalpagado"] = this.totalpagado.toString();
        localStorage.clear();
        window.location.reload();
      }

      window.localStorage["mostrartotal"] = this.total.toString();
      window.localStorage["nivel"] = this.nivel.toString();
      window.localStorage["mostrartotalpagado"] = this.totalpagado.toString();
      window.location.reload();
    }
    if (this.nivel > 5) {
      console.log("ingreso al if")
      this.agregar();
      this.total = 0;
      this.nivel = 1;
      window.localStorage["mostrartotal"] = this.total.toString();
      window.localStorage["nivel"] = this.nivel.toString();
      window.localStorage["mostrartotalpagado"] = this.totalpagado.toString();
      window.location.reload();
    }
  }

  //Metodo que sirve para realizar un post a la base de datos
  agregar() {

    let body = {
      "cedula": this.cedula,
      "nombre": this.nombre,
      "puntos_total": this.total,
      "username": this.username,
    }

    this.post.crear(this.urlapi2, body).subscribe(data => {
      this.user = data;
    });

  }

  //Metodo que sirve para finalizar el juego voluntariamente 
  retirada() {
    this.nivel = 1;
    this.total = 0;
    window.localStorage["mostrartotal"] = this.total.toString();
    window.localStorage["nivel"] = this.nivel.toString();
    window.localStorage["mostrartotalpagado"] = this.totalpagado.toString();
    this.agregar();
    window.location.reload();

  }
}