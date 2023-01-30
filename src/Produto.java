import java.util.UUID;

public class Produto {

    private UUID id;
    private String nome;
    private String descricao;
    private String preco; //bigdecimal?
    private int quantidade;

    // Dois construtores, para dar a opção de fornecer ou não a descrição ao criar o produto.
    public Produto(String nome, String preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.id = UUID.randomUUID();
    }

    public Produto(String nome, String preco, int quantidade, String descricao) {
        this(nome, preco, quantidade);
        this.descricao = descricao;
    }


    //getter and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public UUID getId() {
        return id;
    }
    //------
}
