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
public class Exercicio16 {
    public static void main(String[] args) {
    /* Escrever um programa em Java que leia o nome e as três notas obtidas 
     * por um aluno durante o semestre. Calcular a sua média (aritmética),
     * informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5)
     * e Recuperação (media entre 5.1 a 6.9). 
     */    
                
        Scanner r = new Scanner(System.in);
        System.out.print("Digite o nome do aluno:");
        String C = r.nextLine();
        System.out.println("Digete a primeira nota de " + C);
        double num1 = r.nextDouble();
        System.out.println("Digete a segunda nota de " + C);
        double num2 = r.nextDouble();
        System.out.println("Digete a terceira nota de " + C);
        double num3 = r.nextDouble();
        double media = (num1+num2+num3)/3;
        System.out.printf(" A media de " + C + " e de %.2f \n " , media);
        if (media >= 7) {
            System.out.printf("Parabens o aluno " + C + " Foi aprovado com %.2f " , media);
        }
        if (media <= 5) {
            System.out.printf("Infelismente o aluno " + C + " foi reprovado com %.2f" , media);
        }
        if (media >= 5.1 && media <= 6.9 ) {
            System.out.printf("Infelismente o aluno " + C + " vai a recuperacao com %.2f \n " , media )  ;
        } 
    }
    
}
