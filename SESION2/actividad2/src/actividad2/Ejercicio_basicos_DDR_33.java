
package actividad2;

//9. Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
public class Ejercicio_basicos_DDR_33 {
    public static void main(String[] args) {
        String cadena = "hola mundo";
        
        //Funcion de manipulacion de series de caracteres, extrae caracteres de 
        //serie de caracteres para crear otra serie de caracteres
        String subcadena = cadena.substring(3, 5);
        System.out.println(subcadena);
    }
}
