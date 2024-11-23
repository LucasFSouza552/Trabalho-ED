package estruturas;

public class TempoGerenciador {
    public enum tiposTempos {
        PREENCHER,
        // Vetor
        BUSCAR_PRIMEIRO_ELEMENTO,
        BUSCAR_ULTIMO_ELEMENTO,
        BUSCAR_MEIO_ELEMENTO,
        BUSCAR_VALOR_INEXISTENTE,
        BUSCAR_VALOR_ALEATORIO,

        // Binaria
        BUSCAR_PRIMEIRO_ELEMENTO_BINARIA,
        BUSCAR_ULTIMO_ELEMENTO_BINARIA,
        BUSCAR_MEIO_ELEMENTO_BINARIA,
        BUSCAR_VALOR_INEXISTENTE_BINARIA,
        BUSCAR_VALOR_ALEATORIO_BINARIA,

        // Sort's
        BUBBLE_SORT,
        QUICK_SORT,
    }

    protected long[] tempos;

    public TempoGerenciador() {
        tempos = new long[tiposTempos.values().length];
    }

    public void addTempo(long tempo, tiposTempos t) {
        tempos[t.ordinal()] += tempo;
    }

    public long getTempoMS(tiposTempos t) {
        long tempoEmNanos = tempos[t.ordinal()];
        return tempoEmNanos;
    }

    public long getTempoParaPreencher() {
        return getTempoMS(tiposTempos.PREENCHER);
    }

    public long getTempoPrimeiroElemento() {
        return getTempoMS(tiposTempos.BUSCAR_PRIMEIRO_ELEMENTO);
    }

    public long getTempoUltimoElemento() {
        return getTempoMS(tiposTempos.BUSCAR_ULTIMO_ELEMENTO);
    }

    public long getTempoMeioElemento() {
        return getTempoMS(tiposTempos.BUSCAR_MEIO_ELEMENTO);
    }

    public long getTempoElementoInexistente() {
        return getTempoMS(tiposTempos.BUSCAR_VALOR_INEXISTENTE);
    }

    public long getTempoElementoAleatorio() {
        return getTempoMS(tiposTempos.BUSCAR_VALOR_ALEATORIO);
    }

    public long getTempoPrimeiroElementoBinaria() {
        return getTempoMS(tiposTempos.BUSCAR_PRIMEIRO_ELEMENTO_BINARIA);
    }

    public long getTempoUltimoElementoBinaria() {
        return getTempoMS(tiposTempos.BUSCAR_ULTIMO_ELEMENTO_BINARIA);
    }

    public long getTempoMeioElementoBinaria() {
        return getTempoMS(tiposTempos.BUSCAR_MEIO_ELEMENTO_BINARIA);
    }

    public long getTempoElementoInexistenteBinaria() {
        return getTempoMS(tiposTempos.BUSCAR_VALOR_INEXISTENTE_BINARIA);
    }

    public long getTempoElementoAleatorioBinaria() {
        return getTempoMS(tiposTempos.BUSCAR_VALOR_ALEATORIO_BINARIA);
    }
}
