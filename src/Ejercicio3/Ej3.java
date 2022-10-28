package Ejercicio3;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Ej3 {

    interface NotaFinal{
        public Double notafinal(double ponderadoParciales, double examenFinal, double trabajoFinal);
    }
    public static void main(String[] args) {
        List<Double> parciales = List.of(4.5, 3.8, 5.0);

        NotaFinal calificacion = (x, y, z) -> (x * 0.55) + (y * 0.3) + (z * 0.15);

        Double promedioParciales = parciales.stream()
                .collect(Collectors.averagingDouble(Double::doubleValue));

        System.out.println(calificacion.notafinal(promedioParciales, 3.6,4.4));
    }
}
