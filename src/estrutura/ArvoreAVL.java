package estrutura;

import estruturas.TempoGerenciador;
import interfaces.Estrutura;

public class ArvoreAVL extends TempoGerenciador implements Estrutura {
    private static final int INEXISTENTE = -1;

    class No {
        int valor;
        int altura;
        No left, right;

        public No(int valor) {
            this.valor = valor;
            left = right = null;
            altura = 1;
        }

        public int getAltura() {
            return altura;
        }

        public int getBalance() {
            int leftaltura = (left == null) ? 0 : left.altura;
            int rightaltura = (right == null) ? 0 : right.altura;
            return leftaltura - rightaltura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }

    }

    private No raiz;
    private int tamanho;

    public ArvoreAVL(int tamanho) {
        raiz = null;
        this.tamanho = tamanho;
    }

    public void inserir(int valor) {
        raiz = inserirRecursiva(raiz, valor);
    }

    private No inserirRecursiva(No raiz, int valor) {
        if (raiz == null) {
            return new No(valor);
        }

        if (valor < raiz.valor) {
            raiz.left = inserirRecursiva(raiz.left, valor);
        } else if (valor > raiz.valor) {
            raiz.right = inserirRecursiva(raiz.right, valor);
        } else {
            return raiz;
        }

        raiz.altura = 1 + Math.max(getAltura(raiz.left), getAltura(raiz.right));

        int balance = raiz.getBalance();

        if (balance > 1 && valor < raiz.left.valor) {
            return rotacaoDireita(raiz);
        }

        if (balance < -1 && valor > raiz.right.valor) {
            return rotacaoEsquerda(raiz);
        }

        if (balance > 1 && valor > raiz.left.valor) {
            raiz.left = rotacaoEsquerda(raiz.left);
            return rotacaoDireita(raiz);
        }

        if (balance < -1 && valor < raiz.right.valor) {
            raiz.right = rotacaoDireita(raiz.right);
            return rotacaoEsquerda(raiz);
        }

        return raiz;
    }

    public void inorder() {
        inorderRec(raiz);
        System.out.println();
    }

    private void inorderRec(No node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.valor + " ");
            inorderRec(node.right);
        }
    }

    private No rotacaoEsquerda(No x) {
        No y = x.right;
        No T2 = y.left;

        y.left = x;
        x.right = T2;

        x.altura = Math.max(getAltura(x.left), getAltura(x.right)) + 1;
        y.altura = Math.max(getAltura(y.left), getAltura(y.right)) + 1;

        return y;
    }

    private No rotacaoDireita(No x) {
        No y = x.left;
        No T3 = y.right;

        y.right = x;
        x.left = T3;

        x.altura = Math.max(getAltura(x.left), getAltura(x.right)) + 1;
        y.altura = Math.max(getAltura(y.left), getAltura(y.right)) + 1;

        return y;
    }

    private int getAltura(No no) {
        if (no == null) {
            return 0;
        }
        return no.altura;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarElemento'");
    }

    @Override
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
    public void buscarPrimeiroElemento() {
        long StartTime = getTime();
        int primeiro = buscarPorIndice(0);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_PRIMEIRO_ELEMENTO);
    }

    @Override
    public void buscarUltimoElemento() {
        long StartTime = getTime();
        int ultimo = buscarPorIndice(tamanho - 1);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_ULTIMO_ELEMENTO);
    }

    @Override
    public void buscarMeioElemento() {
        long StartTime = getTime();
        int meio = buscarPorIndice(tamanho / 2);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_MEIO_ELEMENTO);
    }

    @Override
    public void buscarValorInexistente() {
        long StartTime = getTime();
        int inexistente = buscarPorIndice(tamanho + 1);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_VALOR_INEXISTENTE);
    }

    @Override
    public void buscarValorAleatorio() {
        long StartTime = getTime();
        int aleatorio = (int) (Math.random() * tamanho);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_VALOR_ALEATORIO);
    }

    @Override
    public long getTime() {
        return System.nanoTime();
    }

}
