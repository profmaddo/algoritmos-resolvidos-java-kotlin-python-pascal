# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Aumento Salarial com Percentual Variável

Neste quinto exercício, vamos criar um algoritmo que receba o **salário de um funcionário** e o **percentual de aumento**. O programa deve calcular o valor do aumento e o novo salário. Abaixo estão três versões da situação problema com diferentes abordagens didáticas:

---

### 💼 Versão 1: Ambiente de Recursos Humanos
> 🧾 *Um funcionário recebeu um aumento com percentual definido pela diretoria. Crie um programa que leia o salário atual e o percentual de aumento, calcule o valor do reajuste e o novo salário.*

---

### 📊 Versão 2: Linguagem Técnica Neutra
> ✍️ *Desenvolva um programa que leia dois valores: o salário atual de um funcionário e o percentual de aumento. Calcule e exiba o valor do aumento e o novo salário após o reajuste.*

---

### 🚀 Versão 3: Estilo Desafio Empresarial
> 💼 *Você foi contratado para melhorar o sistema de folha de pagamento de uma empresa. Crie um algoritmo que receba o salário de um funcionário e o percentual de aumento, depois mostre o valor do reajuste e o novo salário.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "aumento_percentual"
var
   salario, percentual, aumento, novoSalario: real
inicio
   escreva("Digite o salário atual: ")
   leia(salario)
   escreva("Digite o percentual de aumento: ")
   leia(percentual)
   aumento <- salario * percentual / 100
   novoSalario <- salario + aumento
   escreval("Valor do aumento: ", aumento)
   escreval("Novo salário: ", novoSalario)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class AumentoPercentual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o percentual de aumento: ");
        double percentual = scanner.nextDouble();

        double aumento = salario * percentual / 100;
        double novoSalario = salario + aumento;

        System.out.printf("Valor do aumento: %.2f%n", aumento);
        System.out.printf("Novo salário: %.2f%n", novoSalario);
    }
}
```

**Compilação:**
```bash
javac AumentoPercentual.java
java AumentoPercentual
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o salário atual: ")
    val salario = readLine()!!.toDouble()

    print("Digite o percentual de aumento: ")
    val percentual = readLine()!!.toDouble()

    val aumento = salario * percentual / 100
    val novoSalario = salario + aumento

    println("Valor do aumento: %.2f".format(aumento))
    println("Novo salário: %.2f".format(novoSalario))
}
```

**Compilação:**
```bash
kotlinc AumentoPercentual.kt -include-runtime -d AumentoPercentual.jar
java -jar AumentoPercentual.jar
```

---

## 🐍 Implementação em Python

```python
salario = float(input("Digite o salário atual: "))
percentual = float(input("Digite o percentual de aumento: "))

aumento = salario * percentual / 100
novo_salario = salario + aumento

print("Valor do aumento: {:.2f}".format(aumento))
print("Novo salário: {:.2f}".format(novo_salario))
```

**Execução:**
```bash
python3 aumento_percentual.py
```

---

## 🧙 Implementação em Pascal

```pascal
program AumentoPercentual;
var
  salario, percentual, aumento, novoSalario: real;
begin
  write('Digite o salário atual: ');
  readln(salario);
  write('Digite o percentual de aumento: ');
  readln(percentual);

  aumento := salario * percentual / 100;
  novoSalario := salario + aumento;

  writeln('Valor do aumento: ', aumento:0:2);
  writeln('Novo salário: ', novoSalario:0:2);
end.
```

**Compilação:**
```bash
fpc aumento_percentual.pas
./aumento_percentual  # ou aumento_percentual.exe no Windows
```

---

## 🧠 Dica do Professor
> Teste com percentuais variados (como 10%, 15%, 37.5%) para entender bem o impacto do cálculo proporcional. 📈

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
