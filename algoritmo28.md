# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Média Ponderada com Conceito Final

Neste vigésimo oitavo exercício, o programa deve:

- Receber três notas:
  - Nota do **trabalho de laboratório** (peso 2)
  - Nota da **avaliação semestral** (peso 3)
  - Nota do **exame final** (peso 5)
- Calcular a **média ponderada** das notas;
- Determinar e mostrar o **conceito final** com base na tabela:

| Média Ponderada | Conceito |
|-----------------|----------|
| 8.0 – 10.0      | A        |
| 7.0 – 7.9       | B        |
| 6.0 – 6.9       | C        |
| 5.0 – 5.9       | D        |
| 0.0 – 4.9       | E        |

---

### 📚 Versão 1: Avaliação Final de Desempenho
> 🎓 *Crie um programa que calcule a média ponderada com base em três notas e atribua um conceito de A a E conforme o desempenho.*

---

### 📏 Versão 2: Calculadora de Média com Conceito
> 📊 *Faça um algoritmo que receba três notas com pesos diferentes, calcule a média ponderada e determine o conceito final do estudante.*

---

### 🧮 Versão 3: Sistema de Avaliação Escolar
> 🏫 *Desenvolva um sistema simples para calcular a média ponderada de um aluno e informar seu conceito conforme a tabela de desempenho.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "media_ponderada_conceito"
var
   nota1, nota2, nota3, media: real
   conceito: caractere
inicio
   escreva("Nota do trabalho de laboratório: ")
   leia(nota1)
   escreva("Nota da avaliação semestral: ")
   leia(nota2)
   escreva("Nota do exame final: ")
   leia(nota3)

   media <- (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10

   se media >= 8 então
      conceito <- 'A'
   senao se media >= 7 então
      conceito <- 'B'
   senao se media >= 6 então
      conceito <- 'C'
   senao se media >= 5 então
      conceito <- 'D'
   senao
      conceito <- 'E'
   fimse

   escreval("Média ponderada: ", media)
   escreval("Conceito: ", conceito)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class MediaConceito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota do trabalho de laboratório: ");
        double lab = scanner.nextDouble();

        System.out.print("Nota da avaliação semestral: ");
        double semestral = scanner.nextDouble();

        System.out.print("Nota do exame final: ");
        double exame = scanner.nextDouble();

        double media = (lab * 2 + semestral * 3 + exame * 5) / 10;
        char conceito;

        if (media >= 8)
            conceito = 'A';
        else if (media >= 7)
            conceito = 'B';
        else if (media >= 6)
            conceito = 'C';
        else if (media >= 5)
            conceito = 'D';
        else
            conceito = 'E';

        System.out.println("Média ponderada: " + media);
        System.out.println("Conceito: " + conceito);
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Nota do trabalho de laboratório: ")
    val lab = readLine()!!.toDouble()

    print("Nota da avaliação semestral: ")
    val semestral = readLine()!!.toDouble()

    print("Nota do exame final: ")
    val exame = readLine()!!.toDouble()

    val media = (lab * 2 + semestral * 3 + exame * 5) / 10

    val conceito = when {
        media >= 8 -> "A"
        media >= 7 -> "B"
        media >= 6 -> "C"
        media >= 5 -> "D"
        else -> "E"
    }

    println("Média ponderada: $media")
    println("Conceito: $conceito")
}
```

---

## 🐍 Implementação em Python

```python
lab = float(input("Nota do trabalho de laboratório: "))
semestral = float(input("Nota da avaliação semestral: "))
exame = float(input("Nota do exame final: "))

media = (lab * 2 + semestral * 3 + exame * 5) / 10

if media >= 8:
    conceito = "A"
elif media >= 7:
    conceito = "B"
elif media >= 6:
    conceito = "C"
elif media >= 5:
    conceito = "D"
else:
    conceito = "E"

print(f"Média ponderada: {media}")
print(f"Conceito: {conceito}")
```

---

## 🧙 Implementação em Pascal

```pascal
program MediaConceito;
var
  lab, semestral, exame, media: real;
  conceito: char;
begin
  write('Nota do trabalho de laboratório: ');
  readln(lab);
  write('Nota da avaliação semestral: ');
  readln(semestral);
  write('Nota do exame final: ');
  readln(exame);

  media := (lab * 2 + semestral * 3 + exame * 5) / 10;

  if media >= 8 then
    conceito := 'A'
  else if media >= 7 then
    conceito := 'B'
  else if media >= 6 then
    conceito := 'C'
  else if media >= 5 then
    conceito := 'D'
  else
    conceito := 'E';

  writeln('Média ponderada: ', media:0:2);
  writeln('Conceito: ', conceito);
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
