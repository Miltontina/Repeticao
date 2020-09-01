/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Milton Junior
 */
public class exercicio14 {
   /* 14. Escrever um programa em Java que leia dois valores
    * inteiro distintos e informe qual é o maior.
    */
    
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Digite o primeiro valor inteiro:");
        int n1 = r.nextInt();
        System.out.println("Digite o segundo valor inteiro:");
        int n2 = r.nextInt();
     int maior = n1 > n2 ? n1:n2;
        System.out.println("O numero " + maior + " e o maior " );
   
        
        
       
    }
}
