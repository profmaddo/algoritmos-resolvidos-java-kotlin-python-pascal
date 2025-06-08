# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Menu Interativo de Operações

Neste trigésimo quinto exercício, o programa deve:

- Mostrar um menu com duas opções:
  1. Somar dois números.
  2. Raiz quadrada de um número.
- Receber a opção do usuário.
- Executar a operação correspondente com base nos dados fornecidos.

---

### 📋 Versão 1: Menu Matemático Simples
> ➕ *Crie um programa com menu que permita somar dois números ou calcular a raiz quadrada de um número.*

---

### 🧮 Versão 2: Calculadora Condicional
> 🧠 *Desenvolva um programa com um menu básico de duas operações matemáticas: soma e raiz quadrada.*

---

### 🧾 Versão 3: Operações Dinâmicas
> 🧠 *Implemente um menu de escolha para o usuário decidir se quer somar ou calcular a raiz quadrada.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "menu_operacoes"
var
   opcao: inteiro
   num1, num2, resultado: real
inicio
   escreval("Menu de opções:")
   escreval("1. Somar dois números.")
   escreval("2. Raiz quadrada de um número.")
   escreva("Digite a opção desejada: ")
   leia(opcao)

   se opcao = 1 então
      escreva("Digite o primeiro número: ")
      leia(num1)
      escreva("Digite o segundo número: ")
      leia(num2)
      resultado <- num1 + num2
      escreval("Resultado da soma: ", resultado)
   senao
      escreva("Digite um número: ")
      leia(num1)
      resultado <- raizq(num1)
      escreval("Raiz quadrada: ", resultado)
   fimse
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class MenuOperacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu de opções:");
        System.out.println("1. Somar dois números.");
        System.out.println("2. Raiz quadrada de um número.");
        System.out.print("Digite a opção desejada: ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Digite o primeiro número: ");
            double n1 = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            double n2 = sc.nextDouble();
            System.out.println("Resultado da soma: " + (n1 + n2));
        } else if (opcao == 2) {
            System.out.print("Digite um número: ");
            double n = sc.nextDouble();
            System.out.println("Raiz quadrada: " + Math.sqrt(n));
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
import kotlin.math.sqrt

fun main() {
    println("Menu de opções:")
    println("1. Somar dois números.")
    println("2. Raiz quadrada de um número.")
    print("Digite a opção desejada: ")
    val opcao = readLine()!!.toInt()

    when (opcao) {
        1 -> {
            print("Digite o primeiro número: ")
            val n1 = readLine()!!.toDouble()
            print("Digite o segundo número: ")
            val n2 = readLine()!!.toDouble()
            println("Resultado da soma: ${n1 + n2}")
        }
        2 -> {
            print("Digite um número: ")
            val n = readLine()!!.toDouble()
            println("Raiz quadrada: ${sqrt(n)}")
        }
        else -> println("Opção inválida.")
    }
}
```

---

## 🐍 Implementação em Python

```python
import math

print("Menu de opções:")
print("1. Somar dois números.")
print("2. Raiz quadrada de um número.")
opcao = int(input("Digite a opção desejada: "))

if opcao == 1:
    n1 = float(input("Digite o primeiro número: "))
    n2 = float(input("Digite o segundo número: "))
    print("Resultado da soma:", n1 + n2)
elif opcao == 2:
    n = float(input("Digite um número: "))
    print("Raiz quadrada:", math.sqrt(n))
else:
    print("Opção inválida.")
```

---

## 🧙 Implementação em Pascal

```pascal
program MenuOperacoes;
uses Math;
var
  opcao: integer;
  n1, n2: real;
begin
  writeln('Menu de opções:');
  writeln('1. Somar dois números.');
  writeln('2. Raiz quadrada de um número.');
  write('Digite a opção desejada: ');
  readln(opcao);

  if opcao = 1 then
  begin
    write('Digite o primeiro número: ');
    readln(n1);
    write('Digite o segundo número: ');
    readln(n2);
    writeln('Resultado da soma: ', n1 + n2:0:2);
  end
  else if opcao = 2 then
  begin
    write('Digite um número: ');
    readln(n1);
    writeln('Raiz quadrada: ', sqrt(n1):0:2);
  end
  else
    writeln('Opção inválida.');
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
