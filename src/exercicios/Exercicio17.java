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
i */
public class Exercicio17 {
/* Ler 80 números e ao final informar quantos número(s) est(á)ão no 
 * intervalo entre 10 (inclusive) e  150 (inclusive).
 */    
  
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int cc = 0;
         while (cc<80) {
            System.out.println("Digite um numero:");
            int nr =r.nextInt();
            if(nr>=10 && nr<=150){
                System.out.println("O numero " + nr + " esta no intervalo de 10 a 150 inclusive");
            } else { 
                System.out.println("O numero " + nr + " nao esta no ivervalo de 10 a 150 inclusive");
            } 
               
         }
         }
}