package Ejercicio8;

public class Ej8 {
    interface Anios{
        public Double edad(int dia, int mes, int anio);
    }

    public static void main(String[] args) {
        Anios calculoEdad = (x, y, z) -> ((2022 * 365) + 327 - Double.valueOf(x + ((y - 1) * 30) + (z * 365)))/365;


        System.out.println(calculoEdad.edad(29,10,1966));
    }
}
