/**
 *
 * @author diana
 * 
 */

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float distanciaP, combustivel, media;

        System.out.println("Qual a distância total percorrida pelo automóvel em km: ");
        distanciaP = sc.nextInt();
        System.out.println("Qual o total de combustível gasto em litros? ");
        combustivel = sc.nextInt();

        media = combustivel / distanciaP;

        System.out.println("A média de consumo desse automóvel é: " + media);

    }

}
