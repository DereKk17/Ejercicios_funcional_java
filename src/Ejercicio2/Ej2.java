package Ejercicio2;

public class Ej2 {

    interface off{
        public double descuento(double compra);
    }

    public static void main(String[] args) {
        off rebaja = (x) -> x - (x * 0.15);

        System.out.println(rebaja.descuento(80000));
    }
}
