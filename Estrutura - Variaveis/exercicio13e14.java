/**
 *
 * @author diana
 * 
 */

import java.util.Scanner;

public class exercicio13e14 {

      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
                  
            int idadeAnos;
            int idadesMeses; 
            int idadeDias;

            int ano = 365;
            int mes = 30;
            
            System.out.println("Digite sua idade em anos ");
            idadeAnos = sc.nextInt();
            
            System.out.println("Digite sua idade meses ");
            idadesMeses = sc.nextInt();
            
            System.out.println("Digite sua idade meses ");
            idadeDias = sc.nextInt();
            
            idadeAnos = idadeAnos * ano;
            idadesMeses = idadesMeses * mes;

            idadeDias = idadeDias + idadesMeses + idadeAnos;

            System.out.println("Você ja viveu " + idadeDias + " dias");
      }

}
