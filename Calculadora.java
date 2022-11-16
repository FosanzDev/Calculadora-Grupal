import lib.LibIO;
import lib.Convert;

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

            int option = LibIO.leerInt("Elija una opción: ", 0, 2);

            if (option == 1){
                LibIO.deployMenu("OPERACIONES ARITMÉTICAS", "0. Salir al menu principal", ". ", arithMenu);
                int subOption = LibIO.leerInt("Elija una opción: ", 0, 5);

                switch (subOption){
                    case 1:
                        //TODO -- Sum call
                        break;
                    case 2:
                        //TODO -- Subs call
                        break;
                    case 3:
                        //TODO -- Mult call
                        break;
                    case 4:
                        //TODO -- Div call
                        break;
                    case 5:
                        //TODO -- Mod call
                        break;
                
                    default: break;
                }
                continues = true;
            }

            else if (option == 2){
                LibIO.deployMenu("CONVERSIONES DE BASE", "0. Volver al menú principal", ". ", convMenu);
                int subOption = LibIO.leerInt("Elija una opción: ", 0, 6);

                switch (subOption){
                    case 1:
                        //dec2bin
                        int dec = LibIO.leerInt("Introduzca en decimal: ");
                        String sres = Convert.dec2bin(dec);
                        System.out.println("En binario seria: "  + sres);
                        LibIO.waitReturn("\nPresione Enter para continuar");
                        System.out.println("\n\n");
                        break;
                    
                    case 2:
                        dec = LibIO.leerInt("Introduzca en decimal: ");
                        sres = Convert.dec2hex(dec);
                        System.out.println("En hexadecimal seria: " + sres);
                        LibIO.waitReturn("\nPresione Enter para continuar");
                        System.out.println("\n\n");
                        break;
                    
                    case 3:
                        String bin = LibIO.leerBinario("Introduzca en binario: ");
                        int res = Convert.bin2dec(bin);
                        System.out.println("En decimal seria: " + res);
                        LibIO.waitReturn("\nPresione Enter para continuar");
                        System.out.println("\n\n");
                        break;
                    
                    case 4:
                        bin = LibIO.leerBinario("Introduzca en binario: ");
                        sres = Convert.bin2hex(bin);
                        System.out.println("En hexadecimal seria: " + sres);
                        LibIO.waitReturn("Presione Enter para continuar");
                        System.out.println("\n\n");
                        break;
                    
                    case 5:
                        //TODO -- hex2bin call
                        break;
                    
                    case 6:
                        //TODO -- hex2dec call
                        break;

                    default: break;
                }

                continues = true;
            }

            else continues = false;
        } while (continues);
    }
}
