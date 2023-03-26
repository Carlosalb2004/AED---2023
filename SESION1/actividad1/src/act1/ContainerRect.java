package act1;

import java.util.ArrayList;

public class ContainerRect {
    private ArrayList<Rectangulo> miLista;

    public ContainerRect() {
        miLista = new ArrayList<Rectangulo>();
    }
    
    public void addRectangulo(Rectangulo R1, Rectangulo R2) {
        miLista.add(R1);
        miLista.add(R2);
    }

    public ArrayList<Rectangulo> getMiLista() {
        return miLista;
    }

    public void setMiLista(ArrayList<Rectangulo> miLista) {
        this.miLista = miLista;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s %-30s %-10s %-10s\n", "Rectangulo ", "|| Coordenadas ","|| Distancia ", "|| Area" ));
        sb.append("---------------------------------------------------------------------\n");
        int contador = 1;
        for (Rectangulo elemento : miLista) {
            sb.append(String.format("%-15s %-31s %-13s %-10s\n", contador++, elemento.toString(), elemento.getEsquina1().distancia(elemento.getEsquina1(), elemento.getEsquina2()),elemento.calculoArea(elemento.getEsquina1(), elemento.getEsquina2())));
        }
        return sb.toString();
    }    
}
