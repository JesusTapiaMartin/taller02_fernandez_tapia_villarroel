public class Matriz {
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

    public static void mostrarHotel(String[][] hotel) {
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                System.out.print(hotel[i][j] + "\t\t\t");

            }
            System.out.println();
        }
    }
}