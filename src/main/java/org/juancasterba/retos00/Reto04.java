package org.juancasterba.retos00;

import java.util.Arrays;
import java.util.List;

public class Reto04 {

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

    public static void main(String[] args) {

        List<Float> lados = Arrays.asList(5.0f, 4.0f, 7.0f);
        area(lados);

    }

}
