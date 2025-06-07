# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Cálculo da Área de um Círculo

Neste décimo exercício, vamos criar um programa que **receba o valor do raio (R)** de um círculo e calcule a **área** utilizando a fórmula:  
**Área = π × R²**

---

### 🔵 Versão 1: Medição de Jardim Circular
> 🌻 *Você deseja saber a área de um canteiro redondo para calcular a quantidade de adubo necessária. Crie um programa que receba o raio do círculo e mostre a área.*

---

### 📚 Versão 2: Linguagem Didática Neutra
> ✍️ *Escreva um programa que leia o valor do raio de um círculo e calcule a área usando a fórmula: área = π × R². Utilize o valor de π como 3.1416.*

---

### 🧠 Versão 3: Estilo Desafio de Geometria
> 📐 *Você está participando de uma competição de geometria e precisa calcular a área de um círculo. Desenvolva um algoritmo que receba o raio e calcule a área com precisão.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "area_circulo"
var
   raio, area: real
const
   pi = 3.1416
inicio
   escreva("Digite o raio do círculo: ")
   leia(raio)
   area <- pi * (raio ^ 2)
   escreval("A área do círculo é: ", area)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.1416;

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo é: %.2f%n", area);
    }
}
```

**Compilação:**
```bash
javac AreaCirculo.java
java AreaCirculo
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    val pi = 3.1416

    print("Digite o raio do círculo: ")
    val raio = readLine()!!.toDouble()

    val area = pi * raio * raio
    println("A área do círculo é: %.2f".format(area))
}
```

**Compilação:**
```bash
kotlinc AreaCirculo.kt -include-runtime -d AreaCirculo.jar
java -jar AreaCirculo.jar
```

---

## 🐍 Implementação em Python

```python
import math

raio = float(input("Digite o raio do círculo: "))
area = math.pi * (raio ** 2)

print("A área do círculo é: {:.2f}".format(area))
```

**Execução:**
```bash
python3 area_circulo.py
```

---

## 🧙 Implementação em Pascal

```pascal
program AreaCirculo;
const
  pi = 3.1416;
var
  raio, area: real;
begin
  write('Digite o raio do círculo: ');
  readln(raio);

  area := pi * sqr(raio);
  writeln('A área do círculo é: ', area:0:2);
end.
```

**Compilação:**
```bash
fpc area_circulo.pas
./area_circulo  # ou area_circulo.exe no Windows
```

---

## 🧠 Dica do Professor
> O uso de π (pi) é comum em vários problemas com círculos. Você pode usar bibliotecas matemáticas da linguagem para maior precisão! 🔄

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
