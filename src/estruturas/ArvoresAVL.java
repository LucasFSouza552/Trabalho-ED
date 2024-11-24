package estruturas;

import estruturaBase.ArvoreAVL;

public class ArvoresAVL {

    private ArvoreAVL[] arvoresAVL;

    public ArvoresAVL() {
        arvoresAVL = new ArvoreAVL[] {
                new ArvoreAVL(100),
                new ArvoreAVL(1000),
                new ArvoreAVL(10000)
        };
    }

    public void preencherOrdenado() {
        for (int r = 0; r < 5; r++) {
            for (int i = 0; i < arvoresAVL.length; i++) {
                arvoresAVL[i].preencherOrdenado();
            }
        }
    }

    public void preencherInverso() {
        for (int r = 0; r < 5; r++) {
            for (int i = 0; i < arvoresAVL.length; i++) {
                arvoresAVL[i].preencherInverso();
            }
        }
    }

    public void preencherAleatorio() {
        for (int r = 0; r < 5; r++) {
            for (int i = 0; i < arvoresAVL.length; i++) {
                arvoresAVL[i].preencherAleatorio();
            }
        }
    }

    /**
     * Executa as operações de busca
     * Primeiro Elemento
     * Ultimo Elemento
     * Meio Elemento
     * Elemento Inexistente
     * Elemento Aleatório
     */
    public void buscarElementos() {
        for (int r = 0; r < 5; r++) {
            for (int i = 0; i < arvoresAVL.length; i++) {
                ArvoreAVL arvoreAVL = arvoresAVL[i];
                arvoreAVL.buscarPrimeiroElemento();
                arvoreAVL.buscarUltimoElemento();
                arvoreAVL.buscarMeioElemento();
                arvoreAVL.buscarValorInexistente();
                arvoreAVL.buscarValorAleatorio();
            }
        }
    }

    public void mostrarTempos() {
        // Cabeçalhos da tabela
        String[] headers = {
                "Vetor", "Tempo para preencher", "Primeiro Elemento", "Ultimo Elemento",
                "Meio Elemento", "Elemento Inexistente", "Elemento Aleatório"
        };

        // Dados da tabela
        String[][] data = new String[arvoresAVL.length][headers.length];
        int[] maxLengths = new int[headers.length];

        // Preenchendo os dados
        for (int i = 0; i < arvoresAVL.length; i++) {
            ArvoreAVL arvoreBinaria = arvoresAVL[i];

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
