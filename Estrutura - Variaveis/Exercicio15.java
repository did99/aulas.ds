/**
 *
 * @author diana
 * 
 */
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int totalV;
    int votoB; 
    int votoN; 
    int votoV;

    System.out.println("Qual o total de eleitores?");
            totalV = sc.nextInt();

    System.out.println("Qual o total de votos brancos?");
            votoB = sc.nextInt();

    System.out.println("Qual o total de votos nulos?");
            votoN = sc.nextInt();

    System.out.println("Qual o total de votos válidos?");
            votoV = sc.nextInt();

    int resultB = (totalV/100)*votoB;
    int resultN = (totalV/100)*votoN;
    int resultV =  (totalV/100)*votoV; 

    System.out.println("O percentual de votos brancos  em relação ao total é: " + resultB + "\n" + "O percentual de votos nulos  em relação ao total é: " + resultN + "\n" +  "O percentual de votos válidos  em relação ao total é: " + resultV);
        

}
    
}
