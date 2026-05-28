public class Main {
    public static void main(String[] args) {
        MaquinaBanho minhaMaquina = new MaquinaBanho();

        System.out.println("--- Preparando a Máquina ---");
        for(int i = 0; i < 6; i++) {
            minhaMaquina.abastecerAgua(); 
            minhaMaquina.abastecerShampoo(); 

        System.out.println("\n--- Teste: Retirada sem banho ---");
        minhaMaquina.colocarPet();
        minhaMaquina.retirarPet(); 
        
        minhaMaquina.colocarPet(); 
        minhaMaquina.limparMaquina();
        minhaMaquina.colocarPet();
        minhaMaquina.darBanho();
        minhaMaquina.retirarPet();

        System.out.println("\nNível final de água: " + minhaMaquina.getNivelAgua() + "L");
    }
}
}