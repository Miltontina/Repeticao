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
public class Exercicio18 {
/*/* Faça um programa em Java que receba a idade de 75 pessoas e mostre 
   * mensagem informando “maior de idade” e “menor de idade” para cada pessoa.
   * Considere a idade a partir de 18 anos como maior de idade.
   */
   
    public static void main(String[] args) {
     Scanner r = new Scanner(System.in);
     int cc = 0;
             while (cc< 75){
        System.out.println("Em que ano voce nasceu:");
     int nasc = r.nextInt();
     int idade = 2020 - nasc;
        System.out.println("A sua idade e " + idade);
     if(idade>18){
         System.out.println("Maior de idade");
     } else {
         System.out.println("Menor de idade");
     }
        }
    }
    }
