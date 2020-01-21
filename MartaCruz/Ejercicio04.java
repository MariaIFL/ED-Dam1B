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
public class Ejercicio04 {

    public static void main(String[] args) {
        Componente rueda = new Componente();
        rueda.setNombre("ruedas");
        rueda.setPeso(2.0125);
        Componente freno = new Componente();
        freno.setNombre("frenos");
        freno.setPeso(0.275);
        Componente manillar = new Componente();
        manillar.setNombre("manillar");
        manillar.setPeso(1.050);
        Componente pedal = new Componente();
        pedal.setNombre("pedal");
        pedal.setPeso(0.340);
        Componente[] componentes_bici = {rueda, freno, manillar, pedal};

        Bicicleta bici = new Bicicleta();
        bici.setMarca("Speedus");
        bici.setModelo("X-120");
        bici.setColor("Azul");
        bici.setTipo("Montaña");
        bici.setNserie("683");
        bici.setComponentes(componentes_bici);

        System.out.println("El peso de los total de los componentes es: " + bici.getSumaPesoComponentes() + " kilogramos.");
    }

}
