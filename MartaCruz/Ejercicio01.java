/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.util.Scanner;

/**
 *
 * @author mcpcm
 */
public class Ejercicio01 {

    public static int divisionEntera(int dvn, int dvs) {
        int resultado = 0;
        int suma = 0;
        int contador = 0;
        boolean salir = false;
        while (salir == false) {
            suma += dvs;
            contador += 1;
            if (suma > dvn) {
                contador -= 1;
                salir = true;
            }
        }
        resultado = contador;
        return resultado;
    }

    public static int restoDivisionEntera(int dvn, int div, int divEnt) {
        int resultado = 0;
        resultado = dvn - (div * divEnt);
        return resultado;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el dividendo: ");
        String argdividendo = sc.nextLine();
        int dividendo = Integer.parseInt(argdividendo);
        System.out.print("Introduzca el divisor: ");
        String argdivisor = sc.nextLine();
        int divisor = Integer.parseInt(argdivisor);

        System.out.println("Resultado: " + divisionEntera(dividendo, divisor));
        System.out.println("Resto: " + restoDivisionEntera(dividendo, divisor, divisionEntera(dividendo, divisor)));
    }

}
