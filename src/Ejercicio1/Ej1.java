package Ejercicio1;

import java.util.List;

public class Ej1 {
    public static void main(String[] args) {
        Double salarioBase = 1000000.00;

        List<Double> ventas = List.of(90000.00,50000.00,120000.00);

        Double salarioComisiones = ventas.stream().mapToDouble(venta -> venta * 0.1).sum();

        System.out.println(salarioBase + salarioComisiones);
    }
}
