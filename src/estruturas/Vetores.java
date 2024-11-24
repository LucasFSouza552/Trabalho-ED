package estruturas;

import estruturaBase.Vetor;

public class Vetores {

    private Vetor[] vetores;

    public Vetores() {
        vetores = new Vetor[] {
                new Vetor(100),
                new Vetor(1000),
                new Vetor(10000)
        };
    }

    public void preencherOrdenados() {
        for (int r = 0; r < 5; r++) {
            for (int i = 0; i < vetores.length; i++) {
                vetores[i].preencherOrdenado();
            }
        }
    }

    public void preencherInverso() {
        for (int r = 0; r < 5; r++) {
            for (int i = 0; i < vetores.length; i++) {
                vetores[i].preencherInverso();
            }
        }
    }

    public void preencherAleatorio() {
        for (int r = 0; r < 5; r++) {
            for (int i = 0; i < vetores.length; i++) {
                vetores[i].preencherAleatorio();
            }
        }
    }

    public void buscaBinaria() {
        for (int r = 0; r < 5; r++) {
            for (int i = 0; i < vetores.length; i++) {
                Vetor vetor = vetores[i];
                vetor.buscaBinaria();
            }
        }
    }

    public void quickSort() {
        for (int r = 0; r < 5; r++) {
            for (int i = 0; i < vetores.length; i++) {
                Vetor vetor = vetores[i];
                vetor.quickSort();
            }
        }
    }

    public void bubbleSort() {
        for (int r = 0; r < 5; r++)
            for (int i = 0; i < vetores.length; i++) {
                Vetor vetor = vetores[i];
                vetor.bubbleSort();
            }
    }

    public void buscarElementos() {

        for (int r = 0; r < 5; r++) {
            for (int i = 0; i < vetores.length; i++) {
                Vetor vetor = vetores[i];
                vetor.buscarPrimeiroElemento();
                vetor.buscarUltimoElemento();
                vetor.buscarMeioElemento();
                vetor.buscarValorInexistente();
                vetor.buscarValorAleatorio();
            }
        }
    }

    public void mostrarTempos() {
        // Cabeçalhos da tabela
        String[] headers = {
            "Vetor", "Tempo para preencher", "Primeiro Elemento", "Ultimo Elemento", 
            "Meio Elemento", "Elemento Inexistente", "Elemento Aleatório", 
            "Tempo do QuickSort", "Tempo do BubbleSort"
        };
    
        // Dados da tabela
        String[][] data = new String[vetores.length][headers.length];
        int[] maxLengths = new int[headers.length];
        int Repeticoes = 5;
    
        // Preenchendo os dados
        for (int i = 0; i < vetores.length; i++) {
            Vetor vetor = vetores[i];
    
            long preencher = vetor.getTempoParaPreencher() / Repeticoes;
    
            // Buscas
            long primeiro = vetor.getTempoPrimeiroElemento() / Repeticoes;
            long ultimo = vetor.getTempoUltimoElemento() / Repeticoes;
            long meio = vetor.getTempoMeioElemento() / Repeticoes;
            long inexistente = vetor.getTempoElementoInexistente() / Repeticoes;
            long aleatorio = vetor.getTempoElementoAleatorio() / Repeticoes;
            long quickSort = vetor.getQuickSortTime() / Repeticoes;
            long bubbleSort = vetor.getBubbleSortTime() / Repeticoes;
    
            // Binários
            long primeiroBinaria = vetor.getTempoPrimeiroElementoBinaria() / Repeticoes;
            long ultimoBinaria = vetor.getTempoUltimoElementoBinaria() / Repeticoes;
            long meioBinaria = vetor.getTempoMeioElementoBinaria() / Repeticoes;
            long inexistenteBinaria = vetor.getTempoElementoInexistenteBinaria() / Repeticoes;
            long aleatorioBinaria = vetor.getTempoElementoAleatorioBinaria() / Repeticoes;
    
            // Preenchendo a tabela
            data[i][0] = String.valueOf(vetor.getVetor().length);
            data[i][1] = String.valueOf(preencher);
            data[i][2] = String.valueOf(primeiro + " - Binaria: " + primeiroBinaria);
            data[i][3] = String.valueOf(ultimo + " - Binaria: " + ultimoBinaria);
            data[i][4] = String.valueOf(meio + " - Binaria: " + meioBinaria);
            data[i][5] = String.valueOf(inexistente + " - Binaria: " + inexistenteBinaria);
            data[i][6] = String.valueOf(aleatorio + " - Binaria: " + aleatorioBinaria);
            data[i][7] = String.valueOf(quickSort);
            data[i][8] = String.valueOf(bubbleSort);
    
            // Atualizando o comprimento máximo das colunas
            for (int j = 0; j < headers.length; j++) {
                maxLengths[j] = Math.max(maxLengths[j], Math.max(headers[j].length(), data[i][j].length()));
            }
        }
    
        // Imprimindo a tabela no console no formato Markdown
        System.out.printf("| %-"+maxLengths[0]+"s | %-"+maxLengths[1]+"s | %-"+maxLengths[2]+"s | %-"+maxLengths[3]+"s | %-"+maxLengths[4]+"s | %-"+maxLengths[5]+"s | %-"+maxLengths[6]+"s | %-"+maxLengths[7]+"s | %-"+maxLengths[8]+"s |%n", (Object[]) headers);
    
        // Linha divisória
        System.out.println("|" + "-".repeat(maxLengths[0]) + "|-" + "-".repeat(maxLengths[1]) + "-|-" + "-".repeat(maxLengths[2]) + "-|-" + "-".repeat(maxLengths[3]) + "-|-" + "-".repeat(maxLengths[4]) + "-|-" + "-".repeat(maxLengths[5]) + "-|-" + "-".repeat(maxLengths[6]) + "-|-" + "-".repeat(maxLengths[7]) + "-|-" + "-".repeat(maxLengths[8]) + "-|");
    
        // Imprimindo as linhas de dados
        for (String[] row : data) {
            System.out.printf("| %-"+maxLengths[0]+"s | %-"+maxLengths[1]+"s | %-"+maxLengths[2]+"s | %-"+maxLengths[3]+"s | %-"+maxLengths[4]+"s | %-"+maxLengths[5]+"s | %-"+maxLengths[6]+"s | %-"+maxLengths[7]+"s | %-"+maxLengths[8]+"s |%n", (Object[]) row);
        }
    }
    

}
