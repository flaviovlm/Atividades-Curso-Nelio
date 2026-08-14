# Contador de Alunos Únicos (Exercício Set - Java)

Este projeto é uma solução para o exercício prático sobre a interface Set e a classe HashSet, do curso de Java ministrado pelo professor Nélio Alves.

## Sobre o Problema
Um instrutor de cursos online possui três turmas: Curso A, Curso B e Curso C.
Cada aluno possui um código de identificação único (inteiro). Um mesmo aluno pode estar matriculado em mais de um curso ao mesmo tempo.

O objetivo do programa é ler os alunos de cada disciplina e calcular o total exato de alunos únicos do instrutor, garantindo que ninguém seja contado duas vezes.

---

## Como Funciona a Solução
1. Estruturas de Dados: Utilizei instâncias de HashSet<Integer> para guardar as matrículas de cada turma (A, B e C).
2. Leitura Interativa: Um laço for itera sobre os nomes das turmas, lendo os códigos informados via Scanner.
3. União de Conjuntos (addAll): Para calcular o total geral sem duplicatas, criamos um conjunto consolidado e unimos os dados das três turmas usando o método .addAll().

---

## Tecnologias e Conceitos Utilizados
* Java (JDK 25)
* Collections Framework (Set / HashSet)
* Operação de União de Conjuntos (addAll)
* Estruturas de Repetição e Condicionais (for, if-else)

---

## Como Executar

1. Clone o repositório:
   ```bash
   git clone [https://github.com/flaviovlm/Atividades-Curso-Nelio.git](https://github.com/flaviovlm/Atividades-Curso-Nelio.git)