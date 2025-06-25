# HERANÇA_2

projeto consiste em um arranjo de calsses hipotético para uma empresa, onde há 4 personas hipotéticas, Funcionário, Gerente, Vendedor e Cliente as classes com seus respectivos atributos são:
* Pessoa (super):
 - nome
 - cpf
 - nascimento

 *MÉTODOS*: 
    - formatLocal(String data)
    Converte String em LocalDate

    - formatStr(LocalDate data)
    Converte LocalDate em String

    - printaTudo()
    Saída em String para os atributos da classe

* Cliente (subclasse de Pessoa)
 - email
 - telefone
 - fidelidade

* Funcionario (subclasse de Pessoa)
 - contratacao
 - salario

* Gerente (subclasse de Funcionario)
 - departamento

* Vendedor (subclasse de Funcionario)
 - comissao

As classes pessuem seus respectivos getters e setters, além de um método sobreposto de printaTudo() presente na classe Pessoa()

### 📋 Pré-requisitos

É necessário ter java instalado e demais dependencias (no caso de Linux é necessário que instale jdk-23_linux-x64_bin.deb)

### 🔧 Instalação

Para a utilização de projeto é necessário executa-lo através do Visual Studio code ou através do comando "java" direto numa shell Linux (para isso é necessário primeiro compilar os arquivos com "javac Main.java")

## 🛠️ Construído com

Ferramentas utilizadas e bibliotecas

* IDE Visual Studio

## 📌 Versão

* **Versão 1.0** projeto consiste em um arranjo de calsses hipotético para uma empresa, onde há 4 personas hipotéticas, Funcionário, Gerente, Vendedor e Cliente as classes com seus respectivos atributos são:
* Pessoa (super):
 - nome
 - cpf
 - nascimento

 *MÉTODOS*: 
    - formatLocal(String data)
    Converte String em LocalDate

    - formatStr(LocalDate data)
    Converte LocalDate em String

    - printaTudo()
    Saída em String para os atributos da classe

* Cliente (subclasse de Pessoa)
 - email
 - telefone
 - fidelidade

* Funcionario (subclasse de Pessoa)
 - contratacao
 - salario

* Gerente (subclasse de Funcionario)
 - departamento

* Vendedor (subclasse de Funcionario)
 - comissao

As classes pessuem seus respectivos getters e setters, além de um método sobreposto de printaTudo() presente na classe Pessoa()

## ✒️ Autores

* **Giovanni Galli** - *Trabalho Inicial* - Tarefa Herança 2

