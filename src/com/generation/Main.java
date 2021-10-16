package com.generation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Perro lomito = new Perro();
        lomito.nombre = "Chems";
        lomito.edad = 1;
        lomito.raza = "mestizo";
        lomito.tamanio = "wrande";
        lomito.caractericticas();
        lomito.comer();

        Perro lomito2 = new Perro();
        lomito2.nombre = "Firulais";
        lomito2.edad = 2;
        lomito2.raza = "pug";
        lomito2.tamanio = "chico";
        lomito2.caractericticas();
        lomito2.dormir();

    }
}
