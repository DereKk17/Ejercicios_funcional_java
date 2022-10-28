package Ejercicio12;

import java.util.ArrayList;
import java.util.Spliterator;

public class Ej12 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        int dato = 0;
        for(int i = 0; i < 16; i++){
            numeros.add(dato);
            dato ++;
        }

        System.out.println(numeros);

        Spliterator<Integer> arreglo1 = numeros.stream().spliterator();
        Spliterator<Integer> arreglo2 = arreglo1.trySplit();

        arreglo1.forEachRemaining(numero -> System.out.print(numero + " "));
        System.out.println();
        arreglo2.forEachRemaining(numero -> System.out.print(numero + " "));

    }
}
