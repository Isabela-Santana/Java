package cinema;

// Classe Pai
class Ingresso {
    protected String nomeFilme;
    protected double valorBase;
    protected boolean dublado;

    public Ingresso(String nomeFilme, double valorBase, boolean dublado) {
        this.nomeFilme = nomeFilme;
        this.valorBase = valorBase;
        this.dublado = dublado;
    }

    public double getValorReal() {
        return valorBase;
    }
}

// Meia Entrada
class MeiaEntrada extends Ingresso {
    public MeiaEntrada(String nomeFilme, double valorBase, boolean dublado) {
        super(nomeFilme, valorBase, dublado);
    }

    @Override
    public double getValorReal() {
        return valorBase / 2;
    }
}

// Ingresso Família
class IngressoFamilia extends Ingresso {
    private int numeroPessoas;

    public IngressoFamilia(String nomeFilme, double valorBase, boolean dublado, int numeroPessoas) {
        super(nomeFilme, valorBase, dublado);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double getValorReal() {
        double total = valorBase * numeroPessoas;
        if (numeroPessoas > 3) {
            total *= 0.95; // 5% de desconto
        }
        return total;
    }
}