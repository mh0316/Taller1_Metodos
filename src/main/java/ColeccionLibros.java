import java.util.Scanner;
import java.util.Arrays;

public class ColeccionLibros {
    public static void main(String[] args) {
        menu();
        agregarLibro();
    }

    public static void menu(){
        System.out.println("1. Agregar libro");
        System.out.println("2. Buscar libro");
        System.out.println("3. Mostrar espacios usados");
        System.out.println("4. Mostrar espacios disponibles");
        System.out.println("5. Mostrar toda la colección");
        int opcion = validarIngreso();
    }

    private static int validarIngreso() {
        Scanner teclado = new Scanner(System.in);
        int entrada;
        do {
            try {
                entrada = teclado.nextInt();
                break;
            } catch (Exception e) {
                teclado.nextLine();
            }
        } while (true);
        return entrada;
    }


    private void seleccionarOpcionMenu(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println(agregarLibro());
            case 2:
                System.out.println(buscarLibro());

        }
    }

    public static String[][] agregarLibro(String misLibros[], String titulo, String autor, String editorial){

    }

    private static boolean buscarLibro(){

        return false;
    }

    private static void mostrarTotalLibros(char[][] librosContenidos, char[][] espaciosDisponibles) {
        for (int i = 0; i < librosContenidos.length; i++) {
            System.out.println(Arrays.toString(librosContenidos[i]));
            System.out.println(Arrays.toString(espaciosDisponibles[i]));
        }
    }

}