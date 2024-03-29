class ComandoAdicionarItem implements Comando {
    private Pedido pedido;
    private ComandoItemMenu itemMenu;
    private int quantidade;

    public ComandoAdicionarItem(Pedido pedido, ComandoItemMenu itemMenu, int quantidade) {
        this.pedido = pedido;
        this.itemMenu = itemMenu;
        this.quantidade = quantidade;
    }

    @Override
    public void executar() {
        pedido.adicionarItem(itemMenu, quantidade);
    }
}