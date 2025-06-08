# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Quantidade de Degraus para Alcançar uma Altura

Neste décimo nono exercício, o programa deve:

- Receber a altura de cada degrau da escada (em metros);
- Receber a altura que o usuário deseja alcançar (em metros);
- Calcular e mostrar a quantidade de degraus que o usuário precisa subir para atingir a altura desejada.

---

### 🪜 Versão 1: Subida Planejada
> 📏 *Crie um programa que leia a altura de um degrau e a altura final que o usuário deseja alcançar. Calcule e exiba quantos degraus serão necessários para atingir o objetivo.*

---

### 🔢 Versão 2: Linguagem Objetiva
> 🧮 *Faça um algoritmo que receba a altura de um degrau e a altura a ser atingida. Determine quantos degraus são necessários, desconsiderando a altura do usuário.*

---

### 🏗️ Versão 3: Estilo Engenharia
> 📐 *Desenvolva um programa que calcule a quantidade de degraus de uma escada com base na altura de cada degrau e na altura desejada de subida, com valores em metros.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "degraus_escada"
var
   alturaDegrau, alturaDesejada: real
   qtdDegraus: inteiro
inicio
   escreva("Digite a altura de cada degrau (em metros): ")
   leia(alturaDegrau)
   escreva("Digite a altura desejada (em metros): ")
   leia(alturaDesejada)

   qtdDegraus <- inteiro(alturaDesejada / alturaDegrau)

   escreval("Você deverá subir ", qtdDegraus, " degraus.")
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class EscadaDegraus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura de cada degrau (em metros): ");
        double alturaDegrau = scanner.nextDouble();

        System.out.print("Digite a altura desejada (em metros): ");
        double alturaDesejada = scanner.nextDouble();

        int qtdDegraus = (int)(alturaDesejada / alturaDegrau);

        System.out.println("Você deverá subir " + qtdDegraus + " degraus.");
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite a altura de cada degrau (em metros): ")
    val alturaDegrau = readLine()!!.toDouble()

    print("Digite a altura desejada (em metros): ")
    val alturaDesejada = readLine()!!.toDouble()

    val qtdDegraus = (alturaDesejada / alturaDegrau).toInt()

    println("Você deverá subir $qtdDegraus degraus.")
}
```

---

## 🐍 Implementação em Python

```python
altura_degrau = float(input("Digite a altura de cada degrau (em metros): "))
altura_desejada = float(input("Digite a altura desejada (em metros): "))

qtd_degraus = int(altura_desejada / altura_degrau)

print(f"Você deverá subir {qtd_degraus} degraus.")
```

---

## 🧙 Implementação em Pascal

```pascal
program EscadaDegraus;
var
  alturaDegrau, alturaDesejada: real;
  qtdDegraus: integer;
begin
  write('Digite a altura de cada degrau (em metros): ');
  readln(alturaDegrau);

  write('Digite a altura desejada (em metros): ');
  readln(alturaDesejada);

  qtdDegraus := trunc(alturaDesejada / alturaDegrau);

  writeln('Você deverá subir ', qtdDegraus, ' degraus.');
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
