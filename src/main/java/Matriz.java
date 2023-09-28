public class Matriz {
    public static void main(String[] args) {
        String[][] hotel = matrizHotel();
        mostrarMatriz(hotel);
    }

    public static String[][] matrizHotel() {
        String[][] hotel = new String[10][4];

        // FILA 1 MATRIZ PREDETERMINADA
        hotel[0][0] = "Habitación 1";
        hotel[0][1] = "Disponible";
        hotel[0][2] = "Comida (sin estado)";
        hotel[0][3] = "Noches (sin estado)";

        // FILA 2 MATRIZ PREDETERMINADA
        hotel[1][0] = "Habitación 2";
        hotel[1][1] = "Disponible";
        hotel[1][2] = "Comida (sin estado)";
        hotel[1][3] = "Noches (sin estado)";

        // FILA 3 MATRIZ PREDETERMINADA
        hotel[2][0] = "Habitación 3";
        hotel[2][1] = "Disponible";
        hotel[2][2] = "Comida (sin estado)";
        hotel[2][3] = "Noches (sin estado)";

        // FILA 4 MATRIZ PREDETERMINADA
        hotel[3][0] = "Habitación 4";
        hotel[3][1] = "Disponible";
        hotel[3][2] = "Comida (sin estado)";
        hotel[3][3] = "Noches (sin estado)";

        // FILA 5 MATRIZ PREDETERMINADA
        hotel[4][0] = "Habitación 5";
        hotel[4][1] = "Disponible";
        hotel[4][2] = "Comida (sin estado)";
        hotel[4][3] = "Noches (sin estado)";

        // FILA 6 MATRIZ PREDETERMINADA
        hotel[5][0] = "Habitación 6";
        hotel[5][1] = "Disponible";
        hotel[5][2] = "Comida (sin estado)";
        hotel[5][3] = "Noches (sin estado)";

        // FILA 7 MATRIZ PREDETERMINADA
        hotel[6][0] = "Habitación 7";
        hotel[6][1] = "Disponible";
        hotel[6][2] = "Comida (sin estado)";
        hotel[6][3] = "Noches (sin estado)";

        // FILA 8 MATRIZ PREDETERMINADA
        hotel[7][0] = "Habitación 8";
        hotel[7][1] = "Disponible";
        hotel[7][2] = "Comida (sin estado)";
        hotel[7][3] = "Noches (sin estado)";

        // FILA 9 MATRIZ PREDETERMINADA
        hotel[8][0] = "Habitación 9";
        hotel[8][1] = "Disponible";
        hotel[8][2] = "Comida (sin estado)";
        hotel[8][3] = "Noches (sin estado)";

        // FILA 10 MATRIZ PREDETERMINADA
        hotel[9][0] = "Habitación 10";
        hotel[9][1] = "Disponible";
        hotel[9][2] = "Comida (sin estado)";
        hotel[9][3] = "Noches (sin estado)";

        return hotel;
    }

    public static void mostrarMatriz(String[][] hotel) {
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                System.out.println(hotel[i][j]);
            }
        }
    }
}
