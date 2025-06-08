# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Cálculo seguro da área de um triângulo

### Versão 1 - Redação simples
Crie um programa que calcule a área de um triângulo. O programa deve **validar os dados de entrada**, impedindo que o usuário informe medidas menores ou iguais a zero para a base ou altura.

---

## 💬 Portugol

```portugol
algoritmo "area_triangulo_com_validacao"
var
  base, altura, area: real
inicio
  repita
    escreva("Informe a base do triângulo: ")
    leia(base)
    se base <= 0 entao
      escreval("Valor inválido! A base deve ser maior que zero.")
    fimse
  ate base > 0

  repita
    escreva("Informe a altura do triângulo: ")
    leia(altura)
    se altura <= 0 entao
      escreval("Valor inválido! A altura deve ser maior que zero.")
    fimse
  ate altura > 0

  area <- (base * altura) / 2
  escreval("A área do triângulo é: ", area:0:2)
fimalgoritmo
```

------

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class AreaTrianguloValidacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, altura;

        do {
            System.out.print("Informe a base do triângulo: ");
            base = scanner.nextDouble();
            if (base <= 0) {
                System.out.println("Valor inválido! A base deve ser maior que zero.");
            }
        } while (base <= 0);

        do {
            System.out.print("Informe a altura do triângulo: ");
            altura = scanner.nextDouble();
            if (altura <= 0) {
                System.out.println("Valor inválido! A altura deve ser maior que zero.");
            }
        } while (altura <= 0);

        double area = (base * altura) / 2;
        System.out.printf("A área do triângulo é: %.2f%n", area);
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    var base: Double
    var altura: Double

    do {
        print("Informe a base do triângulo: ")
        base = readLine()!!.toDouble()
        if (base <= 0) println("Valor inválido! A base deve ser maior que zero.")
    } while (base <= 0)

    do {
        print("Informe a altura do triângulo: ")
        altura = readLine()!!.toDouble()
        if (altura <= 0) println("Valor inválido! A altura deve ser maior que zero.")
    } while (altura <= 0)

    val area = (base * altura) / 2
    println("A área do triângulo é: %.2f".format(area))
}
```

---

## 🐍 Implementação em Python

```python
while True:
    base = float(input("Informe a base do triângulo: "))
    if base > 0:
        break
    print("Valor inválido! A base deve ser maior que zero.")

while True:
    altura = float(input("Informe a altura do triângulo: "))
    if altura > 0:
        break
    print("Valor inválido! A altura deve ser maior que zero.")

area = (base * altura) / 2
print(f"A área do triângulo é: {area:.2f}")
```

---

## 🧙 Implementação em Pascal

```pascal
program AreaTrianguloValidacao;
uses crt;
var
  base, altura, area: real;
begin
  repeat
    write('Informe a base do triângulo: ');
    readln(base);
    if base <= 0 then
      writeln('Valor inválido! A base deve ser maior que zero.');
  until base > 0;

  repeat
    write('Informe a altura do triângulo: ');
    readln(altura);
    if altura <= 0 then
      writeln('Valor inválido! A altura deve ser maior que zero.');
  until altura > 0;

  area := (base * altura) / 2;
  writeln('A área do triângulo é: ', area:0:2);
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