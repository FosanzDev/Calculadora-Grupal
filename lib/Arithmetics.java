package lib;

public class Arithmetics{


/**
* Este método realizará una suma entre dos numeros decimales (debe haber mínimo un número decimal), los cuales introducirá el usuario.
* <p>
* Ejemplo:
* <blockquote><pre>
*
* sum (1.2, 2.3)
* res = 3.5
*
* </pre></blockquote>
* <p>
* @param num1 primer número decimal introducido para la operación suma.
* @param num2 segundo número decimal introducido para la operación suma.
* @return resultado en decimal de la suma de los dos números decimales introducidos previamente por el usuario.
*/
    public static double sum(double num1, double num2){
        double res=num1+num2;
        return res;
    }
/**
* Este método realizará una suma entre dos numeros enteros, los cuales introducirá el usuario.
* <p>
* Ejemplo:
* <blockquote><pre>
*
* sum (1, 2)
* res = 3
*
* </pre></blockquote>
* <p>
* @param num1 primer número entero introducido para la operación suma.
* @param num2 segundo número entero introducido para la operación suma.
* @return resultado de la suma de los dos números enteros introducidos previamente por el usuario.
*/
    public static int sum(int num1, int num2){
        int res=num1+num2;
        return res;
    }




/**
* Este método realizará una resta entre dos numeros decimales (debe haber mínimo un número decimal), los cuales introducirá el usuario.
* <p>
* Ejemplo:
* <blockquote><pre>
*
* rest (2.3, 1.2)
* res = 1.1
*
* </pre></blockquote>
* <p>
* @param num1 primer número decimal introducido para la operación resta.
* @param num2 segundo número decimal introducido para la operación resta.
* @return resultado en decimal de la resta de los dos números decimales introducidos previamente por el usuario.
*/
    public static double rest(double num1, double num2){
        double res=num1-num2;
        return res;
    }
/**
* Este método realizará una resta entre dos numeros enteros, los cuales introducirá el usuario.
* <p>
* Ejemplo:
* <blockquote><pre>
*
* rest (3, 2)
* res = 1
*
* </pre></blockquote>
* <p>
* @param num1 primer número entero introducido para la operación resta.
* @param num2 segundo número entero introducido para la operación resta.
* @return resultado de la resta de los dos números enteros introducidos previamente por el usuario.
*/
    public static int rest(int num1, int num2){
        int res = num1-num2;
        return res;
    }




/**
* Este método realizará una multiplicación entre dos numeros decimales (debe haber mínimo un número decimal), los cuales introducirá el usuario.
* <p>
* Ejemplo:
* <blockquote><pre>
*
* mult (2.1, 3.2)
* res = 6.72
*
* </pre></blockquote>
* <p>
* @param num1 primer número decimal introducido para la operación de multiplicación.
* @param num2 segundo número decimal introducido para la operación de multiplicación.
* @return resultado en decimal de la multiplicación de los dos números decimales introducidos previamente por el usuario.
*/
    public static double mult(double num1, double num2){
        double res=num1*num2;
        return res;
    }
/**
* Este método realizará una multiplicación entre dos numeros enteros, los cuales introducirá el usuario.
* <p>
* Ejemplo:
* <blockquote><pre>
*
* mult (2, 3)
* res = 6
*
* </pre></blockquote>
* <p>
* @param num1 primer número entero introducido para la operación de multiplicación.
* @param num2 segundo número entero introducido para la operación de multiplicación.
* @return resultado entero de la multiplicación de los dos números enteros introducidos previamente por el usuario.
*/
    public static int mult(int num1, int num2){
        int res=num1*num2;
        return res;
    }




/**
* Este método realizará una división entre dos numeros, los cuales introducirá el usuario.
* <p>
* Ejemplo:
* <blockquote><pre>
*
* div (8, 3)
* res = 2.66
*
* </pre></blockquote>
* <p>
* @param num1 primer número introducido para la operación de divisón.
* @param num2 segundo número introducido para la operación divisón.
* @return resultado en decimal de la divisón de los dos números decimales introducidos previamente por el usuario.
*/
    public static double div(double num1, double num2){
        double res=num1/num2;
        return res;
    }




/**
* Este método calculará el resto de la división entre dos numeros, los cuales introducirá el usuario.
* <p>
* Ejemplo:
* <blockquote><pre>
*
* resto (6, 3)
* res = 0
*
* </pre></blockquote>
* <p>
* @param num1 primer número introducido para la operación de divisón.
* @param num2 segundo número introducido para la operación divisón.
* @return resultado en decimal del resto de la divisón de los dos números decimales introducidos previamente por el usuario.
*/
      public static double resto(double num1, double num2){
        double res=num1%num2;
        return res;
    }


}