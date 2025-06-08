# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Ordenar Três Números

Neste trigésimo primeiro exercício, o programa deve:

- Receber **três números reais diferentes**;
- Mostrar os três números em **ordem crescente**.

---

### 🧮 Versão 1: Organizador de Valores
> 📊 *Crie um programa que receba três números diferentes e mostre-os em ordem crescente.*

---

### 📏 Versão 2: Classificador Numérico Simples
> 📈 *Faça um algoritmo que leia três valores distintos e os organize do menor para o maior.*

---

### 🔢 Versão 3: Ordenação Crescente
> 🧠 *Implemente um programa que recebe três números e imprime os valores ordenados em ordem crescente.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "ordenar_tres_numeros"
var
   a, b, c, menor, meio, maior: real
inicio
   escreva("Digite o primeiro número: ")
   leia(a)
   escreva("Digite o segundo número: ")
   leia(b)
   escreva("Digite o terceiro número: ")
   leia(c)

   se a < b e a < c então
      menor <- a
      se b < c então
         meio <- b
         maior <- c
      senao
         meio <- c
         maior <- b
      fimse
   senao se b < a e b < c então
      menor <- b
      se a < c então
         meio <- a
         maior <- c
      senao
         meio <- c
         maior <- a
      fimse
   senao
      menor <- c
      se a < b então
         meio <- a
         maior <- b
      senao
         meio <- b
         maior <- a
      fimse
   fimse

   escreval("Ordem crescente: ", menor, ", ", meio, ", ", maior)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;
import java.util.Arrays;

public class OrdenaTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[3];

        System.out.print("Digite o primeiro número: ");
        numeros[0] = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        numeros[1] = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        numeros[2] = scanner.nextDouble();

        Arrays.sort(numeros);
        System.out.println("Ordem crescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o primeiro número: ")
    val a = readLine()!!.toDouble()
    print("Digite o segundo número: ")
    val b = readLine()!!.toDouble()
    print("Digite o terceiro número: ")
    val c = readLine()!!.toDouble()

    val lista = listOf(a, b, c).sorted()
    println("Ordem crescente: ${lista[0]}, ${lista[1]}, ${lista[2]}")
}
```

---

## 🐍 Implementação em Python

```python
a = float(input("Digite o primeiro número: "))
b = float(input("Digite o segundo número: "))
c = float(input("Digite o terceiro número: "))

numeros = [a, b, c]
numeros.sort()

print(f"Ordem crescente: {numeros[0]}, {numeros[1]}, {numeros[2]}")
```

---

## 🧙 Implementação em Pascal

```pascal
program OrdenaTresNumeros;
var
  a, b, c, temp: real;
begin
  write('Digite o primeiro número: ');
  readln(a);
  write('Digite o segundo número: ');
  readln(b);
  write('Digite o terceiro número: ');
  readln(c);

  if a > b then begin temp := a; a := b; b := temp; end;
  if a > c then begin temp := a; a := c; c := temp; end;
  if b > c then begin temp := b; b := c; c := temp; end;

  writeln('Ordem crescente: ', a:0:2, ', ', b:0:2, ', ', c:0:2);
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
