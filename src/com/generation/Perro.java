package com.generation;

public class Perro {
    String nombre;
    String raza;
    int edad;
    String tamanio;

    //constructor vacio
    public Perro () {
    }

    //this.nombre se refiere al String nombre
    // = nombre hace referencia a String nombre de public Perro
    public Perro (String nombre) {
        this.nombre = nombre;
    }

    public Perro (String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public Perro (String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public void caractericticas(){
        System.out.println("Hola mi nombre es " + this.nombre
                + ", soy de raza " + this.raza+" tengo " + this.edad + " años." + " Soy de tamaño " + this.tamanio );
    }
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    public void dormir(){
        System.out.println("zZzZzZzZ");
    }
    public void jugar(){
        System.out.println("Vamos a jugar woof woof");
    }
}
