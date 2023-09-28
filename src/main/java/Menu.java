import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        String[][] hotel = null;
        Menu(hotel);
    }
    public static void Menu(String[][] hotel) {
        Scanner lector = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("========================================");
            System.out.println("           Donde cabe 1, caben 2        ");
            System.out.println("                  HOTEL                 ");
            System.out.println("========================================");
            System.out.println("        [1] Habitaciones                ");
            System.out.println("        [2] Reservar                    ");
            System.out.println("        [3] Reiniciar hotel             ");
            System.out.println("        [4] Imprimir boleta             ");
            System.out.println("        [5] Modificar estado            ");
            System.out.println("        [6] Salir                       ");
            System.out.println("========================================");
            System.out.print("            Ingrese su opción  : ");
            opcion = lector.nextLine();
            System.out.println("========================================");

            switch (opcion) {
                case "1":
                    hotel = Matriz.matrizHotel();
                    Matriz.mostrarMatriz(hotel);
                    break;

                case "2":
                    String[] reserva = Reservar.reservarHabitacion(hotel);
                    Reservar.confirmarReserva(hotel, reserva[0], reserva[1], reserva[2]);


                case "3":
                    break;


                case "4":
                    break;


                case "5":
                    break;


                case "6":
                    System.out.println("        Hasta luego... ");


                default:
                    System.out.println("        Ingrese una opción válida... ");
                    break;
            }
        } while (!opcion.equals("6"));
    }
}