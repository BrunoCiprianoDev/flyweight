package org.example.padrao;

import java.util.ArrayList;
import java.util.List;

public class Armazem {

    private List<Produto> produtos = new ArrayList<>();

    public void armazenar(String nomeProduto, String uuidLocal, String secao) {
        Local local = LocalFactory.getLocal(uuidLocal, secao);
        Produto produto = new Produto(nomeProduto, local);
        produtos.add(produto);
    }

    public List<String> obterLocais() {
        List<String> retirada = new ArrayList<String>();
        for(Produto produto : this.produtos) {
            retirada.add(produto.toString());
        }
        return retirada;
    }

}
