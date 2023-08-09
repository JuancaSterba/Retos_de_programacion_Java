package org.juancasterba.retos00;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Reto #5: ASPECT RATIO DE UNA IMAGEN
 *
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
 * - Url de ejemplo: https://raw.githubusercontent.com/mouredev/
 *   mouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
 *   imagen de 1920*1080px.
 */

public class Reto05 {

    public static int mcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static String formatRelacionAspecto(int width, int height){
        int valorMCD = mcd(width, height);
        int widthFormateado = width / valorMCD;
        int heightFormateado = height / valorMCD;
        return widthFormateado + ":" + heightFormateado;
    }

    public static void relacionAspecto(String url){
        try{
            URL urlImagen = new URL(url);
            BufferedImage imagen = ImageIO.read(urlImagen);

            if (imagen == null) {
                System.out.println("No se pudo leer la imagen desde la URL: " + url);
                return;
            }

            int width = imagen.getWidth();
            int height = imagen.getHeight();
            String relacionAspectoFormateada = formatRelacionAspecto(width, height);

            System.out.println("Datos de la imagen:");
            System.out.println("Ancho: " + width);
            System.out.println("Alto: " + height);
            System.out.println("Relación de aspecto: " + relacionAspectoFormateada);

        } catch (MalformedURLException e) {
            System.out.println("URL de imagen inválida: " + url);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer la imagen desde la URL: " + url);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String urlImagen = "https://cdn.appuals.com/wp-content/uploads/2021/12/1920x1080.png";
        relacionAspecto(urlImagen);

    }

}
