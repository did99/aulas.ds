/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgwhile;

/**
 *
 * @author Aluno CA
 */
public class While02 {
    
     public static void main(String[] args) {
        // TODO code application logic here
         
        int num = 0; 
        int numPar= 0;
    
        while(num <= 100){   
            if(num%2 == 0){
               numPar= num;
               System.out.println("Os números pares compreendidos entre 0 e 100: " +numPar);
               num++; 
           }else {
                   num++;
               }
           }
    
}
     
}
