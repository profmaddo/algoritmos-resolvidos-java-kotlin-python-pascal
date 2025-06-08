# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Inserção e Ordenação Decrescente

Neste trigésimo segundo exercício, o programa deve:

- Receber **três números em ordem crescente**;
- Receber um **quarto número** fora dessa ordem;
- Exibir os **quatro números em ordem decrescente**.

> 💡 Todos os números informados serão diferentes.

---

### 🧮 Versão 1: Reorganizador Inteligente
> 📉 *Desenvolva um algoritmo que leia três valores em ordem crescente e um quarto valor qualquer, e mostre todos em ordem decrescente.*

---

### 📊 Versão 2: Inserção com Reordenação
> 🔁 *Faça um programa que recebe três números ordenados e mais um fora de ordem. Organize todos em ordem decrescente e exiba-os.*

---

### 🔽 Versão 3: Classificação com Interferência
> ✨ *Crie um algoritmo que recebe quatro números, sendo os três primeiros em ordem crescente, e mostre todos em ordem decrescente.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "ordem_decrescente"
var
   n1, n2, n3, n4: real
   vetor: vetor[1..4] de real
   i, j: inteiro
   temp: real
inicio
   escreva("Digite o primeiro número (crescente): ")
   leia(n1)
   escreva("Digite o segundo número (crescente): ")
   leia(n2)
   escreva("Digite o terceiro número (crescente): ")
   leia(n3)
   escreva("Digite o quarto número (qualquer): ")
   leia(n4)

   vetor[1] <- n1
   vetor[2] <- n2
   vetor[3] <- n3
   vetor[4] <- n4

   // Ordenação decrescente (bubble sort simples)
   para i de 1 ate 3 faca
      para j de i+1 ate 4 faca
         se vetor[i] < vetor[j] entao
            temp <- vetor[i]
            vetor[i] <- vetor[j]
            vetor[j] <- temp
         fimse
      fimpara
   fimpara

   escreval("Números em ordem decrescente:")
   para i de 1 ate 4 faca
      escreval(vetor[i])
   fimpara
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] numeros = new Double[4];

        System.out.print("Digite o primeiro número (crescente): ");
        numeros[0] = scanner.nextDouble();
        System.out.print("Digite o segundo número (crescente): ");
        numeros[1] = scanner.nextDouble();
        System.out.print("Digite o terceiro número (crescente): ");
        numeros[2] = scanner.nextDouble();
        System.out.print("Digite o quarto número (qualquer): ");
        numeros[3] = scanner.nextDouble();

        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("Ordem decrescente: " + Arrays.toString(numeros));
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    val numeros = mutableListOf<Double>()
    print("Digite o primeiro número (crescente): ")
    numeros.add(readLine()!!.toDouble())
    print("Digite o segundo número (crescente): ")
    numeros.add(readLine()!!.toDouble())
    print("Digite o terceiro número (crescente): ")
    numeros.add(readLine()!!.toDouble())
    print("Digite o quarto número (qualquer): ")
    numeros.add(readLine()!!.toDouble())

    val ordenados = numeros.sortedDescending()
    println("Ordem decrescente: $ordenados")
}
```

---

## 🐍 Implementação em Python

```python
numeros = []
numeros.append(float(input("Digite o primeiro número (crescente): ")))
numeros.append(float(input("Digite o segundo número (crescente): ")))
numeros.append(float(input("Digite o terceiro número (crescente): ")))
numeros.append(float(input("Digite o quarto número (qualquer): ")))

numeros.sort(reverse=True)
print("Ordem decrescente:", numeros)
```

---

## 🧙 Implementação em Pascal

```pascal
program OrdemDecrescente;
var
  numeros: array[1..4] of real;
  i, j: integer;
  temp: real;
begin
  write('Digite o primeiro número (crescente): ');
  readln(numeros[1]);
  write('Digite o segundo número (crescente): ');
  readln(numeros[2]);
  write('Digite o terceiro número (crescente): ');
  readln(numeros[3]);
  write('Digite o quarto número (qualquer): ');
  readln(numeros[4]);

  for i := 1 to 3 do
    for j := i + 1 to 4 do
      if numeros[i] < numeros[j] then
      begin
        temp := numeros[i];
        numeros[i] := numeros[j];
        numeros[j] := temp;
      end;

  writeln('Ordem decrescente:');
  for i := 1 to 4 do
    writeln(numeros[i]:0:2);
end.
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

---
