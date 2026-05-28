public class MaquinaBanho {
    private int nivelAgua;
    private int nivelShampoo;
    private boolean temPet;
    private boolean maquinaSuja;
    private boolean petEstaLimpo;

    private final int CAPACIDADE_MAX_AGUA = 30;
    private final int CAPACIDADE_MAX_SHAMPOO = 10;

    public MaquinaBanho() {
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
        this.temPet = false;
        this.maquinaSuja = false;
        this.petEstaLimpo = false;
    }

    public int getNivelAgua() { return nivelAgua; }
    
    public int getNivelShampoo() { return nivelShampoo; }

    public boolean isTemPet() { return temPet; }


    public void colocarPet() {
        if (temPet) {
            System.out.println("Erro: Já existe um pet na máquina!");
        } else if (maquinaSuja) {
            System.out.println("Erro: A máquina precisa ser limpa antes de entrar um novo pet.");
        } else {
            this.temPet = true;
            this.petEstaLimpo = false;
            System.out.println("Pet colocado na máquina. Pronto para o banho!");
        }
    }

    public void retirarPet() {
        if (!temPet) {
            System.out.println("Erro: Não há nenhum pet na máquina.");
            return;
        }
        
        if (!petEstaLimpo) {
            this.maquinaSuja = true;
            System.out.println("Aviso: Pet retirado sujo! A máquina ficou suja.");
        } else {
            System.out.println("Pet retirado limpo e cheiroso!");
        }
        this.temPet = false;
    }

    public void darBanho() {
        if (!temPet) {
            System.out.println("Erro: Coloque o pet na máquina primeiro.");
        } else if (nivelAgua < 10 || nivelShampoo < 2) {
            System.out.println("Erro: Insumos insuficientes (Necessário 10L água e 2L shampoo).");
        } else {
            nivelAgua -= 10;
            nivelShampoo -= 2;
            petEstaLimpo = true;
            System.out.println("Banho concluído com sucesso!");
        }
    }

    public void abastecerAgua() {
        if (nivelAgua + 2 <= CAPACIDADE_MAX_AGUA) {
            nivelAgua += 2;
            System.out.println("Abastecido 2L de água. Nível atual: " + nivelAgua + "L");
        } else {
            System.out.println("Erro: Capacidade máxima de água atingida!");
        }
    }

    public void abastecerShampoo() {
        if (nivelShampoo + 2 <= CAPACIDADE_MAX_SHAMPOO) {
            nivelShampoo += 2;
            System.out.println("Abastecido 2L de shampoo. Nível atual: " + nivelShampoo + "L");
        } else {
            System.out.println("Erro: Capacidade máxima de shampoo atingida!");
        }
    }

    public void limparMaquina() {
        if (nivelAgua < 3 || nivelShampoo < 1) {
            System.out.println("Erro: Insumos insuficientes para limpeza.");
        } else {
            nivelAgua -= 3;
            nivelShampoo -= 1;
            maquinaSuja = false;
            System.out.println("Máquina limpa e pronta para o próximo pet.");
        }
    }
}