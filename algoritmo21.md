# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Distância da Escada até a Parede

Neste vigésimo primeiro exercício, o programa deve:

- Receber a **altura** onde se deseja pregar um quadro (em metros);
- Receber o **comprimento da escada** (em metros);
- Calcular e mostrar a **distância da base da escada até a parede**, assumindo um triângulo retângulo;
- Aplicar o **Teorema de Pitágoras**: `distancia^2 = escada^2 - altura^2`.

---

### 🪜 Versão 1: Quadro Bem Posicionado
> 🧱 *Crie um programa que ajude a calcular a distância que a escada deve estar da parede para uma pessoa pregar um quadro a determinada altura.*

---

### 📐 Versão 2: Linguagem Técnica com Trigonometria
> 📏 *Faça um algoritmo que leia o comprimento de uma escada e a altura a ser alcançada, e calcule a distância da escada até a parede usando o Teorema de Pitágoras.*

---

### 🧮 Versão 3: Estilo Simulador de Medidas
> 🧰 *Implemente um programa para simular o posicionamento seguro de uma escada encostada na parede, determinando a distância horizontal necessária com base na altura e no tamanho da escada.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "escada_parede"
var
   escada, altura, distancia: real
inicio
   escreva("Digite o comprimento da escada (m): ")
   leia(escada)
   escreva("Digite a altura onde deseja pregar o quadro (m): ")
   leia(altura)

   se escada <= altura entao
      escreval("Erro: a escada deve ser maior que a altura desejada.")
   senao
      distancia <- raizq(escada^2 - altura^2)
      escreval("A escada deve estar a ", distancia, " metros da parede.")
   fimse
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class EscadaParede {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento da escada (m): ");
        double escada = scanner.nextDouble();

        System.out.print("Digite a altura onde deseja pregar o quadro (m): ");
        double altura = scanner.nextDouble();

        if (escada <= altura) {
            System.out.println("Erro: a escada deve ser maior que a altura desejada.");
        } else {
            double distancia = Math.sqrt(Math.pow(escada, 2) - Math.pow(altura, 2));
            System.out.printf("A escada deve estar a %.2f metros da parede.%n", distancia);
        }
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
import kotlin.math.*

fun main() {
    print("Digite o comprimento da escada (m): ")
    val escada = readLine()!!.toDouble()

    print("Digite a altura onde deseja pregar o quadro (m): ")
    val altura = readLine()!!.toDouble()

    if (escada <= altura) {
        println("Erro: a escada deve ser maior que a altura desejada.")
    } else {
        val distancia = sqrt(escada.pow(2) - altura.pow(2))
        println("A escada deve estar a %.2f metros da parede.".format(distancia))
    }
}
```

---

## 🐍 Implementação em Python

```python
from math import sqrt

escada = float(input("Digite o comprimento da escada (m): "))
altura = float(input("Digite a altura onde deseja pregar o quadro (m): "))

if escada <= altura:
    print("Erro: a escada deve ser maior que a altura desejada.")
else:
    distancia = sqrt(escada**2 - altura**2)
    print("A escada deve estar a {:.2f} metros da parede.".format(distancia))
```

---

## 🧙 Implementação em Pascal

```pascal
program EscadaParede;
uses Math;
var
  escada, altura, distancia: real;
begin
  write('Digite o comprimento da escada (m): ');
  readln(escada);

  write('Digite a altura onde deseja pregar o quadro (m): ');
  readln(altura);

  if escada <= altura then
    writeln('Erro: a escada deve ser maior que a altura desejada.')
  else
  begin
    distancia := sqrt(sqr(escada) - sqr(altura));
    writeln('A escada deve estar a ', distancia:0:2, ' metros da parede.');
  end;
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
