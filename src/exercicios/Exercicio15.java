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
public class Exercicio15 {
/* Faça um programa em Java que receba um número e diga se este número está
 * no intervalo entre 100 e 200.
 */
       
    public static void main(String[] args) {
   Scanner r = new Scanner(System.in);
        System.out.println("digite um numero:");
     double nr = r.nextDouble();
      if(nr>=100 && nr<=200){
       System.out.println("O numero digitado  esta no intervali de 100 a 200");
   } else {
          System.out.println("O numero digitado nao foi encotrado no intervalo de 100 a 200");
      } 
   
   
    }
    
}
