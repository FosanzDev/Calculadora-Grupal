package lib;

import java.util.Scanner;

public class LibIO {
    private static Scanner scanner = new Scanner(System.in);

    public static String leerString(String mensaje, int minLon, int maxLon) {
        String resultado = "";
        boolean valido;
        do {
            System.out.println(mensaje);
            resultado = scanner.nextLine();
            valido = resultado.length() >= minLon && resultado.length() <= maxLon;
            if (!valido) {
                System.out.printf("El string debe tener entre %d y %d letras\n", minLon, maxLon);
            }
        } while (!valido);
        return resultado;
    }

    public static int leerInt(String mensaje, int min, int max) {
        // TODO 
        return -1;
    }

}
