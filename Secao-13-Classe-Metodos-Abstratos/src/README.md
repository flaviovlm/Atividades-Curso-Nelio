# 🦁 Sistema de Cálculo de Impostos (Classes Abstratas)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluido-green?style=for-the-badge)

Exercício final do módulo de **Herança e Polimorfismo**, focando na aplicação de **Classes Abstratas** e **Métodos Abstratos**.

O objetivo é calcular o imposto de renda de um grupo de contribuintes, onde a regra de cálculo muda drasticamente dependendo se é **Pessoa Física (Individual)** ou **Pessoa Jurídica (Company)**.

---

## ⚖️ Regras de Negócio

O sistema deve ler **N** contribuintes. Ao final, deve exibir quanto cada um deve pagar e o total arrecadado pelo governo.

| Tipo | Regra de Cálculo | Dedução / Benefício |
| :--- | :--- | :--- |
| **Pessoa Física** | Renda < 20k: **15%** <br> Renda ≥ 20k: **25%** | Se houve gastos com saúde, **50%** desse gasto é abatido do imposto total. |
| **Pessoa Jurídica** | Taxa Fixa: **16%** | Se tiver **mais de 10 funcionários**, a taxa cai para **14%**. |

---

## 💻 Exemplo de Cenário

**Entrada:**
```text
Enter the number of tax payers: 3

Tax payer #1 data:
Individual or Company (i/c)? i
Name: Alex
Anual income: 50000.00
Health expenditures: 2000.00

Tax payer #2 data:
Individual or Company (i/c)? c
Name: SoftTech
Anual income: 400000.00
Number of employees: 25

Tax payer #3 data:
Individual or Company (i/c)? i
Name: Bob
Anual income: 120000.00
Health expenditures: 0.00

```
**Saída:**
```text
TAXES PAID:
Alex: $ 11500.00
SoftTech: $ 56000.00
Bob: $ 30000.00

TOTAL TAXES: $ 97500.00