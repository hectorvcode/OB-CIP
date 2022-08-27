public class Main {

    /**
     * Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
     * Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
     * */
    public static void condicional(double numeroIf) {
        if (numeroIf >= 0.0) {
            System.out.println("Es un numero positivo");
        } else {
            System.out.println("Es un numero negativo");
        }

    }

    /**
     * Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior
     * a 3, el bloque de código que tendrá el bucle deberá:
     * Incrementar el valor de la variable en uno cada vez que se ejecute.
     * Mostrarlo por pantalla cada vez que se ejecute.
     * */

    public static void cicloWhile(int numeroWhile) {
        while(numeroWhile < 3) {
            ++numeroWhile;
            System.out.println("La variable es " + numeroWhile);
        }

    }

    /**
     * Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar
     * una vez.
     * */
    public static void cicloDoWhile(int numeroDoWhile) {
        do {
            System.out.println("La variable es " + numeroDoWhile);
            ++numeroDoWhile;
        } while(numeroDoWhile >= 0 && numeroDoWhile < 0);

    }

    /**
     * Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será
     * que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute
     * y deberá mostrarse por pantalla.
     * */

    public static void cicloFor() {
        for(int numeroFor = 0; numeroFor <= 3; ++numeroFor) {
            System.out.println(numeroFor);
        }

    }

    /**
     * Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones
     * del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando
     * de la estación en la que está. También habrá que poner un default para cuando el valor de la variable
     * no sea una estación.
     * */

    public static void cicloSwitch(String estacion) {
        switch (estacion) {
            case "invierno":
                System.out.println("La estacion es invierno");
                break;
            case "verano":
                System.out.println("La estacion es verano");
                break;
            case "primavera":
                System.out.println("La estacion es primavera");
                break;
            case "otoño":
                System.out.println("La estacion es otoño");
                break;
            default:
                System.out.println("El valor es no es una estacion");
        }

    }


    public static void main(String[] args) {
        //condicional(-2);
        //cicloWhile(-2);
        //cicloDoWhile(-3);
        //cicloFor();
        cicloSwitch("verano");
    }
}