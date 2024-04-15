/**
 *
 * @author diana
 * 
 */

import java.util.Scanner;
public class Exercicio20 {

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
    
            String sexo;
            String nome;
            Double altura;
    
            System.out.println("Digite seu sexo \n (f) para feminino (m) para masculino");
            sexo = sc.nextLine();
    
            System.out.println("Digite seu nome");
            nome = sc.nextLine();
    
            System.out.println("Digite sua Altura (cm)");
            altura = sc.nextDouble();
            altura = altura / 100;
            
            Double pesoIdeal;
    
            if (sexo == "m") {
                pesoIdeal = (72.7 * altura) - 58;
                System.out.println("Seu peso ideal é: " + pesoIdeal);
            }else {
                pesoIdeal = (62.1 * altura) - 44.7;
                System.out.println("Seu peso ideal é: " + pesoIdeal);
            }

    }
    
}
