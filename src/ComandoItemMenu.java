// Classe ComandoItemMenu
public class ComandoItemMenu {
    private String nome;
    private double preco;
    private int quantidade;  // Adicionado

    public ComandoItemMenu(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;  // Adicionado
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirInformacoes() {
        // ComandoExibirInformacoesItemMenu comando = new ComandoExibirInformacoesItemMenu(this);
        // comando.executar();
        // Implementação específica para exibir informações sobre um ItemMenu
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }
}