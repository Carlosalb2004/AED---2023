package ejercicio1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int contador = 0;
        boolean x = true;
        String gmail = "@gmail.com";
        String hotmail = "@hotmail.com";
        String outlook = "@outlook.com";

        System.out.println("Ingrese sus nombres:");
        String nombre = sn.next();

        System.out.println("Ingrese su apellido paterno:");
        String apePaterno = sn.next();

        System.out.println("Ingrese su apellido materno:");
        String apeMaterno = sn.next();

        while (x == true) {
            System.out.println("Ingrese su correo electronico:");
            String email = sn.next();
            for (int i = 0; i < email.length(); i++) {
                //Comprobamos si el caracter es una vocal
                if (email.charAt(i) == '@') {
                    contador++;
                }
            }

            if (contador > 0) {
                //método contains de la clase String devuelve un valor booleano que indica 
                //si una subcadena especificada está presente dentro de la cadena principal.
                if (email.contains(gmail)) {
                    System.out.println("El correo de " + nombre + " es " + gmail);
                    x = false;
                } else if (email.contains(hotmail)) {
                    System.out.println("El correo de " + nombre + " es " + hotmail);
                    x = false;
                } else if (email.contains(outlook)) {
                    System.out.println("El correo de " + nombre + " es " + outlook);
                    x = false;
                } else {
                    System.out.println("El correo de " + nombre + " es un correo diferente");
                    x = false;
                }
            } else {
                System.out.println("No hay @, volver a ingresar correo");
                x = true;
            }
        }

        System.out.println("Ingrese su numero telefonico:");
        int phone = sn.nextInt();

    }
}
