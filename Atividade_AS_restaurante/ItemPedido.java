
public class ItemPedido {
    private String id;
    private int quantidade;
    private ItemMenu item;

    // Método
    public double calcularSubtotal() {
        return item.getPreco() * quantidade;
    }
}
