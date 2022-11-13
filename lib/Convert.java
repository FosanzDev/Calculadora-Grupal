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
}