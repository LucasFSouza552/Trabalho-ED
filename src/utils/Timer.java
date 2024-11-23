package utils;

public class Timer {
    public static long getTime() {
        return System.nanoTime();
    }

    public static double calcularTempoCincoVezes(Runnable codigo) {
        long startTime = getTime();
        int repeticoes = 5;
        for (int i = 0; i < repeticoes; i++) {
            codigo.run();
        }
        return (double) (getTime() - startTime) / repeticoes;
    }
}
