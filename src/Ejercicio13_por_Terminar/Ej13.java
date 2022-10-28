package Ejercicio13_por_Terminar;

import java.util.Scanner;

public class Ej13 {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
       int [][] matriz = new int[4][5];

       for(int i = 0; i < 4; i ++){
           for(int x = 0; x < 5; x++){
               matriz[i][x] = (int) Math.floor(Math.random() * (10 - 0 + 1) + (0));
           }
       }

        for(int i = 0; i < 4; i ++){
            for(int x = 0; x < 5; x++){
                System.out.print(matriz[i][x] + " ");
            }
            System.out.println();
        }

        System.out.println("numero a bucar");
        int numero = leer.nextInt();



        //Arrays.stream(matriz).filter(x -> x % 2 == 0)
    }
}
