/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej03_operacion;

import pooej03_operacion.Entidades.Operacion;
import pooej03_operacion.OperacionService.OperacionService;

/**
 *
 * @author crist
 */
public class POOEj03_Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionService op1 = new OperacionService();
        Operacion re = op1.crearOperacionion();
        op1.suma(re);
        op1.resta(re);
        op1.multi(re);
        op1.divi(re);

        System.out.println(re);
    }

}
