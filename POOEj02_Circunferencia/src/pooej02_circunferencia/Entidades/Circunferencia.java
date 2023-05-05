/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej02_circunferencia.Entidades;

/**
 *
 * @author crist
 */
public class Circunferencia {

    //atributos
    private float radio;
    private float area;
    private float perimetro;

    //crear constructor defualt
    public Circunferencia() {
    }

    //crear constructor con parametros
    public Circunferencia(float radio, float area, float perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }

    //crear get & set
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    //crear toString
    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

}
