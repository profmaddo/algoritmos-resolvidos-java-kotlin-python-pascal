# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Análise matemática de um conjunto de números

### Versão 1 - Redação simples
Crie um programa que leia uma sequência de números positivos. Para cada número lido, mostre:
- o próprio número;
- seu quadrado;
- seu cubo;
- sua raiz quadrada.

O programa deve encerrar quando um número **menor ou igual a zero** for informado.

---

## 💬 Portugol

```portugol
algoritmo "analise_numerica_simples"
var
  numero: real
inicio
  escreval("Digite valores positivos. Digite 0 ou negativo para sair.")
  repita
    escreva("Digite um número: ")
    leia(numero)
    se numero > 0 entao
      escreval("Número: ", numero:0:2)
      escreval("Quadrado: ", numero * numero:0:2)
      escreval("Cubo: ", numero * numero * numero:0:2)
      escreval("Raiz quadrada: ", raizq(numero):0:2)
      escreval("--------------")
    fimse
  ate numero <= 0
fimalgoritmo
```

---
## ☕ Implementação em Java

```java
import java.util.Scanner;

public class AnaliseNumericaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.println("Digite valores positivos. Digite 0 ou negativo para sair.");

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextDouble();

            if (numero > 0) {
                System.out.printf("Número: %.2f
", numero);
                System.out.printf("Quadrado: %.2f
", Math.pow(numero, 2));
                System.out.printf("Cubo: %.2f
", Math.pow(numero, 3));
                System.out.printf("Raiz quadrada: %.2f
", Math.sqrt(numero));
                System.out.println("--------------");
            }
        } while (numero > 0);
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
import kotlin.math.*

fun main() {
    println("Digite valores positivos. Digite 0 ou negativo para sair.")
    var numero: Double

    do {
        print("Digite um número: ")
        numero = readLine()!!.toDouble()

        if (numero > 0) {
            println("Número: %.2f".format(numero))
            println("Quadrado: %.2f".format(numero * numero))
            println("Cubo: %.2f".format(numero * numero * numero))
            println("Raiz quadrada: %.2f".format(sqrt(numero)))
            println("--------------")
        }
    } while (numero > 0)
}
```

---

## 🐍 Implementação em Python

```python
import math

print("Digite valores positivos. Digite 0 ou negativo para sair.")

while True:
    numero = float(input("Digite um número: "))
    if numero <= 0:
        break
    print(f"Número: {numero:.2f}")
    print(f"Quadrado: {numero ** 2:.2f}")
    print(f"Cubo: {numero ** 3:.2f}")
    print(f"Raiz quadrada: {math.sqrt(numero):.2f}")
    print("--------------")
```

---

## 🧙 Implementação em Pascal

```pascal
program AnaliseNumericaSimples;
uses crt, math;
var
  numero: real;
begin
  writeln('Digite valores positivos. Digite 0 ou negativo para sair.');
  repeat
    write('Digite um número: ');
    readln(numero);
    if numero > 0 then
    begin
      writeln('Número: ', numero:0:2);
      writeln('Quadrado: ', sqr(numero):0:2);
      writeln('Cubo: ', power(numero, 3):0:2);
      writeln('Raiz quadrada: ', sqrt(numero):0:2);
      writeln('--------------');
    end;
  until numero <= 0;
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