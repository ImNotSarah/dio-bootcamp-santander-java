import java.util.Scanner; 

  public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        try{
            String numConta = scanner.next();
            verificarNumeroConta(numConta);
            System.out.println("Numero de conta valido."); 
        } 
        catch (IllegalArgumentException e){
            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos."); 
        } 
        finally {
            scanner.close();
        }
    }
    
    private static String verificarNumeroConta(String numeroConta) throws IllegalArgumentException { 
        if(numeroConta.length() != 8)
            throw new IllegalArgumentException();

            return "Numero de conta valido.";
    }
}