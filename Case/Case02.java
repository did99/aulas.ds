/**
 *
 * @author Aluno CA
 */
public class Case02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          double media;
          double num1 = 0;
          double num2 = 0;
          int mediafinal = 0;
          
          media = (num1 + num2) / 2;
          
          if ( media>=0 && media<=4 ){
            mediafinal = 1;
         }else  if ( media>= 4.1 && media<=7 ){
             mediafinal = 2;
         }else if (media>= 7.1 && media<=10) {
             mediafinal = 3;
         }
          
         
         
          
           switch(mediafinal){
           case 1 -> System.out.println("Reprovado!");
           case 2 -> System.out.println("Exame");
           case 3 -> System.out.println("Aprovado");
           
           
           
           
           }
          
       } 
       
        
    }  
}