# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Cálculo de Idade Atual e Idade em 2050

Neste décimo quarto exercício, o programa deve receber o **ano de nascimento de uma pessoa** e o **ano atual**, e então:

- a) calcular e mostrar a **idade atual** da pessoa;
- b) calcular e mostrar **quantos anos ela terá no ano de 2050**.

---

### 🎂 Versão 1: Cálculo Simples de Idade
> 🕰️ *Escreva um programa que leia o ano de nascimento de uma pessoa e o ano atual, e exiba a idade atual e a idade projetada para o ano de 2050.*

---

### 📅 Versão 2: Linguagem Neutra e Didática
> ✍️ *Crie um algoritmo que receba dois dados: o ano de nascimento e o ano atual. Com base nisso, mostre quantos anos a pessoa tem e quantos anos terá em 2050.*

---

### 🔮 Versão 3: Estilo Futurista
> 🚀 *Você recebeu uma missão de prever o futuro! Crie um programa que descubra a idade atual de alguém e a idade que essa pessoa terá em 2050.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "idade_atual_2050"
var
   anoNascimento, anoAtual, idadeAtual, idade2050: inteiro
inicio
   escreva("Digite o ano de nascimento: ")
   leia(anoNascimento)
   escreva("Digite o ano atual: ")
   leia(anoAtual)

   idadeAtual <- anoAtual - anoNascimento
   idade2050 <- 2050 - anoNascimento

   escreval("Idade atual: ", idadeAtual)
   escreval("Idade em 2050: ", idade2050)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class IdadeAtual2050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int nascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int atual = scanner.nextInt();

        int idadeAtual = atual - nascimento;
        int idade2050 = 2050 - nascimento;

        System.out.println("Idade atual: " + idadeAtual);
        System.out.println("Idade em 2050: " + idade2050);
    }
}
```

**Compilação:**
```bash
javac IdadeAtual2050.java
java IdadeAtual2050
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o ano de nascimento: ")
    val nascimento = readLine()!!.toInt()

    print("Digite o ano atual: ")
    val atual = readLine()!!.toInt()

    val idadeAtual = atual - nascimento
    val idade2050 = 2050 - nascimento

    println("Idade atual: $idadeAtual")
    println("Idade em 2050: $idade2050")
}
```

**Compilação:**
```bash
kotlinc IdadeAtual2050.kt -include-runtime -d IdadeAtual2050.jar
java -jar IdadeAtual2050.jar
```

---

## 🐍 Implementação em Python

```python
nascimento = int(input("Digite o ano de nascimento: "))
atual = int(input("Digite o ano atual: "))

idade_atual = atual - nascimento
idade_2050 = 2050 - nascimento

print("Idade atual:", idade_atual)
print("Idade em 2050:", idade_2050)
```

**Execução:**
```bash
python3 idade_2050.py
```

---

## 🧙 Implementação em Pascal

```pascal
program IdadeAtual2050;
var
  nascimento, atual, idadeAtual, idade2050: integer;
begin
  write('Digite o ano de nascimento: ');
  readln(nascimento);
  write('Digite o ano atual: ');
  readln(atual);

  idadeAtual := atual - nascimento;
  idade2050 := 2050 - nascimento;

  writeln('Idade atual: ', idadeAtual);
  writeln('Idade em 2050: ', idade2050);
end.
```

**Compilação:**
```bash
fpc idade_2050.pas
./idade_2050  # ou idade_2050.exe no Windows
```

---

## 🧠 Dica do Professor
> Para estender o programa, tente calcular também a idade da pessoa em qualquer outro ano informado pelo usuário! 📅

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
