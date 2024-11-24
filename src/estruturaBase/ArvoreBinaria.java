package estruturaBase;

import interfaces.Estrutura;
import utils.TempoGerenciador;

public class ArvoreBinaria extends TempoGerenciador implements Estrutura {

    private static final int INEXISTENTE = -1;
    private No raiz;
    private int tamanho;

    class No {
        int valor;
        No left, right;

        No(int valor) {
            this.valor = valor;
            left = right = null;
        }
    }

    public ArvoreBinaria(int tamanho) {
        this.raiz = null;
        this.tamanho = tamanho;
    }

    @Override
    public void preencherOrdenado() {
        long StartTime = getTime();
        for (int i = 0; i < tamanho; i++) {
            inserir(i);
        }
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.PREENCHER);
    }

    @Override
    public void preencherInverso() {
        long StartTime = getTime();
        for (int i = tamanho - 1; i >= 0; i--) {
            inserir(i);
        }
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.PREENCHER);
    }

    @Override
    public void preencherAleatorio() {
        long StartTime = getTime();
        for (int i = 0; i < tamanho; i++) {
            inserir((int) (Math.random() * tamanho));
        }
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.PREENCHER);
    }

    @Override
    public void buscarPrimeiroElemento() {
        long StartTime = getTime();
        buscarPorIndice(0);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_PRIMEIRO_ELEMENTO);
    }

    public int buscarPorIndice(int index) {
        No atual = raiz;
        int contador = 0;
        while (atual != null) {
            if (contador == index) {
                return atual.valor;
            }
            if (index < contador) {
                atual = atual.left;
            } else {
                atual = atual.right;
                contador++;
            }
        }
        return INEXISTENTE;
    }

    @Override
    public void buscarUltimoElemento() {
        long StartTime = getTime();
        buscarPorIndice(tamanho - 1);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_ULTIMO_ELEMENTO);
    }

    @Override
    public void buscarMeioElemento() {
        long StartTime = getTime();
        buscarPorIndice(tamanho / 2);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_MEIO_ELEMENTO);
    }

    @Override
    public void buscarValorInexistente() {
        long StartTime = getTime();
        buscarPorIndice(tamanho + 1);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_VALOR_INEXISTENTE);
    }

    @Override
    public void buscarValorAleatorio() {
        long StartTime = getTime();
        int r = (int) (Math.random() * 100);
        buscarPorIndice(r);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_VALOR_ALEATORIO);
    }

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No raiz, int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return raiz;
        }
        if (valor < raiz.valor) {
            raiz.left = inserirRecursivo(raiz.left, valor);
        } else {
            raiz.right = inserirRecursivo(raiz.right, valor);
        }
        return raiz;
    }

    public void inorder() {
        inorderRec(raiz);
    }

    private void inorderRec(No node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.valor + " ");
            inorderRec(node.right);
        }
    }

    @Override
    public int buscarElemento(int elemento) {
        return buscarRecursivo(raiz, elemento);
    }

    public void deletar() {
        raiz = null;
    }

    public int buscarRecursivo(No raiz, int elemento) {
        if (raiz == null) {
            return INEXISTENTE;
        }
        if (raiz.valor == elemento) {
            return raiz.valor;
        }
        if (elemento < raiz.valor) {
            return buscarRecursivo(raiz.left, elemento);
        } else {
            return buscarRecursivo(raiz.right, elemento);
        }
    }

    @Override
    public long getTime() {
        return System.nanoTime();
    }

    public int getTamanho() {
        return tamanho;
    }

}
