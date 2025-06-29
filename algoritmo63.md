# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Separação de Números Positivos e Negativos em Vetores

### Versão 1 — Redação direta
Crie um programa que preencha um vetor com oito números inteiros. Em seguida, separe esses números em dois novos vetores: um contendo apenas os valores positivos e o outro contendo os valores negativos. Cada vetor resultante pode ter no máximo oito posições, mas nem todas precisam ser utilizadas.

### Versão 2 — Redação explicativa
Você deve desenvolver um programa que armazene oito valores inteiros fornecidos pelo usuário. Após a leitura, os números positivos devem ser armazenados em um vetor separado e os negativos em outro. Exiba os dois vetores separadamente no final.

### Versão 3 — Redação contextualizada
Em um exercício de programação, o aluno deve criar um programa que receba oito números inteiros. O desafio é separar os valores positivos e negativos em dois vetores distintos, respeitando o tamanho máximo de oito posições, mas utilizando apenas o espaço necessário.

---

## 💬 Portugol

```portugol
algoritmo "separa_positivos_negativos"
var
  numeros: vetor[1..8] de inteiro
  positivos: vetor[1..8] de inteiro
  negativos: vetor[1..8] de inteiro
  i, pos_pos, pos_neg: inteiro
inicio
  pos_pos <- 1
  pos_neg <- 1

  para i de 1 ate 8 faca
    escreva("Digite o ", i, "º número inteiro: ")
    leia(numeros[i])

    se numeros[i] >= 0 entao
      positivos[pos_pos] <- numeros[i]
      pos_pos <- pos_pos + 1
    senao
      negativos[pos_neg] <- numeros[i]
      pos_neg <- pos_neg + 1
    fimse
  fimpara

  escreval("Números positivos:")
  para i de 1 ate pos_pos - 1 faca
    escreval(positivos[i])
  fimpara

  escreval("Números negativos:")
  para i de 1 ate pos_neg - 1 faca
    escreval(negativos[i])
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
