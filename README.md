# Análise de Desempenho de Estruturas de Dados em Java

Este projeto faz a comparação de três tipos de estruturas de dados (vetores, árvores binárias e árvores AVL), utilizando operações de inserção, busca e ordenação (Quicksort e BubbleSort). Durante as operações, analisa o tempo de cada execução. O objetivo é entender a eficiência de cada uma das estruturas com cenários e dados diferentes.

## Descrição dos Arquivos

- **`bin/`**: Pasta onde os arquivos compilados do projeto são armazenados.
- **`src/estruturaBase/`**: Contém as implementações básicas das estruturas de dados, como árvores e vetores.
  - `ArvoreAVL.java`: Implementação de uma árvore AVL.
  - `ArvoreBinaria.java`: Implementação de uma árvore binária.
  - `Vetor.java`: Implementação da estrutura de dados Vetor.
- **`src/estruturas/`**: Implementações específicas de árvores e vetores para diferentes tamanhos de dados (100, 1000, 10000 elementos).
  - `ArvoresAVL.java`, `ArvoresBinarias.java`, `Vetores.java`: Implementações para diferentes tamanhos de dados.
- **`src/interfaces/`**: Contém interfaces que definem contratos para as estruturas de dados.
  - `Estrutura.java`: Interface para as estruturas de dados.
- **`src/nos/`**: Contém as representações dos nós para as árvores binária e AVL.
  - `NoAVL.java`: Nó para a árvore AVL.
  - `NoBinaria.java`: Nó para a árvore binária.
- **`src/utils/`**: Contém implementações utilitárias como algoritmos de ordenação e busca.
  - `BinarySearch.java`: Algoritmo de busca binária.
  - `BubbleSort.java`: Algoritmo de ordenação BubbleSort.
  - `QuickSort.java`: Algoritmo de ordenação QuickSort.
  - `TempoGerenciador.java`: Classe abstrata para armazenamento dos tempos das operações.
- **`src/App.java`**: Classe principal do projeto que inicializa e executa o código.
- **`README.md`**: Arquivo de documentação do projeto.

## Como Executar o Projeto
Para rodar o projeto, basta compilar o código e executar a classe App.java. Se estiver usando uma IDE, clique em `Run` ou `Executar` na classe App.java e o programa será iniciado.

## Dependências
Este projeto requer o Java 23 ou superior para ser executado corretamente. A versão do Java usada neste projeto é:

Java 23.0.1 (Lançado em 15 de outubro de 2024)

## Criador do Projeto

<a href="https://github.com/LucasFSouza552">Lucas Felipe de Souza</a>