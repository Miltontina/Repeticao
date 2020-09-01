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
public class Exercicio23 {
/*23. Faça um programa em Java que receba um número e mostre uma mensagem caso este número
sege maior que 80, menor que 25 ou igual a 40.*/
    
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("digite um numero:");
        double num =r.nextDouble();
        
        if (num>80 || num<25 || num==40){
            System.out.println("mostrei a mensagem");
        } else{
            
        }
    }
    
    
}
