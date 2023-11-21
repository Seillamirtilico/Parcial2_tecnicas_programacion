import java.util.*;

public class Vuelo {
    Scanner sc = new Scanner(System.in);
    LinkedList<Vuelo> vuelos = new LinkedList<Vuelo>();
    int numeroVuelo, capacidadPasajeros;
    String origen, destino, fechaVuelo, horaVuelo;

    public Vuelo() {
        this.vuelos = vuelos;
        this.numeroVuelo = numeroVuelo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.origen = origen;
        this.destino = destino;
        this.fechaVuelo = fechaVuelo;
        this.horaVuelo = horaVuelo;
    }


    public void CrearVuelo(int numeroVuelo, int capacidadPasajeros, String origen, String destino, String fechaVuelo, String horaVuelo){

        System.out.println("Ingrese el número de vuelo");
        numeroVuelo = sc.nextInt();
        System.out.println("Ingrese la capacidad de pasajeros");
        capacidadPasajeros = sc.nextInt();
        System.out.println("Ingrese el origen");
        origen = sc.nextLine();
        System.out.println("Ingrese el destino");
        destino = sc.nextLine();
        System.out.println("Ingrese la fecha de salida");
        fechaVuelo = sc.nextLine();
        System.out.println("Ingrese la hora de salida");
        horaVuelo = sc.nextLine();
    }

    public Vuelo consultarVuelo(int numeroVuelo){

        for(int i = 0; i < vuelos.size(); i++){
            Vuelo vueloAux = vuelos.get(i);
            if (vueloAux.getNumeroVuelo() == numeroVuelo){
                return vueloAux;
            }
        }
        return null;
    }
    public void regVuelo(Vuelo vuelo){
        vuelos.add(vuelo);
    }
    public int getNumeroVuelo() {
        return numeroVuelo;
    }
}