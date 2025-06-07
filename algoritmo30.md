# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Descobrir o Maior Número

Neste trigésimo exercício, o programa deve:

- Receber **dois números reais**;
- Comparar os dois valores;
- Mostrar qual é o **maior número** entre eles.

---

### 🧪 Versão 1: Comparador de Números
> 🔍 *Desenvolva um programa que recebe dois valores e determina qual é o maior deles.*

---

### 🧮 Versão 2: Quem é Maior?
> 🧠 *Crie um algoritmo simples que recebe dois números e indica qual é o maior valor informado.*

---

### 📊 Versão 3: Avaliador Numérico
> 🧾 *Faça um programa que analisa dois números e retorna o maior valor entre eles.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "maior_numero"
var
   num1, num2: real
inicio
   escreva("Digite o primeiro número: ")
   leia(num1)
   escreva("Digite o segundo número: ")
   leia(num2)

   se num1 > num2 então
      escreval("O maior número é: ", num1)
   senao
      escreval("O maior número é: ", num2)
   fimse
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2)
            System.out.println("O maior número é: " + num1);
        else
            System.out.println("O maior número é: " + num2);
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val num2 = readLine()!!.toDouble()

    val maior = if (num1 > num2) num1 else num2
    println("O maior número é: $maior")
}
```

---

## 🐍 Implementação em Python

```python
num1 = float(input("Digite o primeiro número: "))
num2 = float(input("Digite o segundo número: "))

maior = num1 if num1 > num2 else num2
print(f"O maior número é: {maior}")
```

---

## 🧙 Implementação em Pascal

```pascal
program MaiorNumero;
var
  num1, num2: real;
begin
  write('Digite o primeiro número: ');
  readln(num1);
  write('Digite o segundo número: ');
  readln(num2);

  if num1 > num2 then
    writeln('O maior número é: ', num1:0:2)
  else
    writeln('O maior número é: ', num2:0:2);
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
