package act1;

import java.util.ArrayList;

public class Verificador {

    private Rectangulo R1;
    private Rectangulo R2;
    private Verificador V1;

    public Verificador(Rectangulo R1, Rectangulo R2) {
        setR1(R1);
        setR2(R2);
    }

    public void setR1(Rectangulo R1) {
        this.R1 = R1;
    }

    public void setR2(Rectangulo R2) {
        this.R2 = R2;
    }

    public static String Verifica(Rectangulo R1, Rectangulo R2) {
        int i, j;
        double arrayX[] = new double[4];
        double arrayY[] = new double[4];
        Rectangulo auxR;
        Coordenada Esq1, Esq2, Esq3, Esq4;
        double X1, X2, X3, X4, Y1, Y2, Y3, Y4, aux = 0;

        Esq1 = R1.getEsquina1();
        X1 = Esq1.getX();
        Y1 = Esq1.getY();

        Esq2 = R1.getEsquina2();
        X2 = Esq2.getX();
        Y2 = Esq2.getY();

        Esq3 = R2.getEsquina1();
        X3 = Esq3.getX();
        Y3 = Esq3.getY();

        Esq4 = R2.getEsquina2();
        X4 = Esq4.getX();
        Y4 = Esq4.getY();
        X4 = aux;

        arrayX[0] = X1;
        arrayX[1] = X2;
        arrayX[2] = X3;
        arrayX[3] = X4;

        arrayY[0] = Y1;
        arrayY[1] = Y2;
        arrayY[2] = Y3;
        arrayY[3] = Y4;

        boolean first = Verificador.esJunto(arrayX);
        boolean second = Verificador.esJunto(arrayY);

        if (first == true || second == true) {
            System.out.println("Rectangulos A y B se juntan");
        } else {
            for (i = 0; i < arrayX.length - 1; i++) {
                for (j = 0; j < arrayX.length - i - 1; j++) {
                    if (arrayX[j + 1] < arrayX[j]) {
                        aux = arrayX[j + 1];
                        arrayX[j + 1] = arrayX[j];
                        arrayX[j] = aux;
                    }
                }
            }
            X1 = arrayX[1];
            X2 = arrayX[2];

            for (i = 0; i < arrayY.length - 1; i++) {
                for (j = 0; j < arrayY.length - i - 1; j++) {
                    if (arrayY[j + 1] < arrayY[j]) {
                        aux = arrayY[j + 1];
                        arrayY[j + 1] = arrayY[j];
                        arrayY[j] = aux;
                    }

                }
            }
            Y1 = arrayY[1];
            Y2 = arrayY[2];

            Esq1.setX(X1);
            Esq1.setY(Y1);
            Esq2.setX(X2);
            Esq2.setY(Y2);
            R1.setEsquina1(Esq1);
            R1.setEsquina2(Esq2);

            if ((X2 > X3 && X3 > X1) || (X4 > X1 && X1 > X3) || (Y2 > Y3 && Y3 > Y1) || (Y4 > Y2 && Y2 > Y3)) {
                System.out.println("Rectangulos A y B son disjuntos");
            } else {
                System.out.println("Rectangulos A y B se sobreponen");
                System.out.println("El Area es: " + R1.calculoArea(Esq1, Esq2));
            }
        }

        /*
        if (X1 <= X4 && X3 >= X2 && Y1 <= Y4 && Y3 >= Y2) {
            System.out.println("Rectangulos A y B se sobreponen");
        } else if (X1 == X4 || X3 == X2 || Y1 == Y4 || Y3 == Y2) {
            System.out.println("Rectangulos A y B se juntan");
        } else {
            System.out.println("Las figuras están disjuntas.");
        }
         */
 /*
        boolean disjuntas = true;
        Rectangulo[] figuras = {R1, R2};
        for ( i = 0; i < figuras.length; i++) {
            for ( j = i + 1; j < figuras.length; j++) {
                if (figuras[i].intersects(figuras[j])) {
                    disjuntas = false;
                    break;
                }
            }
        }
        if (disjuntas) {
            System.out.println("Las figuras están disjuntas.");
        } else {
            System.out.println("Las figuras se intersectan.");
        }
          else if (X2 < X3 || Y2 < Y3) {
            System.out.println("Rectangulos A y B son disjuntos");
        } else {
            for (i = 0; i < arrayX.length - 1; i++) {
                for (j = 0; j < arrayX.length - i - 1; j++) {
                    if (arrayX[j + 1] < arrayX[j]) {
                        aux = arrayX[j + 1];
                        arrayX[j + 1] = arrayX[j];
                        arrayX[j] = aux;
                    }
                }
            }
            X1 = arrayX[1];
            X2 = arrayX[2];

            for (i = 0; i < arrayY.length - 1; i++) {
                for (j = 0; j < arrayY.length - i - 1; j++) {
                    if (arrayY[j + 1] < arrayY[j]) {
                        aux = arrayY[j + 1];
                        arrayY[j + 1] = arrayY[j];
                        arrayY[j] = aux;
                    }

                }
            }
            Y1 = arrayY[1];
            Y2 = arrayY[2];

            Esq1.setX(X1);
            Esq1.setY(Y1);
            Esq2.setX(X2);
            Esq2.setY(Y2);
            R1.setEsquina1(Esq1);
            R1.setEsquina2(Esq2);

            System.out.println("Rectangulos A y B se sobreponen");
            System.out.println("El Area es: " + R1.calculoArea(Esq1, Esq2));

        }
         */
        return "error";
    }

    public static boolean esJunto(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}


/*
    public static void esSobrePos(Rectangulo r1, Rectangulo r2) {

        Coordenada figura1 = r1.getEsquina1();
        Coordenada figura2 = r2.getEsquina2();

        ArrayList<Coordenada> figuraT1 = new ArrayList<>();
        ArrayList<Coordenada> figuraT2 = new ArrayList<>();

        figuraT1.add(figura1);
        figuraT2.add(figura2);
        
        System.out.println(figuraT1);
        System.out.println(figuraT2);
    }
 */
