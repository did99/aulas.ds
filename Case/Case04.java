/**
 *
 * @author Aluno CA
 */

public class Case04 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
  	  int codigo = 105;
        double preco;
        int quantidade = 3;
        double valortotal;
        
        switch (codigo){
            case 100:
                valortotal = 1.70 * quantidade;
                System.out.println("O valor total é: "+ valortotal);
                break;
            case 101:
                valortotal = 2.30 * quantidade;
                System.out.println("O valor total é: "+ valortotal);
                break;
            case 102:
                valortotal = 2.60 * quantidade;
                System.out.println("O valor total é: "+ valortotal);
                break;
            case 103:
                valortotal = 2.40 * quantidade;
                System.out.println("O valor total é: "+ valortotal);
                break;
            case 104:
                valortotal = 2.50 * quantidade;
                System.out.println("O valor total é: "+ valortotal);
                break;
            case 105:
                valortotal = 1 * quantidade;
                System.out.println("O valor total é: "+ valortotal);
                break;
            default:
                System.out.println("Código Inválido.");
                break;
            
        }
         
    }
    
}