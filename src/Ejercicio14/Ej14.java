package Ejercicio14;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Ej14 {
    public static void main(String[] args) {
        ArrayList<Integer> vector1 = new ArrayList<>();
        ArrayList<Integer> vector2 = new ArrayList<>();
        ArrayList<Integer> vector3 = new ArrayList<>();

        int[][] matriz = new int[3][10];

        int dato = 0;

        for(int i = 0; i < 10; i++){
            vector1.add(dato);
            dato++;
            vector2.add(dato);
            dato++;
            vector3.add(dato);
            dato++;
        }

        int c = 0;

        for(int z : vector1){
            matriz[0][c] = z;
            c ++;
        }

        int b = 0;

        for(int y : vector2){
            matriz[1][b] = y;
            b ++;
        }



        int a = 0;

        for(int x : vector3){
            matriz[2][a] = x;
            a ++;
        }


        for(int i = 0; i < 3; i++){
            for(int k = 0; k < 10; k++){
                System.out.print(matriz[i][k] + "  ");
            }
            System.out.println();
        }
    }
}
