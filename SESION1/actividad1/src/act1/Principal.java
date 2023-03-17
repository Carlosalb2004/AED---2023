package act1;

import java.util.*;
public class Principal {
    public static void main(String[] ar){
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
        
        
        double x[] = {rec1,rec1_}; 
        double y[] = {Orec1,Orec1_};
        double z[] = {rec2,rec2_};
        double w[] = {Orec2,Orec2_};
        
        Coordenada c1 = new Coordenada(rec1,rec1_);
        Coordenada c2 = new Coordenada(Orec1,Orec1_); 
        Coordenada c3 = new Coordenada(rec2,rec2_); 
        Coordenada c4 = new Coordenada(Orec2,Orec2_); 
        
        Rectangulo A = new Rectangulo(c2,c1);
        Rectangulo B = new Rectangulo(c4,c3);
        
        Verificador.esSobrePos(A, B);
        
}
}
