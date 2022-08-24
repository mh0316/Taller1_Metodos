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
        System.out.println("5. Mostrar toda la colección"+mostrarTotalLibros());
        int opcion = validarIngreso();
        seleccionarOpcionMenu(opcion);
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

    private static void seleccionarOpcionMenu(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println(agregarLibro());
            case 2:
                System.out.println(buscarLibro());
            case 3:
                System.out.println(mostrarEspaciosUsados());
            case 4:
                System.out.println(mostrarEspaciosDisponibles());
            case 5:
                System.out.println(mostrarTodaLaColeccion());
        }
    }

    private static boolean[] mostrarTodaLaColeccion() {
        boolean[] coleccion = new boolean[0];
        for (int i = 0; i < coleccion.length; i++) {
            System.out.println(Arrays.toString(coleccion));
        }
        return coleccion;
    }

    private static void mostrarEspaciosDisponibles(String[] espaciosDisponibles) {
        for (int i = 0; i < espaciosDisponibles.length; i++) {
            System.out.println(Arrays.toString(espaciosDisponibles));
        }
    }

    private static int[] agregarLibro() {
        int[] agregaLibro = new int[0];
        for (int i = 0; i < agregaLibro.length; i++) {
            for (int j = 0; j < agregaLibro[i]; j++) {
                int añade = añadir();
                agregaLibro[i] = añade;
            }
        }
        return agregaLibro;
    }

    private static int añadir() {
        return 0;
    }

    private static boolean buscarLibro(){
        System.out.println(mostrarBusquedaDeLibro();
        return false;
    }

    private static void mostrarEspaciosUsados(String[] librosContenidos){
        for (int i = 0; i < librosContenidos.length; i++) {
            System.out.println(Arrays.toString(librosContenidos));
        }
    }

    private static void mostrarBusquedaDeLibro(String[][] librosBuscados, String titulo, String autor, String editorial){
        for (int i = 0; i < librosBuscados.length; i++) {
            for (int j = 0; j < librosBuscados[i].length; j++) {
                if(librosBuscados[i][j].equals(librosBuscados) || librosBuscados.equals(titulo)) {
                    System.out.println("El libro se encuentra dentro de la colección");
                    break;
                } else {
                    System.out.println("El libro no se encuentra dentro de la colección");
                }
            }
        }
    }

    private static void mostrarTotalLibros(char[][] librosContenidos) {
        for (int i = 0; i < librosContenidos.length; i++) {
            System.out.println(Arrays.toString(librosContenidos[i]));
        }
    }
}