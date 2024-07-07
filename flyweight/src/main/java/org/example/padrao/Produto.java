package org.example.padrao;

public class Produto {
    private String nome;
    private Local local;

    public Produto(String nome, Local local) {
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Local getLocalArmazenado() {
        return local;
    }

    public void setLocalArmazenado(Local local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", local=" + local +
                '}';
    }
}
