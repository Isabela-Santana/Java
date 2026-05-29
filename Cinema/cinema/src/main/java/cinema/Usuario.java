package cinema;

abstract class Usuario {
    protected String nome, email, senha;
    protected boolean administrador;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public void setSenha(String senha) { this.senha = senha; }
    
    // Método que estava dando erro (agora dentro da classe)
    public boolean isAdministrador() {
        return this.administrador;
    }

    // Métodos comuns a todos os usuários
    public void realizarLogin() { System.out.println(nome + " logado."); }
    public void realizarLogoff() { System.out.println(nome + " deslogado."); }
    public void alterarDados() { System.out.println("Dados de " + nome + " alterados."); }
    public void alterarSenha(String novaSenha) { 
        this.senha = novaSenha; 
        System.out.println("Senha de " + nome + " alterada com sucesso.");
    }
}

class Gerente extends Usuario {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
        this.administrador = true; // Sempre verdadeiro
    }
    public void gerarRelatorioFinanceiro() { System.out.println("Gerando relatório financeiro..."); }
    public void consultarVendas() { System.out.println("Consultando todas as vendas..."); }
}

class Vendedor extends Usuario {
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
        this.administrador = false; // Sempre falso
        this.quantidadeVendas = 0;
    }

    public void realizarVenda() { 
        this.quantidadeVendas++; 
        System.out.println("Venda realizada! Total: " + quantidadeVendas);
    }
    
    public void consultarVendas() { 
        System.out.println("Vendas deste vendedor: " + quantidadeVendas); 
    }
}

class Atendente extends Usuario {
    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha);
        this.administrador = false; // Sempre falso
        this.valorEmCaixa = 0;
    }

    public void receberPagamento(double valor) { 
        this.valorEmCaixa += valor; 
        System.out.println("Pagamento de R$ " + valor + " recebido.");
    }

    public void fecharCaixa() { 
        System.out.println("Caixa fechado com valor total de: R$ " + valorEmCaixa);
        this.valorEmCaixa = 0; 
    }
}