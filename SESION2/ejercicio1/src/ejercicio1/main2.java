package ejercicio1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class main2 {

    public static void main(String[] args) {
// Verificar que la contraseña contenga al menos un número
        String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).+$";
        String password = "";
        Scanner sn = new Scanner(System.in);
        boolean x = true;

        System.out.println("Ingrese su usuario");
        String user = sn.next();

        while (x == true) {
            System.out.println("Ingrese su contraseña");
            password = sn.next();
            if (password.length() > 8) {
                System.out.println("La contraseña no debe tener más de 8 caracteres. Autenticación fallida.");
                x = true;
            } else {
                Pattern pattern = Pattern.compile(passwordPattern);
                if (!pattern.matcher(password).matches()) {
                    System.out.println("La contraseña debe tener al menos una mayúscula, una minúscula y un carácter especial. Autenticación fallida.");
                    x = true;
                }
            }
            x = false;
        }

        System.out.print("Repita la contraseña: ");
        String password2 = sn.nextLine();

        if (password.equals(password2)) {
            System.out.println("Las contraseñas coinciden. Autenticación exitosa.");
        } else {
            System.out.println("Las contraseñas no coinciden. Autenticación fallida.");
        }
    }

}

