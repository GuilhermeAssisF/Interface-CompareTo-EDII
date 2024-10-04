# Atividade 2 - Prática Ordenação em Java

Este projeto tem como objetivo ler dados de alunos a partir de um arquivo CSV, ordená-los e exibir as informações na saída padrão. O arquivo CSV contém informações como ID, nome, data de nascimento e nota dos alunos. O programa faz a leitura desses dados, ordena os alunos de acordo com o critério escolhido e os exibe.

## Funcionalidades

- Leitura de dados de um arquivo CSV
- Criação de objetos `Alunos` com as informações lidas
- Ordenação dos alunos de acordo com o critério especificado (por exemplo, nota ou nome)
- Exibição dos dados dos alunos ordenados

## Estrutura do Projeto

O projeto está dividido em dois pacotes principais:

- **application**: Contém a classe principal `Program` que executa o fluxo do programa.
- **entities**: Contém a classe `Alunos`, que define os atributos e o comportamento dos alunos.

### Classe `Program`

A classe `Program` é responsável por:

- Ler o arquivo CSV.
- Criar objetos da classe `Alunos`.
- Ordenar os alunos.
- Exibir as informações na saída padrão.

### Classe `Alunos`

A classe `Alunos` define os atributos dos alunos, como ID, nome, data de nascimento e nota. Ela implementa a interface `Comparable<Alunos>`, que permite a ordenação dos objetos de acordo com o critério definido no método `compareTo`.

## Formato do Arquivo CSV

O arquivo CSV deve estar localizado no caminho `C:\\Windows\\temp\\in.txt` (pode ser alterado no código) e ter o seguinte formato:

### Estrutura do CSV

- **ID**: Um número inteiro que representa o ID do aluno.
- **Nome**: O nome completo do aluno.
- **Data de Nascimento**: A data de nascimento no formato `dd/MM/yyyy`.
- **Nota**: A nota do aluno (inteiro).

### Pré-requisitos

- Java Development Kit (JDK) 8 ou superior instalado.
- Um ambiente de desenvolvimento como NetBeans ou Eclipse, ou o terminal para compilar e executar o código.

## Read.me gerado por IA
