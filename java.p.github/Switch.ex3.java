/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;
/**
 *
 * @author Particular
 */
public class ex4 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("n1 - ");
         int n1 = sc1.nextInt();
        System.out.println("n2 - ");
         int n2 = sc1.nextInt();
         
         float media = (n1+n2)/2;
         float diferenca = n1-n2;
         if (diferenca < 0){
             diferenca = diferenca * -1; 
         }
         
         int produto = n1*n2;
         float divisao = n1/n2;
         
        System.out.println("Escolha dentre as opções abaixo: "
                + "\n 1 - Média "
                + "\n 2 - Diferença "
                + "\n 3 - Produto "
                + "\n 4 - Divisão \n");
        
        int opcao = sc1.nextInt();
        
        
        switch(opcao){
        
            case 1 : System.out.println("A Média dos dois números digitados é: " + media);
            break;
            case 2 : System.out.println("A Diferença dos dois números digitados é: " + diferenca);
            break;        
            case 3 : System.out.println("O Produto dos dois números digitados é: " + produto);
            break;        
            case 4 : System.out.println("A divisão do primeiro para o segundo é de : " + divisao);
            break;        
                    
        }
    }
}
