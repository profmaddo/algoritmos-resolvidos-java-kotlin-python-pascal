# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Cálculo de Rendimento de um Depósito

Neste nono exercício, vamos desenvolver um programa que **receba o valor de um depósito bancário** e a **taxa de juros (% ao mês)**, e calcule o **valor do rendimento** e o **valor total após o rendimento**.

---

### 💰 Versão 1: Poupança Pessoal
> 🏦 *Você depositou uma quantia em um banco e deseja saber quanto irá render após um mês. Crie um programa que leia o valor do depósito e a taxa de juros, e mostre o rendimento e o valor total.*

---

### 📊 Versão 2: Linguagem Financeira Neutra
> ✍️ *Desenvolva um programa que leia dois valores: o valor de um depósito e a taxa percentual de juros. Calcule e mostre o rendimento obtido e o total final após o acréscimo dos juros.*

---

### 🚀 Versão 3: Estilo Simulador de Investimentos
> 💹 *Você está criando um simulador de investimentos. Crie um algoritmo que receba o valor depositado e a taxa de juros mensal e mostre o quanto o valor rendeu e o valor final com os juros aplicados.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "rendimento_deposito"
var
   deposito, taxa, rendimento, total: real
inicio
   escreva("Digite o valor do depósito: ")
   leia(deposito)
   escreva("Digite a taxa de juros (%): ")
   leia(taxa)
   rendimento <- deposito * taxa / 100
   total <- deposito + rendimento
   escreval("Rendimento: ", rendimento)
   escreval("Valor total: ", total)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class RendimentoDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do depósito: ");
        double deposito = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (%): ");
        double taxa = scanner.nextDouble();

        double rendimento = deposito * taxa / 100;
        double total = deposito + rendimento;

        System.out.printf("Rendimento: %.2f%n", rendimento);
        System.out.printf("Valor total: %.2f%n", total);
    }
}
```

**Compilação:**
```bash
javac RendimentoDeposito.java
java RendimentoDeposito
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o valor do depósito: ")
    val deposito = readLine()!!.toDouble()

    print("Digite a taxa de juros (%): ")
    val taxa = readLine()!!.toDouble()

    val rendimento = deposito * taxa / 100
    val total = deposito + rendimento

    println("Rendimento: %.2f".format(rendimento))
    println("Valor total: %.2f".format(total))
}
```

**Compilação:**
```bash
kotlinc RendimentoDeposito.kt -include-runtime -d RendimentoDeposito.jar
java -jar RendimentoDeposito.jar
```

---

## 🐍 Implementação em Python

```python
deposito = float(input("Digite o valor do depósito: "))
taxa = float(input("Digite a taxa de juros (%): "))

rendimento = deposito * taxa / 100
total = deposito + rendimento

print("Rendimento: {:.2f}".format(rendimento))
print("Valor total: {:.2f}".format(total))
```

**Execução:**
```bash
python3 rendimento_deposito.py
```

---

## 🧙 Implementação em Pascal

```pascal
program RendimentoDeposito;
var
  deposito, taxa, rendimento, total: real;
begin
  write('Digite o valor do depósito: ');
  readln(deposito);
  write('Digite a taxa de juros (%): ');
  readln(taxa);

  rendimento := deposito * taxa / 100;
  total := deposito + rendimento;

  writeln('Rendimento: ', rendimento:0:2);
  writeln('Valor total: ', total:0:2);
end.
```

**Compilação:**
```bash
fpc rendimento_deposito.pas
./rendimento_deposito  # ou rendimento_deposito.exe no Windows
```

---

## 🧠 Dica do Professor
> Este cálculo é muito comum no dia a dia de quem quer simular aplicações. Tente expandir para vários meses com juros compostos! 📈

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
