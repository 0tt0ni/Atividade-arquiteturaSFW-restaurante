
import java.util.List;

public class Menu {
    private List<ItemMenu> itens;

    // Métodos
    public void adicionarItem(ItemMenu item) { itens.add(item); }
    public void editarItem(String id, ItemMenu novoItem) { /* Lógica para editar item */ }
    public void removerItem(String id) { /* Lógica para remover item */ }
}
