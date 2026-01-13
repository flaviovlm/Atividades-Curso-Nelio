# 🛒 Desafio de Fixação: Sumário de Pedido (Order Summary)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![UML](https://img.shields.io/badge/UML-Model-blue?style=for-the-badge)

Exercício de fixação sobre **Composição** e **Enumerações**, baseado no diagrama de classes fornecido.

---

## 📝 Enunciado
Ler os dados de um pedido com **N** itens (N fornecido pelo usuário). Depois, mostrar um sumário do pedido conforme exemplo.
> **Nota:** O instante do pedido deve ser o instante do sistema: `new Date()`.

---

## 🏗️ Estrutura das Classes (Conforme UML)

### 1. Enumeração
* **OrderStatus:**
    * `PENDING_PAYMENT` (0)
    * `PROCESSING` (1)
    * `SHIPPED` (2)
    * `DELIVERED` (3)

### 2. Entidades
* **Client**
    * `- name : String`
    * `- email : String`
    * `- birthDate : Date`

* **Product**
    * `- name : String`
    * `- price : Double`

* **OrderItem**
    * `- quantity : Integer`
    * `- price : Double`
    * `+ subTotal() : Double` (Lógica: `price * quantity`)

* **Order**
    * `- moment : Date`
    * `- status : OrderStatus`
    * `+ addItem(item : OrderItem) : void`
    * `+ removeItem(item : OrderItem) : void`
    * `+ total() : Double` (Lógica: Soma dos subtotais)

---

## 🖥️ Exemplo de Interação

```text
Enter client data:
Name: Alex Green
Email: alex@gmail.com
Birth date (DD/MM/YYYY): 15/03/1985

Enter order data:
Status: PROCESSING
How many items to this order? 2

Enter #1 item data:
Product name: TV
Product price: 1000.00
Quantity: 1

Enter #2 item data:
Product name: Mouse
Product price: 40.00
Quantity: 2

ORDER SUMMARY:
Order moment: 20/04/2018 11:25:09
Order status: PROCESSING
Client: Alex Green (15/03/1985) - alex@gmail.com
Order items:
TV, $1000.00, Quantity: 1, Subtotal: $1000.00
Mouse, $40.00, Quantity: 2, Subtotal: $80.00
Total price: $1080.00   