package Ejercicio1;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Emisor_de_Sonido> emisores = new ArrayList<>();

        emisores.add(new Perro());
        emisores.add(new Gato());
        emisores.add(new Vaca());
        emisores.add(new Pollito());
        emisores.add(new Ambulancia()); 

        for (Emisor_de_Sonido emisor : emisores) {
            emisor.emiteSonido();
        }
    }
}

