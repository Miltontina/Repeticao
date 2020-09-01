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
public class Exercicio13 { 
    /* Faça um programa em Java que receba um número e mostre uma 
     * mensagem caso este número seja maior que 10
     */ 
   
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Didite um numero compativel:");
        float nr = r.nextFloat();
        if (nr > 10) {
            System.out.println("O numero digitado e compativel!");
        } else {
            System.out.println("O numero digitado nao e compativel!");
        }
    }
    
}
