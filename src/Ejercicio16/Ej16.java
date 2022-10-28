package Ejercicio16;

import java.util.List;

public class Ej16 {

    public static void main(String[] args) {
        List<Integer> caracteres = List.of(9,10,7,10,5,8,10,14,17,10);

        System.out.println(repetidasFilter(caracteres, 10));

    }

    public static Long repetidasFilter(List<Integer> lista, Integer numero){
        return lista.stream().filter(num -> num == numero).count();
    }

   /* public static Long repetidas(List<Integer> lista, Integer numero){
        return lista.stream().reduce()
    }*/
}
