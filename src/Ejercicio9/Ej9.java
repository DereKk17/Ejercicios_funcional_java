package Ejercicio9;

import java.util.*;

public class Ej9 {

    static Scanner leerDato = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ingrese el numeor de elementos deseados");
        int tamanio = leerDato.nextInt();

        int [] vector = new int[tamanio];


        for(int i = 0; i < tamanio; i++){
            vector[i] = (int) Math.floor(Math.random() * (10 - 0 + 1) + (0));
        }

        for(int i = 0; i < tamanio; i++){
            System.out.print(vector[i] + "  ");
        }

        OptionalInt numeroMayor = Arrays.stream(vector).max();
        OptionalInt numeroMenor = Arrays.stream(vector).min();

        System.out.println("Mayor: " + numeroMayor +  "\t"
                + "Menor: " + numeroMenor);
    }
}
