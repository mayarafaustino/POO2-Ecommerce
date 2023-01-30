import java.util.ArrayList;
import java.util.List;

public class Lojinha {

    private List<Produto> produtos;
    private String arrecadacaoComVendas; //bigDecimal?

    //singleton
    private static final Lojinha INSTANCE = new Lojinha(new ArrayList<>());

    private Lojinha(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public static Lojinha getInstance() {
        return INSTANCE;
    }
    //---

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarNaLista(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerDaLista(Produto produto) {
        this.produtos.remove(produto);
    }

    public void vender(Produto produto, int quantidade) {
        //diminuir o produto na quantidade vendida
        //adicionar valor na arrecadaoComVendas
        //processo de pagamento???
    }
}
