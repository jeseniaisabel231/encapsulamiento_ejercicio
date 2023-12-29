public class Mestizo extends Perro{
    public String color;
    public Mestizo(String tamano, int edad, String nombre) {
        super(tamano, edad, nombre);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    void mostrarNombre(){
        System.out.println("El nombre del perro es "+ getNombre());
    }

}
