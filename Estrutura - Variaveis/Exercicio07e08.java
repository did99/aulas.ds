/**
 *
 * @author diana
 * 
 */

import java.util.Scanner;

public class Exercicio07e08 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double combustivel;
        double consumo;
        
        System.out.println("Digite o custo de combustìvel: ");
        combustivel = sc.nextInt();

        System.out.println("Digite a média de consumo: ");
        consumo = sc.nextInt();
        
        double media = combustivel/consumo; 
        
        System.out.println("O custo estimado é: " +media+"km/l");
        
    }
}
