package br.senai.sp.jandira.model;

public class Produto {

    private int id;
    private String nome;
    private int estoque;
    private double preco;
    private String fornecedor;

    public Produto(int id, String nome, int estoque, double preco, String fornecedor){
            this.id =id;
            this.nome = nome;
            this.estoque = estoque;
            this.preco = preco;
            this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void detalhes(){
        System.out.println("O id é " + id);
        System.out.println("O nome é " + nome);
        System.out.println("O estoque " + estoque);
        System.out.println("O preço é " + preco);
        System.out.println("O fornecedor é " + fornecedor);

    }
}
