import lib.*;


public class Calculadora{

    private static String[] mainMenu = new String[] {
        "Operaciones aritmeticas",
        "Conversiones base"
    };

    private static String[] arithMenu = new String[] {
        "Sumar",
        "Restar",
        "Multiplicar",
        "Dividir",
        "Resto de la división"
    };

    private static String[] convMenu = new String[]{
        "De decimal a binario",
        "De decimal a hexadecimal",
        "De binario a decimal",
        "De binario a hexadecimal",
        "De hexadecimal a binario",
        "De hexadecimal a decimal"
    };
 
    public static void main(String[] args) {
        boolean continues;

        do {
            LibIO.deployMenu("CALCULADORA", "0. Salir del programa", ". ", mainMenu);        

            int option = LibIO.leerOpcion("Elija una opción: ", 0, 2);

            if (option == 1){
                LibIO.deployMenu("OPERACIONES ARITMÉTICAS", "0. Salir al menu principal", ". ", arithMenu);
                int subOption = LibIO.leerOpcion("Elija una opción: ", 0, 5);

                switch (subOption){
                    case 1:
                        //Addition option
                        double a = LibIO.leerNum("Introduzca primer numero: ");
                        double b = LibIO.leerNum("Introduzca segundo numero: ");
                        System.out.println("El resultado de la suma es: " + Arithmetics.sum(a, b));
                        LibIO.pause();
                        break;
                    case 2:
                        //Substraction option
                        a = LibIO.leerNum("Introduzca primer numero: ");
                        b = LibIO.leerNum("Introduzca segundo numero: ");
                        System.out.println("El resultado de la resta es: " + Arithmetics.rest(a, b));
                        LibIO.pause();
                        break;
                    case 3:
                        //Multiplication
                        a = LibIO.leerNum("Introduzca multiplicando: ");
                        b = LibIO.leerNum("Introduzca multiplicador: ");
                        System.out.println("El resultado de la multiplicacion es: " + Arithmetics.mult(a, b));
                        LibIO.pause();
                        break;
                    case 4:
                        //Division
                        a = LibIO.leerNum("Introduzca dividendo: ");
                        b = LibIO.leerNum("Introduzca divisor: ");
                        System.out.println("El resultado de la division es: " + Arithmetics.div(a, b));
                        LibIO.pause();
                        break;
                    case 5:
                        //Remainder
                        a = LibIO.leerNum("Introduzca dividendo: ");
                        b = LibIO.leerNum("Introduzca divisor: ");
                        System.out.println("El resto de la division es: " + Arithmetics.resto(a, b));
                        LibIO.pause();
                        break;
                
                    default: break;
                }
                continues = true;
            }

            else if (option == 2){
                LibIO.deployMenu("CONVERSIONES DE BASE", "0. Volver al menú principal", ". ", convMenu);
                int subOption = LibIO.leerOpcion("Elija una opción: ", 0, 6);

                switch (subOption){
                    case 1:
                        //dec2bin
                        int dec = LibIO.leerInt("Introduzca en decimal: ");
                        String sres = Convert.dec2bin(dec);
                        System.out.println("En binario seria: "  + sres);
                        LibIO.pause();
                        break;
                    
                    case 2:
                        //dec2hex
                        dec = LibIO.leerInt("Introduzca en decimal: ");
                        sres = Convert.dec2hex(dec);
                        System.out.println("En hexadecimal seria: " + sres);
                        LibIO.pause();
                        break;
                    
                    case 3:
                        //bin2dec
                        String bin = LibIO.leerBinario("Introduzca en binario: ");
                        int res = Convert.bin2dec(bin);
                        System.out.println("En decimal seria: " + res);
                        LibIO.pause();
                        break;
                    
                    case 4:
                        // bin2hex
                        bin = LibIO.leerBinario("Introduzca en binario: ");
                        sres = Convert.bin2hex(bin);
                        System.out.println("En hexadecimal seria: " + sres);
                        LibIO.pause();
                        break;
                    
                    case 5:
                        // hex2bin
                        String hex = LibIO.leerHex("Introduzca en hexadecimal: ");
                        sres = Convert.hex2bin(hex);
                        System.out.println("En binario seria: " + sres);
                        LibIO.pause();
                        break;
                    
                    case 6:
                        // hex2dec
                        hex = LibIO.leerHex("Introduzca en hexadecimal: ");
                        res = Convert.hex2dec(hex);
                        System.out.println("En decimal seria: " + res);
                        LibIO.pause();
                        break;

                    default: break;
                }

                continues = true;
            }

            else continues = false;
        } while (continues);
    }
}
