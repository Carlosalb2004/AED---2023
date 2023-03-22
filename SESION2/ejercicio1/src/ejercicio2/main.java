package ejercicio2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("BIENVENIDO A NUESTRA COTIZACION AUTOMATIZADA");
        System.out.println("============================================");
        System.out.println("Ingrese nombre del Cliente:");
        String nombreCliente = sn.next();
        System.out.println("Ingrese nombre del Producto:");
        String nombreProducto = sn.next();
        System.out.println("Ingrese precio del Producto:");
        int precioProducto = sn.nextInt();
        System.out.println("Ingrese direccion de envio:");
        String direccionEnvio = sn.next();

        System.out.println("Estimado cliente, " + nombreCliente + "\nLe confirmamos la compra del siguiente producto:\n"
                + "- " + nombreProducto + ": $" + precioProducto + "\nEl producto será enviado a la siguiente dirección:\n"
                + direccionEnvio + "\nGracias por su compra.\nAtentamente,\nLa tienda en línea.");
    }
}
