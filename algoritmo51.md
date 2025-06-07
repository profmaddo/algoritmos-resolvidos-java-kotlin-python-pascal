# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Verificação de Número Primo

### Versão 1 - Redação clara
Faça um programa que receba um número inteiro maior que 1 e determine se ele é **primo** ou **não primo**. Um número primo é aquele que só pode ser dividido por 1 e por ele mesmo.

### Versão 2 - Redação formal
Desenvolva um programa que leia um número inteiro maior que 1 e verifique se ele é um número **primo**. Um número é considerado primo se possuir exatamente dois divisores distintos: 1 e ele próprio.

### Versão 3 - Redação simplificada
👀 Digite um número maior que 1 e o programa vai dizer se ele é **primo** ou **não primo**. Lembre-se: número primo só divide por 1 e por ele mesmo! 🔍

---

## 💬 Portugol

```portugol
algoritmo "verifica_primo"
var
  numero, i, divisores: inteiro
inicio
  escreva("Digite um número inteiro maior que 1: ")
  leia(numero)

  se numero <= 1 entao
    escreval("Número inválido.")
  senao
    divisores <- 0
    para i de 1 ate numero faca
      se numero % i = 0 entao
        divisores <- divisores + 1
      fimse
    fimpara

    se divisores = 2 entao
      escreval("Número primo.")
    senao
      escreval("Número não primo.")
    fimse
  fimse
fimalgoritmo
```

---

## ☕ Java

```java
import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro maior que 1: ");
        int numero = sc.nextInt();
        int divisores = 0;

        if (numero <= 1) {
            System.out.println("Número inválido.");
            return;
        }

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println("Número primo.");
        } else {
            System.out.println("Número não primo.");
        }
    }
}
```

---

## 💙 Kotlin

```kotlin
fun main() {
    print("Digite um número inteiro maior que 1: ")
    val numero = readLine()!!.toInt()
    var divisores = 0

    if (numero <= 1) {
        println("Número inválido.")
        return
    }

    for (i in 1..numero) {
        if (numero % i == 0) divisores++
    }

    if (divisores == 2) println("Número primo.")
    else println("Número não primo.")
}
```

---

## 🐍 Python

```python
numero = int(input("Digite um número inteiro maior que 1: "))
divisores = 0

if numero <= 1:
    print("Número inválido.")
else:
    for i in range(1, numero + 1):
        if numero % i == 0:
            divisores += 1

    if divisores == 2:
        print("Número primo.")
    else:
        print("Número não primo.")
```

---

## 🧙 Pascal

```pascal
program VerificaPrimo;
var
  numero, i, divisores: integer;
begin
  write('Digite um número inteiro maior que 1: ');
  readln(numero);

  if numero <= 1 then
    writeln('Número inválido.')
  else
  begin
    divisores := 0;
    for i := 1 to numero do
    begin
      if numero mod i = 0 then
        divisores := divisores + 1;
    end;

    if divisores = 2 then
      writeln('Número primo.')
    else
      writeln('Número não primo.');
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
