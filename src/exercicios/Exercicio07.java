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
public class Exercicio07 {
    public static void main(String[] args) {
    /* Ler uma temperatura em graus Celsius e apresenta-la convertida em
     *graus Fahrenheit . A formula de conversão e F=(9*C+160)/5 , sendo F a 
     *temperatura em Fahrenheit e C a temperatura em Celsius .
     */    
                
        Scanner s = new Scanner(System.in);
        System.out.println("conversor de temperatura de Celsius para Fahrenheit");
        System.out.println("Digite a temperatura em graus Celsius:");
        double C = s.nextDouble();
        double covernsor = (9*C+160)/5;
        System.out.println("A temperatura em Graus Fahrenheit e de " + covernsor + " Graus " );
    }
    
}
