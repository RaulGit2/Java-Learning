public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirvolume();
        smartTv.diminuirvolume();
        smartTv.diminuirvolume();
        smartTv.aumentarvolume();

        System.out.println("Volume atual: " + smartTv.volume);

        
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        

        smartTv.Ligar();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);
        
        smartTv.Desligar();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);

        

    }
}
