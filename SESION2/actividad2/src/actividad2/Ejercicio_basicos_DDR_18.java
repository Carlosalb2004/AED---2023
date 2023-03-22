package actividad2;

import java.util.Scanner;
//11. Dada una frase, separarlo en palabras.
public class Ejercicio_basicos_DDR_18 {
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        //Hace que podamos escribir espacios en la frase y coja todo el String
        sn.useDelimiter("\n");
        
        System.out.println("Escribe una frase");
        String frase = sn.next();
        
        //Divido la frase en palabras
        String palabras[] = frase.split(" ");
        for(int i=0;i<palabras.length;i++){
            System.out.println(palabras[i]);
        }
    }
}
