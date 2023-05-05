/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej04_rectangulo;

import pooej04_rectangulo.Entidad.Rectangulo;
import pooej04_rectangulo.RectanguloService.RectanguloService;

/**
 *
 * @author crist
 */
public class POOEj04_Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        RectanguloService s1 = new RectanguloService();
        Rectangulo r1 = s1.crearRectangulo();

        s1.superficie(r1);

        s1.perimetro(r1);

        s1.graficaRectangulo(r1);

        System.out.println(r1);
    }
}
