# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Verificação e Classificação de Triângulos

Neste quadragésimo primeiro exercício, o programa deve:

- Receber três valores `X`, `Y` e `Z`.
- Verificar se esses valores podem representar os lados de um triângulo.
- Se formarem um triângulo, classificar como:
  - **Equilátero** (três lados iguais)
  - **Isósceles** (dois lados iguais)
  - **Escaleno** (três lados diferentes)
- Se **não formarem** um triângulo, exibir uma mensagem apropriada.

---

### 🔺 Versão 1: Verificação de Triângulo
> 📐 *Receba três lados e diga se é um triângulo válido.*

---

### 📏 Versão 2: Que Tipo de Triângulo É?
> 🟰 *Se for triângulo, classifique-o como equilátero, isósceles ou escaleno.*

---

### 🔍 Versão 3: Análise Completa de Triângulo
> 📊 *Verifique validade e tipo de triângulo com explicação de regras.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "tipo_triangulo"
var
   x, y, z: real
inicio
   escreva("Digite os três lados do triângulo: ")
   leia(x, y, z)

   se (x < y + z) e (y < x + z) e (z < x + y) então
      se (x = y) e (y = z) então
         escreval("Triângulo Equilátero")
      senao
         se (x = y) ou (x = z) ou (y = z) então
            escreval("Triângulo Isósceles")
         senao
            escreval("Triângulo Escaleno")
         fimse
      fimse
   senao
      escreval("Os valores fornecidos não formam um triângulo.")
   fimse
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, z;

        System.out.print("Digite os três lados do triângulo: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();

        if (x < y + z && y < x + z && z < x + y) {
            if (x == y && y == z) {
                System.out.println("Triângulo Equilátero");
            } else if (x == y || x == z || y == z) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores fornecidos não formam um triângulo.");
        }
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite os três lados do triângulo: ")
    val (x, y, z) = readLine()!!.split(" ").map { it.toDouble() }

    if (x < y + z && y < x + z && z < x + y) {
        when {
            x == y && y == z -> println("Triângulo Equilátero")
            x == y || x == z || y == z -> println("Triângulo Isósceles")
            else -> println("Triângulo Escaleno")
        }
    } else {
        println("Os valores fornecidos não formam um triângulo.")
    }
}
```

---

## 🐍 Implementação em Python

```python
x, y, z = map(float, input("Digite os três lados do triângulo: ").split())

if x < y + z and y < x + z and z < x + y:
    if x == y == z:
        print("Triângulo Equilátero")
    elif x == y or x == z or y == z:
        print("Triângulo Isósceles")
    else:
        print("Triângulo Escaleno")
else:
    print("Os valores fornecidos não formam um triângulo.")
```

---

## 🧙 Implementação em Pascal

```pascal
program TipoTriangulo;
var
  x, y, z: real;
begin
  write('Digite os três lados do triângulo: ');
  readln(x, y, z);

  if (x < y + z) and (y < x + z) and (z < x + y) then
  begin
    if (x = y) and (y = z) then
      writeln('Triângulo Equilátero')
    else if (x = y) or (x = z) or (y = z) then
      writeln('Triângulo Isósceles')
    else
      writeln('Triângulo Escaleno');
  end
  else
    writeln('Os valores fornecidos não formam um triângulo.');
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
