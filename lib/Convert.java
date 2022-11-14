package lib;
public class Convert {
    /**
     * In this function will return the {@code binary}number and request a {@code String}
     * <p>
     * Example: 
     * <blockquote><pre>
     * bin2dec("001011")
     * res = binaryNumber.charAt(i) * Math.pow(2, i)
     * //i is the times that the code travel until i arrives at the length of the String
     * //2 is the number that is multiplied 
     * </pre></blockquote>
     * <p>
     * @param binaryNumber (String that is a binary number)
     * @return res (The decimal number)
     */
    public static int bin2dec(String binaryNumber) {
        int res = 0;
        int resOperation = 0;
        for (int i = 0; i < binaryNumber.length(); i ++) {
            char c = binaryNumber.charAt(i);
            if (c == '1') {
                int num = Character.getNumericValue(c);
                double operation = num * Math.pow(2, i);
                resOperation = (int) operation;
                res += operation;
            }
        }
        return res;
    }
    /**
     * In this function, it will return a {@code decimal} that before was an {@code hexadecimal} number
     * <p>
     * Example: 
     * <blockquote><pre>
     * hex2dec("3F5");
     * //outputs 3155 because : 3 ---> 3 | F ---> 15 | 5 ---> 5
     * //And all of this numbers go to String res, that then, will be output
     * </blockquote></pre>
     * @param hexNumber (The character in hexadecimal)
     * @return res (That is the result of the decimal number)
     */
    public static String hex2dec(String hexNumber) {
        String hexConstants = "ABCDEF";
        String res = "";
        int decNum;

        for (int i = 0; i < hexNumber.length(); i ++) {
            decNum = 0;
            char c = hexNumber.charAt(i);
            if (c > '9') {
                decNum = 10 + hexConstants.indexOf(c);
            } else {
                decNum = c - '0';
            }
            res += decNum;
        }
        return res;
    }
}