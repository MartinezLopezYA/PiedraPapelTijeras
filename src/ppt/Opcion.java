package ppt;

public class Opcion {

    private int p1;
    private int p2;
    private int empate;

    public Opcion() {
    }

    public Opcion(int p1, int p2, int empate) {
        this.p1 = p1;
        this.p2 = p2;
        this.empate = empate;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public void jugar(int x, int y){

        // 1 piedra, 2 papel, 3 tijera

        if (x == 1 && y == 2){
            String a = "Piedra";
            String b = "Papel";
            System.out.println("J1 saco: " + a + "\nJ2 saco: " + b + " \nPunto para j2");
            this.p2+=1;
            System.out.println();
        } else if (x == 2 && y == 1) {
            String a = "Piedra";
            String b = "Papel";
            System.out.println("J1 saco: " + b + "\nJ2 saco: " + a + " \nPunto para j1");
            this.p1+=1;
            System.out.println();
        } else if (x == 1 && y == 3) {
            String a = "Piedra";
            String c = "Tijera";
            System.out.println("J1 saco: " + a + "\nJ2 saco: " + c + " \nPunto para J1");
            this.p1+=1;
            System.out.println();
        } else if (x == 3 && y == 1) {
            String a = "Piedra";
            String c = "Tijera";
            System.out.println("J1 saco: " + c + "\nJ2 saco: " + a + "\nPunto para J2");
            this.p2+=1;
            System.out.println();
        } else if (x == 2 && y == 3) {
            String b = "Papel";
            String c = "Tijera";
            System.out.println("J1 saco: " + b + "\nJ2 saco: " + c);
            System.out.println("Punto para J2");
            this.p2 += 1;
            System.out.println();
        } else if (x == 3 && y == 2) {
            String b = "Papel";
            String c = "Tijera";
            System.out.println("J1 saco: " + c + "\nJ2 saco: " + b);
            System.out.println("Punto para J1");
            this.p1 += 1;
            System.out.println();
        } else if ((x == 1 && y == 1) || (x == 2 && y == 2) || (x == 3 && y == 3)) {
            String a = "Piedra";
            String b = "Papel";
            String c = "Tijera";
            if (x == 1 && y == 1){
                System.out.println("Sacaron " + a);
                this.empate+=1;
                System.out.println();
            } else if (x == 2 && y == 2) {
                System.out.println("Sacaron " + b);
                this.empate+=1;
                System.out.println();
            } else if (x == 3 && y == 3){
                System.out.println("Sacaron " + c);
                this.empate+=1;
                System.out.println();
            }
        }

        if (this.p1 == 2 && (this.p2 == 1 || this.empate == 1)){
            System.out.println("El ganador es el jugador 1 con: " + this.p1 + " puntos de 3");
            this.p1 = 0;
            this.p2 = 0;
            this.empate = 0;
            System.out.println();
        } else if ((this.p1 == 1 || this.empate == 1) && this.p2 == 2) {
            System.out.println("El ganador es el jugador 2 con: " + this.p2 + " puntos de 3");
            this.p1 = 0;
            this.p2 = 0;
            this.empate = 0;
            System.out.println();
        } else if (this.empate == 2 && this.p1 == 1){
            System.out.println("El ganador es el jugador 1 con: " + this.p1 + " puntos de 3");
            this.p1 = 0;
            this.p2 = 0;
            this.empate = 0;
            System.out.println();
        } else if (this.empate == 2 && this.p2 == 1) {
            System.out.println("El ganador es el jugador 2 con: " + this.p2 + " puntos de 3");
            this.p1 = 0;
            this.p2 = 0;
            this.empate = 0;
            System.out.println();
        } else if (this.empate > 2 ) {
            if (this.p1 >= 1){
                System.out.println("El ganador es el jugador 1 con: " + this.p1 + " punto");
                this.p1 = 0;
                this.p2 = 0;
                this.empate = 0;
                System.out.println();
            } else if (this.p2 >= 1) {
                System.out.println("El ganador es el jugador 2 con: " + this.p2 + " punto");
                this.p1 = 0;
                this.p2 = 0;
                this.empate = 0;
                System.out.println();
            }else {
                System.out.println("No hay un ganador aún");
                System.out.println();
            }
        }else {
            System.out.println("No hay un ganador aún");
            System.out.println();
        }

    }

}
