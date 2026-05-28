public class App {
    public static void main(String[] args) throws Exception {
    
        Carro meuCarro = new Carro();

        meuCarro.ligar();
        
        // Tentando acelerar no ponto morto (deve falhar)
        meuCarro.acelerar();

        // Subindo marchas e acelerando
        meuCarro.trocarMarcha(1);
        for(int i=0; i<20; i++) meuCarro.acelerar();
        
        meuCarro.trocarMarcha(2);
        meuCarro.acelerar(); // 21 km/h
        
        meuCarro.virar("Esquerda"); // Deve funcionar (está a 21km)

        meuCarro.verificarVelocidade();
    }
}
    

