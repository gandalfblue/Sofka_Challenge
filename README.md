# Sofka_Challenge
 Repositorio del reto de Sofka

# Pasos_para_trabajar_con_el_back

* El back esta hecho con el ide de eclipse.
* Se utiliza el lenguaje de programación Java en la versión del JDK 11.0.11.
* Se utiliza Spring Framework versión 2.5.6 (en la carpeta drivers, esta el esqueleto que se utiliza y que fue hecho en Spring Initializr).
* Se debe instalar Spring Tools 4 (Se descarga directamente desde el Ide de eclipse).
* Se utiliza base de datos MongoDB (No relacional.
* Para comunicar la base de datos con el back, en la carpeta src\main\resources desde el ide abres el archivo "aplication.properties" y pones la url de conexión con tu base de datos. En ese archivo se deja un ejemplo de como se debe conectar.
* Para ejecutar el back, seleccionamos el nombre del proyecto, damos click derecho, luego "Run as" y por ultimo damos click en "Spring Boot App", se ejecuta el proyecto; si en consola no te arroja ningun error, abres una pestaña del navegdor y colocas la url "http://localhost:8080/swagger-ui.html#/". Puedes escoger entre los metodos que se usan desde el controlador de datos-user o el de preguntas. Allí puedes documentar si funciona los metodos que se usan en la app. 
* Usamos Swagger-ui para hacer la documentación de los metodos del back.






# Pasos_para_trabajar_con_el_front

* El front fue hecho en Visual Studio Code.
* Se debe instalar NodeJS versión 16.13.0 o mayor; pero que sea estable.
* Se debe instalar Angular CLI versión 13.0.4 o mayor, pero que sea estable (se instala directamente desde el Ide de VSCode, primero debe estar instalado el NodeJS).
* Despues de tener instalado Angular CLI y de haber descargado el proyecto, nos colocamos en la carpeta del proyecto "Front Challenge", utilizamos la terminal de consola el comando "cd y el nombre de la carpeta", preferiblemente usar la consola cmd.
* Despues ejecutamos en la misma consola el comando "npm install", para descargar los drivers necesarios para que se ejecute el proyecto, ya que al subir el proyecto a GIT no se sube la carpeta node_modules por temas de derecho de autor.
* Para ejecutar el front en VSCode, ejecutamos en la terminal de consola cmd el comando "ng serve", se demorara unos minutos, al final en la consola aparecera "√ Compiled successfully", abre el navegador preferiblemente Google Chrome y colocas como URL "http://localhost:4200/home" y listo te aparecera el front del proyecto.
* Puedes jugar ingresando tu nombre, username y cedula (es opcional).
* Para jugar solo le das click a la respuesta que creas correcta, si deseas retirate de manera voluntaria le das click al boton "Retirarse".



