# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Par ou Ímpar?

Neste trigésimo terceiro exercício, o programa deve:

- Receber um **número inteiro**;
- Verificar se o número é **par** ou **ímpar**;
- Exibir a mensagem correspondente.

---

### 🔄 Versão 1: Verificador Simples
> 🔢 *Crie um programa que leia um número inteiro e informe se ele é par ou ímpar.*

---

### 📊 Versão 2: Classificador Numérico
> 🧠 *Desenvolva um algoritmo que classifica um número como par ou ímpar.*

---

### 👀 Versão 3: Paridade em Ação
> ⚖️ *Implemente uma lógica que recebe um número inteiro e determina sua paridade (par ou ímpar).*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "verifica_par_ou_impar"
var
   numero: inteiro
inicio
   escreva("Digite um número inteiro: ")
   leia(numero)

   se numero % 2 = 0 então
      escreval("O número é par.")
   senao
      escreval("O número é ímpar.")
   fimse
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class VerificaParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0)
            System.out.println("O número é par.");
        else
            System.out.println("O número é ímpar.");
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite um número inteiro: ")
    val numero = readLine()!!.toInt()

    if (numero % 2 == 0)
        println("O número é par.")
    else
        println("O número é ímpar.")
}
```

---

## 🐍 Implementação em Python

```python
numero = int(input("Digite um número inteiro: "))

if numero % 2 == 0:
    print("O número é par.")
else:
    print("O número é ímpar.")
```

---

## 🧙 Implementação em Pascal

```pascal
program VerificaParOuImpar;
var
  numero: integer;
begin
  write('Digite um número inteiro: ');
  readln(numero);

  if numero mod 2 = 0 then
    writeln('O número é par.')
  else
    writeln('O número é ímpar.');
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
