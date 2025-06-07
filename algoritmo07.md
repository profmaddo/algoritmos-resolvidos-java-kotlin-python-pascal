# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Salário com Gratificação Fixa e Imposto Percentual

Neste sétimo exercício, o programa deve receber o **salário base de um funcionário**, adicionar uma **gratificação fixa de R$ 50,00** e descontar **10% de imposto** sobre o salário base. O objetivo é calcular e exibir o **salário final a receber**.

---

### 💼 Versão 1: Escritório de Contabilidade
> 🧾 *Um funcionário tem direito a uma gratificação fixa de R$ 50,00, mas também sofre um desconto de 10% de imposto sobre seu salário base. Crie um programa que receba o salário base e calcule o salário final.*

---

### 📊 Versão 2: Linguagem Técnica Neutra
> ✍️ *Desenvolva um programa que leia o salário base de um funcionário. O programa deve somar R$ 50,00 de gratificação e subtrair 10% de imposto, ambos aplicados conforme descrito, e exibir o valor líquido.*

---

### 🚀 Versão 3: Estilo Missão de Folha de Pagamento
> 💼 *Sua tarefa é desenvolver um programa que ajude o RH a calcular o salário líquido de um funcionário que recebe gratificação de R$ 50 e paga 10% de imposto sobre o salário base.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "salario_com_gratificacao_fixa"
var
   salarioBase, gratificacao, imposto, salarioFinal: real
inicio
   escreva("Digite o salário base: ")
   leia(salarioBase)
   gratificacao <- 50
   imposto <- salarioBase * 0.10
   salarioFinal <- salarioBase + gratificacao - imposto
   escreval("Salário a receber: ", salarioFinal)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class SalarioGratificacaoFixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário base: ");
        double salarioBase = scanner.nextDouble();

        double gratificacao = 50.0;
        double imposto = salarioBase * 0.10;
        double salarioFinal = salarioBase + gratificacao - imposto;

        System.out.printf("Salário a receber: %.2f%n", salarioFinal);
    }
}
```

**Compilação:**
```bash
javac SalarioGratificacaoFixa.java
java SalarioGratificacaoFixa
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o salário base: ")
    val salarioBase = readLine()!!.toDouble()

    val gratificacao = 50.0
    val imposto = salarioBase * 0.10
    val salarioFinal = salarioBase + gratificacao - imposto

    println("Salário a receber: %.2f".format(salarioFinal))
}
```

**Compilação:**
```bash
kotlinc SalarioGratificacaoFixa.kt -include-runtime -d SalarioGratificacaoFixa.jar
java -jar SalarioGratificacaoFixa.jar
```

---

## 🐍 Implementação em Python

```python
salario_base = float(input("Digite o salário base: "))

gratificacao = 50.0
imposto = salario_base * 0.10
salario_final = salario_base + gratificacao - imposto

print("Salário a receber: {:.2f}".format(salario_final))
```

**Execução:**
```bash
python3 salario_gratificacao_fixa.py
```

---

## 🧙 Implementação em Pascal

```pascal
program SalarioGratificacaoFixa;
var
  salarioBase, gratificacao, imposto, salarioFinal: real;
begin
  write('Digite o salário base: ');
  readln(salarioBase);

  gratificacao := 50.0;
  imposto := salarioBase * 0.10;
  salarioFinal := salarioBase + gratificacao - imposto;

  writeln('Salário a receber: ', salarioFinal:0:2);
end.
```

**Compilação:**
```bash
fpc salario_gratificacao_fixa.pas
./salario_gratificacao_fixa  # ou salario_gratificacao_fixa.exe no Windows
```

---

## 🧠 Dica do Professor
> Lembre-se: gratificação **fixa** e imposto **percentual** são dois conceitos fundamentais em cálculos salariais. Use valores diferentes para reforçar a lógica. 💡

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
