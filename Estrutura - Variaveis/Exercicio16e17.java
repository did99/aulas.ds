/**
 *
 * @author diana
 * 
 */

import java.util.Scanner;

public class Exercicio16e17 {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int salario; 
    int reajuste; 

    System.out.println("Qual o seu salário mensal? ");
    salario = sc.nextInt();

    System.out.println("Qual o percentual de reajuste (apenas o número )? ");
            reajuste = sc.nextInt();

    int total = salario + (salario * reajuste / 100); 

    System.out.println("Seu novo salário é: " + total); 

    }
}
