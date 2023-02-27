public class Usuario {
    public static void main(String[] args) throws Exception {
       
    MinhhaSmartTv smartTV = new MinhhaSmartTv();

       System.out.println("Ligada? " + MinhhaSmartTv.ligada);
       System.out.println("Canal atual: " + smartTV.canal);
       System.out.println("Volume atual: " + smartTV.volume);

    smartTV.mudarCanal(13);
    System.out.println("Canal atual: " + smartTV.canal);     


       
       smartTV.ligar();
       System.out.println("Tv ligada ? -> " + MinhhaSmartTv.ligada);

       smartTV.desligar();
       System.out.println("Tv ligada ? -> " + MinhhaSmartTv.ligada);

    }
}
