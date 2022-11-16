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


    public static String bin2hex(String binaryNumber){
		return (dec2hex(bin2dec(binaryNumber)));
	}

}