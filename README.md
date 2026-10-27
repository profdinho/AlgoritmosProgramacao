# Algoritmos e Programação

Projeto Java Swing utilizado como exemplo nas aulas da UC de Algoritmos e
Programação da Universidade São Judas, Unidade São Bernardo do Campo.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `src/view/TelaInicial.java`: Classe principal e tela de login da aplicação.
- `src/view/TelaInicial.form`: Formulário da tela gerenciado pelo NetBeans.
- `nbproject/`: Configurações do projeto NetBeans.
- `build.xml`: Script de compilação do Apache Ant.
- `test/`: Diretório reservado para testes automatizados.

## Pré-requisitos

- Java Development Kit (JDK) 21 ou superior instalado.
- Apache Ant instalado e disponível no `PATH` para a compilação pelo terminal.
- NetBeans IDE (recomendado para projetos NetBeans).

## Como Executar

1. Clone ou baixe o projeto para o seu computador.
2. Abra o NetBeans IDE.
3. Selecione "File" > "Open Project" e navegue até a pasta do projeto (`AlgoritmosProgramacao`).
4. Abra o projeto no NetBeans.
5. Execute o projeto pela opção "Run Project".

A classe principal configurada no projeto é `view.TelaInicial`.

## Compilação Manual

Se preferir compilar manualmente:

1. Abra um terminal na pasta raiz do projeto.
2. Execute o comando:

   ```bash
   ant compile
   ```

3. Para executar a aplicação:

   ```bash
   java -cp build/classes view.TelaInicial
   ```
