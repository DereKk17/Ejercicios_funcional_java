package Ejercicio11;

import java.util.ArrayList;

public class Ej11{
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();


        for(int i = 0; i < 20; i++){
            numeros.add((int) Math.floor(Math.random() * (200 - 0 + 1) + (0)));
        }

        System.out.println(numeros);

        int numeroMayor = numeros.stream().max(Integer::compare).get();

        System.out.println(numeroMayor);
        System.out.println(numeros.indexOf(numeroMayor));

    }
}
