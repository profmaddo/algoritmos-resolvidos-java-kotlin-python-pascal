# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## ⚡ Situação Problema: Cálculo da Conta de Energia com Desconto no PIX

Neste vigésimo segundo exercício, o programa deve:

- Receber o **valor do salário mínimo**;
- Receber a **quantidade de quilowatts (kWh) consumida** por uma residência;
- Calcular o **valor de cada quilowatt** como sendo 1/5 do salário mínimo;
- Calcular o **valor total a pagar**;
- Calcular o **valor com desconto de 5% para pagamento via PIX**.

---

### 💡 Versão 1: Energia Econômica
> ⚙️ *Faça um programa que calcule o valor de cada kWh com base no salário mínimo, o valor da conta de energia e o valor com 5% de desconto para pagamento via PIX.*

---

### 💰 Versão 2: Foco no Consumo
> 🧮 *Crie um algoritmo que receba o salário mínimo e a quantidade de energia consumida, e informe os valores do kWh, da conta total e do desconto no PIX.*

---

### 🔌 Versão 3: Estilo Conta de Luz
> 💳 *Desenvolva um programa para calcular a fatura de energia elétrica com base no salário mínimo, consumo em kWh e desconto para pagamento à vista via PIX.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "conta_energia_pix"
var
   salarioMinimo, consumoKw, valorKw, valorTotal, valorPix: real
inicio
   escreva("Digite o valor do salário mínimo: ")
   leia(salarioMinimo)
   escreva("Digite a quantidade de kWh consumidos: ")
   leia(consumoKw)

   valorKw <- salarioMinimo / 5
   valorTotal <- valorKw * consumoKw
   valorPix <- valorTotal - (valorTotal * 0.05)

   escreval("Valor do kWh: R$", valorKw)
   escreval("Valor total: R$", valorTotal)
   escreval("Valor com desconto no PIX: R$", valorPix)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class ContaEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite a quantidade de kWh consumidos: ");
        double consumoKw = scanner.nextDouble();

        double valorKw = salarioMinimo / 5;
        double valorTotal = valorKw * consumoKw;
        double valorPix = valorTotal * 0.95;

        System.out.printf("Valor do kWh: R$ %.2f%n", valorKw);
        System.out.printf("Valor total: R$ %.2f%n", valorTotal);
        System.out.printf("Valor com desconto no PIX: R$ %.2f%n", valorPix);
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o valor do salário mínimo: ")
    val salarioMinimo = readLine()!!.toDouble()

    print("Digite a quantidade de kWh consumidos: ")
    val consumoKw = readLine()!!.toDouble()

    val valorKw = salarioMinimo / 5
    val valorTotal = valorKw * consumoKw
    val valorPix = valorTotal * 0.95

    println("Valor do kWh: R$ %.2f".format(valorKw))
    println("Valor total: R$ %.2f".format(valorTotal))
    println("Valor com desconto no PIX: R$ %.2f".format(valorPix))
}
```

---

## 🐍 Implementação em Python

```python
salario_minimo = float(input("Digite o valor do salário mínimo: "))
consumo_kw = float(input("Digite a quantidade de kWh consumidos: "))

valor_kw = salario_minimo / 5
valor_total = valor_kw * consumo_kw
valor_pix = valor_total * 0.95

print("Valor do kWh: R$ {:.2f}".format(valor_kw))
print("Valor total: R$ {:.2f}".format(valor_total))
print("Valor com desconto no PIX: R$ {:.2f}".format(valor_pix))
```

---

## 🧙 Implementação em Pascal

```pascal
program ContaEnergia;
var
  salarioMinimo, consumoKw, valorKw, valorTotal, valorPix: real;
begin
  write('Digite o valor do salário mínimo: ');
  readln(salarioMinimo);

  write('Digite a quantidade de kWh consumidos: ');
  readln(consumoKw);

  valorKw := salarioMinimo / 5;
  valorTotal := valorKw * consumoKw;
  valorPix := valorTotal * 0.95;

  writeln('Valor do kWh: R$ ', valorKw:0:2);
  writeln('Valor total: R$ ', valorTotal:0:2);
  writeln('Valor com desconto no PIX: R$ ', valorPix:0:2);
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
