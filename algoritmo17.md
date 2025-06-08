# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Cálculo do Saldo Após Emissão de Cheques

Neste décimo sétimo exercício, o programa deve:

- Receber o valor do **salário depositado**;
- Receber o valor de **dois cheques emitidos**;
- Calcular o **valor da taxa de retirada** (0,15% por operação de retirada);
- Calcular e exibir o **saldo atual** da conta.

**Importante:** O saldo inicial da conta é **zero**, e o salário foi depositado **antes** das retiradas.

---

### 💸 Versão 1: Saldo com Taxa Bancária
> 💳 *Crie um programa que receba o valor do salário e o valor de dois cheques emitidos. Calcule e exiba o saldo final, considerando uma taxa de 0,15% para cada retirada.*

---

### 🧾 Versão 2: Linguagem Explicativa e Didática
> ✍️ *Faça um algoritmo que receba o salário depositado em conta e os valores de dois cheques descontados. Cada cheque possui uma taxa de retirada de 0,15%. Calcule o saldo atual da conta.*

---

### 🏦 Versão 3: Estilo Banco Digital
> 🏛️ *Implemente um simulador de conta bancária. Após depositar o salário e descontar dois cheques com taxas de 0,15% cada, mostre o saldo disponível.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "saldo_bancario"
var
   salario, cheque1, cheque2, taxa1, taxa2, saldo: real
inicio
   escreva("Digite o valor do salário depositado: ")
   leia(salario)
   escreva("Digite o valor do primeiro cheque: ")
   leia(cheque1)
   escreva("Digite o valor do segundo cheque: ")
   leia(cheque2)

   taxa1 <- cheque1 * 0.0015
   taxa2 <- cheque2 * 0.0015

   saldo <- salario - cheque1 - taxa1 - cheque2 - taxa2

   escreval("Saldo atual da conta: R$", saldo)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class SaldoConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário depositado: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o valor do primeiro cheque: ");
        double cheque1 = scanner.nextDouble();

        System.out.print("Digite o valor do segundo cheque: ");
        double cheque2 = scanner.nextDouble();

        double taxa1 = cheque1 * 0.0015;
        double taxa2 = cheque2 * 0.0015;

        double saldo = salario - cheque1 - taxa1 - cheque2 - taxa2;

        System.out.printf("Saldo atual da conta: R$ %.2f%n", saldo);
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o valor do salário depositado: ")
    val salario = readLine()!!.toDouble()

    print("Digite o valor do primeiro cheque: ")
    val cheque1 = readLine()!!.toDouble()

    print("Digite o valor do segundo cheque: ")
    val cheque2 = readLine()!!.toDouble()

    val taxa1 = cheque1 * 0.0015
    val taxa2 = cheque2 * 0.0015

    val saldo = salario - cheque1 - taxa1 - cheque2 - taxa2

    println("Saldo atual da conta: R$ %.2f".format(saldo))
}
```

---

## 🐍 Implementação em Python

```python
salario = float(input("Digite o valor do salário depositado: "))
cheque1 = float(input("Digite o valor do primeiro cheque: "))
cheque2 = float(input("Digite o valor do segundo cheque: "))

taxa1 = cheque1 * 0.0015
taxa2 = cheque2 * 0.0015

saldo = salario - cheque1 - taxa1 - cheque2 - taxa2

print("Saldo atual da conta: R$ {:.2f}".format(saldo))
```

---

## 🧙 Implementação em Pascal

```pascal
program SaldoConta;
var
  salario, cheque1, cheque2, taxa1, taxa2, saldo: real;
begin
  write('Digite o valor do salário depositado: ');
  readln(salario);

  write('Digite o valor do primeiro cheque: ');
  readln(cheque1);

  write('Digite o valor do segundo cheque: ');
  readln(cheque2);

  taxa1 := cheque1 * 0.0015;
  taxa2 := cheque2 * 0.0015;

  saldo := salario - cheque1 - taxa1 - cheque2 - taxa2;

  writeln('Saldo atual da conta: R$ ', saldo:0:2);
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
