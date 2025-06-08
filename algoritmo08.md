# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Cálculo da Área de um Triângulo

Neste oitavo exercício, o objetivo é criar um programa que **receba a base e a altura de um triângulo** e calcule a **área**, usando a fórmula:  
**Área = (base × altura) / 2**

---

### 🏕️ Versão 1: Geometria no Cotidiano
> 📏 *Durante uma atividade de medição no campo, você precisa calcular a área de um terreno triangular. Desenvolva um programa que receba a base e a altura e calcule a área usando a fórmula clássica.*

---

### 📚 Versão 2: Linguagem Neutra e Didática
> ✍️ *Crie um programa que leia os valores da base e da altura de um triângulo e exiba o valor da área utilizando a fórmula: área = (base × altura) / 2.*

---

### 🧠 Versão 3: Estilo Desafio Matemático
> 🔺 *Você recebeu um desafio matemático para calcular a área de triângulos com diferentes dimensões. Desenvolva um algoritmo que receba a base e a altura e mostre a área correspondente.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "area_triangulo"
var
   base, altura, area: real
inicio
   escreva("Digite a base do triângulo: ")
   leia(base)
   escreva("Digite a altura do triângulo: ")
   leia(altura)
   area <- (base * altura) / 2
   escreval("A área do triângulo é: ", area)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        System.out.printf("A área do triângulo é: %.2f%n", area);
    }
}
```

**Compilação:**
```bash
javac AreaTriangulo.java
java AreaTriangulo
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite a base do triângulo: ")
    val base = readLine()!!.toDouble()

    print("Digite a altura do triângulo: ")
    val altura = readLine()!!.toDouble()

    val area = (base * altura) / 2
    println("A área do triângulo é: %.2f".format(area))
}
```

**Compilação:**
```bash
kotlinc AreaTriangulo.kt -include-runtime -d AreaTriangulo.jar
java -jar AreaTriangulo.jar
```

---

## 🐍 Implementação em Python

```python
base = float(input("Digite a base do triângulo: "))
altura = float(input("Digite a altura do triângulo: "))

area = (base * altura) / 2
print("A área do triângulo é: {:.2f}".format(area))
```

**Execução:**
```bash
python3 area_triangulo.py
```

---

## 🧙 Implementação em Pascal

```pascal
program AreaTriangulo;
var
  base, altura, area: real;
begin
  write('Digite a base do triângulo: ');
  readln(base);

  write('Digite a altura do triângulo: ');
  readln(altura);

  area := (base * altura) / 2;
  writeln('A área do triângulo é: ', area:0:2);
end.
```

**Compilação:**
```bash
fpc area_triangulo.pas
./area_triangulo  # ou area_triangulo.exe no Windows
```

---

## 🧠 Dica do Professor
> Essa fórmula é a base para diversos cálculos em geometria plana. Experimente reutilizá-la em um programa que calcule a área total de vários triângulos! 🔺🔺🔺

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
