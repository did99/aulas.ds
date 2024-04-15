/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgwhile;

/**
 *
 * @author Aluno CA
 */
public class While03 {
        
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero_usuario = 10;
        int numero = 0;
        
        while(numero < numero_usuario){
            if(numero%2 == 0){
                System.out.println(numero + " Número Par");
                numero++;
            }else {
                System.out.println(numero + " Número Impar");
                numero++;
            }
        }
    
}
    
}
