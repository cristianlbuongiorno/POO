/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01_libro;

import pooej01_libro.Entidades.Libro;
import pooej01_libro.Service.LibroService;

/**
 *
 * @author crist
 */
public class POOEj01_Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar un objeto de tipo servicio para poder acceder al servicio
        LibroService ls = new LibroService();
        /*instanaciar el objeto donde voy a querer alojar el retorno de lo que se construyo en la clase de servivios para
        llenar sus atributos*/
        Libro l1 = ls.crearLibro();
        System.out.println(l1);
    }

}
