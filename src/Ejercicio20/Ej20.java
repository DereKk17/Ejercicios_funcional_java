package Ejercicio20;

import java.util.List;
import java.util.stream.Collectors;

public class Ej20 {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(1,5,7,9,1,2,12,23,45,5,8);

        System.out.println(eliminarNumeros(numeros, 4));

    }

    public static List<Integer> eliminarNumeros(List<Integer> lista, int numero){
        return lista.stream()
                .filter(num -> num > numero)
                .collect(Collectors.toList());
    }
}
