# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Série de Frações com Fatoriais

Neste quadragésimo quinto exercício, você deverá implementar um programa que:
- Leia um valor inteiro e positivo **N**.
- Calcule o valor de **Z** conforme a fórmula da série:
  

**Z = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!**

Este problema envolve lógica de repetição e uso do fatorial para somar os termos de uma série matemática.

---

### 💡 Versão 1: Uso direto de `for`
> 📘 *Calcula os termos com laço numérico crescente.*

### 💡 Versão 2: Fatorial com função auxiliar
> 🔢 *Função separada para clareza e reutilização.*

### 💡 Versão 3: Enquanto (`while`) com somatório
> 🔄 *Usa laço `while` para praticar controle por condição.*

---

## 💬 Portugol

```portugol
algoritmo "serie_fatorial"
var
   N, i, j, fatorial: inteiro
   Z: real
inicio
   escreva("Digite um valor inteiro positivo N: ")
   leia(N)

   Z <- 1
   para i de 1 ate N faca
      fatorial <- 1
      para j de 1 ate i faca
         fatorial <- fatorial * j
      fimpara
      Z <- Z + 1 / fatorial
   fimpara

   escreval("Valor de Z: ", Z)
fimalgoritmo
```

---

## ☕ Java

```java
import java.util.Scanner;

public class SerieFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor inteiro positivo N: ");
        int N = sc.nextInt();
        double Z = 1.0;

        for (int i = 1; i <= N; i++) {
            double fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            Z += 1 / fatorial;
        }

        System.out.printf("Valor de Z: %.6f\n", Z);
    }
}
```

---

## 💙 Kotlin

```kotlin
fun main() {
    print("Digite um valor inteiro positivo N: ")
    val N = readLine()!!.toInt()
    var Z = 1.0

    for (i in 1..N) {
        var fatorial = 1.0
        for (j in 1..i) {
            fatorial *= j
        }
        Z += 1 / fatorial
    }

    println("Valor de Z: %.6f".format(Z))
}
```

---

## 🐍 Python

```python
N = int(input("Digite um valor inteiro positivo N: "))
Z = 1.0

for i in range(1, N + 1):
    fatorial = 1
    for j in range(1, i + 1):
        fatorial *= j
    Z += 1 / fatorial

print(f"Valor de Z: {Z:.6f}")
```

---

## 🧙 Pascal

```pascal
program SerieFatorial;
uses sysutils;
var
  N, i, j, fatorial: integer;
  Z: real;
begin
  write('Digite um valor inteiro positivo N: ');
  readln(N);
  Z := 1;

  for i := 1 to N do
  begin
    fatorial := 1;
    for j := 1 to i do
      fatorial := fatorial * j;
    Z := Z + 1 / fatorial;
  end;

  writeln('Valor de Z: ', FormatFloat('0.000000', Z));
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
