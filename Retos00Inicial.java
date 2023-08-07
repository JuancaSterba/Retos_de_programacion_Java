import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Retos00Inicial {
    public static void main(String[] args) {

        // Reto # 0
        fizzBuzz();

        // Reto # 1
        System.out.println(anagrama("Anaconda","anaconda"));

        // Reto # 2
        fibonacci();

        // Reto # 3
        for (int i = 1; i <= 100; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }

        // Reto # 4
        List<Float> lados = Arrays.asList(5.0f, 4.0f, 7.0f);
        area(lados);

    }

    /**
     * Reto #0: EL FAMOSO "FIZZ BUZZ”
     *
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
     *
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
     *
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

    /**
     * Reto #3: ¿ES UN NÚMERO PRIMO?
     *
     * Escribe un programa que se encargue de comprobar si un número es o no primo.
     * Hecho esto, imprime los números primos entre 1 y 100.
     */

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) { // comprobando la raiz cuadrada optimizamos la función
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Reto #4: ÁREA DE UN POLÍGONO
     *
     * Crea una única función (importante que sólo sea una) que sea capaz
     * de calcular y retornar el área de un polígono.
     * - La función recibirá por parámetro sólo UN polígono a la vez.
     * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
     * - Imprime el cálculo del área de un polígono de cada tipo.
     */

    public static void area(List<Float> lados){
        if (lados.size() == 1){
            Float lado = lados.get(0);
            Float area = lado * lado;
            System.out.println("El área del cuadrado es: "+area);
        } else if (lados.size() == 2) {
            Float lado1 = lados.get(0);
            Float lado2 = lados.get(1);
            Float area = lado1 * lado2;
            System.out.println("El área del rectángulo es: "+area);
        } else if (lados.size() == 3) { // Se puede agregar algun tipo de confirmacion si es un triangulo
            Float lado1 = lados.get(0);
            Float lado2 = lados.get(1);
            Float lado3 = lados.get(2);
            double s = (lado1 + lado2 + lado3) / 2.0;
            double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3)); // fórmula de Herón
            System.out.println("El área del triángulo es: " + area);
        } else {
            System.out.println("El polígono es incorrecto");
        }
    }

}
