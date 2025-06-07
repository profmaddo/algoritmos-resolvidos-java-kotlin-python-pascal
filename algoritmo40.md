# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Resolução de Equações do 2º Grau

Neste quadragésimo exercício, vamos construir um programa capaz de resolver **equações do segundo grau** da forma:

```
ax² + bx + c = 0
```

O programa deverá:

- Receber os coeficientes `a`, `b` e `c`.
- Calcular o **discriminante (delta)**.
- Determinar as raízes reais da equação (se existirem).
- Mostrar o tipo de raiz:
  - 2 raízes reais distintas
  - 1 raiz real (raiz dupla)
  - Nenhuma raiz real

---

### 🧮 Versão 1: Resolva a Equação Quadrática
> 📊 *Calcule as raízes reais de uma equação de 2º grau com base nos coeficientes fornecidos.*

---

### 🧠 Versão 2: Delta e Soluções Reais
> 🧾 *Mostre o valor de delta e interprete se há raízes reais, uma ou duas.*

---

### 📐 Versão 3: Análise Completa de Equação do 2º Grau
> 📚 *Informe os coeficientes de uma equação quadrática e veja os resultados com interpretação didática.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "equacao_segundo_grau"
var
   a, b, c, delta, x1, x2: real
inicio
   escreva("Digite os coeficientes a, b e c: ")
   leia(a, b, c)

   se a = 0 então
      escreval("Não é equação do 2º grau.")
   senão
      delta <- b^2 - 4 * a * c
      escreval("Delta = ", delta)

      se delta < 0 então
         escreval("Não existem raízes reais.")
      senao
         se delta = 0 então
            x1 <- -b / (2 * a)
            escreval("Raiz única: ", x1)
         senao
            x1 <- (-b + raizq(delta)) / (2 * a)
            x2 <- (-b - raizq(delta)) / (2 * a)
            escreval("Duas raízes reais: ", x1, " e ", x2)
         fimse
      fimse
   fimse
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.print("Digite os coeficientes a, b e c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do 2º grau.");
            return;
        }

        delta = b * b - 4 * a * c;
        System.out.println("Delta = " + delta);

        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Raiz única: " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Duas raízes reais: " + x1 + " e " + x2);
        }
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
import kotlin.math.sqrt

fun main() {
    print("Digite os coeficientes a, b e c: ")
    val (a, b, c) = readLine()!!.split(" ").map { it.toDouble() }

    if (a == 0.0) {
        println("Não é uma equação do 2º grau.")
        return
    }

    val delta = b * b - 4 * a * c
    println("Delta = $delta")

    when {
        delta < 0 -> println("Não existem raízes reais.")
        delta == 0.0 -> println("Raiz única: ${-b / (2 * a)}")
        else -> {
            val x1 = (-b + sqrt(delta)) / (2 * a)
            val x2 = (-b - sqrt(delta)) / (2 * a)
            println("Duas raízes reais: $x1 e $x2")
        }
    }
}
```

---

## 🐍 Implementação em Python

```python
import math

a = float(input("Digite o coeficiente a: "))
b = float(input("Digite o coeficiente b: "))
c = float(input("Digite o coeficiente c: "))

if a == 0:
    print("Não é equação do 2º grau.")
else:
    delta = b**2 - 4*a*c
    print(f"Delta = {delta}")

    if delta < 0:
        print("Não existem raízes reais.")
    elif delta == 0:
        x = -b / (2 * a)
        print(f"Raiz única: {x}")
    else:
        x1 = (-b + math.sqrt(delta)) / (2 * a)
        x2 = (-b - math.sqrt(delta)) / (2 * a)
        print(f"Duas raízes reais: {x1} e {x2}")
```

---

## 🧙 Implementação em Pascal

```pascal
program EquacaoSegundoGrau;
uses math;
var
  a, b, c, delta, x1, x2: real;
begin
  write('Digite os coeficientes a, b e c: ');
  readln(a, b, c);

  if a = 0 then
    writeln('Não é equação do 2º grau.')
  else
  begin
    delta := sqr(b) - 4 * a * c;
    writeln('Delta = ', delta:0:2);

    if delta < 0 then
      writeln('Não existem raízes reais.')
    else if delta = 0 then
    begin
      x1 := -b / (2 * a);
      writeln('Raiz única: ', x1:0:2);
    end
    else
    begin
      x1 := (-b + sqrt(delta)) / (2 * a);
      x2 := (-b - sqrt(delta)) / (2 * a);
      writeln('Duas raízes reais: ', x1:0:2, ' e ', x2:0:2);
    end;
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
