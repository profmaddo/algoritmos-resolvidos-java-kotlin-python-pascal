# Aprenda algoritmos com o Professor Marco Maddo

🎲 **Algoritmo 71 - Frequência dos Números Sorteados em 20 Jogadas de Dado**

## Situação Problema Reformulada

### Versão 1:
Você é encarregado de registrar o resultado de 20 jogadas de um dado comum. Sua tarefa é contar quantas vezes cada número (de 1 a 6) apareceu.

### Versão 2:
Em um jogo com 20 lançamentos de dado, anote todos os resultados e diga qual número saiu mais vezes e quantas vezes cada um apareceu.

### Versão 3:
Simule 20 jogadas de um dado de 6 faces e, ao final, mostre todos os números que saíram e com que frequência cada face foi sorteada.

---

## 📘 Enunciado
Faça um programa que receba o número sorteado por um dado em vinte jogadas. Mostre os números sorteados e a frequência com que apareceram.

---

## 💡 Lógica em Portugol

```portugol
algoritmo "frequencia_dado"
variável
    dados: vetor[1..20] de inteiro
    frequencia: vetor[1..6] de inteiro
    i, valor: inteiro

inicio
    para i de 1 até 6 faça
        frequencia[i] <- 0
    fimpara

    para i de 1 até 20 faça
        escreva("Digite o resultado da jogada ", i, ": ")
        leia(valor)
        enquanto (valor < 1) ou (valor > 6) faça
            escreva("Valor inválido. Digite um número entre 1 e 6: ")
            leia(valor)
        fimenquanto
        dados[i] <- valor
        frequencia[valor] <- frequencia[valor] + 1
    fimpara

    escreval("Números sorteados:")
    para i de 1 até 20 faça
        escreva(dados[i], " ")
    fimpara

    escreval("
Frequência de cada número:")
    para i de 1 até 6 faça
        escreval("Número ", i, ": ", frequencia[i], " vezes")
    fimpara
fimalgoritmo
```

---

## ✨ Redes do Professor Marco Maddo

- YouTube: [Professor Marco Maddo](https://www.youtube.com/@ProfessorMarcoMaddo)
- LinkedIn: [Marco Maddo](https://www.linkedin.com/in/marcomaddo/)
- GitHub: [@profmaddo](https://github.com/profmaddo)
- GitLab: [@profmaddo](https://gitlab.com/profmaddo)
- Udemy: [Cursos Marco Maddo](https://www.udemy.com/user/marcomaddo/)

---

## 🌐 Acesse também:

- Site oficial do professor: [www.marcomaddo.com.br](https://www.marcomaddo.com.br)
- Empresa TSSTI Tecnologia: [www.tssti.com.br](https://www.tssti.com.br)
