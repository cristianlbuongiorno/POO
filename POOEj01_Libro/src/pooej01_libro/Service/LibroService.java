/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01_libro.Service;

import java.util.Scanner;
import pooej01_libro.Entidades.Libro;

/**
 *
 * @author crist
 */
public class LibroService {

    public Libro crearLibro() {
        //.useDelimiter("\n"); se utiliza para que al momento de leer un String te permita utilizar espacios.
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //instanciamos el objeto
        Libro lb = new Libro();
        //pedimos los valores correspondientes a cada atributo.
        System.out.println("Ingrese el código ISBN: ");
        lb.setIsbn(leer.nextInt());
        System.out.println("Ingrese el nro de páginas: ");
        lb.setPaginas(leer.nextInt());
        System.out.println("Ingrese el título del libro: ");
        lb.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro: ");
        lb.setAutor(leer.next());

        return lb;
    }

}
