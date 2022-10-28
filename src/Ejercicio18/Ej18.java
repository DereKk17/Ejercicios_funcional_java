package Ejercicio18;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ej18 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

        List<Integer> listaEnRango = enRango(5,15,numeros);

        listaEnRango.forEach(x -> System.out.println(x + "  "));

    }

    public static List<Integer> enRango(int primerIntervalo, int segundoIntervalo, List<Integer> lista){
        return lista.stream()
                .filter(num -> num >= primerIntervalo && num <= segundoIntervalo)
                .collect(Collectors.toList());
    }
}
