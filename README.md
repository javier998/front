# RESUMEN DEL PROYECTO
- Para el desarrollo del Backend se realizó con el Framwork de Spring Boot (JAVA 8)
- Para el desarrolo de la Base de Datos se utilizó Postgres
- Para el desarrollo del Fronted se realizó con el Framework de Angular

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

# EJECUCION DEL  DEL BACKEND Y FRONTEND SIN DOCKERIZACIÓN
## EJECUCIÓN DEL BACKEND REALIZADO EN SPRING BOOT + POSTGRES


#### 1. Crear una base de datos vacia en Postgres
#### 2. Modificar el archivo application.properties del proyecto Maven ubicado en  /Other Sources /src/main/resources/default package

* En la primera línea colocar el puerto y el nombre de la base de datos creada
* En la segunda línea colocar el usuario de la BD de Postgres
* En la tercera linea colacar el password de la BD de Postgres

```
spring.datasource.url=jdbc:postgresql://localhost:5432/db_tarea
spring.datasource.username=postgres
spring.datasource.password=Wja0903
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto= update
logging.level.org.hibernate.SQL=debug
spring.mvc.pathmatch.matching-strategy=ant-path-matcher
```
#### 3. Ejecutar el proyecto Maven

**Nota:**  El proyecto creará las tablas con sus atributos y relaciones de acuerdo a las entidades declaradas.

## EJECUCIÓN DEL FRONTEND (ANGULAR)

#### 1. Ubicarse dentro de la carpeta del proyecto
#### 2. Ingresar a la  terminal con la ubicacion del proyecto y ejecutar
```
npm install
```
#### 3. Ejecutar el proyecto
```
ng server
```
