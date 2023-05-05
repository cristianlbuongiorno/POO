/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej03_operacion.OperacionService;

import java.util.Scanner;
import pooej03_operacion.Entidades.Operacion;

/**
 *
 * @author crist
 */
public class OperacionService {

    public Operacion crearOperacionion() {

        Scanner leer = new Scanner(System.in);

        //instanciamos el obeto
        Operacion calculo = new Operacion();

        //pedimos los datos para los atributos
        System.out.println("Ingrese el primer número; ");
        calculo.setNum1(leer.nextDouble());
        System.out.println("Ingrese el segundo número: ");
        calculo.setNum2(leer.nextDouble());

        return calculo;
    }

    public void suma(Operacion calculo) {

        calculo.setSuma(calculo.getNum2() + calculo.getNum1());

    }

    public void resta(Operacion calculo) {

        calculo.setResta(calculo.getNum1() - calculo.getNum2());

    }

    public void multi(Operacion calculo) {

        calculo.setMulti(calculo.getNum1() * calculo.getNum2());

        if (calculo.getNum1() == 0 || calculo.getNum2() == 0) {
            System.out.println("Error. Alguno de sus números es 0.");

        }

    }

    public void divi(Operacion calculo) {

        calculo.setDivi(calculo.getNum1() / calculo.getNum2());

        if (calculo.getNum1() == 0 || calculo.getNum2() == 0) {
            System.out.println("Error. Alguno de sus números es 0.");

        }
    }

}
