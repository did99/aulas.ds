/**
 *
 * @author diana
 * 
 */

import java.util.Scanner;

public class Exercicio12 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int valor;
        
        System.out.println("Digite um valor: ");
        valor = sc.nextInt();
        
        int antecessor = valor - 1;
        
        System.out.println("O antecessor desse número é: "+ antecessor);
        
    }
}
