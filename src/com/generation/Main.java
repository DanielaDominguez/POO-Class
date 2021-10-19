package com.generation;

import sun.security.krb5.internal.PAEncTSEnc;

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

        Perro lomito3 = new Perro("Milaneso");
        Perro lomito4 = new Perro("Sr. Kawamura", "Husky", 4, "Gigante");
        lomito4.caractericticas();
    }
}
