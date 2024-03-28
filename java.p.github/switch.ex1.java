/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc1 = new Scanner (System.in);
        
        int numeroproduto = sc1.nextInt();
        
        switch (numeroproduto){
            
            case 2,3,4:
                System.out.println("alimento perecivel");
                
            case 1:
                System.out.println("alimento nao perecivel");
                
            case 5,6 :
                System.out.println("vestuario");
                
            case 7:
                System.out.println("higiene pessoal");
                
            case 8,9,10,11,12,13,14,15:
                System.out.println("limpeza e utensilios domesticos");
                
                
                
                
                
        
        }
        
    }
    
}
