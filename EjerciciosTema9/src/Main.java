public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.edad = 25;
        cliente.telefono = "3133755642";
        cliente.nombre = "Carmen Gonzalez";
        cliente.credito = true;
        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito: " + cliente.credito);
    }
}

class Persona{
    public int edad;
    public String nombre;
    public String telefono;
}

class Cliente extends Persona{
    public boolean credito;
}

class Trabajador extends Persona{
    public double salario;
}