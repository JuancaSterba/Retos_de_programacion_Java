import java.util.Arrays;

public class Retos00Inicial {
    public static void main(String[] args) {

        // Reto # 0
        fizzBuzz();

        // Reto # 1
        System.out.println(anagrama("Anaconda","anaconda"));

        // Reto # 2
        fibonacci();

    }

    /**
     * Reto #0: EL FAMOSO "FIZZ BUZZ”
     * Escribe un programa que muestre por consola (con un print) los
     * números de 1 a 100 (ambos incluidos y con un salto de línea entre
     * cada impresión), sustituyendo los siguientes:
     * - Múltiplos de 3 por la palabra "fizz".
     * - Múltiplos de 5 por la palabra "buzz".
     * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
     */
    private static void fizzBuzz() {
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * Reto #1: ¿ES UN ANAGRAMA?
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     *   las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagrama.
     */
    public static boolean anagrama(String palabra1, String palabra2){
        if (!palabra1.equalsIgnoreCase(palabra2)) {
            char[] letrasPalabra1 = palabra1.toLowerCase().toCharArray();
            char[] letrasPalabra2 = palabra2.toLowerCase().toCharArray();

            Arrays.sort(letrasPalabra1);
            Arrays.sort(letrasPalabra2);

            return Arrays.equals(letrasPalabra1, letrasPalabra2);
        } else {
            return false;
        }
    }

    /**
     * Reto #2: LA SUCESIÓN DE FIBONACCI
     * Escribe un programa que imprima los 50 primeros números de la sucesión
     * de Fibonacci empezando en 0.
     * - La serie Fibonacci se compone por una sucesión de números en
     *   la que el siguiente siempre es la suma de los dos anteriores.
     *   0, 1, 1, 2, 3, 5, 8, 13...
     */

    public static void fibonacci(){
        long anterior = 0;
        long siguiente = 1;
        for (int i = 0; i < 50; i++){
            System.out.println(anterior);
            long suma = anterior + siguiente;
            anterior = siguiente;
            siguiente = suma;
        }
    }

}
