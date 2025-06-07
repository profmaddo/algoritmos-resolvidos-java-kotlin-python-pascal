# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Cálculo do Tamanho da Escada Usando Trigonometria

Neste vigésimo exercício, o programa deve:

- Receber a **altura da parede onde está a ponta da escada** (em metros);
- Receber o **ângulo formado entre a escada e o chão** (em graus);
- Calcular a **medida da escada** usando trigonometria;
- Utilizar a fórmula: `escada = altura / sen(ângulo)` (ângulo convertido para radianos).

---

### 🪜 Versão 1: Medindo a Escada com Trigonometria
> 📏 *Crie um programa que leia o ângulo (em graus) de inclinação de uma escada em relação ao chão e a altura da parede. Calcule e mostre o comprimento da escada.*

---

### 📐 Versão 2: Linguagem Didática e Explicativa
> 📊 *Faça um algoritmo que leia a altura de uma parede e o ângulo formado entre uma escada e o chão. Calcule o comprimento da escada, convertendo o ângulo para radianos antes do cálculo.*

---

### 🧱 Versão 3: Estilo Engenharia de Obra
> 🏗️ *Implemente um programa para calcular o comprimento de uma escada encostada em uma parede, dado o ângulo com o chão e a altura desejada. Use seno e conversão de ângulo.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "calculo_escada"
var
   altura, angulo, escada, rad: real
inicio
   escreva("Digite a altura da parede (m): ")
   leia(altura)
   escreva("Digite o ângulo formado com o chão (graus): ")
   leia(angulo)

   rad <- angulo * 3.1416 / 180
   escada <- altura / sen(rad)

   escreval("Comprimento da escada: ", escada, " metros")
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class CalculoEscada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura da parede (m): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o ângulo formado com o chão (graus): ");
        double angulo = scanner.nextDouble();

        double rad = Math.toRadians(angulo);
        double escada = altura / Math.sin(rad);

        System.out.printf("Comprimento da escada: %.2f metros%n", escada);
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
import kotlin.math.*

fun main() {
    print("Digite a altura da parede (m): ")
    val altura = readLine()!!.toDouble()

    print("Digite o ângulo formado com o chão (graus): ")
    val angulo = readLine()!!.toDouble()

    val rad = Math.toRadians(angulo)
    val escada = altura / sin(rad)

    println("Comprimento da escada: %.2f metros".format(escada))
}
```

---

## 🐍 Implementação em Python

```python
from math import sin, radians

altura = float(input("Digite a altura da parede (m): "))
angulo = float(input("Digite o ângulo formado com o chão (graus): "))

rad = radians(angulo)
escada = altura / sin(rad)

print("Comprimento da escada: {:.2f} metros".format(escada))
```

---

## 🧙 Implementação em Pascal

```pascal
program CalculoEscada;
uses Math;
var
  altura, angulo, rad, escada: real;
begin
  write('Digite a altura da parede (m): ');
  readln(altura);

  write('Digite o ângulo formado com o chão (graus): ');
  readln(angulo);

  rad := angulo * Pi / 180;
  escada := altura / sin(rad);

  writeln('Comprimento da escada: ', escada:0:2, ' metros');
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
