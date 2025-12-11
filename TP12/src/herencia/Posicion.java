package herencia;

public class Posicion {
	  private double posX;
	    private double posY;
	    public Posicion(double x, double y) {
	        this.posX = x;
	        this.posY = y;
	    }
	    public double getPosx() {
	        return posX;
	    }
	    public double getPosy() {
	        return posY;
	    }
	    public void setXY(double x, double y) {
	        this.posX = x;
	        this.posY = y;
	    }
	    public void incrementaPos(double valorX, double valorY) {
	        this.posX += valorX;
	        this.posY += valorY;
	    }
	    public double distancia(Posicion otra) {
	        return Math.sqrt(Math.pow(this.posX - otra.getPosx(), 2) + Math.pow(this.posY - otra.getPosy(), 2));
	    }
}
