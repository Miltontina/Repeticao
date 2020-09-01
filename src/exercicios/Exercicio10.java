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
public class Exercicio10 {
   /* A loja Mamão com açúcar esta vendendo seus produtos em 5 (cinco) 
    * prestações sem juros.Faça um programa em Java que receba um valor de 
    * uma compra e mostre o valor das prestações .
    */
    
    
    public static void main(String[] args) {
            Scanner r = new Scanner(System.in);
            System.out.println("Qual e o valor do produto adquirido?:");
            double p = r.nextDouble();
            double parcela = p  / 5 ;
            System.out.println("Tera de pagar 5 prestacoes de  " + parcela + "MT");
    }
    
}
