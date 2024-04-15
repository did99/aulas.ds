/**
 *
 * @author diana
 * 
 */

import java.util.Scanner;

public class Exercicio09e10 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int dist;
        double consumo;
        
        System.out.println("Digite em km a distância percorrida: ");
        dist = sc.nextInt();
        
        System.out.println("Digite a média de consumo km/l: ");
        consumo = sc.nextInt();
        
        double total = dist/consumo; 
        double gasto = total * 5.58;

        System.out.println("A quantidade de gasolina e = "+total + "\n" + "O preço gasto é = " +gasto);

    }
}
