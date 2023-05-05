/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author crist
 */
public class PersonaService {

    public Persona crearPersona() {

        Persona p1 = new Persona();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese su nombre completo: ");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese su apellido: ");
        p1.setApellido(leer.nextLine());
        System.out.println("Ingrese su edad: ");
        p1.setEdad(leer.nextInt());

        return p1;

    }

}
