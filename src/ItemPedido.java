class ItemPedido {
    private ComandoItemMenu itemMenu;
    private int quantidade;

    public ItemPedido(ComandoItemMenu itemMenu, int quantidade) {
        this.itemMenu = itemMenu;
        this.quantidade = quantidade;
    }

    public ComandoItemMenu getItemMenu() {
        return itemMenu;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularSubtotal() {
        return itemMenu.getPreco() * quantidade;
    }
}