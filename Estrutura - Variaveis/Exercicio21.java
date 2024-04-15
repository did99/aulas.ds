/**
 *
 * @author diana
 * 
 */

 import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double valorTotal;
        
        System.out.println("Digite o valor do Alcool");
        Double valorAlcool = sc.nextDouble();

        System.out.println("Digite a quantidade do Alcool");
        Double quantidadeAlcool = sc.nextDouble();

        System.out.println("Digite o valor da Gasolina");
        Double valorGasolina = sc.nextDouble();

        System.out.println("Digite a quantidade de Gasolina");
        Double quantidadeGasolina = sc.nextDouble();

        if(quantidadeAlcool <= 20){
            valorTotal = valorAlcool - ((valorAlcool * 3) / 100);
            System.out.println("O valor total a se pagar pelo alcool é de: " + valorTotal + "R$");
        }else if(quantidadeAlcool > 20){
            valorTotal = valorAlcool - ((valorAlcool * 5) / 100);
            System.out.println("O valor total a se pagar pelo alcool é de: " + valorTotal + "R$");
        }

        if(quantidadeGasolina <= 20){
            valorTotal = valorGasolina - ((valorGasolina * 4) / 100);
            System.out.println("O valor total a se pagar pela gasolina é de: " + valorTotal + "R$");
        }else if(quantidadeGasolina > 20){
            valorTotal = valorGasolina - ((valorGasolina * 6) / 100);
            System.out.println("O valor total a se pagar pela gasolina é de: " + valorTotal + "R$");
        }
    }
}
