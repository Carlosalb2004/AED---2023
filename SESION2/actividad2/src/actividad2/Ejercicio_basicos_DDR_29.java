package actividad2;
//6. Pedir al usuario que nos escriba frases de forma infinita hasta que 
// insertemos una cadena vacia. Mostrar la cadena resultante
import javax.swing.JOptionPane;

public class Ejercicio_basicos_DDR_29 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null,
                "Introduce un texto, cadena vacia para terminar",
                "Introducir texto",
                JOptionPane.INFORMATION_MESSAGE);
        
        String cadenaResultado = "";
        
        //Mientras no este vacio la cadena escrita continuo
        while(!texto.isEmpty()){
            //Concatenamos el texto
            cadenaResultado += texto;
            
            //Reintroducimos de nuevo una cadena
            texto = JOptionPane.showInputDialog(null,
                "Introduce un texto, cadena vacia para terminar",
                "Introducir texto",
                JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showInputDialog(null,
                cadenaResultado,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
