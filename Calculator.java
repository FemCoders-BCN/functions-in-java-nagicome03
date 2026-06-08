public class Calculator {
    
    public static void main(String[] args) {

        //Ejecuta aquí todos los métodos creados e imprime en la terminal. 
        System.out.println(sumDoubles(2.5,2.5));
        System.out.println(substractDoubles(5.3,0.3));
        System.out.println(multiplyDoubles(2.4,3.2));
        System.out.println(divideDoubles(10.2, 5.2));
    }

    //Define los métodos basándote en su doc comment.

    //Ejercicio 1:
    /**
     * Function name: add
     * 
     * @param number1 (double) 
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. sum 2 numbers
     */

    public static double sumDoubles(double number1, double number2){
        return number1+number2;
    }
    

     //Ejercicio 2:
    /**
     * Function name: subtract
     *
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. subtract 2 numbers
     */

    public static double substractDoubles(double number1, double number2){
        return number1-number2;
    }

    //Ejercicio 3:
    /**
     * Function name: multiply
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. multiply 2 numbers
     */

    public static double multiplyDoubles(double number1, double number2){
        return number1*number2;
    }

    //Ejercicio 4:
    /**
     * Function name: divide
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. divide 2 numbers
     */

    public static double divideDoubles(double number1, double number2){
        return number1/number2;
    }

}
