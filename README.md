# 🌳 Árvore AVL em Java - pt-BR

Projeto desenvolvido durante o quinto semestre do curso de **Análise e Desenvolvimento de Sistemas**, na disciplina de **Algoritmos e Programação: Árvores e Ordenação**.

O projeto tem como objetivo implementar uma **Árvore AVL** em Java, aplicando conceitos de estruturas de dados, árvores binárias de busca, balanceamento automático, inserção, remoção, busca e caminhamentos.

## 📌 Sobre o Projeto

A Árvore AVL é uma árvore binária de busca auto-balanceada. Isso significa que, após operações de inserção ou remoção, a árvore realiza ajustes para manter sua altura equilibrada, garantindo melhor desempenho nas operações de busca, inserção e remoção.

Neste projeto, foram implementados os principais métodos de uma Árvore AVL, incluindo:

* Inserção de valores.
* Remoção de valores.
* Busca de valores.
* Balanceamento da árvore.
* Rotações simples e duplas.
* Caminhamento em ordem.
* Caminhamento em pré-ordem.
* Caminhamento em pós-ordem.

## 🚀 Funcionalidades

* Criação de uma Árvore AVL.
* Inserção de novos nodos.
* Remoção de nodos existentes.
* Busca de valores na árvore.
* Balanceamento automático após inserções e remoções.
* Rotação simples à esquerda.
* Rotação simples à direita.
* Rotação dupla esquerda-direita.
* Rotação dupla direita-esquerda.
* Listagem dos valores por caminhamento:

  * Em ordem.
  * Pré-ordem.
  * Pós-ordem.
* Classe de testes para validar os resultados esperados.
* Exibição de mensagens coloridas no console para indicar testes corretos ou incorretos.

## 🛠️ Tecnologias Utilizadas

* Java
* JDK
* Estruturas de Dados
* Programação Orientada a Objetos
* Árvores Binárias
* Árvore AVL

## 📁 Estrutura do Projeto

```bash
arvore-avl-java/
├── AVLTree.java
├── Nodo.java
├── Test.java
└── Log.java
```

## 📄 Descrição das Classes

### `AVLTree.java`

Classe principal do projeto, responsável pela implementação da Árvore AVL.

Contém os métodos de:

* Inserção.
* Remoção.
* Busca.
* Cálculo de altura.
* Cálculo de balanceamento.
* Rotações.
* Caminhamentos da árvore.

### `Nodo.java`

Classe responsável por representar cada nodo da árvore.

Cada nodo possui:

* Valor inteiro.
* Altura.
* Referência para o filho esquerdo.
* Referência para o filho direito.

### `Test.java`

Classe utilizada para executar o programa e testar o funcionamento da árvore.

Nela são realizados testes de:

* Inserção de valores.
* Caminhamento em ordem.
* Caminhamento em pré-ordem.
* Caminhamento em pós-ordem.
* Remoção de valor.
* Busca de valor.

### `Log.java`

Classe auxiliar utilizada para exibir mensagens no console, indicando se os testes foram executados corretamente ou se houve erro.

As mensagens são exibidas com cores diferentes para facilitar a visualização dos resultados.

## 📦 Como Executar o Projeto

### 1. Tenha o Java e o JDK instalados

Para executar o projeto, é necessário ter o **Java** e o **JDK** instalados na máquina.

Você pode verificar a instalação com os comandos:

```bash
java -version
javac -version
```

### 2. Abra o projeto em uma IDE Java

Abra os arquivos do projeto em uma IDE compatível com Java, como:

* IntelliJ IDEA
* Eclipse
* NetBeans
* Visual Studio Code com extensão Java

### 3. Execute a classe de teste

Execute a classe:

```bash
Test.java
```

Essa classe irá criar uma Árvore AVL, inserir valores, testar os caminhamentos, remover um valor e realizar uma busca.

## 🧪 Testes Realizados

A classe `Test.java` executa os seguintes testes:

### Inserção de valores

São inseridos os seguintes valores na árvore:

```text
4, 15, 23, 67, 89, 56, 14, 7, -4
```

### Caminhamento em ordem

Resultado esperado:

```text
[-4, 4, 7, 14, 15, 23, 56, 67, 89]
```

### Caminhamento em pós-ordem

Resultado esperado:

```text
[-4, 7, 4, 15, 14, 56, 89, 67, 23]
```

### Caminhamento em pré-ordem

Resultado esperado:

```text
[23, 14, 4, -4, 7, 15, 67, 56, 89]
```

### Remoção

O valor `89` é removido da árvore.

Após a remoção, o caminhamento em pré-ordem esperado é:

```text
[23, 14, 4, -4, 7, 15, 67, 56]
```

### Busca

O programa realiza a busca pelo valor `45`.

Como esse valor não está presente na árvore, o resultado esperado é que a busca retorne `false`.

## 🧠 Conceitos Praticados

Este projeto foi desenvolvido para praticar conceitos importantes de estruturas de dados, como:

* Árvores binárias de busca.
* Árvores AVL.
* Balanceamento de árvores.
* Altura de nodos.
* Fator de balanceamento.
* Recursividade.
* Inserção e remoção em árvores.
* Caminhamentos em árvores.
* Organização de código em classes.
* Testes simples de validação.

## 📚 Contexto Acadêmico

O projeto foi desenvolvido como atividade acadêmica da disciplina **Algoritmos e Programação: Árvores e Ordenação**, durante o quinto semestre do curso de **Análise e Desenvolvimento de Sistemas**.

O principal objetivo foi compreender o funcionamento de uma Árvore AVL e aplicar, na prática, os conceitos de balanceamento e manipulação de estruturas hierárquicas.

## ✒ Desenvolvido por

**Luis Henrique Lehr**
