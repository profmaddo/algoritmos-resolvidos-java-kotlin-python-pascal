# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Potenciação Entre Dois Números

Neste décimo segundo exercício, vamos desenvolver um programa que **receba dois números maiores que zero** e calcule a **potência do primeiro número elevado ao segundo**.

---

### 💡 Versão 1: Cálculo de Potência Simples
> 🔢 *Desenvolva um programa que receba dois números positivos. O primeiro número será a base e o segundo o expoente. O programa deve mostrar o resultado da base elevada ao expoente.*

---

### 📚 Versão 2: Linguagem Neutra e Didática
> ✍️ *Faça um programa que leia dois números maiores que zero e mostre o resultado da potência do primeiro número elevado ao segundo.*

---

### ⚙️ Versão 3: Estilo Desafio Numérico
> 🚀 *Você está criando uma calculadora científica e precisa de uma função que eleve um número a outro. Crie um algoritmo que receba dois números positivos e mostre o resultado da potenciação.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "potencia_dois_numeros"
var
   base, expoente, resultado: real
inicio
   escreva("Digite a base (maior que zero): ")
   leia(base)
   escreva("Digite o expoente (maior que zero): ")
   leia(expoente)

   se base > 0 e expoente > 0 entao
      resultado <- base ^ expoente
      escreval("Resultado: ", resultado)
   senao
      escreval("Erro: os dois números devem ser maiores que zero.")
   fimse
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class PotenciaDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base (maior que zero): ");
        double base = scanner.nextDouble();

        System.out.print("Digite o expoente (maior que zero): ");
        double expoente = scanner.nextDouble();

        if (base > 0 && expoente > 0) {
            double resultado = Math.pow(base, expoente);
            System.out.printf("Resultado: %.4f%n", resultado);
        } else {
            System.out.println("Erro: os dois números devem ser maiores que zero.");
        }
    }
}
```

**Compilação:**
```bash
javac PotenciaDoisNumeros.java
java PotenciaDoisNumeros
```

---

## 💙 Implementação em Kotlin

```kotlin
import kotlin.math.*

fun main() {
    print("Digite a base (maior que zero): ")
    val base = readLine()!!.toDouble()

    print("Digite o expoente (maior que zero): ")
    val expoente = readLine()!!.toDouble()

    if (base > 0 && expoente > 0) {
        val resultado = base.pow(expoente)
        println("Resultado: %.4f".format(resultado))
    } else {
        println("Erro: os dois números devem ser maiores que zero.")
    }
}
```

**Compilação:**
```bash
kotlinc PotenciaDoisNumeros.kt -include-runtime -d PotenciaDoisNumeros.jar
java -jar PotenciaDoisNumeros.jar
```

---

## 🐍 Implementação em Python

```python
base = float(input("Digite a base (maior que zero): "))
expoente = float(input("Digite o expoente (maior que zero): "))

if base > 0 and expoente > 0:
    resultado = base ** expoente
    print("Resultado: {:.4f}".format(resultado))
else:
    print("Erro: os dois números devem ser maiores que zero.")
```

**Execução:**
```bash
python3 potencia_dois_numeros.py
```

---

## 🧙 Implementação em Pascal

```pascal
program PotenciaDoisNumeros;
uses math;
var
  base, expoente, resultado: real;
begin
  write('Digite a base (maior que zero): ');
  readln(base);
  write('Digite o expoente (maior que zero): ');
  readln(expoente);

  if (base > 0) and (expoente > 0) then
  begin
    resultado := power(base, expoente);
    writeln('Resultado: ', resultado:0:4);
  end
  else
    writeln('Erro: os dois números devem ser maiores que zero.');
end.
```

**Compilação:**
```bash
fpc potencia_dois_numeros.pas
./potencia_dois_numeros  # ou potencia_dois_numeros.exe no Windows
```

---

## 🧠 Dica do Professor
> A função de potenciação é essencial em cálculos exponenciais. Tente adaptar o programa para aceitar expoentes negativos também como desafio! ⚡

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
