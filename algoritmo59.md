# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Estatísticas de números digitados

### Versão 1 - Redação simples
Desenvolva um programa que receba uma sequência de números inteiros (um por vez). A entrada dos números será finalizada quando o usuário digitar o número `100000`.  
Durante a entrada, o programa deve calcular e exibir ao final:

- a soma dos números digitados;
- a quantidade de números digitados;
- a média dos números digitados;
- o maior e o menor número;
- a média dos números pares;
- a porcentagem dos números ímpares entre todos os números digitados.

---

## 💬 Portugol

```portugol
algoritmo "estatisticas_numeros"
var
  num, soma, qtd, maior, menor, pares, somaPares, impares: inteiro
  media, mediaPares, porcentagemImpares: real
inicio
  soma <- 0
  qtd <- 0
  pares <- 0
  somaPares <- 0
  impares <- 0
  maior <- -99999
  menor <- 99999

  escreval("Digite números inteiros (100000 encerra):")

  repita
    escreva("Número: ")
    leia(num)

    se num <> 100000 entao
      soma <- soma + num
      qtd <- qtd + 1

      se num > maior entao
        maior <- num
      fimse
      se num < menor entao
        menor <- num
      fimse

      se num % 2 = 0 entao
        pares <- pares + 1
        somaPares <- somaPares + num
      senao
        impares <- impares + 1
      fimse
    fimse
  ate num = 100000

  se qtd > 0 entao
    media <- soma / qtd
    escreval("Soma: ", soma)
    escreval("Quantidade: ", qtd)
    escreval("Média: ", media:0:2)
    escreval("Maior número: ", maior)
    escreval("Menor número: ", menor)

    se pares > 0 entao
      mediaPares <- somaPares / pares
      escreval("Média dos pares: ", mediaPares:0:2)
    senao
      escreval("Nenhum número par digitado.")
    fimse

    porcentagemImpares <- (impares * 100) / qtd
    escreval("Porcentagem de ímpares: ", porcentagemImpares:0:2, "%")
  senao
    escreval("Nenhum número válido digitado.")
  fimse
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
