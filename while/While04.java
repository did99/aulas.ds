/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgwhile;

/**
 *
 * @author Aluno CA
 */

import java.util.Scanner;

public class While04 {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        int quantidade_aluno;
        int quantidade_notas;
        float media = 0;
        int alunos;
        
        System.out.println("Quantos alunos tem na sua sala? ");
        quantidade_aluno = sc.nextInt();
        
       alunos= quantidade_aluno; 
        
        while(quantidade_aluno > 0){
          
            System.out.println("Digite a nota do aluno: ");
            quantidade_notas = sc.nextInt();
               
                
            media = quantidade_notas + media;
            quantidade_aluno--;
         
            }
            double mediafinal = media/alunos;
            System.out.println("A média da sala é: " +mediafinal);
            
        }
     
     
               
        
        
       
                
                
        }
                
             
        
  

