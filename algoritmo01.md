# Aprenda algoritmos com o Professor Marco Maddo

![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)


## 🧠 Situação Problema: Soma de Quatro Números Inteiros

Neste primeiro exercício, vamos desenvolver algoritmos e programas simples que recebem **quatro números inteiros** e retornam a **soma entre eles**. Veja abaixo três formas diferentes de apresentar o mesmo problema:

---

### 🎯 Versão 1: Contexto Pessoal

> *Imagine que você foi ao supermercado e comprou quatro itens diferentes. Cada item custou um valor inteiro (sem centavos). Escreva um algoritmo que receba esses quatro valores e calcule o total da compra.*

---

### 📚 Versão 2: Linguagem Neutra e Didática

> *Desenvolva um algoritmo que leia quatro números inteiros fornecidos pelo usuário. Em seguida, o algoritmo deve calcular e exibir a soma desses quatro valores.*

---

### 🧩 Versão 3: Estilo Desafio

> *Você recebeu a missão de somar quatro números inteiros informados um a um pelo usuário. Crie um programa que faça a leitura desses números, calcule a soma total e mostre o resultado final na tela.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "soma_quatro_numeros"
var
   num1, num2, num3, num4, soma: inteiro
inicio
   escreva("Digite o primeiro número: ")
   leia(num1)
   escreva("Digite o segundo número: ")
   leia(num2)
   escreva("Digite o terceiro número: ")
   leia(num3)
   escreva("Digite o quarto número: ")
   leia(num4)
   soma <- num1 + num2 + num3 + num4
   escreval("A soma é: ", soma)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class SomaQuatroNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        System.out.print("Digite o quarto número: ");
        int num4 = scanner.nextInt();

        int soma = num1 + num2 + num3 + num4;
        System.out.println("A soma é: " + soma);
    }
}
```

**Compilação:**

```bash
javac SomaQuatroNumeros.java
java SomaQuatroNumeros
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()

    print("Digite o terceiro número: ")
    val num3 = readLine()!!.toInt()

    print("Digite o quarto número: ")
    val num4 = readLine()!!.toInt()

    val soma = num1 + num2 + num3 + num4
    println("A soma é: $soma")
}
```

**Compilação:**

```bash
kotlinc SomaQuatroNumeros.kt -include-runtime -d SomaQuatroNumeros.jar
java -jar SomaQuatroNumeros.jar
```

---

## 🐍 Implementação em Python

```python
num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))
num3 = int(input("Digite o terceiro número: "))
num4 = int(input("Digite o quarto número: "))

soma = num1 + num2 + num3 + num4
print("A soma é:", soma)
```

**Execução:**

```bash
python3 soma_quatro_numeros.py
```

---

## 🧙 Implementação em Pascal

```pascal
program SomaQuatroNumeros;
var
  num1, num2, num3, num4, soma: integer;
begin
  write('Digite o primeiro número: ');
  readln(num1);

  write('Digite o segundo número: ');
  readln(num2);

  write('Digite o terceiro número: ');
  readln(num3);

  write('Digite o quarto número: ');
  readln(num4);

  soma := num1 + num2 + num3 + num4;
  writeln('A soma é: ', soma);
end.
```

**Compilação:**

```bash
fpc soma_quatro_numeros.pas
./soma_quatro_numeros  # ou soma_quatro_numeros.exe no Windows
```

---

## 🧠 Dica do Professor

> Este exercício é excelente para introduzir entrada de dados, variáveis e operações aritméticas. Refaça com outros valores e teste também com números negativos! 😉

---

## 🌐 Redes do Professor Marco Maddo

* YouTube: [Professor Marco Maddo](https://www.youtube.com/@ProfessorMarcoMaddo)
* LinkedIn: [Marco Maddo](https://www.linkedin.com/in/marcomaddo/)
* GitHub: [@profmaddo](https://github.com/profmaddo)
* GitLab: [@profmaddo](https://gitlab.com/profmaddo)
* Udemy: [Cursos Marco Maddo](https://www.udemy.com/user/marcomaddo/)

---

## 🚀 Acesse também:

* 🌐 Site oficial do professor: [www.marcomaddo.com.br](https://www.marcomaddo.com.br)
* 🧑‍💼 Empresa TSSTI Tecnologia: [www.tssti.com.br](https://www.tssti.com.br)

---
