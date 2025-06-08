# Algoritmo 75 – Multiplicação da Matriz pelo Maior Elemento
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## Versão 1 - Reformulação da Situação Problema
Crie um programa que leia os valores de uma matriz 2x2 e multiplique cada um desses valores pelo maior número presente na matriz, gerando uma nova matriz resultante.

## Versão 2 - Reformulação da Situação Problema
Desenvolva um algoritmo para preencher uma matriz de 2 linhas por 2 colunas, identificar o maior elemento presente e gerar uma nova matriz com cada elemento multiplicado por esse maior valor.

## Versão 3 - Reformulação da Situação Problema
Elabore um programa que receba os dados de uma matriz 2x2, determine o maior número da matriz e calcule uma segunda matriz onde cada elemento é o produto do número original pelo maior valor encontrado.

---

## 📌 Solução em Portugol (Visualg)

```portugol
algoritmo "Matriz Multiplicada pelo Maior Elemento"
var
   M: vetor[1..2,1..2] de inteiro
   R: vetor[1..2,1..2] de inteiro
   i, j, maior: inteiro
inicio
   escreval("Preencha a matriz M (2x2):")
   maior <- -99999
   para i de 1 ate 2 faca
      para j de 1 ate 2 faca
         escreva("M[", i, "][", j, "]: ")
         leia(M[i,j])
         se M[i,j] > maior entao
            maior <- M[i,j]
         fimse
      fimpara
   fimpara

   escreval("Maior elemento encontrado: ", maior)
   escreval("Calculando a matriz R...")
   para i de 1 ate 2 faca
      para j de 1 ate 2 faca
         R[i,j] <- M[i,j] * maior
      fimpara
   fimpara

   escreval("Matriz Resultante R:")
   para i de 1 ate 2 faca
      para j de 1 ate 2 faca
         escreva(R[i,j], " ")
      fimpara
      escreval()
   fimpara
fimalgoritmo
```
