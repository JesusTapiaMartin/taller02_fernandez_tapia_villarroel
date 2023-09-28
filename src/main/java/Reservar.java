import java.util.Scanner;
public class Reservar {

    public static void main(String[] args) {
        String[][] hotel = crearMatriz();
        mostrarHotel(hotel);
        String[] reserva = reservarHabitacion(hotel);
        confimarReserva(hotel, reserva[0], reserva[1], reserva[2]);
        mostrarHotel(hotel);
    }
    //=================== CREAR MATRIZ ===================
    public static String[][] crearMatriz() {
        String[][] hotel = new String[10][4];

        for (int i = 0; i < 10; i++) {
            hotel[i][0] = Integer.toString(i + 1);
            hotel[i][1] = "Disponible";
            hotel[i][2] = "0";
            hotel[i][3] = "Sin alimentación";
        }

        return hotel;
    }

    // =================== MOSTRAR HOTEL ===================
    public static void mostrarHotel(String[][] hotel) {
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                System.out.print(hotel[i][j] + "\t\t\t");

            }
            System.out.println();
        }
    }



    //=================== RESERVAR HABITACIÓN ===================
    public static String[] reservarHabitacion(String[][] hotel) {
        Scanner lector      = new Scanner(System.in);

        System.out.println(" ---------- RESERVAR HABITACIÓN ----------");
        System.out.print  ("        Número de la habitación     : ");
        String habitacion   = lector.nextLine();

        System.out.print  ("        Número de noches            : ");
        String noches       = lector.nextLine();

        System.out.print  ("        Servicio de alimentación    : ");
        String alimentacion = lector.nextLine();

        return new String[]{habitacion, noches, alimentacion};
    }


    //=================== CONFIRMAR RESERVA ===================
    public static void confimarReserva( String[][] hotel, String habitacion,
                                        String noches   , String alimentacion){
        Scanner lector = new Scanner(System.in);

        System.out.println(" ---------- Confirmar reserva ----------");
        System.out.println("        [1] Sí                          ");
        System.out.println("        [2] No                          ");
        int opcion = lector.nextInt();

        if (opcion == 1){
            int habitacionNum = Integer.parseInt(habitacion);
            hotel[habitacionNum - 1][1] = "Ocupado";
            hotel[habitacionNum - 1][2] = noches;
            hotel[habitacionNum - 1][3] = alimentacion;
            System.out.println("        La habitación " + habitacion + " fue reservada ");

        } else if (opcion == 2){
            System.out.println("s");

        } else {
            System.out.println("        Ingrese una opción válida... ");

        }

    }
}
