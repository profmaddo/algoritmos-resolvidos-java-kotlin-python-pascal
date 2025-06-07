# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Cálculo do índice de mortalidade infantil

### Versão 1 - Redação direta
Foi realizada uma pesquisa para calcular o índice de mortalidade infantil em determinado período. Para isso, é necessário:

- Informar o número total de crianças nascidas.
- Informar o sexo (M ou F) e o tempo de vida (em meses) de cada criança.
- Com base nesses dados, o programa deve calcular:
  - A porcentagem de crianças do sexo **feminino** que morreram no período;
  - A porcentagem de crianças do sexo **masculino** que morreram no período;
  - A porcentagem de crianças que viveram **até 24 meses**.

---

## 💬 Portugol

```portugol
algoritmo "indice_mortalidade_infantil"
var
  i, total, vida, mortesF, mortesM, ate24, totalF, totalM: inteiro
  sexo: caractere
  percF, percM, perc24: real
inicio
  escreva("Informe o número de crianças nascidas: ")
  leia(total)

  mortesF <- 0
  mortesM <- 0
  ate24 <- 0
  totalF <- 0
  totalM <- 0

  para i de 1 ate total faca
    escreva("Sexo da criança (M/F): ")
    leia(sexo)
    escreva("Tempo de vida em meses: ")
    leia(vida)

    se sexo = "F" entao
      totalF <- totalF + 1
      se vida = 0 entao
        mortesF <- mortesF + 1
      fimse
    senao
      totalM <- totalM + 1
      se vida = 0 entao
        mortesM <- mortesM + 1
      fimse
    fimse

    se vida <= 24 entao
      ate24 <- ate24 + 1
    fimse
  fimpara

  se totalF > 0 entao
    percF <- (mortesF * 100.0) / totalF
  fimse
  se totalM > 0 entao
    percM <- (mortesM * 100.0) / totalM
  fimse
  se total > 0 entao
    perc24 <- (ate24 * 100.0) / total
  fimse

  escreval("Percentual de mortes femininas: ", percF:0:2, "%")
  escreval("Percentual de mortes masculinas: ", percM:0:2, "%")
  escreval("Percentual de crianças com até 24 meses de vida: ", perc24:0:2, "%")
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
