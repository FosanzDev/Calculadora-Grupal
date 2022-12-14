package lib;
import java.util.Scanner;
public class LibIO {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Request the user an String with a personalized request message
     * and loops input request in case length of the String given is not between {@code [minLon-maxLon]}
     * <p>
     * Examples:
     * <blockquote><pre>
     * 
     * String string = leerString("Enter an String: ", 0, 20);
     * 
     * </pre></blockquote>
     * <p>
     * 
     * @param mensaje String with the personalized message
     * @param minLon Integer with the minimum length
     * @param maxLon Integer with the maximum length
     * @return String with the validated input
     */
    public static String leerString(String mensaje, int minLon, int maxLon) {
        String resultado = "";
        boolean valido;
        do {
            System.out.print(mensaje);
            resultado = scanner.nextLine();
            valido = resultado.length() >= minLon && resultado.length() <= maxLon;
            if (!valido) {
                System.out.printf("El string debe tener entre %d y %d letras\n", minLon, maxLon);
            }
        } while (!valido);
        return resultado;
    }

    /**
     * Reads a String with a personalized request message
     * @param mensaje Message to be printed
     * @return String with the input
     */
    public static String leerString(String mensaje){
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    /**
     * Requests the user an integer with personalized message and
     * loops input request in case number it's not in range {@code [min-max]}
     * <p>
     * Examples:
     * 
     * <blockquote><pre>
     * 
     * int validNumber = leerOpcion("Enter integer between 0 and 10: ", 0, 10);
     * 
     * </pre></blockquote>
     * 
     * <p>
     * @param mensaje String with personalized input
     * @param min Integer with min value to accept
     * @param max Integer with max value to accept
     * @return an integer with the validated input 
     */
    public static int leerOpcion(String mensaje, int min, int max){
        boolean valido = true;
        do{
            System.out.print(mensaje);
            String snum = scanner.nextLine();
            int n = Integer.MIN_VALUE;

            try {
                n = Integer.parseInt(snum);
                valido = true;

            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida");
                valido = false;
                continue;
            }

            if (inRange(n, min, max)){
                return n;
            }

            else{
                System.out.println("Entrada no valida (Fuera de rango)");
                valido = false;
            }
        } while (!valido);

        return 0;
    }

    /**
     * Requests the user a number with personalized message
     * <p>
     * Examples:
     * <blockquote><pre>
     * int number = leerNum("Introduzca un numero: ");
     * //number = user input as a double
     * </pre></blockquote>
     * @param mensaje String with personalized input
     * @return an double with the user input
     */
    public static double leerNum(String mensaje){
        double n = 0;
        boolean valido = true;
        do{
            System.out.print(mensaje);
            String snum = scanner.nextLine();

            try {
                n = Double.parseDouble(snum);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida");
                valido = false;
            }
                
        } while (!valido);

        return n;
    }

    /**
     * Request the user an integer and checks wether it's an integer or not
     * @param mensaje String with the message to be prompted 
     * @return Integer with the chosen value
     */
    public static int leerInt(String mensaje){
        int n = 0;
        boolean valido = true;
        do{
            System.out.print(mensaje);
            String snum = scanner.nextLine();
            snum = snum.trim().replaceAll("\\s+", "");

            try {
                n = Integer.parseInt(snum);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida");
                valido = false;
            }
                
        } while (!valido);

        return n;
    }

    /**
     * Requests the user a binary number and checks wether it's valid or not
     * @param mensaje String with the personalized request message
     * @return String with the validated binary
     */
    public static String leerBinario(String mensaje){
        boolean valido = true;
        String bin;

        do {
            System.out.print(mensaje);
            bin = scanner.nextLine();
            valido = true;

            if(bin.isBlank()){
                System.out.println("Binario no valido");
                valido = false;
                continue;
            }

            bin = bin.trim();

            for(int i=0; i<bin.length(); i++){
                char idx = bin.charAt(i);
                if(idx == '0' || idx == '1');

                else{
                    System.out.println("Binario no valido");
                    valido = false;
                    break;
                }
        }
            
        } while (!valido);

        return bin;
    }

    /**
     * Checks wether a Hexadecimal is valid or not. It also 
     * returns it in uppercase and without spaces
     * @param mensaje
     * @return
     */
    public static String leerHex(String mensaje){
        String hexValues = "ABCDEF";
        boolean valido;
        String hex;

        do {
            System.out.print(mensaje);
            hex = scanner.nextLine();
            valido = true;

            if(hex.isBlank()){
                System.out.println("Hexadecimal no valido");
                valido = false;
                continue;
            }

            hex = hex.trim().replaceAll("\\s+", "").toUpperCase();

            for(int i=0; i<hex.length(); i++){
                char c = hex.charAt(i);
                if(c < '0' || c > '9' && hexValues.indexOf(c) == -1){
                    System.out.println("Hexadecimal no valido");
                    valido = false;
                    break;
                }
            }
            
        } while (!valido);

        return hex;
    }


    /**
     * Waits until user interruption (Enter key)
     */
    public static void pause() {
        System.out.println("\nPresione enter para continuar...\n");
        scanner.nextLine();
    }

    /**
     * Waits until user interruption (Enter key) with a personalized message
     * @param mensaje String with the personalized message
     */
    public static void pause(String mensaje){
        System.out.println(mensaje);
        scanner.nextLine();
    }

    /**
     * Prints a menu with personalized title, footer and initial sequence per element given.
     * <p>
     * If the initial sequence includes a {@code "."}, an autoincremental index will be added before the {@code "."}.
     * <p>
     * Footer lenght equals the title columns. If footer ==  {@code " "}, footer won't be printed. 
     * <p>
     * Examples:
     *  <blockquote><pre>
     *deployMenu("Example menu", " ", "--> ", "Opt1", "Opt2");
     *  //******************
     *  //** Example menu **
     *  //******************
     *  // --> Opt1
     *  // --> Opt2
     * 
     *deployMenu("Example menu with id", "Footer!", "--> . ", "Opt1", "Opt2");
     *  //**************************
     *  //** Example menu with id **
     *  //**************************
     *  // --> 1. Opt1
     *  // --> 2. Opt2
     *  //--------------------------
     *  // Footer!
     *  </pre></blockquote>
     *
     * @param title String with the title
     * @param footer String with the footer
     * @param init String with the starting sequence.
     * @param args Receives an undefinied number of Strings or a String array ({@code String[]})
     */
    public static void deployMenu(String title, String footer, String init, String... args){
        int idx = 1;
        String titleMod = new StringBuilder("*".repeat(title.length() + 6) 
                + "\n** " + title + " **\n"
                + "*".repeat(title.length() + 6)).toString();
        
        System.out.println(titleMod);

        if (init.contains(".")){

            for (String arg : args){
                String initMod = init.replace(".", idx + ".");
                System.out.println(initMod + arg);
                idx++;
            }
        }

        else{
            for (String arg : args){
                System.out.println(init + arg);
            }
        }

        if(footer.equals(" ") || footer.equals(""));
        else{
            System.out.println("-".repeat(title.length() + 6));
            System.out.println(footer);
        }
    }
    
        /**
     * Returns wether the number is between a range of numbers or not
     * <p>
     * Examples:
     * <blockquote><pre>
     * boolean b = inRange(3, 2.5, 4)
     *      //b = true
     * </pre></blockquote>
     * @param x Number to be checked
     * @param lowerBound Min range border
     * @param upperBound Max range border
     * @return a boolean with the result
     */
    public static boolean inRange(double x, double lowerBound, double upperBound){
        if (x >= lowerBound && x <=upperBound) return true;
        else return false;
    }

}