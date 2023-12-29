public class Perro {
    //atributos privados
    private String tamano;
    private int edad;
    protected String nombre;

    //constructor
    public Perro(String tamano, int edad, String nombre) {
        this.tamano = tamano;
        this.edad = edad;
        this.nombre = nombre;
    }

    //metodos
    public String getTamano() {
        return tamano;
    }

    private int getEdad() {
        return edad;
    }

    protected String getNombre() {
        return nombre;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    private void setEdad(int edad) {
        this.edad = edad;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void mostrarEdad(){
        System.out.println("La edad del perro es: " + getEdad());
    }
}
