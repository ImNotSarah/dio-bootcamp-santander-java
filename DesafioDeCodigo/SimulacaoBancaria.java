import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 

        while (true) { 
            int opcao = scanner.nextInt();
            
              switch (opcao) {
                  case 1:{
                      //System.out.print("Digite o valor a ser depositado R$ ");
                      saldo += scanner.nextDouble();
                      System.out.println("Saldo atual: " + saldo);
                      break;
                  }
  
                  case 2:{
                      // System.out.print("Digite o valor a ser sacado R$ ");
                      double saque = scanner.nextDouble();
                      if (saque > saldo){
                          System.out.println("Saldo insuficiente.");
                      }
                      else if (saque == 500.0){
                          saldo -= saque;
                          System.out.println("Saldo atual: " + saldo);
                      }
                      else{
                          saldo -= saque;
                      }
                      break;
                  } 
  
                  case 3:{
                      System.out.println("Saldo atual: " + saldo);
                      break;
                  }
                  case 0:{
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                    break;
                  }

                  default:
                      System.out.println("Opção inválida. Tente novamente."); 
                      break;
                }
        }
    }
}