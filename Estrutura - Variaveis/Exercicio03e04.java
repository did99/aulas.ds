/**
 *
 * @author diana
 * 
 */

import java.util.Scanner;

public class Exercicio03e04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float salario, vendas, com, total;
        String nome;

        System.out.println("Digite seu nome: ");
        nome = sc.next();

        System.out.println("Digite seu salário fixo R$: ");
        salario = sc.nextInt();

        System.out.println("Digite o total de vendas efetuadas: ");
        vendas = sc.nextInt();

        com = (float) (vendas / 100) * 15;

        total = com + salario;

        System.out.println(
                "Seu nome é: " + nome + "\n" +
                "Seu salário fixo é = " + salario + "\n" +
                "Salário ao final do mês = " + total);
    }

}
