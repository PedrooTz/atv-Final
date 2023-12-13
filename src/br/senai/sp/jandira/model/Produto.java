package br.senai.sp.jandira.model;

public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double preco;
    private String fornecedor;

    public Produto (int id, String nome, int quantidade, double preco, String fornecedor){
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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

    public void mostrarInformacoes (){
        System.out.println("O nome id é:" + id);
        System.out.println("O nome é:" + nome);
        System.out.println("A quantidade é:" + quantidade);
        System.out.println("O preço é:"  + preco);
        System.out.println("O fornecedor é:" + fornecedor);
    }
}
