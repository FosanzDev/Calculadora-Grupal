package lib;

public class Convert {
    /**
     * In this method, we will pass from hex to dec. We request a hexadecimal number to pass it from decimal number
     * <p>
     * <blockquote><pre>
     * hex2dec("3F5");
     * //outputs 1013 
     * </blockquote></pre>
     * <p>
     * @param hex The hexadecimal number
     * @return The decimal number
     */
    public static int hex2dec(String hex) {
        String hexConstants = "ABCDEF";
        int res = 0;
        int decNum;
        int indx = 0;
        hex = hex.toUpperCase().trim();

        for (int i = hex.length()-1; i >= 0; i--) {
            char c = hex.charAt(i);
            if (c > '9') {
                decNum = 10 + hexConstants.indexOf(c);
            } else {
                decNum = c - '0';
            }  

            double operation = decNum * Math.pow(16,indx);
            res += operation;
            indx ++;
        }
        return res;
    }
    /**
     * In this method, we will pass from dec to bin. We request a decimal number to pass it from binary number
     * <blockquote><pre>
     * dec2bin(33);
     * //outputs 0010 0001
     * </blockquote></pre>
     * <p>
     * @param dec The decimal number
     * @return The binary number
     */
    public static String dec2bin(int dec) {
        int resto;
        StringBuilder binary = new StringBuilder();
        do {
            resto = dec % 2;
            dec /= 2;
            binary.append(resto);
        } while (dec != 0);
        return binary.reverse().toString();
    }
    /**
     * In this method, we will pass from hex to bin. We request a hexadecimal number to pass it from binary number, first passing it from hexadecimal to decimal and after decimal to binary number
     * <blockquote><pre>
     * hex2bin("3F5");
     * //outputs 0010 0001
     * </blockquote></pre>
     * @param hex (The hexadecimal number)
     * @return The binary number
     */
    public static String hex2bin(String hex) {
        return dec2bin(hex2dec(hex));
    }
}