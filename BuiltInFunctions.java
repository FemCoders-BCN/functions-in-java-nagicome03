public class BuiltInFunctions {
    public static void main(String[] args) {

        //Ejecuta aquí todos los métodos creados e imprime en la terminal.
        printMessage("Hola");
        System.out.println(getLenght("Perro"));
        System.out.println(convertToLowercase("GATO"));
        System.out.println(findPrefix("Buenos dias", "Buenos"));
        System.out.println(replaceCharacters("Buenas tardes", 'a', 'e'));
        System.out.println(getsSquareRoot(9.2));
        System.out.println(getPower(2.0,4.0));
        System.out.println(getRandomNumber());
        System.out.println(maxNumber(4,7));



    }

        //Ejercicio 1:
        /**
         * Function name: printMessage
         * 
         * @param message (String)
         * 
         * Inside the function:
         * 1. Find a java built-in function that prints the message on the console.
        */

        // Escribe tu código aquí
        public static void printMessage(String message){
            System.out.println(message);
        }
    
        //Ejercicio 2:
        /**
         * Function name: getLength
         * 
         * @param message (String)
         * @return (int)
         * 
         * Inside the function:
         * 1. Find a built-in function that returns the length of a string.
         */

        // Escribe tu código aquí
        public static int getLenght(String message){
            return message.length();
        }

        //Ejercicio 3:
        /**
         * Function name: convertToLowercase
         * 
         * @param message (String)
         * @return (String)
         * 
         * Inside the function:
         * 1. Find a built-in function that converts a string to lowercase.
         */

        // Escribe tu código aquí
        public static String convertToLowercase(String message){
            return message.toLowerCase();
        }

        //Ejercicio 4:
        /**
         * Function name: findPrefix
         * 
         * @param message (String)
         * @param prefix (String)
         * @return (boolean)
         * 
         * Inside the function:
         * 1. Find a built-in function that checks if a string starts with a specified prefix.
         */

        // Escribe tu código aquí
        public static Boolean findPrefix(String message, String prefix){
            return message.startsWith(prefix);
        }

        //Ejercicio 5:
        /**
         * Function name: replaceCharacters
         * 
         * @param message (String)
         * @param oldChar (char)
         * @param newChar (char)
         * @return (String)
         * 
         * Inside the function:
         * 1. Find a built-in function that replaces all occurrences of a specified character in a string with another character.
         */

        // Escribe tu código aquí
        public static String replaceCharacters(String message, char oldChar, char newChar){
            return  message.replace(oldChar,newChar);
        }

        //Ejercicio 6:
        /**
         * Function name: getsSquareRoot
         * 
         * @param number (double)
         * @return (double)
         * 
         * Inside the function:
         * 1. Find a built-in function that calculates the square root of a number.
         */

        // Escribe tu código aquí
        public static double getsSquareRoot(double number){
            return Math.sqrt(number);
        }

        //Ejercicio 7:
        /**
         * Function name: getPower
         * 
         * @param base (double)
         * @param exponent (double)
         * @return (double)
         * 
         * Inside the function:
         * 1. Find a built-in function that calculates the power of a number.
         */

        // Escribe tu código aquí
        public static double getPower(double base, double exponent){
            return Math.pow(base, exponent);
        }

        //Ejercicio 8:
        /**
         * Function name: getRandomNumber
         *
         * @return (double)
         * 
         * Inside the function:
         * 1. Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
         */

        // Escribe tu código aquí
        public static double getRandomNumber(){
            return Math.random();
        }

        //Ejercicio 9:
        /**
         * Function name: maxNumber
         * 
         * @param number1 (int)
         * @param number2 (int)
         * @return (int)
         * 
         * Inside the function:
         * 1. Find a built-in function that returns the larger of two numbers.
         */

        // Escribe tu código aquí
        public static int maxNumber(int number1, int number2){
            return Math.max(number1,number2);
        }
    }