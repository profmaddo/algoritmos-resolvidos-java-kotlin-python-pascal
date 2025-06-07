# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Aumento Salarial de 25%

Neste quarto exercício, o objetivo é criar um algoritmo que receba o salário de um funcionário e calcule o novo salário após um aumento de 25%. Abaixo, apresentamos três formas diferentes de contextualizar o problema:

---

### 💼 Versão 1: Ambiente Corporativo
> 🏢 *Um funcionário recebeu um aumento salarial de 25%. Crie um programa que leia o salário atual e calcule o novo salário com o reajuste aplicado.*

---

### 📈 Versão 2: Linguagem Matemática Neutra
> ✍️ *Desenvolva um programa que leia o salário de um funcionário. Em seguida, o programa deve calcular e mostrar o novo valor com um acréscimo de 25%.*

---

### 🚀 Versão 3: Estilo Missão Econômica
> 💰 *Sua missão é ajudar na folha de pagamento de uma empresa. Para isso, desenvolva um algoritmo que receba o salário atual de um funcionário e retorne o novo salário com um aumento de 25%.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "aumento_salarial"
var
   salario, novoSalario: real
inicio
   escreva("Digite o salário atual: ")
   leia(salario)
   novoSalario <- salario + (salario * 0.25)
   escreval("O novo salário é: ", novoSalario)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class AumentoSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = scanner.nextDouble();

        double novoSalario = salario + (salario * 0.25);
        System.out.printf("O novo salário é: %.2f%n", novoSalario);
    }
}
```

**Compilação:**
```bash
javac AumentoSalarial.java
java AumentoSalarial
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o salário atual: ")
    val salario = readLine()!!.toDouble()

    val novoSalario = salario + (salario * 0.25)
    println("O novo salário é: %.2f".format(novoSalario))
}
```

**Compilação:**
```bash
kotlinc AumentoSalarial.kt -include-runtime -d AumentoSalarial.jar
java -jar AumentoSalarial.jar
```

---

## 🐍 Implementação em Python

```python
salario = float(input("Digite o salário atual: "))
novo_salario = salario + (salario * 0.25)
print("O novo salário é: {:.2f}".format(novo_salario))
```

**Execução:**
```bash
python3 aumento_salarial.py
```

---

## 🧙 Implementação em Pascal

```pascal
program AumentoSalarial;
var
  salario, novoSalario: real;
begin
  write('Digite o salário atual: ');
  readln(salario);

  novoSalario := salario + (salario * 0.25);
  writeln('O novo salário é: ', novoSalario:0:2);
end.
```

**Compilação:**
```bash
fpc aumento_salarial.pas
./aumento_salarial  # ou aumento_salarial.exe no Windows
```

---

## 🧠 Dica do Professor
> Refaça o exercício com diferentes porcentagens (10%, 50%, etc.) e compare os valores finais! Isso ajuda a reforçar a lógica percentual. 📊

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
