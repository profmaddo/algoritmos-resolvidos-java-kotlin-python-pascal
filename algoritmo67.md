# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Identificando Valores Superiores a 50

### Versão 1 — Redação direta
Crie um programa que leia dez números inteiros, identifique e mostre quais deles são maiores que 50 e suas respectivas posições no vetor. Se nenhum número atender ao critério, exiba uma mensagem informando isso.

### Versão 2 — Redação explicativa
Desenvolva um algoritmo que preencha um vetor com dez números inteiros. O programa deve analisar os valores armazenados e exibir todos os números superiores a 50, juntamente com suas posições no vetor. Caso nenhum número esteja acima de 50, informe essa situação ao usuário.

### Versão 3 — Redação contextualizada
Imagine que você está criando um sistema para análise de dados de sensores que captam valores inteiros. Seu programa deve receber dez valores, identificar os que estão acima de 50 e exibir suas posições no vetor. Se não houver valores acima de 50, o sistema deve emitir um alerta.

---

## 💬 Portugol

```portugol
algoritmo "valores_maiores_que_50"
var
  numeros: vetor[1..10] de inteiro
  i: inteiro
  encontrou: logico
inicio
  encontrou <- falso
  para i de 1 ate 10 faca
    escreva("Digite o ", i, "º número: ")
    leia(numeros[i])
  fimpara

  escreval("
Números maiores que 50 e suas posições:")
  para i de 1 ate 10 faca
    se numeros[i] > 50 entao
      escreval("Posição ", i, ": ", numeros[i])
      encontrou <- verdadeiro
    fimse
  fimpara

  se nao encontrou entao
    escreval("Nenhum número maior que 50 foi encontrado.")
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
