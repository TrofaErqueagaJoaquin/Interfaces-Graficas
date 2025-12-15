package Ejercicio1;


public class Pollito extends Animal implements Emisor_de_Sonido {
    @Override
    public void emiteSonido() {
        System.out.println("El pollito dice: pío");
    }
}