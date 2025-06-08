# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Intercalação de Dois Vetores

### Versão 1 — Redação direta
Faça um programa que preencha dois vetores com dez números inteiros cada. Em seguida, crie e mostre um terceiro vetor contendo os elementos dos dois primeiros intercalados.

### Versão 2 — Redação explicativa
Crie um programa que leia dois vetores, cada um com 10 elementos inteiros. Após isso, construa um novo vetor intercalando os elementos dos dois primeiros (1º do vetor A, 1º do vetor B, 2º do vetor A, 2º do vetor B, etc.) e exiba o vetor resultante.

### Versão 3 — Redação contextualizada
Uma empresa deseja criar um relatório que intercale dois conjuntos de dados representados por vetores. Escreva um programa que receba dois vetores de 10 elementos e gere um terceiro vetor intercalando os valores de ambos, mantendo a ordem de inserção.

---

## 💬 Portugol

```portugol
algoritmo "intercalar_vetores"
var
  vetorA, vetorB, vetorC: vetor[1..10] de inteiro
  resultado: vetor[1..20] de inteiro
  i, j: inteiro
inicio
  para i de 1 ate 10 faca
    escreva("Digite o ", i, "º número do vetor A: ")
    leia(vetorA[i])
  fimpara

  para i de 1 ate 10 faca
    escreva("Digite o ", i, "º número do vetor B: ")
    leia(vetorB[i])
  fimpara

  j <- 1
  para i de 1 ate 10 faca
    resultado[j] <- vetorA[i]
    j <- j + 1
    resultado[j] <- vetorB[i]
    j <- j + 1
  fimpara

  escreval("Vetor intercalado:")
  para i de 1 ate 20 faca
    escreval(resultado[i])
  fimpara
fimalgoritmo
```

---

## 🌐 Redes do Professor Marco Maddo

- YouTube: [Professor Marco Maddo](https://www.youtube.com/@ProfessorMarcoMaddo)
- LinkedIn: [Marco Maddo](https://www.linkedin.com/in/marcomaddo/)
- GitHub: [@profmaddo](https://github.com/profmadddo)
- GitLab: [@profmaddo](https://gitlab.com/profmaddo)
- Udemy: [Cursos Marco Maddo](https://www.udemy.com/user/marcomaddo/)

---

## 🚀 Acesse também:

- 🌐 Site oficial do professor: [www.marcomaddo.com.br](https://www.marcomaddo.com.br)
- 🧑‍💼 Empresa TSSTI Tecnologia: [www.tssti.com.br](https://www.tssti.com.br)
