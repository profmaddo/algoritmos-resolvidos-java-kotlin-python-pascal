# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Ordenações Condicionais

Neste trigésimo quarto exercício, o programa deve:

- Receber quatro valores: `I` (inteiro positivo), `A`, `B` e `C` (números reais diferentes entre si);
- `I` define como os números devem ser ordenados:

| Valor de I | Forma de escrever A, B, C |
|------------|----------------------------|
| 1          | Ordem crescente            |
| 2          | Ordem decrescente          |
| 3          | O maior no meio            |

---

### 🔄 Versão 1: Organizador Condicional
> 📋 *Desenvolva um programa que lê três números reais A, B e C e um inteiro I, e organiza os valores conforme o valor de I.*

---

### 📊 Versão 2: Controle de Apresentação Numérica
> ✨ *Crie um algoritmo que recebe um modo de exibição (I) e apresenta os números A, B e C conforme especificado.*

---

### 🧠 Versão 3: Ordenação com Lógica de Negócio
> 🔢 *Implemente um programa que altera a ordem de exibição dos números A, B e C conforme a regra determinada por I.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "ordenacao_condicional"
var
   I: inteiro
   A, B, C: real
   vetor: vetor[1..3] de real
   i, j: inteiro
   temp: real
inicio
   escreva("Digite o valor de I (1, 2 ou 3): ")
   leia(I)
   escreva("Digite o valor de A: ")
   leia(A)
   escreva("Digite o valor de B: ")
   leia(B)
   escreva("Digite o valor de C: ")
   leia(C)

   vetor[1] <- A
   vetor[2] <- B
   vetor[3] <- C

   // Ordenar crescente
   para i de 1 ate 2 faca
      para j de i+1 ate 3 faca
         se vetor[i] > vetor[j] entao
            temp <- vetor[i]
            vetor[i] <- vetor[j]
            vetor[j] <- temp
         fimse
      fimpara
   fimpara

   se I = 1 entao
      escreval("Ordem crescente: ", vetor[1], ", ", vetor[2], ", ", vetor[3])
   senao se I = 2 entao
      escreval("Ordem decrescente: ", vetor[3], ", ", vetor[2], ", ", vetor[1])
   senao se I = 3 entao
      escreval("Maior no meio: ", vetor[1], ", ", vetor[3], ", ", vetor[2])
   fimse
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;
import java.util.Arrays;

public class OrdenacaoCondicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de I (1, 2 ou 3): ");
        int I = scanner.nextInt();
        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();
        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

        Double[] numeros = {A, B, C};
        Arrays.sort(numeros);

        if (I == 1) {
            System.out.printf("Ordem crescente: %.2f, %.2f, %.2f%n", numeros[0], numeros[1], numeros[2]);
        } else if (I == 2) {
            System.out.printf("Ordem decrescente: %.2f, %.2f, %.2f%n", numeros[2], numeros[1], numeros[0]);
        } else if (I == 3) {
            System.out.printf("Maior no meio: %.2f, %.2f, %.2f%n", numeros[0], numeros[2], numeros[1]);
        }
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o valor de I (1, 2 ou 3): ")
    val I = readLine()!!.toInt()
    print("Digite o valor de A: ")
    val A = readLine()!!.toDouble()
    print("Digite o valor de B: ")
    val B = readLine()!!.toDouble()
    print("Digite o valor de C: ")
    val C = readLine()!!.toDouble()

    val lista = listOf(A, B, C).sorted()

    when (I) {
        1 -> println("Ordem crescente: ${lista[0]}, ${lista[1]}, ${lista[2]}")
        2 -> println("Ordem decrescente: ${lista[2]}, ${lista[1]}, ${lista[0]}")
        3 -> println("Maior no meio: ${lista[0]}, ${lista[2]}, ${lista[1]}")
    }
}
```

---

## 🐍 Implementação em Python

```python
I = int(input("Digite o valor de I (1, 2 ou 3): "))
A = float(input("Digite o valor de A: "))
B = float(input("Digite o valor de B: "))
C = float(input("Digite o valor de C: "))

valores = sorted([A, B, C])

if I == 1:
    print("Ordem crescente:", valores)
elif I == 2:
    print("Ordem decrescente:", valores[::-1])
elif I == 3:
    print("Maior no meio:", [valores[0], valores[2], valores[1]])
```

---

## 🧙 Implementação em Pascal

```pascal
program OrdenacaoCondicional;
var
  I: integer;
  A, B, C, temp: real;
  numeros: array[1..3] of real;
  i, j: integer;
begin
  write('Digite o valor de I (1, 2 ou 3): ');
  readln(I);
  write('Digite o valor de A: ');
  readln(A);
  write('Digite o valor de B: ');
  readln(B);
  write('Digite o valor de C: ');
  readln(C);

  numeros[1] := A;
  numeros[2] := B;
  numeros[3] := C;

  for i := 1 to 2 do
    for j := i + 1 to 3 do
      if numeros[i] > numeros[j] then
      begin
        temp := numeros[i];
        numeros[i] := numeros[j];
        numeros[j] := temp;
      end;

  if I = 1 then
    writeln('Ordem crescente: ', numeros[1]:0:2, ', ', numeros[2]:0:2, ', ', numeros[3]:0:2)
  else if I = 2 then
    writeln('Ordem decrescente: ', numeros[3]:0:2, ', ', numeros[2]:0:2, ', ', numeros[1]:0:2)
  else if I = 3 then
    writeln('Maior no meio: ', numeros[1]:0:2, ', ', numeros[3]:0:2, ', ', numeros[2]:0:2);
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
