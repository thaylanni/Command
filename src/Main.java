public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente("Thaylanni");

        // Criando um pedido para o cliente
        Pedido pedido = new Pedido(cliente);

        // Criando um comando para adicionar um item ao menu
        ComandoItemMenu comandoItemMenu = new ComandoItemMenu("Pizza", 10);
        ComandoAdicionarItem comandoAdicionarPizza = new ComandoAdicionarItem(pedido, comandoItemMenu, 2);

        // Adicionando o comando à fila de comandos do atendente
        Atendente atendente = new Atendente();
        atendente.adicionarComando(comandoAdicionarPizza);

        // Processando os pedidos
        atendente.processarPedidos();

        // Exibindo o pedido
        pedido.exibirPedido();
    }
}
