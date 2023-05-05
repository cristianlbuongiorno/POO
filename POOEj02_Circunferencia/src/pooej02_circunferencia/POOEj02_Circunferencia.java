/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej02_circunferencia;

import pooej02_circunferencia.CircunferenciaService.CircunferenciaService;
import pooej02_circunferencia.Entidades.Circunferencia;

/**
 *
 * @author crist
 */
public class POOEj02_Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar un objeto de tipo servicio para poder acceder al servicio
        CircunferenciaService circ = new CircunferenciaService();
        /*instanaciar el objeto donde voy a querer alojar el retorno de lo que se construyo en la clase de servivios para
        llenar sus atributos*/
        Circunferencia arPe = circ.crearCircunferencia();
        System.out.println(arPe);
    }

}
