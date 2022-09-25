# RESUMEN DEL PROYECTO
Para el desarrollo del Backend se realizó con el Framwork de Spring Boot
Para el desarrolo de la Base de Datos se utilizó Postgres
Para el desarrollo del Fronted se realizó con el Framework de Angular

# DOCKERIZACION DEL BACKEND Y FRONTEND
## DOCKERIZACION DEL BACKEND REALIZADO EN SPRING BOOT + POSTGRES
**NOTA**: Antes de la dockerización del backend construir la aplicacion maven, el cual el resultado debe de dar un archivo llamado "proyecto-2.7.4-SNAPSHOT.jar" que se ubicara en la carpeta "target". En el caso que obtenga el otro nombre distinto dirigirse al archivo "DockerFile" y sustiruir los textos "proyecto-2.7.4-SNAPSHOT.jar" por el nombre del archivo obtenido.

#### 1. Crear la imagen docker en la carpeta backend/proyecto
```
docker-compose up
```
#### 2. Una vez creada la imagen se empezara a ejecutar los contenedores de manera automatica



## DOCKERIZACION DEL FRONTEND REALIZADO EN ANGULAR:

##### 1. Crear la imagen docker en la carpeta fronted/proyecto
**NOTA**: en "javierch998" colocar el nombre de usuario de Docker Hub de la persona que va a creer la imagen
```
 docker build -t javierch998/proyecto-app .
```
##### 2. Ejecuta la imagen docker
**NOTA**: en "javierch998" colocar el nombre de usuario de Docker Hub de la persona que va a ejecutar el comando

```
docker run -d -it -p 80:80/tcp --name proyecto-app javierch998/proyecto-app:latest
```
##### 3. La docekerizacion estara lista 
```
Para ingresar entrar  la url: localhost:80
```