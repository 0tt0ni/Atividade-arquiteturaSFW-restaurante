
public class Cliente {
    private String id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String senha;

    // Métodos
    public void cadastrar() { /* Lógica para cadastro de cliente */ }
    public void login() { /* Lógica para autenticação de cliente */ }
    public void visualizarMenu(Menu menu) { /* Exibir o menu */ }
    public void fazerPedido(Pedido pedido) { /* Lógica para realizar o pedido */ }
    public void acompanharPedido(Pedido pedido) { /* Exibir o status do pedido */ }
}
