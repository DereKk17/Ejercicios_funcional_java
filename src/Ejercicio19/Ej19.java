package Ejercicio19;

import java.util.List;

public class Ej19 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(0,1,-3,-2,8,-1,6);

        System.out.println(cuentaPositivos(numeros));

    }

    public static Long cuentaPositivos(List<Integer> lista){
        return lista.stream()
                .filter(num -> num > 0)
                .count();
    }
}
