/**
 *
 * @author diana
 * 
 */

import java.util.Scanner;

public class Exercicio18 {
    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double custoF; 

    System.out.println("Qual o custo de fábrica do seu carro?");
    custoF = sc.nextDouble();

    double custoC = custoF + (custoF * 0.28) + (custoF * 0.45); 

    System.out.println("O custo do consumidor é: " +custoC);
    }
}
