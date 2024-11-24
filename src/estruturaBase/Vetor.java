package estruturaBase;

import interfaces.Estrutura;
import utils.BinarySearch;
import utils.BubbleSort;
import utils.QuickSort;
import utils.TempoGerenciador;

public class Vetor extends TempoGerenciador implements Estrutura {
    private final int INEXISTENTE = -1;

    private int[] vetor;

    public Vetor(int size) {
        this.vetor = new int[size];
    }

    @Override
    public long getTime() {
        return System.nanoTime();
    }

    @Override
    public void preencherAleatorio() {
        long StartTime = getTime();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.PREENCHER);
    }

    @Override
    public void preencherInverso() {
        long StartTime = getTime();
        for (int i = vetor.length - 1; i >= 0; i--) {
            vetor[i] = i;
        }
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.PREENCHER);
    }

    @Override
    public void preencherOrdenado() {
        long StartTime = getTime();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.PREENCHER);
    }

    @Override
    public int buscarElemento(int elemento) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                return vetor[i];
            }
        }
        return INEXISTENTE;
    }

    @Override
    public int buscarPorIndice(int indice) {
        for (int i = 0; i < vetor.length; i++) {
            if (i == indice) {
                return vetor[i];
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
        buscarPorIndice(vetor.length - 1);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_ULTIMO_ELEMENTO);
    }

    @Override
    public void buscarMeioElemento() {
        long StartTime = getTime();
        buscarPorIndice(vetor.length / 2);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_MEIO_ELEMENTO);
    }

    @Override
    public void buscarValorInexistente() {
        long StartTime = getTime();
        buscarPorIndice(10001);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_VALOR_INEXISTENTE);
    }

    @Override
    public void buscarValorAleatorio() {
        int r = (int) (Math.random() * 100);
        long StartTime = getTime();
        buscarPorIndice(r);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_VALOR_ALEATORIO);
    }

    /// Busca binária

    public void buscarPrimeiroElementoBinaria() {
        long StartTime = getTime();
        BinarySearch.buscaBinaria(vetor, vetor[0]);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_PRIMEIRO_ELEMENTO_BINARIA);
    }

    public void buscarUltimoElementoBinaria() {
        long StartTime = getTime();
        BinarySearch.buscaBinaria(vetor, vetor[vetor.length - 1]);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_ULTIMO_ELEMENTO_BINARIA);
    }

    public void buscarMeioElementoBinaria() {
        long StartTime = getTime();
        BinarySearch.buscaBinaria(vetor, vetor[vetor.length / 2]);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_MEIO_ELEMENTO_BINARIA);
    }

    public void buscarValorInexistenteBinaria() {
        long StartTime = getTime();
        BinarySearch.buscaBinaria(vetor, 10001);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_VALOR_INEXISTENTE_BINARIA);
    }

    public void buscarValorAleatorioBinaria() {
        int r = (int) (Math.random() * 100);
        long StartTime = getTime();
        BinarySearch.buscaBinaria(vetor, vetor[r]);
        long tempo = getTime() - StartTime;
        addTempo(tempo, tiposTempos.BUSCAR_VALOR_ALEATORIO_BINARIA);
    }

    public void buscaBinaria() {
        int[] vetor = QuickSort.sort(this.vetor);
        addTempo(BinarySearch.buscarPrimeiroElementoBinaria(vetor), tiposTempos.BUSCAR_PRIMEIRO_ELEMENTO_BINARIA);
        addTempo(BinarySearch.buscarUltimoElementoBinaria(vetor), tiposTempos.BUSCAR_ULTIMO_ELEMENTO_BINARIA);
        addTempo(BinarySearch.buscarMeioElementoBinaria(vetor), tiposTempos.BUSCAR_MEIO_ELEMENTO_BINARIA);
        addTempo(BinarySearch.buscarValorInexistenteBinaria(vetor), tiposTempos.BUSCAR_VALOR_INEXISTENTE_BINARIA);
        addTempo(BinarySearch.buscarValorAleatorioBinaria(vetor), tiposTempos.BUSCAR_VALOR_ALEATORIO_BINARIA);
    }

    public void quickSort() {
        addTempo(QuickSort.sortTime(vetor), tiposTempos.QUICK_SORT);
    }

    public int[] getVetor() {
        return vetor;
    }

    public int[] bubbleSort() {
        return BubbleSort.sort(vetor);
    }

    public long getQuickSortTime() {
        return QuickSort.sortTime(vetor);
    }

    public long getBubbleSortTime() {
        return BubbleSort.sortTime(vetor);
    }

}
