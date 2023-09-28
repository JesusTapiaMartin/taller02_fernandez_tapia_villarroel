public class ModificarEstado {

    public static void main(String[] args) {
        String[][] habitaciones = new String[][]{
                {"1", "libre"},
                {"2", "ocupada"},
                {"3", "ocupada"}
        };
        System.out.println("La habitacion numero: " + habitaciones[0][0] + ", Tiene el estado: " + habitaciones[0][1]);

        modificarEstado(habitaciones, "1", "ocupada");
        System.out.println("La habitacion numero: " + habitaciones[0][0] + ", Se actualizo al estado: " + habitaciones[0][1]);
    }
    public static void modificarEstado(String[][] habitaciones, String NumeroHabitacion, String EstadoHabitacion) {
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i][0].equals(NumeroHabitacion)) {
                habitaciones[i][1] = EstadoHabitacion;
            }
        }
    }
// Se tiene que modificar este for de acuerdo a como se creará la matriz

//

}