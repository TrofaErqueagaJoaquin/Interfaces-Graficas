package Ejercicio1;


public class Gato extends Animal implements Emisor_de_Sonido {
    @Override
    public void emiteSonido() {
        System.out.println("El gato dice: miau");
    }
}