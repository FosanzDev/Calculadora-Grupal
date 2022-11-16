package lib;

public class Convert{

    /**
     * Este método realizará una conversion de un numero binario a un numero decimal el cual introducirá el usuario.
     * <p>
     * Ejemplo:
     * <blockquote><pre>
     * long result = bin2dec("00010011")
     * // result = 19
     * 
     * @param res creamos una variable para almacenar el resultado
     * @param idx creamos una variable para poder guardar los indices
     * @param binaryNumber para indicar que el numero es binario
     * @return 
    */
    public static int bin2dec(String binaryNumber) {
        int res = 0;
        int idx = 0;

        for (int i = binaryNumber.length()-1; i >= 0 ; i --) {
            char c = binaryNumber.charAt(i);

            if (c == '1') {
                int num = Character.getNumericValue(c);
                double operation = num * Math.pow(2, idx);
                res += operation;
            }
            idx++;
        }
        return res;
    }
    
    /**
     * Este metodo sirve para poder realizar una conversion de un numoer decimal a un numero hexadecimal
     * <p>
     * Ejemplo:
     * * <blockquote><pre>
     * long result = dec2hex("43")
     * // result = 2B
     * 
     * 
     * @param numero variable para almacenar el numero que nos pase el usuario
     * @param resto variable para almacenar el el resto del numero
     * @param String variable que almacena el resultado 
     * @return retorna el resultado final con la conversion de decimal a hexadecimal hecha
     */

    public static String dec2hex(int numero){
		int resto;
       	String resultado="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

	 	while(numero > 0){
            resto = numero%16;
            resultado += hex[resto];
            numero /= 16;
 		}
		return resultado;
	}

    /**
     * Este metodo aprovecha los dos anteriores para hacer uno nuevo que realize conversiones de binario a hexadecimal
     * <p>
     * Ejemplo:
     *  <blockquote><pre>
     * long result = bin2hex("10100101")
     * // result = A5
     * 
     * @param binaryNumber para indicar que estamos utilizando un nunmero binario
     * @return lo que retorna es el resultado final que da utilizando los dos metodos para realizar las conversiones necesarias
    */


    public static String bin2hex(String binaryNumber){
		return (dec2hex(bin2dec(binaryNumber)));
	}

}