import lib.LibIO;

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
                        //TODO -- dec2bin call
                        break;
                    
                    case 2:
                        //TODO -- dec2hex call
                        break;
                    
                    case 3:
                        //TODO -- bin2dec call
                        break;
                    
                    case 4:
                        //TODO -- bin2hex call
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
