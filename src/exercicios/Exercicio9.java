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
public class Exercicio9 {
/* Faça um programa em Java que receba um valor que foi depositado
 * e exiba o valor com rendimento apos 1 mês .  considere fixo o juro
 * da poupança em 0,70 %a.m.
 */    
    
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Digite o valor do deposito:");
        int x =r.nextInt();
       double valordepositado = (x*0.7) ;
        System.out.println("Apos 1 mes tera um rendimento de " + valordepositado + "Mt");
      
    }
    
}
