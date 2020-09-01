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
public class Exercicio20 {
/*20.A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com
 *   desconto. Faça um programa em Java que calcule e exiba o valor do desconto e o valor a ser pago
 *   pelo cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até
 *   2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando
 *   desconto até que a resposta seja: “(N) Não” . Informar total de carros com ano até 2000 e total geral.
 */
    
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String resposta = "s";
        int totalDeCarrosAte2000= 0;
        double totalGeralAPagar = 0;
        do {
            System.out.println("Insira o preco do veiculo:");
            double preco = r.nextDouble();
            
            System.out.println("Insira o ano de fabrico do veiculo:");
            int ano = r.nextInt();
            
            double desconto = 0;
            if (ano > 2000){
             desconto = preco * 0.07;  
            } else{
              desconto = preco * 0.12;  
              totalDeCarrosAte2000++;
            }
            double valorAPagar = preco - desconto;
            totalGeralAPagar += preco - desconto; 
            
            System.out.println("Valor do desconto: " + desconto);
            System.out.println("Valor a ser pago: " + valorAPagar);
            System.err.println("Deseja continuar calculando (S/N):");
            resposta = r.next();
        
        } while(!resposta.endsWith("N"));
        
        System.out.println("========== Relatorio ==========\n");
        System.out.println("Total de carros com o ano ate 2000: " + totalDeCarrosAte2000 );
        System.out.println("Total geral: " + totalGeralAPagar );
        System.out.println("\n========== Fim Relatorio ==========");
    }
    
    
}
