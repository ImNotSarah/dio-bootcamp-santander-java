public class Usuario {
    public static void main(String[] args) throws Exception{
        
        SmartTv smartTv = new SmartTv();

        

        smartTv.desligar();

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        
        smartTv.ligar();

        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);

        System.out.println("Volume Atual: " +smartTv.volume);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Novo Status -> Volume Atual: " + smartTv.volume);

        smartTv.desligar();
        
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);

    }
}
