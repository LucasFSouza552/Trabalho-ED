import estruturas.ArvoresAVL;
import estruturas.ArvoresBinarias;
import estruturas.Vetores;

public class App {

    public static void main(String[] args) throws Exception {

        new App();
    }

    public App() {
        testarVetores();
        System.out.println("");
        testarArvoreBinaria();
        System.out.println("");

        testarArvoreAVL();
    }

    private void testarVetores() {
        Vetores vetoresOrdenados = new Vetores();
        vetoresOrdenados.preencherOrdenados();
        vetoresOrdenados.buscarElementos();
        vetoresOrdenados.buscaBinaria();
        vetoresOrdenados.quickSort();
        vetoresOrdenados.bubbleSort();

        Vetores vetoresInverso = new Vetores();
        vetoresInverso.preencherInverso();
        vetoresInverso.buscarElementos();
        vetoresInverso.buscaBinaria();
        vetoresInverso.quickSort();
        vetoresInverso.bubbleSort();

        Vetores vetoresAleatorio = new Vetores();
        vetoresAleatorio.preencherAleatorio();
        vetoresAleatorio.buscarElementos();
        vetoresAleatorio.buscaBinaria();
        vetoresAleatorio.quickSort();

        // Exibir tempos
        System.out.println("Vetores ordenados: ");
        vetoresOrdenados.mostrarTempos();
        System.out.println("");
        System.out.println("Vetores invertidos: ");
        vetoresInverso.mostrarTempos();
        System.out.println("");
        vetoresAleatorio.bubbleSort();
        System.out.println("Vetores aleatorios: ");
        vetoresAleatorio.mostrarTempos();
        System.out.println("");
    }

    private void testarArvoreBinaria() {
        ArvoresBinarias arvoreBinariaOrdenada = new ArvoresBinarias();
        arvoreBinariaOrdenada.preencherOrdenado();
        arvoreBinariaOrdenada.buscarElementos();
        System.out.println("Árvore Binaria Ordenada: ");
        arvoreBinariaOrdenada.mostrarTempos();
        System.out.println("");

        ArvoresBinarias arvoreBinariaInversa = new ArvoresBinarias();
        arvoreBinariaInversa.preencherInverso();
        arvoreBinariaInversa.buscarElementos();
        System.out.println("Árvore Binaria Inversa: ");
        arvoreBinariaInversa.mostrarTempos();
        System.out.println("");

        ArvoresBinarias arvoreBinariaAleatorio = new ArvoresBinarias();
        arvoreBinariaAleatorio.preencherAleatorio();
        arvoreBinariaAleatorio.buscarElementos();
        System.out.println("Árvore Binaria Aleatoria: ");
        arvoreBinariaAleatorio.mostrarTempos();
        System.out.println("");
    }

    private void testarArvoreAVL() {
        ArvoresAVL arvoresAvlOrdenada = new ArvoresAVL();
        arvoresAvlOrdenada.preencherOrdenado();
        arvoresAvlOrdenada.buscarElementos();
        System.out.println("Árvore AVL Ordenada: ");
        arvoresAvlOrdenada.mostrarTempos();
        System.out.println("");

        ArvoresAVL arvoresAvlInversa = new ArvoresAVL();
        arvoresAvlInversa.preencherInverso();
        arvoresAvlInversa.buscarElementos();
        System.out.println("Árvore AVL Inversa: ");
        arvoresAvlInversa.mostrarTempos();
        System.out.println("");

        ArvoresAVL arvoresAvlAleatorio = new ArvoresAVL();
        arvoresAvlAleatorio.preencherAleatorio();
        arvoresAvlAleatorio.buscarElementos();
        System.out.println("Árvore AVL Aleatoria: ");
        arvoresAvlAleatorio.mostrarTempos();
        System.out.println("");

    }
}
