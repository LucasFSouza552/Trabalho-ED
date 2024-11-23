package utils;

public class ConvertNanoToMs {
    public static double convertNanoToMs(long nano) {
        return ((double) nano) / 1_000_000;
    }
}
