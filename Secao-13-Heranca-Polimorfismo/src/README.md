# 🏷️ Desafio: Etiquetas de Preço (Polimorfismo)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluido-green?style=for-the-badge)

Exercício de fixação sobre **Herança** e **Polimorfismo** do curso de Java Completo (Prof. Nélio Alves).

O objetivo é ler um conjunto de produtos e gerar suas etiquetas de preço, comportando-se de maneira diferente dependendo do tipo do produto (Comum, Importado ou Usado).

---

## 📝 Regras de Negócio

O programa deve ler **N** produtos. Para cada produto, o sistema pergunta se é Comum (c), Usado (u) ou Importado (i).

1.  **Produto Comum:** A etiqueta deve mostrar apenas `Nome $ Preço`.
2.  **Produto Importado:**
    * Deve ler a **Taxa de Alfândega** (`customsFee`).
    * O preço final deve somar a taxa.
    * A etiqueta deve mostrar `Nome $ PreçoTotal (Customs fee: $ Taxa)`.
3.  **Produto Usado:**
    * Deve ler a **Data de Fabricação** (`manufactureDate`).
    * A etiqueta deve mostrar `Nome (used) $ Preço (Manufacture date: dd/MM/yyyy)`.

---

## 💻 Exemplo de Entrada e Saída

```text
Enter the number of products: 3
Product #1 data:
Common, used or imported (c/u/i)? c
Name: Tablet
Price: 260.00

Product #2 data:
Common, used or imported (c/u/i)? i
Name: Notebook
Price: 1100.00
Customs fee: 20.00

Product #3 data:
Common, used or imported (c/u/i)? u
Name: iPhone
Price: 400.00
Manufacture date (DD/MM/YYYY): 15/03/2017

--- PRICE TAGS ---
Tablet $ 260.00
Notebook $1120.00 (Customs fee:$ 20.00)
iPhone (used) $ 400.00 (Manufacture date: 15/03/2017)