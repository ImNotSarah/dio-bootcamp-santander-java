public class operadores6 {
    public static void main(String[] args) {
        String nome1 = "GLEYSON";
        String nome2 = new String("GLEYSON");

        System.out.println(nome1.equals(nome2));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é iqual ao númeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);
    }
    
}
