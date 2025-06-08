# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Sequência de Fibonacci

### Versão 1 - Redação simples
Crie um programa que mostre os **oito primeiros termos** da **sequência de Fibonacci**, na qual cada número é a soma dos dois anteriores, iniciando com 0 e 1.

### Versão 2 - Redação educacional
Construa um algoritmo que calcule e exiba os **oito primeiros elementos da sequência de Fibonacci**, importante para o estudo de algoritmos que envolvem recorrência e progressões matemáticas.

### Versão 3 - Redação criativa
Imagine um coelho que se multiplica de acordo com a sequência de Fibonacci 🐇. Crie um programa que exiba os **oito primeiros números dessa famosa sequência**, iniciando com 0 e 1.

---

## 💬 Portugol

```portugol
algoritmo "fibonacci"
var
  a, b, c, i: inteiro
inicio
  a <- 0
  b <- 1
  escreval(a)
  escreval(b)
  para i de 3 ate 8 faca
    c <- a + b
    escreval(c)
    a <- b
    b <- c
  fimpara
fimalgoritmo
```

---

## ☕ Java

```java
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i <= 8; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
```

---

## 💙 Kotlin

```kotlin
fun main() {
    var a = 0
    var b = 1
    println(a)
    println(b)
    for (i in 3..8) {
        val c = a + b
        println(c)
        a = b
        b = c
    }
}
```

---

## 🐍 Python

```python
a, b = 0, 1
print(a)
print(b)
for _ in range(6):
    c = a + b
    print(c)
    a, b = b, c
```

---

## 🧙 Pascal

```pascal
program Fibonacci;
var
  a, b, c, i: integer;
begin
  a := 0;
  b := 1;
  writeln(a);
  writeln(b);
  for i := 3 to 8 do
  begin
    c := a + b;
    writeln(c);
    a := b;
    b := c;
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
