import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroVuelo = 0, capacidadPasajeros = 0;
        String origen = "", destino = "", fechaVuelo = "", horaVuelo = "";
        Pasajero pasajero = new Pasajero();
        String nombre = "", preferenciasAlimenticias = "";
        int numeroPasaporte = 0, edad = 0, opcion;
        Vuelo vuelo = new Vuelo();

        do {
            System.out.println("Bienvenido a tu programa de reserva de vuelos\n1. Inciar usuario\n2. Crear un nuevo vuelo\n3. Hacer una reserva\n4. Consultar vuelo\n5. Cancelar reserva\n6. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    pasajero.nuevousuario(nombre, preferenciasAlimenticias, edad, numeroPasaporte);
                    break;
                case 2:
                    vuelo.regVuelo(vuelo);
                    break;
                case 3:
                    break;
                case 4:
                    vuelo.consultarVuelo(vuelo.getNumeroVuelo());
                case 5:
                    break;
                case 6:
                    System.out.println("CHAOOO");
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
            }
        } while (opcion != 3);
    }

}