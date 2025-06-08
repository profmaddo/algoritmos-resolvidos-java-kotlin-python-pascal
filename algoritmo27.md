# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Comprimento da Escada Usando Ângulo e Distância

Neste vigésimo sétimo exercício, o programa deve:

- Receber:
  - A **medida do ângulo** (em graus) formado entre a escada e o chão;
  - A **distância da escada até a parede** (em metros).
- Calcular e mostrar:
  - A **medida da escada**, necessária para alcançar a altura desejada.
- ℹ️ Observação: use a fórmula baseada na função **cosseno**:

  ```
  cos(ângulo) = adjacente / hipotenusa
  hipotenusa = adjacente / cos(ângulo)
  ```

---

### 🧗 Versão 1: Calculadora de Escada
> 🪜 *Crie um programa que calcule o comprimento de uma escada inclinada, dado o ângulo com o solo e a distância da parede.*

---

### 📐 Versão 2: Medindo Escadas com Trigonometria
> 📏 *Desenvolva um algoritmo que ajude a calcular o tamanho da escada para alcançar a parede, usando ângulo e distância ao solo.*

---

### 🎯 Versão 3: Qual o Tamanho Ideal da Escada?
> 🔍 *Faça um programa que determine a medida exata da escada a partir do ângulo com o solo e da base até a parede.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "comprimento_escada"
var
   angulo_graus, distancia, angulo_radianos, escada: real
inicio
   escreva("Digite o ângulo em graus: ")
   leia(angulo_graus)
   escreva("Digite a distância da escada até a parede (m): ")
   leia(distancia)

   angulo_radianos <- angulo_graus * (pi / 180)
   escada <- distancia / cos(angulo_radianos)

   escreval("Comprimento da escada: ", escada, " metros")
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class ComprimentoEscada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        double angulo = scanner.nextDouble();

        System.out.print("Digite a distância até a parede (m): ");
        double distancia = scanner.nextDouble();

        double anguloRad = Math.toRadians(angulo);
        double escada = distancia / Math.cos(anguloRad);

        System.out.println("Comprimento da escada: " + escada + " metros");
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
import kotlin.math.*

fun main() {
    print("Digite o ângulo em graus: ")
    val angulo = readLine()!!.toDouble()

    print("Digite a distância até a parede (m): ")
    val distancia = readLine()!!.toDouble()

    val anguloRad = Math.toRadians(angulo)
    val escada = distancia / cos(anguloRad)

    println("Comprimento da escada: %.2f metros".format(escada))
}
```

---

## 🐍 Implementação em Python

```python
import math

angulo = float(input("Digite o ângulo em graus: "))
distancia = float(input("Digite a distância até a parede (m): "))

angulo_rad = math.radians(angulo)
escada = distancia / math.cos(angulo_rad)

print("Comprimento da escada: {:.2f} metros".format(escada))
```

---

## 🧙 Implementação em Pascal

```pascal
program ComprimentoEscada;
uses Math;
var
  angulo, distancia, anguloRad, escada: real;
begin
  write('Digite o ângulo em graus: ');
  readln(angulo);

  write('Digite a distância até a parede (m): ');
  readln(distancia);

  anguloRad := angulo * (Pi / 180);
  escada := distancia / cos(anguloRad);

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
