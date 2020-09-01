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
public class Exercicio28 {
/* 28. Escrever um programa em Java para uma empresa que decide dar um reajuste a seus 584
 *     funcionários de acordo com os seguintes critérios:
 *     a) 50% para aqueles que ganham menos do que três salários mínimos;
 *     b) 20% para aqueles que ganham entre três até dez salários mínimos;
 *     c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
 *     d) 10% para os demais funcionários.
 *    Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
 *     Calcule o seu novo salário reajustado. Escrever o nome do funcionário, 
 *     o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento.
  */
    public static double reajustarSalario(double salarioActual , double salarioMinimo ){
    
    //a)    
        if(salarioActual < (salarioMinimo * 3) ){
            return salarioActual + ( salarioActual * 0.5) ;
       }
        
    //b)
        if(salarioActual >= (salarioMinimo * 3) && salarioActual <= (salarioMinimo * 10) ){
            return salarioActual + ( salarioActual * 0.2) ;
       }        
    
    //c)
        if(salarioActual > (salarioMinimo * 10) && salarioActual <= (salarioMinimo * 20) ){
            return salarioActual + ( salarioActual * 0.15) ;
       }         
        
     return salarioActual + ( salarioActual * 0.1) ;
 
    }
    
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int totalFuncionarios = 2;
        
        String[] nomes = new String[totalFuncionarios];
        double[] salarios = new double[totalFuncionarios];
        double[] salariosReajustados = new double[totalFuncionarios];
       
        System.out.println("Insira o salario minimo:");
        double salarioMinimo = r.nextDouble();
        
        for (int i = 0; i < totalFuncionarios; i++) {
            System.out.println("Insira o nome do ["+(i + 1)+"a] funcionario" );
            nomes[i] = r.next();
            
            System.out.println("Insira o salario do ["+(i + 1)+"a] funcionario" );
            salarios[i] = r.nextDouble();
            
            salariosReajustados[i] = reajustarSalario(salarios[i] , salarioMinimo);
            
        }
        
        double totalAumentoSalarioNaFolha = 0;
        for (int i = 0; i < totalFuncionarios; i++) {
            System.out.println("O funcionario " +( nomes[i] ) + " antes recebia (" + salarios[i] + ") , ele agora passa a receber (" + salariosReajustados[i]  + ")");  
            
            totalAumentoSalarioNaFolha += salariosReajustados[i] - salarios[i]; 
        }
        System.out.println("Total de aumento na e: " + totalAumentoSalarioNaFolha );
    
    }
    
   
}
