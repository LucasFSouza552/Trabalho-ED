package interfaces;

public interface Estrutura {

    public void preencherOrdenado();

    public void preencherInverso();

    public void preencherAleatorio();

    public int buscarElemento(int elemento);

    public int buscarPorIndice(int indice);

    public void buscarPrimeiroElemento();

    public void buscarUltimoElemento();

    public void buscarMeioElemento();

    public void buscarValorInexistente();

    public void buscarValorAleatorio();

    public long getTime();
}
