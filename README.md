# Proyecto PilaOStack

Este proyecto implementa una **estructura de datos Pila (Stack)** en Java utilizando nodos enlazados.  
La pila sigue el principio **LIFO (Last In, First Out)**: el último elemento en entrar es el primero en salir.

---

## 📂 Estructura del proyecto

PilaOStack/
├── src/
│   ├── Nodo.java
│   ├── Pila.java
│   └── Main.java
├── README.md
├── .gitignore
└── LICENSE


---

## 📌 Clases principales

### 1. Clase `Nodo`
Representa cada elemento de la pila.

- **Atributos:**
  - `int valor`: almacena el dato.
  - `Nodo sig`: referencia al siguiente nodo.

- **Constructores:**
  - `Nodo()`: inicializa el nodo vacío.
  - `Nodo(int valor)`: inicializa el nodo con un valor específico.

- **Métodos:**
  - `getValor() / setValor(int valor)`: obtiene o asigna el valor.
  - `getSiguiente() / setSiguiente(Nodo sig)`: obtiene o asigna el enlace al siguiente nodo.

---

### 2. Clase `Pila`
Implementa la lógica de la pila dinámica.

- **Atributos:**
  - `Nodo inicio`: referencia al nodo tope de la pila.

- **Métodos principales:**
  - `esVacia()`: retorna `true` si la pila está vacía.
  - `apilar(int valor)`: inserta un nuevo nodo en el tope (Push).
  - `desapilar()`: elimina y retorna el nodo del tope (Pop).
  - `mostrarPila()`: recorre e imprime los elementos de la pila.
  - `buscar(int aBuscar)`: retorna `true` si el valor existe en la pila.
  - `eliminar()`: vacía completamente la pila.
  - `retirar()`: elimina solo el nodo del tope sin retornarlo.
  - `cantidad()`: retorna el número de elementos en la pila.

---

### 3. Clase `Main`
Clase de prueba para demostrar el funcionamiento de la pila.

- **Acciones realizadas:**
  - Apila los valores: `4, 16, 12, 8, 65`.
  - Desapila tres elementos y los muestra en consola.

- **Ejemplo de salida esperada:**
**Ejemplo de salida esperada:**
Elemento desapilado: 65
Elemento desapilado: 8
Elemento desapilado: 12
