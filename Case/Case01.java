
/**
 *
 * @author Aluno CA
 */
public class Case01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int clas = 0;
        
         if ( clas >=8 && clas <=15 ){
            clas = 8;
         } else  if (clas >= 16){
             clas=9;
         }
                 
                 
       
       switch(clas){
           case 1 -> System.out.println("Alimento não-perecível");
           case 2 -> System.out.println("Alimento perecível");
           case 3 -> System.out.println("Alimento perecível");
           case 4 -> System.out.println("Alimento perecível");
           case 5 -> System.out.println("Vestuário");
           case 6 -> System.out.println("Vestuário");
           case 7 -> System.out.println("Higiene Pessoal");
           case 8 -> System.out.println("Limpeza e  Utensílios Doméstico");
           case 9 -> System.out.println("Código Inválido");
           
          
          
       } 
       
       }
          
           
    }
    }
}