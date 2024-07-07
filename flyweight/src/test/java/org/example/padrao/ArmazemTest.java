package org.example.padrao;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArmazemTest {

    @Test
    void deveBuscarProdutos() {
        Armazem armazem = new Armazem();
        armazem.armazenar("Produto1", "UUID01", "A");
        armazem.armazenar("Produto2", "UUID01", "A");
        armazem.armazenar("Produto3", "UUID01", "A");
        armazem.armazenar("Produto4", "UUID01", "A");

        List<String> retirada = Arrays.asList(
                "Produto{nome='Produto1', local=Local{uuid='UUID01', secao='A'}}",
                "Produto{nome='Produto2', local=Local{uuid='UUID01', secao='A'}}",
                "Produto{nome='Produto3', local=Local{uuid='UUID01', secao='A'}}",
                "Produto{nome='Produto4', local=Local{uuid='UUID01', secao='A'}}"
               );
        assertEquals(retirada, armazem.obterLocais());
    }

    @Test
    void deveRetornarTotalLocais() {
        Armazem armazem = new Armazem();
        armazem.armazenar("Produto1", "UUID01", "A");
        armazem.armazenar("Produto2", "UUID01", "A");
        armazem.armazenar("Produto3", "UUID02", "B");
        armazem.armazenar("Produto4", "UUID02", "B");

    assertEquals(2, LocalFactory.getTotalLocais());
    }
}