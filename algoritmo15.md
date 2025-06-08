# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Cálculo do Custo Final de um Veículo

Neste décimo quinto exercício, o programa deve receber:

- O **preço de fábrica** de um carro;
- O **percentual de lucro do distribuidor**;
- O **percentual de impostos sobre o preço de fábrica**.

E então calcular e mostrar:

- a) o valor do **lucro do distribuidor**;
- b) o valor dos **impostos**;
- c) o **preço final** ao consumidor.

---

### 🚗 Versão 1: Cálculo do Custo de um Carro
> 💰 *Crie um programa que receba o preço de fábrica de um carro, o percentual de lucro e o percentual de impostos, e mostre o valor do lucro, dos impostos e o preço final do veículo.*

---

### 📊 Versão 2: Linguagem Neutra e Didática
> ✍️ *Desenvolva um algoritmo que leia três valores: preço de fábrica, percentual de lucro e percentual de impostos. Calcule os valores correspondentes e o preço final do carro.*

---

### 📈 Versão 3: Estilo Negócio de Concessionária
> 🚙 *Você está montando um sistema para uma concessionária. O programa deve calcular o preço final de um carro com base no preço de fábrica, no lucro e nos impostos.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "preco_final_veiculo"
var
   precoFabrica, percLucro, percImposto, lucro, imposto, precoFinal: real
inicio
   escreva("Digite o preço de fábrica: ")
   leia(precoFabrica)
   escreva("Digite o percentual de lucro do distribuidor: ")
   leia(percLucro)
   escreva("Digite o percentual de impostos: ")
   leia(percImposto)

   lucro <- precoFabrica * (percLucro / 100)
   imposto <- precoFabrica * (percImposto / 100)
   precoFinal <- precoFabrica + lucro + imposto

   escreval("Lucro do distribuidor: R$", lucro)
   escreval("Impostos: R$", imposto)
   escreval("Preço final do veículo: R$", precoFinal)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class PrecoFinalVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço de fábrica: ");
        double precoFabrica = scanner.nextDouble();

        System.out.print("Digite o percentual de lucro do distribuidor: ");
        double percLucro = scanner.nextDouble();

        System.out.print("Digite o percentual de impostos: ");
        double percImposto = scanner.nextDouble();

        double lucro = precoFabrica * (percLucro / 100);
        double imposto = precoFabrica * (percImposto / 100);
        double precoFinal = precoFabrica + lucro + imposto;

        System.out.printf("Lucro do distribuidor: R$ %.2f%n", lucro);
        System.out.printf("Impostos: R$ %.2f%n", imposto);
        System.out.printf("Preço final do veículo: R$ %.2f%n", precoFinal);
    }
}
```

**Compilação:**
```bash
javac PrecoFinalVeiculo.java
java PrecoFinalVeiculo
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o preço de fábrica: ")
    val precoFabrica = readLine()!!.toDouble()

    print("Digite o percentual de lucro do distribuidor: ")
    val percLucro = readLine()!!.toDouble()

    print("Digite o percentual de impostos: ")
    val percImposto = readLine()!!.toDouble()

    val lucro = precoFabrica * (percLucro / 100)
    val imposto = precoFabrica * (percImposto / 100)
    val precoFinal = precoFabrica + lucro + imposto

    println("Lucro do distribuidor: R$ %.2f".format(lucro))
    println("Impostos: R$ %.2f".format(imposto))
    println("Preço final do veículo: R$ %.2f".format(precoFinal))
}
```

**Compilação:**
```bash
kotlinc PrecoFinalVeiculo.kt -include-runtime -d PrecoFinalVeiculo.jar
java -jar PrecoFinalVeiculo.jar
```

---

## 🐍 Implementação em Python

```python
preco_fabrica = float(input("Digite o preço de fábrica: "))
perc_lucro = float(input("Digite o percentual de lucro do distribuidor: "))
perc_imposto = float(input("Digite o percentual de impostos: "))

lucro = preco_fabrica * (perc_lucro / 100)
imposto = preco_fabrica * (perc_imposto / 100)
preco_final = preco_fabrica + lucro + imposto

print("Lucro do distribuidor: R$ {:.2f}".format(lucro))
print("Impostos: R$ {:.2f}".format(imposto))
print("Preço final do veículo: R$ {:.2f}".format(preco_final))
```

**Execução:**
```bash
python3 preco_final_veiculo.py
```

---

## 🧙 Implementação em Pascal

```pascal
program PrecoFinalVeiculo;
var
  precoFabrica, percLucro, percImposto, lucro, imposto, precoFinal: real;
begin
  write('Digite o preço de fábrica: ');
  readln(precoFabrica);

  write('Digite o percentual de lucro do distribuidor: ');
  readln(percLucro);

  write('Digite o percentual de impostos: ');
  readln(percImposto);

  lucro := precoFabrica * (percLucro / 100);
  imposto := precoFabrica * (percImposto / 100);
  precoFinal := precoFabrica + lucro + imposto;

  writeln('Lucro do distribuidor: R$ ', lucro:0:2);
  writeln('Impostos: R$ ', imposto:0:2);
  writeln('Preço final do veículo: R$ ', precoFinal:0:2);
end.
```

**Compilação:**
```bash
fpc preco_final_veiculo.pas
./preco_final_veiculo  # ou preco_final_veiculo.exe no Windows
```

---

## 🧠 Dica do Professor
> Você pode adaptar esse algoritmo para calcular o custo de qualquer produto que envolva impostos e margem de lucro! 🛒

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
