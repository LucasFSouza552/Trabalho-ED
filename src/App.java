import estruturas.ArvoresAVL;
import estruturas.ArvoresBinarias;
import estruturas.Vetores;

public class App {

    public static void main(String[] args) throws Exception {
        new App();
    }

    public App() {
        // Testa a classe Vetores com diferentes tipos de preenchimento
        testarVetores();
        System.out.println("");
        // Testa a classe ArvoresBinaria com diferentes tipos de preenchimento
        testarArvoreBinaria();
        System.out.println("");
        // Testa a classe ArvoresAVL com diferentes tipos de preenchimento
        testarArvoreAVL();
    }

    /**
     * Testa a classe Vetores com diferentes tipos de preenchimento
     */
    private void testarVetores() {
        // Vetores ordenados
        Vetores vetoresOrdenados = new Vetores();
        vetoresOrdenados.preencherOrdenados();
        vetoresOrdenados.buscarElementos();
        vetoresOrdenados.buscaBinaria();
        vetoresOrdenados.quickSort();
        vetoresOrdenados.bubbleSort();

        System.out.println("Vetores ordenados: ");
        vetoresOrdenados.mostrarTempos();
        System.out.println("");

        // Vetores invertidos
        Vetores vetoresInverso = new Vetores();
        vetoresInverso.preencherInverso();
        vetoresInverso.buscarElementos();
        vetoresInverso.buscaBinaria();
        vetoresInverso.quickSort();
        vetoresInverso.bubbleSort();

        System.out.println("Vetores invertidos: ");
        vetoresInverso.mostrarTempos();
        System.out.println("");

        // Vetores aleatorios
        Vetores vetoresAleatorio = new Vetores();
        vetoresAleatorio.preencherAleatorio();
        vetoresAleatorio.buscarElementos();
        vetoresAleatorio.buscaBinaria();
        vetoresAleatorio.quickSort();

        vetoresAleatorio.bubbleSort();
        System.out.println("Vetores aleatorios: ");
        vetoresAleatorio.mostrarTempos();
        System.out.println("");
    }

    /**
     * Testa a classe ArvoresBinaria com diferentes tipos de preenchimento
     */
    private void testarArvoreBinaria() {
        // Árvore Binaria ordenada
        ArvoresBinarias arvoreBinariaOrdenada = new ArvoresBinarias();
        arvoreBinariaOrdenada.preencherOrdenado();
        arvoreBinariaOrdenada.buscarElementos();
        System.out.println("Árvore Binaria Ordenada: ");
        arvoreBinariaOrdenada.mostrarTempos();
        System.out.println("");

        // Árvore Binaria invertida
        ArvoresBinarias arvoreBinariaInversa = new ArvoresBinarias();
        arvoreBinariaInversa.preencherInverso();
        arvoreBinariaInversa.buscarElementos();
        System.out.println("Árvore Binaria Inversa: ");
        arvoreBinariaInversa.mostrarTempos();
        System.out.println("");

        // Árvore Binaria aleatoria
        ArvoresBinarias arvoreBinariaAleatorio = new ArvoresBinarias();
        arvoreBinariaAleatorio.preencherAleatorio();
        arvoreBinariaAleatorio.buscarElementos();
        System.out.println("Árvore Binaria Aleatoria: ");
        arvoreBinariaAleatorio.mostrarTempos();
        System.out.println("");
    }

    /**
     * Testa a classe ArvoresAVL com diferentes tipos de preenchimento
     */
    private void testarArvoreAVL() {
        // Árvore AVL ordenada
        ArvoresAVL arvoresAvlOrdenada = new ArvoresAVL();
        arvoresAvlOrdenada.preencherOrdenado();
        arvoresAvlOrdenada.buscarElementos();
        System.out.println("Árvore AVL Ordenada: ");
        arvoresAvlOrdenada.mostrarTempos();
        System.out.println("");

        // Árvore AVL invertida
        ArvoresAVL arvoresAvlInversa = new ArvoresAVL();
        arvoresAvlInversa.preencherInverso();
        arvoresAvlInversa.buscarElementos();
        System.out.println("Árvore AVL Inversa: ");
        arvoresAvlInversa.mostrarTempos();
        System.out.println("");

        // Árvore AVL aleatoria
        ArvoresAVL arvoresAvlAleatorio = new ArvoresAVL();
        arvoresAvlAleatorio.preencherAleatorio();
        arvoresAvlAleatorio.buscarElementos();
        System.out.println("Árvore AVL Aleatoria: ");
        arvoresAvlAleatorio.mostrarTempos();
        System.out.println("");

    }
}
