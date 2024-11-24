package estruturaBase;

import interfaces.Estrutura;
import nos.NoAVL;
import utils.TempoGerenciador;

public class ArvoreAVL extends TempoGerenciador implements Estrutura {
    private static final int INEXISTENTE = -1;

    private NoAVL raiz;
    private int tamanho;

    public ArvoreAVL(int tamanho) {
        raiz = null;
        this.tamanho = tamanho;
    }

    public void inserir(int valor) {
        raiz = inserirRecursiva(raiz, valor);
    }

    private NoAVL inserirRecursiva(NoAVL raiz, int valor) {
        if (raiz == null) {
            return new NoAVL(valor);
        }

        if (valor < raiz.getValor()) {
            raiz.setLeft(inserirRecursiva(raiz.getLeft(), valor));
        } else if (valor > raiz.getValor()) {
            raiz.setRight(inserirRecursiva(raiz.getRight(), valor));
        } else {
            return raiz;
        }

        raiz.setAltura(1 + Math.max(getAltura(raiz.getLeft()), getAltura(raiz.getRight())));

        int balance = raiz.getBalance();

        if (balance > 1 && valor < raiz.getLeft().getValor()) {
            return rotacaoDireita(raiz);
        }

        if (balance < -1 && valor > raiz.getRight().getValor()) {
            return rotacaoEsquerda(raiz);
        }

        if (balance > 1 && valor > raiz.getLeft().getValor()) {
            raiz.setLeft(rotacaoEsquerda(raiz.getLeft()));
            return rotacaoDireita(raiz);
        }

        if (balance < -1 && valor < raiz.getRight().getValor()) {
            raiz.setRight(rotacaoDireita(raiz.getRight()));
            return rotacaoEsquerda(raiz);
        }

        return raiz;
    }

    public void inorder() {
        inorderRec(raiz);
        System.out.println();
    }

    private void inorderRec(NoAVL node) {
        if (node != null) {
            inorderRec(node.getLeft());
            System.out.print(node.getValor() + " ");
            inorderRec(node.getRight());
        }
    }

    private NoAVL rotacaoEsquerda(NoAVL x) {
        NoAVL y = x.getRight();
        NoAVL T2 = y.getLeft();

        y.setLeft(x);
        x.setRight(T2);

        x.setAltura(Math.max(getAltura(x.getLeft()), getAltura(x.getRight())) + 1);
        y.setAltura(Math.max(getAltura(y.getLeft()), getAltura(y.getRight())) + 1);

        return y;
    }

    private NoAVL rotacaoDireita(NoAVL x) {
        NoAVL y = x.getLeft();
        NoAVL T3 = y.getRight();

        y.setRight(x);
        x.setLeft(T3);

        x.setAltura(Math.max(getAltura(x.getLeft()), getAltura(x.getRight())) + 1);
        y.setAltura(Math.max(getAltura(y.getLeft()), getAltura(y.getRight())) + 1);

        return y;
    }

    private int getAltura(NoAVL no) {
        if (no == null) {
            return 0;
        }
        return no.getAltura();
    }

    public int getTamanho() {
        return tamanho;
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
    public int buscarElemento(int elemento) {
        return buscarRecursivo(raiz, elemento);
    }

    public int buscarRecursivo(NoAVL raiz, int elemento) {
        if (raiz == null) {
            return INEXISTENTE;
        }
        if (raiz.getValor() == elemento) {
            return raiz.getValor();
        }
        if (elemento < raiz.getValor()) {
            return buscarRecursivo(raiz.getLeft(), elemento);
        } else {
            return buscarRecursivo(raiz.getRight(), elemento);
        }
    }

    @Override
    public int buscarPorIndice(int index) {
        NoAVL atual = raiz;
        int contador = 0;
        while (atual != null) {
            if (contador == index) {
                return atual.getValor();
            }
            if (index < contador) {
                atual = atual.getLeft();
            } else {
                atual = atual.getRight();
                contador++;
            }
        }
        return INEXISTENTE;
    }

    @Override
    public void buscarPrimeiroElemento() {
        long StartTime = getTime();
        buscarPorIndice(0);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_PRIMEIRO_ELEMENTO);
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
        int aleatorio = (int) (Math.random() * tamanho);
        buscarPorIndice(aleatorio);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_VALOR_ALEATORIO);
    }

    @Override
    public long getTime() {
        return System.nanoTime();
    }

}
