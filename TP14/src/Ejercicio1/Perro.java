package Ejercicio1;

public class Perro extends Animal implements Emisor_de_Sonido {
    @Override
    public void emiteSonido() {
        System.out.println("El perro dice: guau");
    }
}