public class Carro {
    private boolean ligado = false;
    private int velocidade = 0;
    private int marcha = 0; // 0 = Ponto Morto

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Erro: Só pode desligar em ponto morto (0) e parado (0km/h).");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("O carro está desligado!");
            return;
        }

        // Verifica se está tentando pular marcha (ex: de 1 para 3)
        if (Math.abs(novaMarcha - marcha) == 1) {
            if (novaMarcha >= 0 && novaMarcha <= 6) {
                this.marcha = novaMarcha;
                System.out.println("Marcha alterada para: " + marcha);
            }
        } else {
            System.out.println("Erro: Você não pode pular marchas!");
        }
    }

    public void acelerar() {
        if (!ligado || marcha == 0) {
            System.out.println("O carro não pode acelerar (desligado ou em ponto morto).");
            return;
        }

        int limiteSuperior = marcha * 20; // 1ª=20, 2ª=40... 6ª=120
        if (velocidade < limiteSuperior && velocidade < 120) {
            velocidade++;
            System.out.println("Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("Limite atingido para a marcha " + marcha);
        }
    }

    public void frear() {
        if (!ligado) return;

        int limiteInferior = (marcha == 1) ? 0 : (marcha - 1) * 20 + 1;
        
        if (velocidade > 0 && velocidade >= limiteInferior) {
            velocidade--;
            System.out.println("Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("Reduza a marcha para continuar diminuindo a velocidade.");
        }
    }

    public void virar(String direcao) {
        if (ligado && velocidade >= 1 && velocidade <= 40) {
            System.out.println("O carro virou para a " + direcao);
        } else {
            System.out.println("Não é seguro ou possível virar nesta velocidade/estado.");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h | Marcha: " + marcha);
    }
}