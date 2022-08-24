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
            case 3:
                System.out.println(mostrarEspaciosUsados());
            case 4:
                System.out.println(mostrarEspaciosDisponibles());
            case 5:
                System.out.println(mostrarTodaLaColeccion());
        }
    }

    private static int[] agregarLibro(int[] añadir) {
        for (int i = 0; i < añadir.length; i++) {
            for (int j = 0; j < añadir[i]; j++) {
                char voto = añadir();
                añadir[i] = voto;
            }
        }
        return añadir;
    }

    private static boolean buscarLibro(){

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