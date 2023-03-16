package ppt;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner comand = new Scanner(System.in);
        Random rd = new Random();
        Opcion play = new Opcion();
        boolean salir = false;

        while (!salir){
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            System.out.print("opc: ");
            int opc = comand.nextInt();
            switch (opc){
                case 1:
                    int x = rd.nextInt(1, 4);
                    int y = rd.nextInt(1, 4);
                    play.jugar(x, y);
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Chao");
            }
        }

    }
}