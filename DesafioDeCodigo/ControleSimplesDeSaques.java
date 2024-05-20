import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double totalSacado = 0.0;
        
        for (int i = 0; ; i++) {
            double valorSaque = scanner.nextDouble();
            
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            if (totalSacado + valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; 
            } 
            else {
                totalSacado += valorSaque;
                double limiteRestante = limiteDiario - totalSacado;
                System.out.println("Saque realizado. Limite restante: " + limiteRestante);
            }
        }
        scanner.close();
    }
}
