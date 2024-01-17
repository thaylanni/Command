
import java.util.ArrayList;

class Pedido {
    private Cliente cliente;
    private ArrayList<ItemPedido> itens = new ArrayList<>();

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(ComandoItemMenu itemMenu, int quantidade) {
        itens.add(new ItemPedido(itemMenu, quantidade));
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido itemPedido : itens) {
            total += itemPedido.calcularSubtotal();
        }
        return total;
    }

    public void exibirPedido() {
        System.out.println("Pedido de " + cliente.getNome() + ":");
        for (ItemPedido itemPedido : itens) {
            System.out.println(itemPedido.getQuantidade() + "x " + itemPedido.getItemMenu().getNome());
        }
        System.out.println("Total: R$" + calcularTotal());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public boolean estaVazio() {
        return itens.isEmpty();
    }

    public void limparPedido() {
        itens.clear();
    }

    public void adicionarItem(ComandoAdicionarItem comandoAdicionarItem) {
        comandoAdicionarItem.executar();
    }
}