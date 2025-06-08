# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Correção de Provas de Múltipla Escolha

### Versão 1 — Redação direta
Faça um programa que leia o gabarito de uma prova com 8 questões. Em seguida, leia os números de 10 alunos e as respostas dadas por cada um. Calcule e mostre a nota de cada aluno e a porcentagem de aprovação (nota mínima 6).

### Versão 2 — Redação explicativa
Crie um sistema para corrigir automaticamente provas com 8 questões de múltipla escolha. O programa deve primeiro ler o gabarito da prova e, depois, as respostas de 10 alunos identificados por um número. Para cada aluno, exiba sua nota (de 0 a 8) e, ao final, mostre a porcentagem dos alunos aprovados (nota mínima: 6 pontos).

### Versão 3 — Redação contextualizada
Uma escola deseja automatizar a correção de uma prova objetiva com 8 questões. Desenvolva um programa que receba o gabarito oficial e, para cada um dos 10 alunos inscritos, leia seu número e as respostas fornecidas. O sistema deve informar a nota de cada aluno e a porcentagem de aprovados com nota igual ou superior a 6.

---

## 💬 Portugol

```portugol
algoritmo "corrigir_provas"
var
  gabarito: vetor[1..8] de caractere
  respostas: vetor[1..8] de caractere
  i, j, nota, aprovados: inteiro
  aluno: vetor[1..10] de inteiro
inicio
  escreval("Digite o gabarito da prova:")
  para i de 1 ate 8 faca
    escreva("Questão ", i, ": ")
    leia(gabarito[i])
  fimpara

  aprovados <- 0
  para i de 1 ate 10 faca
    escreval("
Aluno ", i)
    escreva("Número do aluno: ")
    leia(aluno[i])
    nota <- 0

    para j de 1 ate 8 faca
      escreva("Resposta da questão ", j, ": ")
      leia(respostas[j])
      se respostas[j] = gabarito[j] entao
        nota <- nota + 1
      fimse
    fimpara

    escreval("Aluno ", aluno[i], " tirou nota: ", nota)
    se nota >= 6 entao
      aprovados <- aprovados + 1
    fimse
  fimpara

  escreval("
Porcentagem de aprovação: ", (aprovados * 100) / 10, "%")
fimalgoritmo
```

---

## 🌐 Redes do Professor Marco Maddo

- YouTube: [Professor Marco Maddo](https://www.youtube.com/@ProfessorMarcoMaddo)
- LinkedIn: [Marco Maddo](https://www.linkedin.com/in/marcomaddo/)
- GitHub: [@profmaddo](https://github.com/profmaddo)
- GitLab: [@profmaddo](https://gitlab.com/profmaddo)
- Udemy: [Cursos Marco Maddo](https://www.udemy.com/user/marcomaddo/)

---

## 🚀 Acesse também:

- 🌐 Site oficial do professor: [www.marcomaddo.com.br](https://www.marcomaddo.com.br)
- 🧑‍💼 Empresa TSSTI Tecnologia: [www.tssti.com.br](https://www.tssti.com.br)
