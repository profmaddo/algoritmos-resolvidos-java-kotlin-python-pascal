# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 📘 Situação Problema - algoritmo69.md

**Versão 1 - Descrição Tradicional:**  
Crie um programa que leia 10 números inteiros em um vetor e mais 5 números inteiros em um segundo vetor. Para cada número do primeiro vetor, some todos os elementos do segundo vetor e determine se o resultado é par ou ímpar. Agrupe os resultados em dois novos vetores: um com os resultados pares e outro com os ímpares.

**Versão 2 - Foco no raciocínio lógico:**  
Vamos desenvolver um algoritmo que manipule dois conjuntos numéricos: o primeiro com 10 elementos e o segundo com 5. Para cada número do primeiro vetor, somaremos todos os do segundo e classificaremos o total como par ou ímpar. Os valores finais serão distribuídos em dois novos vetores.

**Versão 3 - Linguagem informal e prática:**  
Você vai digitar 10 números em um vetor e mais 5 em outro. O programa vai somar cada número do primeiro vetor com todos os do segundo e vai guardar os resultados pares em um vetor e os ímpares em outro.

---

## ✨ Lógica em Portugol

```portugol
algoritmo "Classifica pares e ímpares com soma de vetores"
var
  v1: vetor[1..10] de inteiro
  v2: vetor[1..5] de inteiro
  pares: vetor[1..50] de inteiro
  impares: vetor[1..50] de inteiro
  i, j, soma, posP, posI: inteiro
inicio
  posP <- 1
  posI <- 1

  escreva("Digite os 10 números do primeiro vetor:")
  para i de 1 ate 10 faca
    leia(v1[i])
  fimpara

  escreva("Digite os 5 números do segundo vetor:")
  para i de 1 ate 5 faca
    leia(v2[i])
  fimpara

  para i de 1 ate 10 faca
    soma <- v1[i]
    para j de 1 ate 5 faca
      soma <- soma + v2[j]
    fimpara

    se (soma % 2 = 0) entao
      pares[posP] <- soma
      posP <- posP + 1
    senao
      impares[posI] <- soma
      posI <- posI + 1
    fimse
  fimpara

  escreval("Números Pares:")
  para i de 1 ate posP - 1 faca
    escreval(pares[i])
  fimpara

  escreval("Números Ímpares:")
  para i de 1 ate posI - 1 faca
    escreval(impares[i])
  fimpara
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

Vamos juntos nessa jornada de aprendizado! ✨
