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
public class Exercicio30 {
    /* 30. Faça um programa em Java que receba o nome a idade, o sexo e salário fixo de um funcionário.
     *  Mostre o nome e o salário líquido
     */
    
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
         
        System.out.println("Digite o nome do fucionario:");
        String nome = r.next();
        
        System.out.println("Digite a idade do fucionario:");
        int idade = r.nextInt();
        
        System.out.println("digite o sexo do funcionario (M/F):");
        String sexo = r.next();
        
        System.out.println("Digite o salario fixo do funcionario: \'" + nome + "\'" ); 
        double salario = r.nextDouble();
        
        double salarioLiquido = r.nextDouble();
        
        if (sexo.equalsIgnoreCase("M") && idade >= 30){
            salarioLiquido = salario + 100;
        }
        if (sexo.equalsIgnoreCase("M") && idade < 30){
            salarioLiquido = salario + 50;
        }
        if (sexo.equalsIgnoreCase("F") && idade >= 30){
            salarioLiquido = salario + 200;
        }
        if (sexo.equalsIgnoreCase("F") && idade < 30){
            salarioLiquido = salario + 80;
        }
        System.out.println("O nome do funcionario: " + nome );
        System.out.println("O salario liquido do funcionario " + nome + " e de:");
    }
}
