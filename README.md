# Algoritmos e Programação

Aplicação desktop em Java Swing usada como exemplo nas aulas da UC de
Algoritmos e Programação da Universidade São Judas, unidade São Bernardo do
Campo.

O projeto apresenta uma tela de login e um formulário de cadastro de
correntista, com campos como nome, CPF, e-mail, telefone, data de nascimento,
tipo de conta, tipo de pessoa, senha e observações.

## Funcionalidades

- Login de demonstração.
- Formulário de cadastro de correntista com máscaras para CPF, telefone e data.
- Seleção de tipo de conta e de pessoa (física ou jurídica).
- Modelo `Correntista` para representar os dados do formulário.

> **Atenção:** este é um projeto didático. O login atualmente usa as
> credenciais fixas `admin` e `123456`, e os dados do cadastro não são
> persistidos.

## Tecnologias

- Java 21
- Java Swing
- Apache Ant
- NetBeans

## Estrutura do projeto

```text
src/
├── model/
│   └── Correntista.java
└── view/
    ├── TelaInicial.java
    ├── TelaInicial.form
    ├── TelaCadastroCorrentista.java
    └── TelaCadastroCorrentista.form
nbproject/                 # Configurações do projeto NetBeans
build.xml                  # Script de compilação do Apache Ant
test/                      # Diretório reservado para testes
```

Os arquivos `.form` são mantidos pelo editor visual do NetBeans. Evite editar
manualmente o código gerado entre os blocos indicados pelo IDE.

## Pré-requisitos

- JDK 21 ou superior instalado.
- Apache Ant instalado e disponível no `PATH`.
- NetBeans IDE (opcional, recomendado para editar os formulários).

## Executar pelo NetBeans

1. Abra o NetBeans.
2. Selecione **File > Open Project** e escolha a pasta do projeto.
3. Execute **Run Project**.

A classe principal configurada no projeto é `view.TelaInicial`.

## Compilar e executar pelo terminal

Na raiz do projeto, execute:

```bash
ant clean
ant compile
java -cp build/classes view.TelaInicial
```

Para gerar o arquivo JAR de distribuição:

```bash
ant jar
```

O artefato será criado em `dist/InterfaceGrafica.jar`.
