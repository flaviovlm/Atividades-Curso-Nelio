# Formação Java Completo & Programação Orientada a Objetos

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em_Progresso-yellow?style=for-the-badge)

Este repositório documenta minha jornada de aprofundamento no **Core do Java**, seguindo o curso do professor Nélio Alves.

Embora eu já atue com **Spring Boot** no desenvolvimento de APIs, o objetivo deste estudo é fortalecer os conceitos de **Engenharia de Software**, **Gerenciamento de Memória** e **Arquitetura de Objetos** que rodam "por baixo do capô" dos frameworks modernos.

---

## Objetivos de Estudo (Jan/2026)
O foco não é apenas sintaxe, mas sim boas práticas, manipulação de memória e design de código.

- [x] **Introdução à POO:** Classes, Atributos, Métodos e Membros Estáticos.
- [x] **Construtores & Encapsulamento:** Sobrecarga, Palavra `this`, Javabeans.
- [x] **Comportamento de Memória:** Stack vs Heap, Vetores de Objetos, Garbage Collection.
- [x] **Listas e Fluxos:** Interface List, ArrayList e introdução a Streams.
- [x] **Enumerações e Composição:** Modelagem de objetos complexos (ex: Pedido -> Itens -> Produto).
- [x] **Herança e Polimorfismo:** Classes Abstratas e Métodos Abstratos.
- [x] **Tratamento de Exceções:** Try, Catch, Finally e Exceções Personalizadas.
- [x] **Interfaces:** Injeção de Dependência, Inversão de Controle e Strategy Pattern.
- [x] **Generics e Set:** Tipos genéricos, Coleções Hash/Tree e Operações de Conjuntos.
- [ ] **Map:** Estrutura Chave/Valor, manipulação de pares e implementações (`HashMap`, `TreeMap`).

---

## Estrutura do Repositório

Os exercícios estão organizados por tópicos para facilitar a consulta e revisão de conceitos fundamentais.

| Tópico | Destaque | Conceitos Aplicados |
| :--- | :--- | :--- |
| **01. Membros Estáticos** | [`/Secao-08-Membros-Estaticos`](./Secao-08-Membros-Estaticos) | Métodos `static`, Constantes, `Math` utils. |
| **02. Construtores** | [`/Secao-09-Construtores`](./Secao-09-Construtores) | Encapsulamento, Sobrecarga e Palavra `this`. |
| **03. Memória e Vetores** | [`/Secao-10-Memoria-Vetores`](./Secao-10-Memoria-Vetores) | **Desafio do Pensionato**, Vetores de Objetos, Tratamento de `null`. |
| **04. Listas e Streams** | [`/Secao-10-Listas`](./Secao-10-Listas) | **Aumento Salarial**, Interface `List`, Predicados (Lambda) e Stream API. |
| **05. Enumerações e Composição** | [`/Secao-12-Enumeracoes`](./Secao-12-Enumeracoes) | **Order Summary**, StringBuilder, Enums, Design de Classes (1:N). |
| **06. Herança e Polimorfismo** | [`/Secao-13-Heranca-Polimorfismo`](./Secao-13-Heranca-Polimorfismo) | **Price Tags**, `extends`, `super`, `@Override`, Polimorfismo. |
| **07. Classes Abstratas** | [`/Secao-13-Classe-Metodos-Abstratos`](./Secao-13-Classe-Metodos-Abstratos) | **Tax Payer System**, Classes e Métodos Abstratos, Lógica de Negócio Polimórfica. |
| **08. Tratamento de Exceções** | [`/Secao-14-Tratamento-Excecoes`](./Secao-14-Tratamento-Excecoes) | **Bank Account**, `try-catch`, Custom Exceptions, `RuntimeException`. |
| **09. Interfaces** | [`/Secao-16-interfaces`](./Secao-16-interfaces) | **Contract Service**, Injeção de Dependência, Baixo Acoplamento, Interface vs Classe Concreta. |
| **10. Generics e Set** | [`/Secao-17-Set-Generics`](./Secao-17-Set-Generics) | **Contador de Alunos**, Interface `Set`, `HashSet`, União de Conjuntos (`addAll`), `hashCode` & `equals`. |
| **11. Map** | [`/Secao-18-Map`](./Secao-18-Map) | Estrutura Chave/Valor, `HashMap`, `TreeMap`, busca eficiente e ordenação de chaves. |

---

## Tecnologias e Ferramentas

* **Linguagem:** Java 21 (LTS)
* **IDE:** IntelliJ IDEA
* **Controle de Versão:** Git & GitHub
* **Foco Futuro:** Arquitetura de Microsserviços com Spring Boot

---

## Como executar
Para rodar qualquer projeto deste repositório:

1. Clone o repositório:
```bash
git clone [https://github.com/flaviovlm/Atividades-Curso-Nelio.git](https://github.com/flaviovlm/Atividades-Curso-Nelio.git)
