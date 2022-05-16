<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>


<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Revisión de elementos de programación (Parte I)</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>02</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA INICIO::</td><td>09-May-2022</td><td>FECHA FIN:</td><td>13-May-2022</td><td>DURACIÓN:</td><td>02 horas</td>
</tr>
<tr><td colspan="6">INTEGRANTES:
    <ul>
        <li>Eduardo Franshua Durand Obando</li>
        <li>Henry Isaias Galvez Quilla</li>
        <li>Kevin J. Alvarez Astete</li>
        <li>Edmundo Edilberto Centeno Quispe</li>      
</td>
</<tr>
<tr><td colspan="6">DOCENTES:
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
</tdbody>
</table>

# Revisión de elementos de programación

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]

[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

#

## OBJETIVOS TEMAS Y COMPETENCIAS

### OBJETIVOS

- Realizar ejercicios en temas de Estructuras de datos, tipos de datos abstractos, bucles, Arrays, Listas enlazadas, Recursión.

### TEMAS
- TAD
- Arrays

<details>
<summary>COMPETENCIAS</summary>

- C.m. Construye responsablemente soluciones haciendo uso de estructuras de datos y algoritmos, siguiendo un proceso adecuado para resolver problemas computacionales que se ajustan al uso de los recursos disponibles y a especificaciones concretas.

</details>

## CONTENIDO DE LA GUÍA

### MARCO CONCEPTUAL

- https://www.w3schools.com/java/
- https://docs.oracle.com/javase/7/docs/api/java/util/List.html
- https://docs.oracle.com/javase/tutorial/java/generics/types.html

## EJERCICIO RESUELTO POR EL DOCENTE

#
- ArrayList
    -   ```sh
        ArrayList<String> alumnos = new ArrayList<String>();
        ArrayList<Integer> notas = new ArrayList<Integer>();

        alumnos.add("HENRY");
		alumnos.add("DIEGO");
		alumnos.add("RICHART");
		alumnos.add("GABRIEL");

        System.out.println(alumnos.hashCode());
        System.out.println(alumnos.isEmpty());
        System.out.println(alumnos.size());
        ```
- Iterador
    -   ```sh
        Iterator<String> itA = alumnos.iterator();		
		while(itA.hasNext()) {
			System.out.println(itA.next());
		}
        ```
- Java Bean
    -   ```sh
        public class Animal {

            String nombre;
            boolean genero;

            public Animal(String nombre, boolean genero) {
                super();
                this.nombre = nombre;
                this.genero = genero;
            }
            public String getNombre() {
                return nombre;
            }
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
            public boolean isGenero() {
                return genero;
            }
            public void setGenero(boolean genero) {
                this.genero = genero;
            }

        }
        ```
    -   ```sh
        ArrayList<Animal> mascotas = new ArrayList<Animal>();
        ```
    -   ```sh
        List<Animal> mascotas2 = new List<Animal>(); /** <- Ver error */
        List<Animal> mascotas2 = new ArrayList<Animal>();
        ```

## EJERCICIOS PROPUESTOS
- 1. Invertir un matriz de enteros (2 pts)

    - Ejemplo:
    - A=[1 2 3]	->	Ain=[3 2 1]


    -   ```sh
        public int[] invertirArray(int[] A){
            /** */
            //Procedimiento para invertir la matriz
            /** */
            return Ain;
        }
        ```
        - Para resolver el ejercicio 1 se creó una matriz con la misma longitud que la original, luego se empezó a instanciar cada uno de los elementos de la segunda matriz con los elementos de la primera de atrás hacia adelante. EJEMPLO :
            - PrimerElementoMatrizVacía = ÚltimoElementoMatrizOriginal
            - SegundoElementoMatrizVacía = PenúltimoElementoMatrizOriginal
        #

- 2. Rotación a la Izquierda (3 pts)

    - Ejemplo:
    - Si d=2
    - A=[1 2 3 4 5]	->	Aiz=[3 4 5 1 2]

    -   ```sh
        public int[] rotarIzquierdaArray(int[] A){
            /** */
            //Procedimiento para rotar la matriz
            /** */
            return Aiz;
        }
        ```
        - En este segundo ejercicio primero se buscó rotar la matriz hacia la izquierda una posición, luego este proceso se repetiría las  veces que se indicaran.
        - Para lograr rotar la matriz una posición a la izquierda se guardo el primer elemento en una variable temporal, luego se le asigno a cada elemento de la matriz el elemento siguiente a él a excepción del último elemento al cual le fue asignado el valor de la variable temporal. Este proceso se repite n veces para rotar la matriz según se pida.
        #

- 3. Triángulo recursivo (4 pts)

    - Ejemplo:
    - b=5
    -   ```sh
        *
        **
        ***
        ****
        *****
        ```

    -   ```sh
        public void trianguloRecursivo(int base){
            /** */
            //Procedimiento para imprimir triángulo
            /** */
        }
        ```
        - Para este ejercicio se uso recursividad, de tal forma que en el caso base n = 1 se imprime solo un asterisco, caso contrario se uso la misma funcion pero para
        el caso n-1, entonces luego imprimira n asteriscos, dependiendo al valor n que tenga durante la funcion actual.
        -Ejemplo: Para n=3, primero intentara resolver para n=2, donde tambien necesitara resolver para n = 1 (caso base), por lo que imprimira un asterisco, una vez resuelto
        imprimira dos asteriscos lo que finalizara el caso n=2, para luego imprimir tres asterisco, lo que finalizara la funcion recursiva.

- 4. Lista (11 pts)
    - Implementa una Lista usando POO con tipos genéricos siguiendo los estándares de Java. (Los métodos para una lista).

    - https://docs.oracle.com/javase/7/docs/api/java/util/List.html

    - Puede ignorar los siguientes métodos:
        - hashCode()
        - iterator()
        - listIterator()
        - listIterator(int index)
        - retainAll(Collection<?> c)
        - toArray()
        - toArray(T[] a)
	## HernyGalvezQ
    -Se implementó la clase Persona para usar POO
	```
	 private String name;
    	private int age;
    	private String gender;
    	private double nota;

    	public Persona(String name, int age, String gender, double nota) {
        	this.name = name;
       		this.age = age;
        	this.gender = gender;
        	this.nota = nota;
    	}
	```
   -En la clase Programa se declaró y se inicializó un List que almacenara un ArrayList de Persona
	```
	public static List<Persona> personas = new ArrayList<Persona>();
	```
   -Se uso un bucle para colocar todos los datos en la funcion de registro e IntroducirDatos
   -Se uso switch para utilizar los diferentes métodos de List en un menu
	```
	switch (opcion) {
                case 1: // add
                    introducirDatos();    
                case 2: // add 
                    personas.add(posicion, registro());
                case 3: // clear
                    personas.clear();
                case 4: // contains
                    System.out.println("Es: " + personas.contains(registro()));
                case 5: // equals
                    // System.out.println("Es: "+personas.equals(registro()));
                case 6: // get
                    System.out.println(personas.get(posicion2));
                case 7: // indexOf
                    System.out.println("Posicion: " + personas.indexOf(registro()));
                case 8: // isEmpty
                    System.out.println("La lista esta vacia: " + personas.isEmpty());
                case 9: // lastIndexOf
                    System.out.println("Posicion: " + personas.lastIndexOf(registro()));
                case 10: // remove
                    System.out.println(personas.remove(posicion3));
                case 11: // remove
                    System.out.println("Se eliminó la persona: " + personas.remove(registro()));
                case 12: // set
                    System.out.println("Se reemplazó la persona: " + personas.set(posicion4, registro()));
                case 13: // size
                    System.out.println("Hay " + personas.size() + " personas");
                case 14: // subList
                    System.out.println(personas.subList(posicion5, posicion6));
            }
	```
    - (i) Implemente una clase Node<T> donde T es un tipo genérico, esta clase debe contener al menos dos propiedades. 

    - https://docs.oracle.com/javase/tutorial/java/generics/types.html

    -   ```sh 
        T data: la información almacenada en el nodo
        Node<T> nextNode: una referencia al siguiente nodo
        ```

    - (ii) Implementar una clase List<T> esta clase debe contener al menos esta propiedad
    -   ```sh 
        Node<T> root: la referencia sobre el nodo inicial
        ```
#

## CUESTIONARIO
### ¿Qué diferencia hay entre un List y un ArrayList en Java?
- List es una interfaz, por lo que no se puede instanciar, mientras que ArrayList es una clase que se puede instanciar.
- La interfaz List se utiliza para crear una lista de elementos (objetos) asociados con sus números de índice. La clase ArrayList se utiliza para crear matrices dinámicas que contienen objetos.
- La interfaz de lista crea una colección de elementos que se almacenan secuencialmente y se identifican y se accede a ellos por índice. Mientras que ArrayList crea una matriz de objetos que pueden crecer dinámicamente.
### ¿Qué beneficios y oportunidades ofrecen las clases genéricas en Java?
- Le permiten usar tipos para parametrizar clases, interfaces y métodos definiéndolos.
- Verificación de tipo más fuerte en tiempo de compilación.
- La eliminación de conversiones aumenta la legibilidad del código.
- Posibilidad de implementar algoritmos genéricos utilizando tipos seguros.
## REFERENCIAS
    - https://www.w3schools.com/java/
    - https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers
    - https://docs.oracle.com/javase/7/docs/api/java/util/List.html
    - https://docs.oracle.com/javase/tutorial/java/generics/types.html
#

[license]: https://img.shields.io/github/license/rescobedoq/pw2?label=rescobedoq
[license-file]: https://github.com/rescobedoq/pw2/blob/main/LICENSE

[downloads]: https://img.shields.io/github/downloads/rescobedoq/pw2/total?label=Downloads
[releases]: https://github.com/rescobedoq/pw2/releases/

[last-commit]: https://img.shields.io/github/last-commit/rescobedoq/pw2?label=Last%20Commit

[Debian]: https://img.shields.io/badge/Debian-D70A53?style=for-the-badge&logo=debian&logoColor=white
[debian-site]: https://www.debian.org/index.es.html

[Git]: https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white
[git-site]: https://git-scm.com/

[GitHub]: https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white
[github-site]: https://github.com/

[Vim]: https://img.shields.io/badge/VIM-%2311AB00.svg?style=for-the-badge&logo=vim&logoColor=white
[vim-site]: https://www.vim.org/

[Java]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white
[java-site]: https://docs.oracle.com/javase/tutorial/


[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]
