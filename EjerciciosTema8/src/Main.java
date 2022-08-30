public class Main {
    public static void main(String[] args) {

        Persona persona1 =  new Persona();
        persona1.setEdad(42);
        persona1.setNombre("Hector Vasquez");
        persona1.setTelefono("3133755040");

        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad =  edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}