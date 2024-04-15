/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

/**
 *
 * @author Aluno CA
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int num = 0; 
        int numImpar= 0;
        
        
        
        while(num <= 100){
            if(num%2 == 1){
            numImpar = num;
            System.out.println("Os números ímpares compreendidos entre 0 e 100: " +numImpar);
            num++; 
        }else {
                num++;
            }
        }
    }
    
}
