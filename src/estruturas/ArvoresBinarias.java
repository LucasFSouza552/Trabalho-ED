package estruturas;

import estruturaBase.ArvoreBinaria;

public class ArvoresBinarias {

    private ArvoreBinaria[] arvoresBinarias;

    public ArvoresBinarias() {
        arvoresBinarias = new ArvoreBinaria[] {
                new ArvoreBinaria(100),
                new ArvoreBinaria(1000),
                new ArvoreBinaria(10000)
        };
    }

    public void deletarDados() {
        arvoresBinarias[0].deletar();
        arvoresBinarias[1].deletar();
        arvoresBinarias[2].deletar();
    }

    public void preencherOrdenado() {
        for (int r = 0; r < 5; r++) {
            deletarDados();
            for (int i = 0; i < arvoresBinarias.length; i++) {
                arvoresBinarias[i].preencherOrdenado();
            }
        }
    }

    public void preencherInverso() {
        for (int i = 0; i < arvoresBinarias.length; i++) {
            for (int r = 0; r < 5; r++) {
                deletarDados();
                arvoresBinarias[i].preencherInverso();
            }
        }
    }

    public void preencherAleatorio() {
        for (int i = 0; i < arvoresBinarias.length; i++) {
            for (int r = 0; r < 5; r++) {
                deletarDados();
                arvoresBinarias[i].preencherAleatorio();
            }
        }
    }

    public void inorder(int posicao) {
        arvoresBinarias[posicao].inorder();
    }

    public void buscarElementos() {

        for (int i = 0; i < arvoresBinarias.length; i++) {
            ArvoreBinaria arvoreBinaria = arvoresBinarias[i];
            // arvoreBinaria.inorder();
            arvoreBinaria.buscarPrimeiroElemento();
            arvoreBinaria.buscarUltimoElemento();
            arvoreBinaria.buscarMeioElemento();
            arvoreBinaria.buscarValorInexistente();
            arvoreBinaria.buscarValorAleatorio();
        }
    }

    public void mostrarTempos() {
        // Cabeçalhos da tabela
        String[] headers = {
                "Vetor", "Tempo para preencher", "Primeiro Elemento", "Ultimo Elemento",
                "Meio Elemento", "Elemento Inexistente", "Elemento Aleatório"
        };

        // Dados da tabela
        String[][] data = new String[arvoresBinarias.length][headers.length];
        int[] maxLengths = new int[headers.length];

        // Preenchendo os dados
        for (int i = 0; i < arvoresBinarias.length; i++) {
            ArvoreBinaria arvoreBinaria = arvoresBinarias[i];

            long preencher = arvoreBinaria.getTempoParaPreencher() / 5;
            long primeiro = arvoreBinaria.getTempoPrimeiroElemento() / 5;
            long ultimo = arvoreBinaria.getTempoUltimoElemento() / 5;
            long meio = arvoreBinaria.getTempoMeioElemento() / 5;
            long inexistente = arvoreBinaria.getTempoElementoInexistente() / 5;
            long aleatorio = arvoreBinaria.getTempoElementoAleatorio() / 5;

            data[i][0] = String.valueOf(arvoreBinaria.getTamanho());
            data[i][1] = String.valueOf(preencher);
            data[i][2] = String.valueOf(primeiro);
            data[i][3] = String.valueOf(ultimo);
            data[i][4] = String.valueOf(meio);
            data[i][5] = String.valueOf(inexistente);
            data[i][6] = String.valueOf(aleatorio);

            for (int j = 0; j < headers.length; j++) {
                maxLengths[j] = Math.max(maxLengths[j], Math.max(headers[j].length(), data[i][j].length()));
            }
        }

        // Imprimindo a tabela no console no formato Markdown
        System.out.printf(
                "| %-" + maxLengths[0] + "s | %-" + maxLengths[1] + "s | %-" + maxLengths[2] + "s | %-" + maxLengths[3]
                        + "s | %-" + maxLengths[4] + "s | %-" + maxLengths[5] + "s | %-" + maxLengths[6] + "s |%n",
                (Object[]) headers);

        System.out.println("|" + "-".repeat(maxLengths[0]) + "|-" + "-".repeat(maxLengths[1]) + "-|-"
                + "-".repeat(maxLengths[2]) + "-|-" + "-".repeat(maxLengths[3]) + "-|-" + "-".repeat(maxLengths[4])
                + "-|-" + "-".repeat(maxLengths[5]) + "-|-" + "-".repeat(maxLengths[6]) + "-|");

        for (String[] row : data) {
            System.out.printf("| %-" + maxLengths[0] + "s | %-" + maxLengths[1] + "s | %-" + maxLengths[2] + "s | %-"
                    + maxLengths[3] + "s | %-" + maxLengths[4] + "s | %-" + maxLengths[5] + "s | %-" + maxLengths[6]
                    + "s |%n", (Object[]) row);
        }
    }

}
