public class Main {

    /**
     * Primera parte:
     * Crear una función con tres parámetros que sean números que se suman entre sí.
     * Llamar a la función en el main y darle valores.
     * */

    public static void suma(double a, double b, double c){
        double result = a + b + c;
        System.out.println("El resultado de la suma es: " + result);
    }

    public static void main(String[] args) {
        suma(1,2,3);
        Coche miCoche = new Coche();
        miCoche.aumentarPuerta();
        System.out.println("El numero de puertas es: " + miCoche.numeroPuertas);
    }
}

/**
 * Segunda parte:
 * Crear una clase coche.
 * Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
 * Una función que incremente el número de puertas que tiene el coche.
 * Crear un objeto miCoche en el main y añadirle una puerta.
 * Mostrar el número de puertas que tiene el objeto.
 * */
class Coche {
    public int numeroPuertas = 4;

    public void aumentarPuerta(){
        this.numeroPuertas++;
    }
}