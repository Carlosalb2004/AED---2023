package act1;

import java.util.*;

public class Principal {

    public static void main(String[] ar) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una esquina del 1er rectangulo: ");
        double rec1 = leer.nextDouble();
        double rec1_ = leer.nextDouble();

        System.out.println("Ingrese la esquina opuesta del 1er rectangulo: ");
        double Orec1 = leer.nextDouble();
        double Orec1_ = leer.nextDouble();

        System.out.println("Ingrese una esquina del 2do rectangulo: ");
        double rec2 = leer.nextDouble();
        double rec2_ = leer.nextDouble();

        System.out.println("Ingrese la esquina opuesta del 2do rectangulo: ");
        double Orec2 = leer.nextDouble();
        double Orec2_ = leer.nextDouble();

        //FIGURA 1
        Coordenada c1 = new Coordenada(rec1, rec1_);
        Coordenada c2 = new Coordenada(Orec1, Orec1_);
        
        //FIGURA 2
        Coordenada c3 = new Coordenada(rec2, rec2_);
        Coordenada c4 = new Coordenada(Orec2, Orec2_);

        Rectangulo A = new Rectangulo(c1, c2);
        
        Rectangulo B = new Rectangulo(c3, c4);


        double fx1[] = {rec1, rec1_};
        double fy1[] = {Orec1, Orec1_};

        double fx2[] = {rec2, rec2_};
        double fy2[] = {Orec2, Orec2_};
        
        System.out.println("Rectangulo A = (" + Arrays.toString(fx1) + "," + Arrays.toString(fy1)+")");
        System.out.println("Rectangulo B = (" +  Arrays.toString(fx2) + "," + Arrays.toString(fy2)+")");
        
        Verificador.Verifica(A, B);
        ContainerRect cR = new ContainerRect();
        cR.addRectangulo(A, B);
        System.out.println(cR);
    }


}
