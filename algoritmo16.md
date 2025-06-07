# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Cálculo de Salário com Base no Salário Mínimo

Neste décimo sexto exercício, o programa deve receber:

- O **número de horas trabalhadas**;
- O **valor do salário mínimo**.

E então calcular:

- a) O **valor da hora trabalhada**, que é metade do salário mínimo;
- b) O **salário bruto**, que é o número de horas trabalhadas multiplicado pelo valor da hora;
- c) O **imposto**, que é 3% do salário bruto;
- d) O **salário a receber**, que é o salário bruto menos o imposto.

---

### 💼 Versão 1: Regras Trabalhistas
> 🧾 *Crie um programa que leia o número de horas trabalhadas e o salário mínimo. Calcule e exiba o valor da hora, o salário bruto, o valor do imposto e o salário a receber.*

---

### 📑 Versão 2: Linguagem Neutra e Explicativa
> ✍️ *Desenvolva um algoritmo que, com base na quantidade de horas trabalhadas e no salário mínimo atual, calcule e exiba todos os valores intermediários e o salário líquido do trabalhador.*

---

### 🧮 Versão 3: Estilo Contador de RH
> 📊 *Você está criando um sistema de folha de pagamento. Crie um programa que calcule quanto um funcionário receberá com base no número de horas trabalhadas e o valor do salário mínimo.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "calculo_salario"
var
   horasTrabalhadas, salarioMinimo, valorHora, salarioBruto, imposto, salarioReceber: real
inicio
   escreva("Digite o número de horas trabalhadas: ")
   leia(horasTrabalhadas)
   escreva("Digite o valor do salário mínimo: ")
   leia(salarioMinimo)

   valorHora <- salarioMinimo / 2
   salarioBruto <- horasTrabalhadas * valorHora
   imposto <- salarioBruto * 0.03
   salarioReceber <- salarioBruto - imposto

   escreval("Valor da hora trabalhada: R$", valorHora)
   escreval("Salário bruto: R$", salarioBruto)
   escreval("Imposto (3%): R$", imposto)
   escreval("Salário a receber: R$", salarioReceber)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas: ");
        double horas = scanner.nextDouble();

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        double valorHora = salarioMinimo / 2;
        double salarioBruto = horas * valorHora;
        double imposto = salarioBruto * 0.03;
        double salarioReceber = salarioBruto - imposto;

        System.out.printf("Valor da hora trabalhada: R$ %.2f%n", valorHora);
        System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Imposto (3%%): R$ %.2f%n", imposto);
        System.out.printf("Salário a receber: R$ %.2f%n", salarioReceber);
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o número de horas trabalhadas: ")
    val horas = readLine()!!.toDouble()

    print("Digite o valor do salário mínimo: ")
    val salarioMinimo = readLine()!!.toDouble()

    val valorHora = salarioMinimo / 2
    val salarioBruto = horas * valorHora
    val imposto = salarioBruto * 0.03
    val salarioReceber = salarioBruto - imposto

    println("Valor da hora trabalhada: R$ %.2f".format(valorHora))
    println("Salário bruto: R$ %.2f".format(salarioBruto))
    println("Imposto (3%): R$ %.2f".format(imposto))
    println("Salário a receber: R$ %.2f".format(salarioReceber))
}
```

---

## 🐍 Implementação em Python

```python
horas = float(input("Digite o número de horas trabalhadas: "))
salario_minimo = float(input("Digite o valor do salário mínimo: "))

valor_hora = salario_minimo / 2
salario_bruto = horas * valor_hora
imposto = salario_bruto * 0.03
salario_receber = salario_bruto - imposto

print("Valor da hora trabalhada: R$ {:.2f}".format(valor_hora))
print("Salário bruto: R$ {:.2f}".format(salario_bruto))
print("Imposto (3%): R$ {:.2f}".format(imposto))
print("Salário a receber: R$ {:.2f}".format(salario_receber))
```

---

## 🧙 Implementação em Pascal

```pascal
program CalculoSalario;
var
  horas: real;
  salarioMinimo, valorHora, salarioBruto, imposto, salarioReceber: real;
begin
  write('Digite o número de horas trabalhadas: ');
  readln(horas);

  write('Digite o valor do salário mínimo: ');
  readln(salarioMinimo);

  valorHora := salarioMinimo / 2;
  salarioBruto := horas * valorHora;
  imposto := salarioBruto * 0.03;
  salarioReceber := salarioBruto - imposto;

  writeln('Valor da hora trabalhada: R$ ', valorHora:0:2);
  writeln('Salário bruto: R$ ', salarioBruto:0:2);
  writeln('Imposto (3%): R$ ', imposto:0:2);
  writeln('Salário a receber: R$ ', salarioReceber:0:2);
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
