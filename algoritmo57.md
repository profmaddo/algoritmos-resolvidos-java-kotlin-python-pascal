# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Soma de intervalos entre dois números

### Versão 1 - Redação simples
Crie um programa que leia pares de números inteiros positivos `[m, n]`. Para cada par informado com `m < n`, o programa deve calcular e exibir a soma de todos os inteiros entre `m` e `n` (inclusive).  
A execução deve ser encerrada quando for digitado um par em que `m >= n`.

---

## 💬 Portugol

```portugol
algoritmo "soma_intervalo_pares_menores"
var
  m, n, i, soma: inteiro
inicio
  escreval("Digite pares de valores inteiros positivos (m < n).")
  escreval("Para encerrar, digite um par onde m >= n.")
  escreval("-------------------------------------------")

  repita
    escreva("Digite o valor de m: ")
    leia(m)
    escreva("Digite o valor de n: ")
    leia(n)

    se m < n entao
      soma <- 0
      para i de m ate n faca
        soma <- soma + i
      fimpara
      escreval("A soma dos inteiros entre ", m, " e ", n, " é: ", soma)
      escreval("-------------------------------------------")
    fimse
  ate m >= n

  escreval("Programa encerrado.")
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class SomaIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;

        System.out.println("Digite pares de valores inteiros positivos (m < n).");
        System.out.println("Para encerrar, digite um par onde m >= n.");
        System.out.println("-------------------------------------------");

        do {
            System.out.print("Digite o valor de m: ");
            m = scanner.nextInt();
            System.out.print("Digite o valor de n: ");
            n = scanner.nextInt();

            if (m < n) {
                int soma = 0;
                for (int i = m; i <= n; i++) {
                    soma += i;
                }
                System.out.printf("A soma dos inteiros entre %d e %d é: %d%n", m, n, soma);
                System.out.println("-------------------------------------------");
            }
        } while (m < n);

        System.out.println("Programa encerrado.");
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    println("Digite pares de valores inteiros positivos (m < n).")
    println("Para encerrar, digite um par onde m >= n.")
    println("-------------------------------------------")

    while (true) {
        print("Digite o valor de m: ")
        val m = readLine()!!.toInt()
        print("Digite o valor de n: ")
        val n = readLine()!!.toInt()

        if (m >= n) break

        val soma = (m..n).sum()
        println("A soma dos inteiros entre $m e $n é: $soma")
        println("-------------------------------------------")
    }

    println("Programa encerrado.")
}
```

---

## 🐍 Implementação em Python

```python
print("Digite pares de valores inteiros positivos (m < n).")
print("Para encerrar, digite um par onde m >= n.")
print("-------------------------------------------")

while True:
    m = int(input("Digite o valor de m: "))
    n = int(input("Digite o valor de n: "))

    if m >= n:
        break

    soma = sum(range(m, n + 1))
    print(f"A soma dos inteiros entre {m} e {n} é: {soma}")
    print("-------------------------------------------")

print("Programa encerrado.")
```

---

## 🧙 Implementação em Pascal

```pascal
program SomaIntervalo;
uses crt;
var
  m, n, i, soma: integer;
begin
  writeln('Digite pares de valores inteiros positivos (m < n).');
  writeln('Para encerrar, digite um par onde m >= n.');
  writeln('-------------------------------------------');

  repeat
    write('Digite o valor de m: ');
    readln(m);
    write('Digite o valor de n: ');
    readln(n);

    if m < n then
    begin
      soma := 0;
      for i := m to n do
        soma := soma + i;
      writeln('A soma dos inteiros entre ', m, ' e ', n, ' é: ', soma);
      writeln('-------------------------------------------');
    end;
  until m >= n;

  writeln('Programa encerrado.');
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
