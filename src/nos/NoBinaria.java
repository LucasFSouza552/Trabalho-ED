package nos;

public class NoBinaria {

    private int valor;
    private NoBinaria left, right;

    public NoBinaria(int valor) {
        this.valor = valor;
        left = right = null;
    }

    public int getValor() {
        return valor;
    }

    public NoBinaria getLeft() {
        return left;
    }

    public NoBinaria getRight() {
        return right;
    }

    public void setLeft(NoBinaria left) {
        this.left = left;
    }

    public void setRight(NoBinaria right) {
        this.right = right;
    }

}
