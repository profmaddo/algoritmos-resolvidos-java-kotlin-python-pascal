# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Quantos Convites Precisam Ser Vendidos?

Neste vigésimo quinto exercício, o programa deve:

- Receber o **custo total** de um espetáculo teatral;
- Receber o **preço de cada convite** vendido;
- Calcular e mostrar:
  - A **quantidade mínima de convites** que devem ser vendidos para **cobrir o custo do espetáculo** (arredondando para cima se necessário).

---

### 🎭 Versão 1: Ingressos para Cobrir o Custo
> 💰 *Desenvolva um programa que calcule quantos convites precisam ser vendidos para cobrir o custo de uma peça de teatro.*

---

### 🎟️ Versão 2: Planejamento de Arrecadação
> 📊 *Faça um algoritmo que receba o custo e o preço do convite e determine a quantidade de ingressos a vender para evitar prejuízo.*

---

### 🧮 Versão 3: Calculadora de Ingressos
> 🎫 *Crie um programa para calcular a quantidade mínima de convites necessários para pagar o custo de um espetáculo teatral.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "convites_para_cobrir_custo"
var
   custoEspetaculo, precoConvite: real
   quantidadeConvites: inteiro
inicio
   escreva("Digite o custo do espetáculo: ")
   leia(custoEspetaculo)
   escreva("Digite o preço do convite: ")
   leia(precoConvite)

   quantidadeConvites <- ceil(custoEspetaculo / precoConvite)

   escreval("Quantidade de convites a serem vendidos: ", quantidadeConvites)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class ConvitesEspetaculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo do espetáculo: ");
        double custo = scanner.nextDouble();

        System.out.print("Digite o preço do convite: ");
        double precoConvite = scanner.nextDouble();

        int quantidadeConvites = (int) Math.ceil(custo / precoConvite);

        System.out.println("Quantidade de convites a serem vendidos: " + quantidadeConvites);
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
import kotlin.math.ceil

fun main() {
    print("Digite o custo do espetáculo: ")
    val custo = readLine()!!.toDouble()

    print("Digite o preço do convite: ")
    val precoConvite = readLine()!!.toDouble()

    val quantidade = ceil(custo / precoConvite).toInt()

    println("Quantidade de convites a serem vendidos: $quantidade")
}
```

---

## 🐍 Implementação em Python

```python
import math

custo = float(input("Digite o custo do espetáculo: "))
preco = float(input("Digite o preço do convite: "))

quantidade = math.ceil(custo / preco)

print("Quantidade de convites a serem vendidos:", quantidade)
```

---

## 🧙 Implementação em Pascal

```pascal
program ConvitesEspetaculo;
uses Math;
var
  custo, preco: real;
  quantidade: integer;
begin
  write('Digite o custo do espetáculo: ');
  readln(custo);

  write('Digite o preço do convite: ');
  readln(preco);

  quantidade := ceil(custo / preco);

  writeln('Quantidade de convites a serem vendidos: ', quantidade);
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
