package actividad2;

// 2. Reemplaza todas las a del String anterior por una e.
public class CambioLetrasApp {

    public static void main(String[] args) {
        String cadena = "La lluvia en Sevilla es un maravilla";

        //Aviso de esta forma no modifica el String original
        System.out.println(cadena.replace('a', 'e'));
    }
}
