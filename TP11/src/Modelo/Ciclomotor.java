package Modelo;

public class Ciclomotor {
    private String nombre;
    private int potencia;
    private int velocidad;
    private int peso;
    private int cilindrada;

    public Ciclomotor(String nombre, int potencia, int velocidad, int peso, int cilindrada) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.peso = peso;
        this.cilindrada = cilindrada;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getPeso() {
        return peso;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return nombre + " [potencia=" + potencia + 
               ", velocidad=" + velocidad + 
               ", peso=" + peso + 
               ", cilindrada=" + cilindrada + "]";
    }

    // Comparación de atributos
    public Ciclomotor enfrentaPotencia(Ciclomotor otro) {
        if (this.getPotencia() > otro.getPotencia()) return this;
        if (this.getPotencia() < otro.getPotencia()) return otro;
        return null;
    }

    public Ciclomotor enfrentaVelocidad(Ciclomotor otro) {
        if (this.getVelocidad() > otro.getVelocidad()) return this;
        if (this.getVelocidad() < otro.getVelocidad()) return otro;
        return null;
    }

    public Ciclomotor enfrentaPeso(Ciclomotor otro) {
        if (this.getPeso() > otro.getPeso()) return this;
        if (this.getPeso() < otro.getPeso()) return otro;
        return null;
    }

    public Ciclomotor enfrentaCilindrada(Ciclomotor otro) {
        if (this.getCilindrada() > otro.getCilindrada()) return this;
        if (this.getCilindrada() < otro.getCilindrada()) return otro;
        return null;
    }
}
