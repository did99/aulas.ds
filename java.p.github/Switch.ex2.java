/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ex3;

import java.util.Scanner;

/**
 *
 * @author Particular
 */
public class Ex3{

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        float N1 = sc1.nextFloat();
        float N2 = sc1.nextFloat();
        
        float media = (N1+N2)/2;
        
        System.out.println(media);
        
        if  (media < 4) {
            System.out.println("Repovado");
            }
        else if (media > 4.1 && media < 7){
            System.out.println("Exame");
        }
        else if (media > 7.1 && media <= 10){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Digite notas válidas!");
        }
        
    }
}

