package Ejercicio15_PorTerminar;

import java.util.Arrays;

public class Ej15 {

    public static void main(String[] args) {

        String [][] estudiantes = new String[25][7];
        int [][] notas = new int[25][4];

        for(int i = 0; i < 25; i++){
            estudiantes[i][0] = (i + 1) + ".Estudiante";
        }
        for(int i = 0; i < 25; i++){
            estudiantes[i][1] = "apellido" + i;
        }
        for(int i = 0; i < 25; i++){
            int valor = (int) Math.floor(Math.random() * (5 - 0 + 1) + (0));
            estudiantes[i][2] = "" + valor;
            notas[i][0] = valor;
        }
        for(int i = 0; i < 25; i++){
            int valor = (int) Math.floor(Math.random() * (5 - 0 + 1) + (0));
            estudiantes[i][3] = "" + valor;
            notas[i][1] = valor;
        }
        for(int i = 0; i < 25; i++){
            int valor = (int) Math.floor(Math.random() * (5 - 0 + 1) + (0));
            estudiantes[i][4] = "" + valor;
            notas[i][2] = valor;
        }
        for(int i = 0; i < 25; i++){
            int valor = (int) Math.floor(Math.random() * (5 - 0 + 1) + (0));
            estudiantes[i][5] = "" + valor;
            notas[i][3] = valor;
        }

        int h = 0;
        for(int[] n : notas){
            float promedio = (Arrays.stream(n).reduce(0,Integer::sum))/4;
            estudiantes[h][6] = "" + promedio;
            h++;
        }



        for(int j = 0; j < 25; j++){
            for(int a = 0; a < 7; a++){
                System.out.print(estudiantes[j][a] + " ");
            }
            System.out.println();
        }


    }
}
