# 🏨 Desafio Pensionato (Boarding House)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

> **Tópico:** Vetores, Memória e Lógica de Programação

## 📝 Sobre o Desafio

Este exercício faz parte do curso de **Java Completo**. O objetivo é simular o sistema de aluguel de quartos de um pensionato.

O prédio possui **10 quartos** (numerados de 0 a 9). O programa deve receber os dados de `N` estudantes (nome e email) e o número do quarto que cada um escolheu. Ao final, deve ser gerado um relatório mostrando apenas os quartos ocupados, em ordem crescente.

## 💡 O Que Aprendi (Key Concepts)

Este desafio foi fundamental para consolidar o entendimento sobre como o Java gerencia memória:

* **Vetores de Objetos vs. Primitivos:** Diferente de um vetor de `int` (que inicia com 0), um vetor de Objetos (ex: `Rent[]`) inicia com todas as posições `null`.
* **Mapeamento Direto:** Utilização do número do quarto escolhido pelo usuário diretamente como o **índice** do vetor, eliminando a necessidade de loops de busca complexos.
* **Tratamento de Null:** Lógica para iterar sobre o vetor e imprimir apenas as posições instanciadas (`if (vect[i] != null)`), evitando o erro `NullPointerException`.

## ⚙️ Exemplo de Funcionamento

**Entrada:**
```text
How many rooms will be rented? 3

Rent #1:
Name: Maria Green
Email: maria@gmail.com
Room: 5

Rent #2:
Name: Marco Antonio
Email: marco@gmail.com
Room: 1

Rent #3:
Name: Alex Brown
Email: alex@gmail.com
Room: 8