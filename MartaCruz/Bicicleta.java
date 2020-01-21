/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author mcpcm
 */
public class Bicicleta {

    private String marca;
    private String modelo;
    private String color;
    private String tipo;
    private String nserie;
    private Componente[] componentes;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNserie() {
        return nserie;
    }

    public void setNserie(String nserie) {
        this.nserie = nserie;
    }

    public Componente[] getComponentes() {
        return componentes;
    }

    public void setComponentes(Componente[] componentes) {
        this.componentes = componentes;
    }

    public double getSumaPesoComponentes() {
        double suma = 0d;
        for (int i = 0; i < componentes.length; i++) {
            suma += componentes[i].getPeso();
        }
        return suma;
    }

}
