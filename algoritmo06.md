# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Salário com Gratificação e Imposto

Neste sexto exercício, o programa deve receber o **salário base de um funcionário**, calcular a **gratificação de 5%** e o **desconto de imposto de 7%**, ambos sobre o salário base, e então mostrar o **salário a receber**.

---

### 💼 Versão 1: Folha de Pagamento Empresarial
> 🧾 *Crie um programa que leia o salário base de um funcionário, aplique uma gratificação de 5% e um desconto de 7% de imposto, e exiba o salário final a receber.*

---

### 📊 Versão 2: Linguagem Técnica Neutra
> ✍️ *Elabore um programa que receba o salário base. Em seguida, o sistema deve calcular e exibir o valor da gratificação (5%), o valor do imposto (7%) e o salário líquido.*

---

### 🚀 Versão 3: Estilo Desafio de Escritório
> 💼 *Sua tarefa é calcular corretamente o salário a receber de um funcionário após aplicar a gratificação e o imposto. O salário base é fornecido como entrada. O sistema deve exibir o resultado final.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "salario_a_receber"
var
   salarioBase, gratificacao, imposto, salarioFinal: real
inicio
   escreva("Digite o salário base: ")
   leia(salarioBase)
   gratificacao <- salarioBase * 0.05
   imposto <- salarioBase * 0.07
   salarioFinal <- salarioBase + gratificacao - imposto
   escreval("Salário a receber: ", salarioFinal)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class SalarioAReceber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário base: ");
        double salarioBase = scanner.nextDouble();

        double gratificacao = salarioBase * 0.05;
        double imposto = salarioBase * 0.07;
        double salarioFinal = salarioBase + gratificacao - imposto;

        System.out.printf("Salário a receber: %.2f%n", salarioFinal);
    }
}
```

**Compilação:**
```bash
javac SalarioAReceber.java
java SalarioAReceber
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o salário base: ")
    val salarioBase = readLine()!!.toDouble()

    val gratificacao = salarioBase * 0.05
    val imposto = salarioBase * 0.07
    val salarioFinal = salarioBase + gratificacao - imposto

    println("Salário a receber: %.2f".format(salarioFinal))
}
```

**Compilação:**
```bash
kotlinc SalarioAReceber.kt -include-runtime -d SalarioAReceber.jar
java -jar SalarioAReceber.jar
```

---

## 🐍 Implementação em Python

```python
salario_base = float(input("Digite o salário base: "))

gratificacao = salario_base * 0.05
imposto = salario_base * 0.07
salario_final = salario_base + gratificacao - imposto

print("Salário a receber: {:.2f}".format(salario_final))
```

**Execução:**
```bash
python3 salario_a_receber.py
```

---

## 🧙 Implementação em Pascal

```pascal
program SalarioAReceber;
var
  salarioBase, gratificacao, imposto, salarioFinal: real;
begin
  write('Digite o salário base: ');
  readln(salarioBase);

  gratificacao := salarioBase * 0.05;
  imposto := salarioBase * 0.07;
  salarioFinal := salarioBase + gratificacao - imposto;

  writeln('Salário a receber: ', salarioFinal:0:2);
end.
```

**Compilação:**
```bash
fpc salario_a_receber.pas
./salario_a_receber  # ou salario_a_receber.exe no Windows
```

---

## 🧠 Dica do Professor
> Ao somar a gratificação e subtrair o imposto, você está usando a lógica de **operações combinadas**. Reforce o entendimento com diferentes percentuais como desafio extra. 🧩

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
