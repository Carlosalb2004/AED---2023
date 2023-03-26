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

    public static void Verifica(Rectangulo R1, Rectangulo R2) {
        int i, j;
        if (Verificador.esJunto(R1, R2) == true) {
            System.out.println("Rectangulos A y B estan juntos");
        } else {
            if (Verificador.esSobrePos(R1, R2) == true) {
                System.out.println("Rectangulos A y B se sobreponen");
                double r1, r2, rpt;
                r1 = R1.getEsquina1().distancia(R1.getEsquina1(), R1.getEsquina2());
                r2 = R2.getEsquina1().distancia(R2.getEsquina1(), R2.getEsquina2());
                rpt = r1 - r2;
                System.out.println("El Area Sobrepuesta es: " + rpt);
            } else {
                System.out.println("Rectangulos A y B son disjuntos");
            }
        }
    }

    public static boolean esJunto(Rectangulo R1, Rectangulo R2) {
        double X1, X2, X3, X4, Y1, Y2, Y3, Y4;
        double X1S, X2S, Y1S, Y2S;
        double X3S, X4S, Y3S, Y4S;

        Coordenada Esq1, Esq2, Esq3, Esq4;

        Esq1 = R1.getEsquina1();
        X1 = Esq1.getX();
        Y1 = Esq1.getY();

        Esq2 = R1.getEsquina2();
        X2 = Esq2.getX();
        Y2 = Esq2.getY();

        if (X1 < X2) {
            X1S = X1;
            if (Y1 < Y2) {
                Y1S = Y1;
                X2S = X2;
                Y2S = Y2;
            } else {
                Y1S = Y2;
                X2S = X2;
                Y2S = Y1;
            }
        } else {
            X1S = X2;
            if (Y1 < Y2) {
                Y1S = Y1;
                X2S = X1;
                Y2S = Y2;
            } else {
                Y1S = Y2;
                X2S = X1;
                Y2S = Y1;
            }
        }

        Esq3 = R2.getEsquina1();
        X3 = Esq3.getX();
        Y3 = Esq3.getY();

        Esq4 = R2.getEsquina2();
        X4 = Esq4.getX();
        Y4 = Esq4.getY();

        if (X3 < X4) {
            X3S = X3;
            if (Y3 < Y4) {
                Y3S = Y3;
                X4S = X4;
                Y4S = Y4;
            } else {
                Y3S = Y4;
                X4S = X4;
                Y4S = Y3;
            }
        } else {
            X3S = X4;
            if (Y3 < Y4) {
                Y3S = Y3;
                X4S = X3;
                Y4S = Y4;
            } else {
                Y3S = Y4;
                X4S = X3;
                Y4S = Y3;
            }
        }

        if ((((X2S == X3S) || (Y2S == Y3S)) || ((X1S == X4S) || (Y1S == Y4S))) == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esDisjunto(Rectangulo R1, Rectangulo R2) {
        /*
        double X1, X2, X3, X4, Y1, Y2, Y3, Y4;
        double X1S, X2S, Y1S, Y2S;
        double X3S, X4S, Y3S, Y4S;

        Coordenada Esq1, Esq2, Esq3, Esq4;

        Esq1 = R1.getEsquina1();
        X1 = Esq1.getX();
        Y1 = Esq1.getY();

        Esq2 = R1.getEsquina2();
        X2 = Esq2.getX();
        Y2 = Esq2.getY();

        if (X1 < X2) {
            X1S = X1;
            if (Y1 < Y2) {
                Y1S = Y1;
                X2S = X2;
                Y2S = Y2;
            } else {
                Y1S = Y2;
                X2S = X2;
                Y2S = Y1;
            }
        } else {
            X1S = X2;
            if (Y1 < Y2) {
                Y1S = Y1;
                X2S = X1;
                Y2S = Y2;
            } else {
                Y1S = Y2;
                X2S = X1;
                Y2S = Y1;
            }
        }

        Esq3 = R2.getEsquina1();
        X3 = Esq3.getX();
        Y3 = Esq3.getY();

        Esq4 = R2.getEsquina2();
        X4 = Esq4.getX();
        Y4 = Esq4.getY();

        if (X3 < X4) {
            X3S = X3;
            if (Y3 < Y4) {
                Y3S = Y3;
                X4S = X4;
                Y4S = Y4;
            } else {
                Y3S = Y4;
                X4S = X4;
                Y4S = Y3;
            }
        } else {
            X3S = X4;
            if (Y3 < Y4) {
                Y3S = Y3;
                X4S = X3;
                Y4S = Y4;
            } else {
                Y3S = Y4;
                X4S = X3;
                Y4S = Y3;
            }
        }

        if (((X2S - X3S > 0) && (Y2S - Y3S < 0)) || ((Y1S - Y4S > 0))) {
            return true;
        } else {
            return esSobrePos(R1, R2);
        }
         */
        return false;
    }

    public static boolean esSobrePos(Rectangulo R1, Rectangulo R2) {
        double X1, X2, X3, X4, Y1, Y2, Y3, Y4;
        double X1S, X2S, Y1S, Y2S;
        double X3S, X4S, Y3S, Y4S;

        Coordenada Esq1, Esq2, Esq3, Esq4;

        Esq1 = R1.getEsquina1();
        X1 = Esq1.getX();
        Y1 = Esq1.getY();

        Esq2 = R1.getEsquina2();
        X2 = Esq2.getX();
        Y2 = Esq2.getY();

        if (X1 < X2) {
            X1S = X1;
            if (Y1 < Y2) {
                Y1S = Y1;
                X2S = X2;
                Y2S = Y2;
            } else {
                Y1S = Y2;
                X2S = X2;
                Y2S = Y1;
            }
        } else {
            X1S = X2;
            if (Y1 < Y2) {
                Y1S = Y1;
                X2S = X1;
                Y2S = Y2;
            } else {
                Y1S = Y2;
                X2S = X1;
                Y2S = Y1;
            }
        }

        Esq3 = R2.getEsquina1();
        X3 = Esq3.getX();
        Y3 = Esq3.getY();

        Esq4 = R2.getEsquina2();
        X4 = Esq4.getX();
        Y4 = Esq4.getY();

        if (X3 < X4) {
            X3S = X3;
            if (Y3 < Y4) {
                Y3S = Y3;
                X4S = X4;
                Y4S = Y4;
            } else {
                Y3S = Y4;
                X4S = X4;
                Y4S = Y3;
            }
        } else {
            X3S = X4;
            if (Y3 < Y4) {
                Y3S = Y3;
                X4S = X3;
                Y4S = Y4;
            } else {
                Y3S = Y4;
                X4S = X3;
                Y4S = Y3;
            }
        }
        if ((((X1S < X3S) && (X3S < X2S)) || ((Y1S < Y3S) && (Y3S < Y2S))) || (((X3S < X1S) && (X1S < X2S) || ((Y3S < Y1S) && (Y1S < Y2S))))==true) {
            return true;
        } else {
            return esDisjunto(R1, R2);
        }
    }
}
