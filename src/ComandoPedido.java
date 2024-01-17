class ComandoPedido implements Comando {

    private Pedido pedido;
    private ItemMenu itemMenu;
    private int quantidade;

    public ComandoPedido(Pedido pedido, ItemMenu itemMenu, int quantidade) {
        this.pedido = pedido;
        this.itemMenu = itemMenu;
        this.quantidade = quantidade;
    }

    @Override
    public void executar() {
        pedido.adicionarItem(itemMenu, quantidade);
    }
}
