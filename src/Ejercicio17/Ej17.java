package Ejercicio17;

import java.util.List;
import java.util.stream.Stream;

public class Ej17 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(0,2,1,7,8,56,17,18);

        Stream<Object> listaTrasnformada = operacion(numeros);

        listaTrasnformada.forEach(num -> System.out.println(num + " "));

    }

    public static Stream<Object> operacion(List<Integer> listaEntrada){
        return  listaEntrada.stream()
                .filter(x -> x % 2 == 0)
                .map(y -> y / 2);
    }
}
