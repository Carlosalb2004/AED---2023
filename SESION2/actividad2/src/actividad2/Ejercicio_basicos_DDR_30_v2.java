package actividad2;
//7. Convertir una frase a mayúsculas o minúsculas, que daremos opción 
// a que el usuario lo pida y mostraremos el resultado por pantalla.
import javax.swing.JOptionPane;

public class Ejercicio_basicos_DDR_30_v2 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null,
                "Por favor, introduce una frase",
                "Introduccion",
                JOptionPane.INFORMATION_MESSAGE);
        String cadenaResultante = "";
        
        //true = Lo pasamos todo en MAYUSCULAS
        //false = Lo pasamos todo en minisculas
        
        boolean isMayus;
        int eleccion = JOptionPane.showConfirmDialog(null,
                "¿Quieres que se pase a MAYUSCULAS?",
                "Eleccion",
                JOptionPane.YES_NO_CANCEL_OPTION);
        isMayus = (eleccion == JOptionPane.YES_OPTION);
        
        //Segun lo elegido, lo transformaremos a MAYUSCULA o minuscula
        
        if(isMayus){
            cadenaResultante = texto.toUpperCase();
        }else{
            cadenaResultante = texto.toLowerCase();
        }
        JOptionPane.showMessageDialog(null,
                cadenaResultante,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
