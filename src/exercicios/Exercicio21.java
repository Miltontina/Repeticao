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
public class Exercicio21 {
   /* 21. Escrever um programa em Java que leia os dados de “N” pessoas
    * (nome, sexo, idade e saúde)e informe se está apta ou não para cumprir
    * o serviço militar obrigatório. Informe os totais.
    */
    
    public static void main(String[] args) {
     
        Scanner r = new Scanner(System.in);
        System.out.println("insira o numero total de pessoas que deseja verificar o seu estado de saude:");
        int N = r.nextInt();
        int totalAptos = 0;
        int totalNaoaAptos = 0;
        for (int i = 0; i < N; i++) {
       System.out.println("Por favor digite o seu nome:");
       String nome = r.next();
        
       System.out.println("Qual e o seu genero?(M/F):");
       String sexo = r.next();
       
       System.out.println("por favor " + nome + " digite a sua idade ");
       int idade = r.nextInt();
       
       System.out.println("Qual e o seu estado de saude?(Bem(B) Nao bem(NB)):");  
       String saude = r.next();
      
       if ( saude.equalsIgnoreCase("B") && idade >=18){
           System.out.println("O/A " + nome + " esta apta para o servico militar obrigatorio");
           
          }else{
           System.out.println("O/A " + nome + " nao esta apta para o servico militar obrigatorio");
       }
       
       
        if( saude.equalsIgnoreCase("B") && idade >=18){
         totalAptos ++;  
       } else {
           totalNaoaAptos ++;
       }
           
     }
           System.out.println("========== Totais ==========");
            
            System.out.println("Total de pessoas:" + N );
            System.out.println("Total aptos:" + totalAptos);
            System.out.println("Total nao aptos:" + totalNaoaAptos);
            
            System.out.println("==========FimTotais==========");
        
        }
    }          
    
                