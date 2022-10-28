package Ejercicio7;

public class Ej7 {
    interface Genero{
        public Double salon(int genero, int totalSalon);
    }

    public static void main(String[] args) {
        Genero porcentaje = (h, t) -> Double.valueOf((h * 100)/t);

        System.out.println("mujeres " + porcentaje.salon(20,50) + " %");
        System.out.println("hombres " + porcentaje.salon(30,50)+ " %");
    }
}
