/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej02_circunferencia.CircunferenciaService;

import java.util.Scanner;
import pooej02_circunferencia.Entidades.Circunferencia;

/**
 *
 * @author crist
 */
public class CircunferenciaService {

    public Circunferencia crearCircunferencia() {

        //.useDelimiter("\n"); se utiliza para que al momento de leer un String te permita utilizar espacios.
        Scanner leer = new Scanner(System.in);
        //instanciamos el objeto
        Circunferencia ra = new Circunferencia();
        //pedimos los valores conrrespondientes
        System.out.println("Ingrese el radio de la circunferencia: ");
        ra.setRadio(leer.nextFloat());

        float area = (float) (Math.PI * Math.pow(ra.getRadio(), 2));
        ra.setArea(area);
        float perimetro = (float) (2 * Math.PI * ra.getRadio());
        ra.setPerimetro(perimetro);

        return ra;
    }
}
