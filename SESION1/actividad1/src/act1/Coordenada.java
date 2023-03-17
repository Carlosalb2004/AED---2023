package act1;

import java.util.*;

public class Coordenada {

    private double x;
    private double y;

    public Coordenada() {
    }

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada c) {
       this.x= c.x;
       this.y= c.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distancia(Coordenada c){
        double diferenciaX = x - c.getX();
        double diferenciaY = y - c.getY();
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }
    public static double distancia(Coordenada c1, Coordenada c2){
        double dX = c1.x - c1.getX();
        double dY = c2.y - c2.getY();
        return Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
    }
    @Override
    public String toString() {
        return "Coordenada{" + "x=" + x + ", y=" + y + '}';
    }
    
      
}
