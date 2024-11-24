package nos;

public class NoAVL {
    private int valor;
    private int altura;
    private NoAVL left, right;

    public NoAVL(int valor) {
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

    public int getValor() {
        return valor;
    }

    public NoAVL getLeft() {
        return left;
    }

    public void setLeft(NoAVL left) {
        this.left = left;
    }

    public NoAVL getRight() {
        return right;
    }

    public void setRight(NoAVL right) {
        this.right = right;
    }

}
