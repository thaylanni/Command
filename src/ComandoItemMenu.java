// Classe ItemMenu
public class ComandoItemMenu {
    // Atributos
    private String nome;
    private double preco;

    // Construtores
    public ItemMenu(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Métodos para exibir informações do item do menu
    public void exibirInformacoes() {
        ComandoExibirInformacoesItemMenu comando = new ComandoExibirInformacoesItemMenu(this);
        comando.executar();
    }

    // Métodos para adicionar quantidade
    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }
    / Métodos para exibir informações do item do menu
    public void exibirInformacoes() {
        // Implementação específica para exibir informações sobre um ItemMenu
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    // Métodos para adicionar quantidade
    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }
}
