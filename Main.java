import java.security.cert.Extension;

public class Main {
    public static void main(String[]args){

        Perro perrito1 = new Perro("mediano", 3, "Tito");
        Mestizo perrito2 = new Mestizo("mediano", 4, "Dolar");
        try{
            System.out.println("La edad del perro es: " + perrito1.getEdad());
        }catch(Exception Error){
            System.out.println("Los modificadores de acceso private solo son accesibles dentro de la clase ");
            perrito1.mostrarEdad();
        }finally{
            System.out.println("El tamano del perro es " + perrito1.getTamano());
        }

        try{
            System.out.println("El nombre del perro es: " + perrito2.getNombre());
        }catch(Exception Error){
            System.out.println("Los modificadores de acceso protected solo son accesibles dentro de la clase padre y sus sus clases hijas");
            perrito2.mostrarEdad();
        }finally{
            System.out.println("El tamano del perro es " + perrito2.getTamano());
        }

    }
}
