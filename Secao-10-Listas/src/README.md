# 💼 Employee Management System (List & Streams)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

> **Tópico:** Listas Dinâmicas, Expressões Lambda e Referência de Memória.

## 📜 Enunciado do Problema

Fazer um programa para ler um número inteiro **N** e depois os dados (id, nome e salário) de **N** funcionários. Não deve haver repetição de id.

Em seguida, efetuar o aumento de **X por cento** no salário de um determinado funcionário.
Para isso, o programa deve ler um **id** e o valor **X**. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários na tela.

---

## ⚙️ Exemplo de Funcionamento

O sistema trata dois cenários principais: sucesso na busca do ID e erro caso o ID não exista.

### Cenário 1: ID Encontrado
```text
How many employees will be registered? 3

Employee #1:
Id: 333
Name: Maria Brown
Salary: 4000.00

Employee #2:
Id: 536
Name: Alex Grey
Salary: 3000.00

Employee #3:
Id: 772
Name: Bob Green
Salary: 5000.00

Enter the employee id that will have salary increase: 536
Enter the percentage: 10.0

List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3300.00  <-- (Salário atualizado: 3000 + 10%)
772, Bob Green, 5000.00
```
### Cenário 2 : ID Inexistente 
```text
Enter the employee id that will have salary increase: 100
This id does not exist!

List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3000.00
772, Bob Green, 5000.00
