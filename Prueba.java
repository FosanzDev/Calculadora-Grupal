import lib.LibIO;

public class Prueba{
    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        String nif = LibIO.leerString("Dame tu NIF", 9, 9);
    }
}
