# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Média Aritmética com Mensagem e Nota de Exame

Neste vigésimo nono exercício, o programa deve:

- Receber três notas de um aluno;
- Calcular a média aritmética simples;
- Exibir uma **mensagem** conforme a média, seguindo:

| Média Aritmética | Situação   |
|------------------|------------|
| 0.0 – 3.0        | Reprovado  |
| 3.0 – 7.0        | Exame      |
| 7.0 – 10.0       | Aprovado   |

- Caso a média esteja entre 3.0 e 7.0, exibir também a **nota necessária no exame** para ser aprovado, considerando que a média final exigida é 6.0.

---

### 🧪 Versão 1: Avaliação com Chance de Recuperação
> 📊 *Crie um programa que calcule a média de três notas e determine a situação do aluno. Caso precise fazer exame, mostre a nota necessária para a aprovação.*

---

### 📈 Versão 2: Calculadora de Média com Verificação de Exame
> ✏️ *Desenvolva um algoritmo que analisa a média aritmética de um aluno e informa sua situação, com cálculo da nota mínima para aprovação no exame, se necessário.*

---

### 🎓 Versão 3: Simulador de Resultado Escolar
> 🎯 *Implemente um programa que classifica o aluno como aprovado, reprovado ou em exame com base na média de três notas.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "media_exame"
var
   nota1, nota2, nota3, media, nota_exame: real
inicio
   escreva("Digite a primeira nota: ")
   leia(nota1)
   escreva("Digite a segunda nota: ")
   leia(nota2)
   escreva("Digite a terceira nota: ")
   leia(nota3)

   media <- (nota1 + nota2 + nota3) / 3

   escreval("Média: ", media)

   se media < 3 então
      escreval("Situação: Reprovado")
   senao se media < 7 então
      escreval("Situação: Exame")
      nota_exame <- (6 * 2) - media
      escreval("Nota necessária no exame: ", nota_exame)
   senao
      escreval("Situação: Aprovado")
   fimse
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class MediaExame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;
        System.out.printf("Média: %.2f%n", media);

        if (media < 3) {
            System.out.println("Situação: Reprovado");
        } else if (media < 7) {
            System.out.println("Situação: Exame");
            double notaExame = 12 - media;
            System.out.printf("Nota necessária no exame: %.2f%n", notaExame);
        } else {
            System.out.println("Situação: Aprovado");
        }
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite a primeira nota: ")
    val n1 = readLine()!!.toDouble()
    print("Digite a segunda nota: ")
    val n2 = readLine()!!.toDouble()
    print("Digite a terceira nota: ")
    val n3 = readLine()!!.toDouble()

    val media = (n1 + n2 + n3) / 3
    println("Média: %.2f".format(media))

    when {
        media < 3 -> println("Situação: Reprovado")
        media < 7 -> {
            println("Situação: Exame")
            val notaExame = 12 - media
            println("Nota necessária no exame: %.2f".format(notaExame))
        }
        else -> println("Situação: Aprovado")
    }
}
```

---

## 🐍 Implementação em Python

```python
n1 = float(input("Digite a primeira nota: "))
n2 = float(input("Digite a segunda nota: "))
n3 = float(input("Digite a terceira nota: "))

media = (n1 + n2 + n3) / 3
print(f"Média: {media:.2f}")

if media < 3:
    print("Situação: Reprovado")
elif media < 7:
    print("Situação: Exame")
    nota_exame = 12 - media
    print(f"Nota necessária no exame: {nota_exame:.2f}")
else:
    print("Situação: Aprovado")
```

---

## 🧙 Implementação em Pascal

```pascal
program MediaExame;
var
  n1, n2, n3, media, notaExame: real;
begin
  write('Digite a primeira nota: ');
  readln(n1);
  write('Digite a segunda nota: ');
  readln(n2);
  write('Digite a terceira nota: ');
  readln(n3);

  media := (n1 + n2 + n3) / 3;
  writeln('Média: ', media:0:2);

  if media < 3 then
    writeln('Situação: Reprovado')
  else if media < 7 then
  begin
    writeln('Situação: Exame');
    notaExame := 12 - media;
    writeln('Nota necessária no exame: ', notaExame:0:2);
  end
  else
    writeln('Situação: Aprovado');
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
