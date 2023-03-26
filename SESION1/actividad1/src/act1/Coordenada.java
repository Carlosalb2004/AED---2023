package act1;

import java.text.DecimalFormat;
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
        this.x = c.x;
        this.y = c.y;
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

    public double distancia(Coordenada c) {
        return Math.sqrt(Math.pow(this.x - c.x, 2) + Math.pow(this.y - c.y, 2));

    }

    public double distancia(Coordenada c1, Coordenada c2) {
        DecimalFormat df = new DecimalFormat("0.00");
        double distancia = Math.sqrt(Math.pow(c1.x - c2.x, 2) + Math.pow(c1.y - c2.y, 2));
        double numero = Double.parseDouble(df.format(distancia));
        return numero;

    }

    @Override
    public String toString() {
        return "[" + this.x + ", " + this.y + "]";
    }

}
