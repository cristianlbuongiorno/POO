/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej03_operacion.Entidades;

/**
 *
 * @author crist
 */
public class Operacion {

    //creamos atributos
    private double num1;
    private double num2;
    private double suma;
    private double resta;
    private double multi;
    private double divi;

    //creamos constructores
    public Operacion() {
    }

    //creamos constructores con atributos
    public Operacion(double num1, double num2, double suma, double resta, double multi, double divi) {
        this.num1 = num1;
        this.num2 = num2;
        this.suma = suma;
        this.resta = resta;
        this.multi = multi;
        this.divi = divi;
    }

    //creamos get and set
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double getResta() {
        return resta;
    }

    public void setResta(double resta) {
        this.resta = resta;
    }

    public double getMulti() {
        return multi;
    }

    public void setMulti(double multi) {
        this.multi = multi;
    }

    public double getDivi() {
        return divi;
    }

    public void setDivi(double divi) {
        this.divi = divi;
    }

    //creamos toString
    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + ", suma=" + suma + ", resta=" + resta + ", multi=" + multi + ", divi=" + divi + '}';
    }

}
