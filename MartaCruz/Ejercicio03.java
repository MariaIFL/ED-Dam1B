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
public class Ejercicio03 {

    public static void imprimirmatriz(char[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        String argumento = sc.nextLine();
        int n = Integer.parseInt(argumento);
        char[][] matriz = new char[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 'A';
                } else {
                    matriz[i][j] = '*';
                }
            }
        }
        imprimirmatriz(matriz);
    }
}
