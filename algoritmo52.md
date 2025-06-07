# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Cálculo de salário e produtividade por classes em uma fábrica

### Versão 1 - Redação objetiva
Em uma fábrica trabalham 15 operários (homens e mulheres). Cada trabalhador recebe um salário baseado no número de peças que fabrica por mês, de acordo com três classes:

- **Classe 1**: até 30 peças – recebe **salário mínimo**.
- **Classe 2**: de 31 a 50 peças – recebe salário mínimo + **3% por peça excedente**.
- **Classe 3**: mais de 50 peças – recebe salário mínimo + **5% por peça excedente**.

O programa deve:
- Receber o número do operário, quantidade de peças produzidas e sexo.
- Calcular e exibir:
  - o salário e o número do operário;
  - o total da folha de pagamento;
  - o total de peças produzidas;
  - a média de peças feitas por homens;
  - a média de peças feitas por mulheres;
  - o operário com **maior salário**.

---

## 💬 Portugol

```portugol
algoritmo "folha_pagamento_fabrica"
constante SALARIO_MINIMO = 1320
var
  i, pecas, totalPecas, totalHomens, totalMulheres: inteiro
  numOperario, maiorSalarioOperario: inteiro
  sexo: caractere
  salario, folhaPagamento, maiorSalario: real
  mediaHomens, mediaMulheres: real
inicio
  totalPecas <- 0
  folhaPagamento <- 0
  totalHomens <- 0
  totalMulheres <- 0
  maiorSalario <- 0

  para i de 1 ate 15 faca
    escreva("Número do operário: ")
    leia(numOperario)
    escreva("Peças fabricadas: ")
    leia(pecas)
    escreva("Sexo (M/F): ")
    leia(sexo)

    se pecas <= 30 entao
      salario <- SALARIO_MINIMO
    senao se pecas <= 50 entao
      salario <- SALARIO_MINIMO + (pecas - 30) * (SALARIO_MINIMO * 0.03)
    senao
      salario <- SALARIO_MINIMO + (pecas - 30) * (SALARIO_MINIMO * 0.05)
    fimse

    escreval("Operário ", numOperario, " - Salário: R$", salario:0:2)

    folhaPagamento <- folhaPagamento + salario
    totalPecas <- totalPecas + pecas

    se sexo = "M" entao
      totalHomens <- totalHomens + 1
      mediaHomens <- mediaHomens + pecas
    senao
      totalMulheres <- totalMulheres + 1
      mediaMulheres <- mediaMulheres + pecas
    fimse

    se salario > maiorSalario entao
      maiorSalario <- salario
      maiorSalarioOperario <- numOperario
    fimse
  fimpara

  se totalHomens > 0 entao
    mediaHomens <- mediaHomens / totalHomens
  fimse

  se totalMulheres > 0 entao
    mediaMulheres <- mediaMulheres / totalMulheres
  fimse

  escreval("Folha total: R$", folhaPagamento:0:2)
  escreval("Total de peças: ", totalPecas)
  escreval("Média peças homens: ", mediaHomens:0:2)
  escreval("Média peças mulheres: ", mediaMulheres:0:2)
  escreval("Operário com maior salário: ", maiorSalarioOperario)
fimalgoritmo
```

---

> 📝 As implementações completas em **Java**, **Kotlin**, **Python** e **Pascal** podem ser encontradas neste markdown!

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
