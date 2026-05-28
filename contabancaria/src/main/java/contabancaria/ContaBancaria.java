package contabancaria;


public class ContaBancaria {
    private double saldo;
    private double limiteChequeEspecial;
    private double valorUsadoChequeEspecial;
    private final double TAXA_USO_CHEQUE = 0.20;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        this.valorUsadoChequeEspecial = 0;

        if (depositoInicial <= 500.0) {
            this.limiteChequeEspecial = 50.0;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }
    }

    public void consultarSaldo() {
        double disponivelTotal = saldo + (limiteChequeEspecial - valorUsadoChequeEspecial);
        System.out.printf("%n--- EXTRATO ---%n");
        System.out.printf("Saldo em conta: R$ %.2f%n", saldo);
        System.out.printf("Limite Cheque Especial: R$ %.2f%n", (limiteChequeEspecial - valorUsadoChequeEspecial));
        System.out.printf("Total Disponível: R$ %.2f%n", disponivelTotal);
    }

    public void consultarChequeEspecial() {
        System.out.printf("Seu limite total de cheque especial é: R$ %.2f%n", limiteChequeEspecial);
    }

    public void verificarChequeEspecial() {
        if (valorUsadoChequeEspecial > 0) {
            System.out.printf("Alerta: Você está usando R$ %.2f do cheque especial.%n", valorUsadoChequeEspecial);
        } else {
            System.out.println("Você não está utilizando o cheque especial.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            if (valorUsadoChequeEspecial > 0) {
                double taxa = valorUsadoChequeEspecial * TAXA_USO_CHEQUE;
                System.out.printf("Cobrando taxa de uso do cheque especial (20%%): R$ %.2f%n", taxa);
                valor -= taxa;

                if (valor >= valorUsadoChequeEspecial) {
                    valor -= valorUsadoChequeEspecial;
                    valorUsadoChequeEspecial = 0;
                } else {
                    valorUsadoChequeEspecial -= valor;
                    valor = 0;
                }
            }
            this.saldo += valor;
            System.out.println("Depósito processado.");
        }
    }

    public void realizarPagamento(double valor, String descricao) {
        double disponivel = saldo + (limiteChequeEspecial - valorUsadoChequeEspecial);
        
        if (valor <= disponivel) {
            if (valor <= saldo) {
                saldo -= valor;
            } else {
                double excesso = valor - saldo;
                saldo = 0;
                valorUsadoChequeEspecial += excesso;
                System.out.println("Atenção: Entrou no cheque especial.");
            }
            System.out.printf("%s de R$ %.2f realizado.%n", descricao, valor);
        } else {
            System.out.println("Erro: Saldo e limite insuficientes.");
        }
    }
}