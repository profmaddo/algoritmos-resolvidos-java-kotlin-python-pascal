# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Potências e Raízes de um Número

Neste décimo primeiro exercício, o objetivo é criar um programa que receba **um número positivo e maior que zero** e calcule:

- a) o número ao **quadrado**;
- b) o número ao **cubo**;
- c) a **raiz quadrada** do número;
- d) a **raiz cúbica** do número.

---

### 🔢 Versão 1: Ferramenta Matemática
> 🧮 *Desenvolva um programa que funcione como uma calculadora científica básica, recebendo um número positivo e retornando as potências e raízes solicitadas.*

---

### 📚 Versão 2: Linguagem Didática Neutra
> ✍️ *Faça um programa que receba um número maior que zero e exiba: o número ao quadrado, ao cubo, sua raiz quadrada e raiz cúbica.*

---

### 🧠 Versão 3: Estilo Desafio Numérico
> 💡 *Crie um algoritmo que aceite apenas números positivos maiores que zero e mostre suas potências (² e ³) e raízes (√ e ∛). Use matemática de forma criativa!*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "potencias_e_raizes"
var
   numero, quadrado, cubo, raizQuadrada, raizCubica: real
inicio
   escreva("Digite um número positivo maior que zero: ")
   leia(numero)
   se numero > 0 entao
      quadrado <- numero ^ 2
      cubo <- numero ^ 3
      raizQuadrada <- raizq(numero)
      raizCubica <- numero ^ (1/3)
      escreval("Ao quadrado: ", quadrado)
      escreval("Ao cubo: ", cubo)
      escreval("Raiz quadrada: ", raizQuadrada)
      escreval("Raiz cúbica: ", raizCubica)
   senao
      escreval("Erro: o número deve ser maior que zero.")
   fimse
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class PotenciasRaizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo maior que zero: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            double quadrado = Math.pow(numero, 2);
            double cubo = Math.pow(numero, 3);
            double raizQuadrada = Math.sqrt(numero);
            double raizCubica = Math.cbrt(numero);

            System.out.printf("Ao quadrado: %.4f%n", quadrado);
            System.out.printf("Ao cubo: %.4f%n", cubo);
            System.out.printf("Raiz quadrada: %.4f%n", raizQuadrada);
            System.out.printf("Raiz cúbica: %.4f%n", raizCubica);
        } else {
            System.out.println("Erro: o número deve ser maior que zero.");
        }
    }
}
```

**Compilação:**
```bash
javac PotenciasRaizes.java
java PotenciasRaizes
```

---

## 💙 Implementação em Kotlin

```kotlin
import kotlin.math.*

fun main() {
    print("Digite um número positivo maior que zero: ")
    val numero = readLine()!!.toDouble()

    if (numero > 0) {
        println("Ao quadrado: %.4f".format(numero.pow(2)))
        println("Ao cubo: %.4f".format(numero.pow(3)))
        println("Raiz quadrada: %.4f".format(sqrt(numero)))
        println("Raiz cúbica: %.4f".format(numero.pow(1.0 / 3)))
    } else {
        println("Erro: o número deve ser maior que zero.")
    }
}
```

**Compilação:**
```bash
kotlinc PotenciasRaizes.kt -include-runtime -d PotenciasRaizes.jar
java -jar PotenciasRaizes.jar
```

---

## 🐍 Implementação em Python

```python
import math

numero = float(input("Digite um número positivo maior que zero: "))

if numero > 0:
    print("Ao quadrado: {:.4f}".format(numero ** 2))
    print("Ao cubo: {:.4f}".format(numero ** 3))
    print("Raiz quadrada: {:.4f}".format(math.sqrt(numero)))
    print("Raiz cúbica: {:.4f}".format(numero ** (1/3)))
else:
    print("Erro: o número deve ser maior que zero.")
```

**Execução:**
```bash
python3 potencias_raizes.py
```

---

## 🧙 Implementação em Pascal

```pascal
program PotenciasRaizes;
uses math;
var
  numero, quadrado, cubo, raizQuadrada, raizCubica: real;
begin
  write('Digite um número positivo maior que zero: ');
  readln(numero);

  if numero > 0 then
  begin
    quadrado := power(numero, 2);
    cubo := power(numero, 3);
    raizQuadrada := sqrt(numero);
    raizCubica := exp(ln(numero) / 3);  // raiz cúbica

    writeln('Ao quadrado: ', quadrado:0:4);
    writeln('Ao cubo: ', cubo:0:4);
    writeln('Raiz quadrada: ', raizQuadrada:0:4);
    writeln('Raiz cúbica: ', raizCubica:0:4);
  end
  else
    writeln('Erro: o número deve ser maior que zero.');
end.
```

**Compilação:**
```bash
fpc potencias_raizes.pas
./potencias_raizes  # ou potencias_raizes.exe no Windows
```

---

## 🧠 Dica do Professor
> Usar potências fracionárias como 1/3 para raiz cúbica é uma prática comum em linguagens de programação. Explore também para outras raízes! 🧠

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
