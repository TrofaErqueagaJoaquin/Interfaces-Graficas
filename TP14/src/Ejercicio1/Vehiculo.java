package Ejercicio1;

public class Vehiculo {
    private String Patente;
    private String numeroChasis;
    private String numeroMotor;

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public String getPatente() {
        return Patente;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }
}
