import java.util.Scanner;

public class Pasajero {
    Scanner sc = new Scanner(System.in);
    protected String nombre, preferenciasAlimenticias;
    protected int numeroPasaporte, edad;



    protected void nuevousuario(String nombre, String preferenciasAlimenticias, int edad, int numeroPasaporte){
        System.out.println("Ingrese su nombre porfavor");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad porfavor");
        edad = sc.nextInt();
        System.out.println("Ingrese su número de pasaporte porfavor");
        numeroPasaporte = sc.nextInt();
        System.out.println("Ingrese las cosas que le gustario o no comer");
        preferenciasAlimenticias = sc.nextLine();
    }
    protected Pasajero() {
        this.nombre = nombre;
        this.preferenciasAlimenticias = preferenciasAlimenticias;
        this.numeroPasaporte = numeroPasaporte;
        this.edad = edad;
    }
}