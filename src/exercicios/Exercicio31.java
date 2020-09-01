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
public class Exercicio31 {
    /*31. Escrever um programa em Java que leia três valores inteiros
     *    distintos e os escreva em ordem crescente.
     */
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        
        System.out.println("Insira o primeiro numero: ");
        int num1 = r.nextInt();
        
        System.out.println("IInsira o segundo numero: ");
        int num2 = r.nextInt();
        
        System.out.println("Insira o terceiro numero: ");    
        int num3 = r.nextInt();
        
        int auxiliar = num1;
        
        if (num2 < auxiliar){
            num1 = num2;
            num2 = auxiliar;
            auxiliar = num1;
        }
        if(num3 < num1) {
            num1 = num3;
            num3 = auxiliar;
        }
        if (num3 < num2){
         num3 = num2 ;
         num2 = num3;
        }
        System.out.println("Valores em ordem:(1a" + num1 + " )(2a" + num2 + ")(3a" + num3 + ")");
    }
}
