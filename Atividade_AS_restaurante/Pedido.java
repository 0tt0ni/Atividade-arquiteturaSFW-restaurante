
import java.util.Date;
import java.util.List;

public class Pedido {
    private String id;
    private Date data;
    private String status;
    private List<ItemPedido> itens;

    // Métodos
    public void atualizarStatus(String novoStatus) { this.status = novoStatus; }
    public double calcularTotal() { /* Lógica para somar o total dos itens */ return 0.0; }
}
