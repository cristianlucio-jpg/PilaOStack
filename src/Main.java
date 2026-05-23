/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Cristian Alexis Lucio Narvaez
 */
public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();

        // Apilar elementos
        pila.apilar(4);
        pila.apilar(16);
        pila.apilar(12);
        pila.apilar(8);
        pila.apilar(65);

        // Desapilar elementos
        System.out.println("\nElemento desapilado: " + pila.desapilar());
        System.out.println("Elemento desapilado: " + pila.desapilar());
        System.out.println("Elemento desapilado: " + pila.desapilar());
    }
}



