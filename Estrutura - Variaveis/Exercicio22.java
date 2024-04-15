/**
 *
 * @author diana
 * 
 */
 import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double valorGasolina = 3.30;
        double valorAlcool = 2.90;
        double valorTotal;
        boolean sairLoop = false;

        System.out.println("Digite o combustivel utilizado \n (g) para gasolina \n (a) para alcool" );
        String combustivel = sc.next();

        while (sairLoop) {
            System.out.println("Valor inválido!! Digite \n (g) para gasolina \n (a) para alcool" );
            combustivel = sc.next();
            if(combustivel.contentEquals("g") || combustivel.contentEquals("a")){
                sairLoop = true;
            }
        }

        System.out.println("Digite a quantidadede de litros vendidos");
        double litrosVedidos = sc.nextDouble();

        if (combustivel.contentEquals("a")) {
            valorTotal = valorAlcool * litrosVedidos;
            System.out.println("O valor total do alcool foi de: " + valorTotal + "R$");
        }else {
            valorTotal = valorGasolina * litrosVedidos;
            System.out.println("O valor total da gasolina foi de: " + valorTotal + "R$");
        }

    }
}
