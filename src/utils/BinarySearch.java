package utils;

public class BinarySearch {
    private final static int INEXISTENTE = -1;

    public static int buscaBinaria(int[] array, int elemento) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("O vetor não pode ser nulo ou vazio.");
        }
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == elemento) {
                return meio;
            }

            if (array[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return INEXISTENTE;
    }

    private static long getTime() {
        return System.nanoTime();
    }

    public static long buscarPrimeiroElementoBinaria(int[] vetor) {
        long StartTime = getTime();
        BinarySearch.buscaBinaria(vetor, vetor[0]);
        return getTime() - StartTime;
    }

    public static long buscarUltimoElementoBinaria(int[] vetor) {
        long StartTime = getTime();
        BinarySearch.buscaBinaria(vetor, vetor[vetor.length - 1]);
        return getTime() - StartTime;
    }

    public static long buscarMeioElementoBinaria(int[] vetor) {
        long StartTime = getTime();
        BinarySearch.buscaBinaria(vetor, vetor[vetor.length / 2]);
        return getTime() - StartTime;
    }

    public static long buscarValorInexistenteBinaria(int[] vetor) {
        long StartTime = getTime();
        BinarySearch.buscaBinaria(vetor, 10001);
        return getTime() - StartTime;
    }

    public static long buscarValorAleatorioBinaria(int[] vetor) {
        int r = (int) (Math.random() * 100);
        long StartTime = getTime();
        BinarySearch.buscaBinaria(vetor, vetor[r]);
        return getTime() - StartTime;
    }

}
