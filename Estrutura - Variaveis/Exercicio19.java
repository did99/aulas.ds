/**
 *
 * @author diana
 * 
 */

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double numero1; 
    double valorVendas; 
    double salario; 
    double valorCarro; 


    System.out.println("Qual a quantidade de carros vendidos ao mês? ");
            numero1 = sc.nextDouble();

    System.out.println("Qual o valor total de vendas? ");
            valorVendas = sc.nextDouble();

    System.out.println("Qual o seu salário fixo? ");
            salario = sc.nextDouble();

    System.out.println("Qual o valor que recebeu por carros vendidos? ");
            valorCarro = sc.nextDouble();


    double total = salario + valorVendas + (valorVendas*0.05) + valorCarro; 

    System.out.println("Seu salário ao final do mês é:  " + total);


    }
}
