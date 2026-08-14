# Sistema de Treinamento em Tecnologia

Sistema em Java desenvolvido para gerenciar e controlar treinamentos de capacitação técnica de programadores em empresas, aplicando conceitos avançados de **Programação Orientada a Objetos (POO)** como **Herança**, **Polimorfismo**, **Encapsulamento** e regras de negócio complexas.

---

## Contexto Acadêmico

Projeto acadêmico desenvolvido para a disciplina de **Técnica de Programação I** do curso de **Desenvolvimento de Software Multiplataforma (DSM)** na **FATEC Praia Grande**.

## Tecnologias e Conceitos Utilizados

- **Linguagem:** Java (JDK 17+)
- **Estrutura de Dados:** `ArrayList` para controle de alunos matriculados
- **Paradigmas de POO:**
  - **Herança & Polimorfismo:** Classe base `Treinamento` com especializações em `TreinamentoPresencial` e `TreinamentoOnline`
  - **Encapsulamento:** Controle estrito de atributos e métodos de validação
  - **Abstração:** Modelagem de alunos, instrutores e modalidades de curso

---

## Funcionalidades & Regras de Negócio

### 🔹 Classe Base `Treinamento`
- **Controle de Alunos:** Lista dinâmica (`ArrayList<Aluno>`) mantendo nome e nota final.
- **Validação de Disponibilidade:** Método `verificarDisponibilidade()` para checar a agenda do instrutor.
- **Carga Horária e Limite:** Método `verificarUltimoTreinamento(Aluno aluno)` que valida o limite de 80 horas de treinamento a cada 2 meses por programador.
- **Métricas:** Método `calcularMediaAlunos()` para calcular a média geral de aproveitamento da turma.

### 🔹 Subclasses Específicas (Polimorfismo)
- **`TreinamentoPresencial`:** Herda da classe base e inclui atributos/regras específicas para gestão de espaço físico (`local`).
- **`TreinamentoOnline`:** Herda da classe base e gerencia acessos virtuais (`linkAcesso`).

---


## Estrutura do Projeto

```text
src/
 ├── Aluno.java                  # Representação do aluno (nome e nota final)
 ├── Treinamento.java            # Classe super/mãe com atributos e regras de negócio
 ├── TreinamentoPresencial.java  # Subclasse para treinamentos presenciais (Polimorfismo)
 ├── TreinamentoOnline.java      # Subclasse para treinamentos remotos (Polimorfismo)
 └── Main.java                   # Instanciação das classes e testes de execução
