/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Aluno CA
 */
public class ex06 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    
    int numero = 0;
        int numeromaior = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        
        while(x < 10){
            System.out.println("Digite um número: ");
            y = sc.nextInt(); 
        
            if(y > numero){
                y = numero;
                z = numero;
                
            }
            
            x++;
        }
        
        System.out.println("O maior número é: "+numeromaior+"\nO segundo maior número é: "+z);

     }
    
}
