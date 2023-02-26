# CVDS_LAB03
## Clases de Equivalencia
## ***Integrantes:***
- Erika Juliana Castro Romero
- Mariana Pulido Moreno
## **CREAR UN PROYECTO CON MAVEN** 
En el directorio de trabajo ejecutar el comando necesario para crear un proyecto maven, basado en un arquetipo:
* Grupo: edu.eci.cvds
* Artefacto: ClasesEquivalencia
* Paquete: edu.eci.cvds.tdd
* archetypeArtifactId: maven-archetype-quickstart
```
    mvn archetype:generate -Dfilter=maven-archetype-quickstart 
```
![1](https://github.com/MPulidoM/CVDS_LAB03/blob/main/Pantallazos/im1.PNG)

## **Actualizar y crear dependencias en el proyecto**
- Busque en internet el repositorio central de maven. 
- Busque el artefacto JUnit y entre a la versión más nueva 
- Ingrese a la pestaña de Maven y haga click en el texto de la dependencia para copiarlo al portapapeles. 
- Edite el archivo pom.xml y realice las siguientes actualizaciones: 
  - Agregue la dependencia copiada a la sección de dependencias. 
  - Hay que cambiar la versión del compilador de Java a la versión 8, para ello, agregue la sección properties antes de la sección de dependencias:
 ```
   <properties>        
    <maven.compiler.target>1.8</maven.compiler.target>                   
    <maven.compiler.source>1.8</maven.compiler.source>     
    </properties> 
```
