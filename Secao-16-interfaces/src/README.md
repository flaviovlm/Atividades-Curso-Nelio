# 💳 Sistema de Processamento de Contratos (Interfaces)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-%234CAF50.svg?style=for-the-badge)

## 💻 Sobre o Projeto

Este projeto consiste em um sistema backend para processamento automatizado de parcelas de contratos. O principal objetivo acadêmico foi a aplicação de **Interfaces** para garantir o **baixo acoplamento** entre a camada de serviço (`Service`) e a regra de negócio de pagamento.

A aplicação permite a geração de parcelas mensais, aplicando juros e taxas específicas de um serviço financeiro (neste exemplo, o **PayPal**), mas foi arquitetada para aceitar qualquer outro serviço (ex: PagSeguro, Stripe) sem a necessidade de modificar o código existente da classe de serviço principal, respeitando o princípio **Open/Closed** do SOLID.

---

## ⚙️ Arquitetura e Conceitos Aplicados

O projeto foi estruturado utilizando o padrão de camadas (**Domain Layer** e **Service Layer**) e foca na **Injeção de Dependência Manual**.

### Estrutura de Classes (Resumo)

* **`ContractService`**: Responsável por gerar as parcelas. Ela **não conhece** a implementação concreta do serviço de pagamento (PayPal). Ela conhece apenas a Interface.
* **`OnlinePaymentService` (Interface)**: O "Contrato" que define os métodos obrigatórios (`paymentFee`, `interest`).
* **`PaypalService`**: A implementação concreta que define as taxas de 1% e 2%.

> **Conceito Chave:** Inversão de Controle (IoC). A classe `ContractService` recebe a dependência via construtor, permitindo flexibilidade total.

---

## 🧮 Regras de Negócio

O serviço de pagamento atual (PayPal) aplica as seguintes regras para cada parcela gerada:

1.  **Juros Simples:** 1% a cada mês acumulado.
2.  **Taxa de Pagamento:** 2% sobre o valor já corrigido com os juros.

### Exemplo de Cálculo (Mesa de Teste)

Para um contrato de **R$ 600,00** em **3 parcelas**:

| Parcela | Data | Cálculo (Base 200.00) | Total |
| :--- | :--- | :--- | :--- |
| **#1** | 1 mês após | 200 + 1% (juros) + 2% (taxa) | **206.04** |
| **#2** | 2 meses após | 200 + 2% (juros) + 2% (taxa) | **208.08** |
| **#3** | 3 meses após | 200 + 3% (juros) + 2% (taxa) | **210.12** |

---

## 🛠 Tecnologias Utilizadas

* **Java 21** (Lógica e POO)
* **Interfaces** (Polimorfismo e Abstração)
* **Date/Time API** (`LocalDate`, `DateTimeFormatter`)

---

## 🚀 Como Executar

1.  Clone o repositório.
2.  Abra o projeto na sua IDE favorita (IntelliJ, Eclipse).
3.  Execute a classe `Main.java` (pacote `application`).
4.  Insira os dados do contrato no console conforme solicitado.

### Exemplo de Entrada/Saída no Console

```text
Enter the number of contract: 
Number: 8028
Date (dd/MM/yyyy): 25/06/2018
Value Contract: 600.00
Enter the number of installments: 3

PARCELAS: 
25/07/2018 - 206.04
25/08/2018 - 208.08
25/09/2018 - 210.12
