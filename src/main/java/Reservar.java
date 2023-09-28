import java.util.Scanner;
public class Reservar {


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
    public static void confirmarReserva( String[][] hotel, String habitacion,
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
