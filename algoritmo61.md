# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Verificação de Números Primos em Vetor

### Versão 1 — Redação direta
Faça um programa que preencha um vetor com nove números inteiros, verifique quais desses números são primos e mostre o número primo e sua respectiva posição no vetor.

### Versão 2 — Redação orientada a iniciante
Queremos analisar uma sequência de nove números inteiros. Seu programa deve armazenar esses números em um vetor, identificar quais são primos e exibir, para cada primo encontrado, sua posição no vetor.

### Versão 3 — Redação com contexto do cotidiano
Imagine que você está filtrando números especiais de uma lista de nove valores. Esses números especiais são chamados de *primos*, pois só podem ser divididos por 1 e por eles mesmos. Crie um programa que identifique esses valores e mostre suas posições na lista.

---

## 💬 Portugol

```portugol
algoritmo "vetor_numeros_primos"
var
  vetor: vetor[1..9] de inteiro
  i, j, divisores: inteiro
inicio
  para i de 1 ate 9 faca
    escreva("Digite o ", i, "º número: ")
    leia(vetor[i])
  fimpara

  escreval("Números primos e suas posições:")
  para i de 1 ate 9 faca
    se vetor[i] > 1 entao
      divisores <- 0
      para j de 1 ate vetor[i] faca
        se vetor[i] % j = 0 entao
          divisores <- divisores + 1
        fimse
      fimpara

      se divisores = 2 entao
        escreval("Número ", vetor[i], " na posição ", i, " é primo.")
      fimse
    fimse
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
