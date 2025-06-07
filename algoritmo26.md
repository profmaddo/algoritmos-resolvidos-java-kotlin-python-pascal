# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Iluminação Ideal para Cômodos

Neste vigésimo sexto exercício, o programa deve:

- Receber as **duas dimensões de um cômodo** (em metros);
- Calcular a **área do cômodo em m²**;
- Calcular e mostrar a **potência de iluminação ideal**;
  - A regra usada é: para cada **1 m²**, usa-se **9 W** de potência.

---

### 💡 Versão 1: Luz na Medida Certa
> 💡 *Faça um programa que leia as dimensões de um cômodo e informe sua área e a potência necessária de iluminação, com base em 9 watts por metro quadrado.*

---

### 🏠 Versão 2: Calculadora de Potência para Ambientes
> 🔌 *Desenvolva um algoritmo para calcular a potência de iluminação de um cômodo dado seu comprimento e largura.*

---

### 📏 Versão 3: Quantos Watts Para Este Espaço?
> 📐 *Implemente um programa que calcule a área de um cômodo e a potência necessária de luz para iluminá-lo adequadamente.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "potencia_iluminacao"
var
   comprimento, largura, area, potencia: real
inicio
   escreva("Digite o comprimento do cômodo (m): ")
   leia(comprimento)
   escreva("Digite a largura do cômodo (m): ")
   leia(largura)

   area <- comprimento * largura
   potencia <- area * 9

   escreval("Área do cômodo: ", area, " m²")
   escreval("Potência necessária: ", potencia, " W")
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class PotenciaIluminacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do cômodo (m): ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura do cômodo (m): ");
        double largura = scanner.nextDouble();

        double area = comprimento * largura;
        double potencia = area * 9;

        System.out.println("Área do cômodo: " + area + " m²");
        System.out.println("Potência necessária: " + potencia + " W");
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o comprimento do cômodo (m): ")
    val comprimento = readLine()!!.toDouble()

    print("Digite a largura do cômodo (m): ")
    val largura = readLine()!!.toDouble()

    val area = comprimento * largura
    val potencia = area * 9

    println("Área do cômodo: $area m²")
    println("Potência necessária: $potencia W")
}
```

---

## 🐍 Implementação em Python

```python
comprimento = float(input("Digite o comprimento do cômodo (m): "))
largura = float(input("Digite a largura do cômodo (m): "))

area = comprimento * largura
potencia = area * 9

print(f"Área do cômodo: {area} m²")
print(f"Potência necessária: {potencia} W")
```

---

## 🧙 Implementação em Pascal

```pascal
program PotenciaIluminacao;
var
  comprimento, largura, area, potencia: real;
begin
  write('Digite o comprimento do cômodo (m): ');
  readln(comprimento);

  write('Digite a largura do cômodo (m): ');
  readln(largura);

  area := comprimento * largura;
  potencia := area * 9;

  writeln('Área do cômodo: ', area:0:2, ' m²');
  writeln('Potência necessária: ', potencia:0:2, ' W');
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
