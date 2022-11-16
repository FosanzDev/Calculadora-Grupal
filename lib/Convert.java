package lib;

public class Convert{

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
    
}