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
public class Ejercicio02 {

    public static String palindromo(char[] a, char[] b) {
        String resultado = "";
        int contador = 0;
        if (a.length != b.length) {
            resultado = "No es palíndromo";
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    contador += 1;
                } else {
                    contador = 0;
                }
            }
            if (contador == a.length) {
                resultado = "Sí es palíndromo";
            } else {
                resultado = "No es palíndromo";
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String argumento = sc.nextLine();
        char[] array_palabra = argumento.toCharArray();
        char[] array_palindromo = new char[argumento.length()];
        int j = 0;
        for (int i = argumento.length() - 1; i >= 0; i--) {
            array_palindromo[j] = array_palabra[i];
            j += 1;
        }
        System.out.println(palindromo(array_palabra, array_palindromo));
    }
}
