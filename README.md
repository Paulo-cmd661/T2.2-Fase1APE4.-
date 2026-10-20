<h1 align="center">Guía APE 4: Programación Orientada a Objetos</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/VS%20Code-007ACC?style=flat-square&logo=visualstudiocode&logoColor=white" alt="VS Code">
  <img src="https://img.shields.io/badge/Git-F05032?style=flat-square&logo=git&logoColor=white" alt="Git">
  <img src="https://img.shields.io/badge/GitHub-181717?style=flat-square&logo=github&logoColor=white" alt="GitHub">
</p>

## Datos del trabajo

| | |
|---|---|
| **Estudiante** | Paulo Josué Escobar Bautista |
| **Carrera** | Software, primer semestre, paralelo 1B |
| **Institución** | Universidad Técnica de Ambato (UTA) |
| **Tema** | Clases, objetos, arreglos, condicionales y ciclos en Java |


---

## Ejercicio 1: Notas del curso

**Enunciado**

> Crear la clase `Estudiante` con nombre, nota1, nota2, nota3 y promedio. En `main`, crear 5 instancias, calcular el promedio de cada una e imprimirlas con el formato `nombre : promedio`, agregando **Aprobado** (7 o más), **Supletorio** (de 5 a 6.99) o **Reprobado** (menos de 5). Al final, imprimir cuántos estudiantes aprobaron.

**Cómo lo resolví**

- Hice que el promedio se calcule dentro del constructor, así cada estudiante lo tiene listo apenas se crea.
- Agregué un método que devuelve el estado (Aprobado, Supletorio o Reprobado) según el promedio.
- Guardé los 5 estudiantes en un arreglo y con un `for` imprimí cada uno, sumando a un contador los que aprobaron.

**Conceptos aplicados:** clases, constructor, arreglo de objetos, `if / else if`, contador.

**Resultado en consola**

<!-- Pega aquí la captura del Ejercicio 1 -->

---

## Ejercicio 2: Inventario de una tienda

**Enunciado**

> Crear la clase `Producto` con nombre, precio y stock. Crear 4 productos e imprimirlos con el formato `nombre : precio`. Simular la venta de 3 unidades de dos de ellos, mostrar "Reponer" junto a cada producto que quede con menos de 5 unidades e imprimir el valor total del inventario (suma de precio por stock).

**Cómo lo resolví**

- Creé el método `vender(cantidad)` que resta unidades del stock y el método `valorTotal()` que devuelve precio por stock.
- Primero imprimí los 4 productos con su precio, luego vendí 3 unidades de dos de ellos (Mouse y Teclado).
- Recorrí de nuevo el arreglo: si el stock quedó por debajo de 5 se muestra "Reponer", y mientras tanto se va sumando el valor de cada producto para obtener el total del inventario.

**Conceptos aplicados:** métodos con parámetros, modificación de atributos, acumulador, condicional.

**Resultado en consola**

<!-- Pega aquí la captura del Ejercicio 2 -->

---

## Ejercicio 3: Veterinaria

**Enunciado**

> Crear la clase `Mascota` con nombre, especie, edad y peso. Crear 3 mascotas e imprimirlas con el formato `nombre : especie : peso`, mostrando "Revisar peso" si pesan más de 20 kg. Luego escribir `Mascota m4 = m1;`, sumar 1 a `m4.edad`, imprimir `m1.edad` y explicar en un comentario por qué cambió.

**Cómo lo resolví**

- Instancié 3 mascotas y las recorrí con un bucle, agregando el aviso "Revisar peso" cuando el peso es mayor a 20.
- Después hice `Mascota m4 = m1;` y le sumé 1 a la edad de `m4`.
- Al imprimir `m1.edad` el valor también aumentó. Esto pasa porque `m4 = m1` **no crea un objeto nuevo**: solo copia la referencia, y las dos variables apuntan al mismo objeto en memoria. Lo dejé explicado en un comentario dentro del código.

**Conceptos aplicados:** objetos, referencias en memoria, condicional, bucle `for-each`.

**Resultado en consola**

<!-- Pega aquí la captura del Ejercicio 3 -->

---

## Ejercicio 4: Cuenta de ahorro

**Enunciado**

> Crear la clase `Cuenta` con titular y saldo. Crear 2 cuentas, una con 200 y otra con 350. Con un `while`, depositar 50 por mes en cada cuenta hasta que llegue a 500, imprimiendo cada mes con el formato `titular : saldo`, y al final cuántos meses necesitó cada una (6 y 3).

**Cómo lo resolví**

- La clase `Cuenta` tiene un método `depositar(monto)` que suma al saldo.
- Para cada cuenta usé un `while` que se repite mientras el saldo sea menor a 500: deposita 50, suma 1 al contador de meses e imprime el saldo.
- Al salir del ciclo se muestra cuántos meses necesitó esa cuenta: Ana tardó 6 meses (200 → 500) y Luis 3 meses (350 → 500).

**Conceptos aplicados:** ciclo `while`, contador, métodos, arreglo de objetos.

**Resultado en consola**

<!-- Pega aquí la captura del Ejercicio 4 -->

---

## Ejercicio 5: Biblioteca

**Enunciado**

> Crear las clases `Libro` (titulo, autor, disponible) y `Socio` (nombre, librosPrestados). Crear 4 libros y 2 socios, registrar que el primer socio presta 2 libros y el segundo presta 1 (`disponible = false` y aumentar `librosPrestados`), y al final imprimir cada libro con el formato `titulo : Disponible` o `titulo : Prestado`, cada socio con el formato `nombre : librosPrestados` y cuántos libros quedan disponibles.

**Cómo lo resolví**

- Trabajé con dos clases que se relacionan: `Libro` empieza siempre con `disponible = true`.
- En `Socio` creé el método `prestar(libro)`, que marca el libro como no disponible y aumenta en 1 los libros prestados del socio.
- En `main` registré los 3 préstamos y luego recorrí los libros (mostrando Disponible o Prestado y contando los disponibles) y los socios (mostrando cuántos libros tiene cada uno).

**Conceptos aplicados:** relación entre dos clases, paso de objetos como parámetro, booleanos, contadores.

**Resultado en consola**

<!-- Pega aquí la captura del Ejercicio 5 -->


