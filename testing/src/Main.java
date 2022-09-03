public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        cocheChanger(coche);
        cocheChanger(coche);

        System.out.println(coche.velocidad);
    }

    public static int factorial(int numero){
        int resultado;
        if (numero ==1){
            return 1;
        }

        resultado = factorial(numero -1) * numero;
        return resultado;
    }

    public static int factorialNR(int numero){
        int temp;
        int resultado = 1;

        for(temp = 1; temp <= numero; temp++){
            resultado = resultado *temp
        }
        return resultado;
    }

    public static void cocheChanger(Coche coche){
        coche.velocidad += 50;
    }
}

interface Vehiculo{
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Moto implements Vehiculo{
    public void Acelerar(int cuantaVelocidad){
        System.out.println("Moto -> Acelerar()");
    }
    public void Frenar(int cuantaVelocidad){
        System.out.println("Moto -> Frenar()");
    }
}

class Coche implements Vehiculo{

    int velocidad = 0;
    public void Acelerar(int cuantaVelocidad){
        System.out.println("Coche -> Acelerar()");
    }
    public void Frenar(int cuantaVelocidad){
        System.out.println("Coche -> Frenar()");
    }
}