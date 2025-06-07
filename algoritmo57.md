# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Soma de intervalos entre dois números

### Versão 1 - Redação simples
Crie um programa que leia pares de números inteiros positivos `[m, n]`. Para cada par informado com `m < n`, o programa deve calcular e exibir a soma de todos os inteiros entre `m` e `n` (inclusive).  
A execução deve ser encerrada quando for digitado um par em que `m >= n`.

---

## 💬 Portugol

```portugol
algoritmo "soma_intervalo_pares_menores"
var
  m, n, i, soma: inteiro
inicio
  escreval("Digite pares de valores inteiros positivos (m < n).")
  escreval("Para encerrar, digite um par onde m >= n.")
  escreval("-------------------------------------------")

  repita
    escreva("Digite o valor de m: ")
    leia(m)
    escreva("Digite o valor de n: ")
    leia(n)

    se m < n entao
      soma <- 0
      para i de m ate n faca
        soma <- soma + i
      fimpara
      escreval("A soma dos inteiros entre ", m, " e ", n, " é: ", soma)
      escreval("-------------------------------------------")
    fimse
  ate m >= n

  escreval("Programa encerrado.")
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
