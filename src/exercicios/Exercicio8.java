
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Milton Junior
 */
public class Exercicio8 {

    public static void main(String[] args) {
       /*Elaborar um programa em Java que efetue  a apresentação do valor da conversão
        * em real(R$) de um valor lido em dólar (US$) . O programa em Java devera solicitar
        * o valor da cotação em dólar e também a quantidade de dólares disponíveis com o
        * usuário 
        */
                
        Scanner s = new Scanner(System.in);
        System.out.println("Conversor de Dolares em Reais!");
        System.out.print("Quantos dolares deseja converter?: US$");
        double dolares  = s.nextDouble();
        
        double conversao = dolares * 2.20 ;
        System.out.println("Podera ter " + conversao + " Reais ");
        
    }
   }
    
