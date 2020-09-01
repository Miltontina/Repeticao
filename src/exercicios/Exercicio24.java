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
public class Exercicio24 {
/*24. Faça um programa em Java que receba “N” números e mostre positivo, negativo ou zero para
 * cada número   
 */   
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("digite qualquer numero:");
        double num = r.nextDouble();
        if(num<0){
            System.out.println("O numero digitado e um nemero negativo");
        } if (num==0){
        System.out.println("O numero digitado e zero");
    } if (num>0){
        System.out.println("O numero digitado e um numero positivo");
    }     
    } 
}
