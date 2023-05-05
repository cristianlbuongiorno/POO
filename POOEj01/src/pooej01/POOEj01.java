/*
1) Seguiremos trabajando sobre la clase Persona que creamos y ahora deberás sumarle 3 atributos
que creas pertinentes.
2) Volveremos a usar la clase Persona y vamos a crear objetos en tu Main utilizando los
constructores.
3) Continuaremos con nuestra clase Persona y vamos a primero crear los getter y setter y después
invocarlos desde el Main con alguno de los objetos que instanciaste.
 */
package pooej01;

import Entidad.Persona;
import Servicios.PersonaService;

/**
 *
 * @author crist
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonaService s1 = new PersonaService();
        Persona p1 = s1.crearPersona();

        System.out.println(p1);

    }

}
