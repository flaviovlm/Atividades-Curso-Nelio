# 🏦 Bank Account System (Exception Handling)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)

Exercício de fixação do módulo de **Tratamento de Exceções**.
O objetivo é simular uma operação de saque bancário, onde regras de negócio podem impedir a transação. Ao invés de usar `if-else` no programa principal, utilizamos **Exceções Personalizadas** para tratar os erros de forma robusta.

---

## 🛡️ Regras de Negócio (Validation Logic)

O sistema deve permitir realizar saques (`withdraw`), mas deve lançar uma exceção caso as regras abaixo sejam violadas:

| Regra | Condição de Erro | Mensagem de Exceção |
| :--- | :--- | :--- |
| **Limite de Saque** | Valor do saque > Limite definido na conta | *"The amount exceeds withdraw limit"* |
| **Saldo Insuficiente** | Valor do saque > Saldo atual + Limite* | *"Not enough balance"* |

*> Nota: Neste exercício específico, a validação de saldo considera apenas o dinheiro em conta, sem cheque especial, para simplificação.*

---

## 💻 Exemplo de Execução

O programa deve tratar os erros (try-catch) e não deixar o sistema "quebrar" (crash).

**Cenário 1: Sucesso**
```text
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 100.00
New balance: 400.00
```

**Cenário 2: Erro de limite**
```text
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 400.00
Withdraw error: The amount exceeds withdraw limit
```

**Cenário 3: Erro de saldo**
```text
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 200.00
Withdraw limit: 300.00

Enter amount for withdraw: 250.00
Withdraw error: Not enough balance