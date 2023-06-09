package act1;

import java.util.*;

public class Rectangulo {

    private Coordenada esquina1;
    private Coordenada esquina2;

    // Constructor
    public Rectangulo(Coordenada c1, Coordenada c2) {
        setEsquina1(c1);
        setEsquina2(c2);

    }

    public void setEsquina1(Coordenada coo) {
        this.esquina1 = coo;
    }

    public void setEsquina2(Coordenada coo) {
        this.esquina2 = coo;
    }

    public Coordenada getEsquina1() {
        return esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    @Override
    public String toString() {
        return "(" + this.esquina1 + this.esquina2 + ")";
    }

    public double calculoArea(Coordenada x, Coordenada y) {
        double ancho = Math.abs(x.getX() - y.getX());
        double alto = Math.abs(x.getY() - y.getY());
        double area = ancho * alto;
        return area;
    }
}
