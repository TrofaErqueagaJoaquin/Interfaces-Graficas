package Ejercicio1;

public class Vaca extends Animal implements Emisor_de_Sonido {
    @Override
    public void emiteSonido() {
        System.out.println("La vaca dice: muu");
    }
}
