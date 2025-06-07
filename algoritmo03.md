# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Média Ponderada

Neste terceiro exercício, o desafio é receber **três notas** e seus respectivos **pesos**, calcular e exibir a **média ponderada**. Veja abaixo três formas diferentes de apresentar o mesmo problema para engajar os estudantes:

---

### 🎓 Versão 1: Contexto de Avaliação Escolar
> 🏫 *Um aluno fez três avaliações com pesos diferentes. Crie um programa que receba a nota e o peso de cada avaliação e calcule a média ponderada final do aluno.*

---

### 📐 Versão 2: Linguagem Neutra e Matemática
> ✍️ *Desenvolva um programa que leia três notas e seus respectivos pesos. Em seguida, calcule e mostre a média ponderada utilizando a fórmula: (nota1 × peso1 + nota2 × peso2 + nota3 × peso3) / (peso1 + peso2 + peso3).*

---

### 🧠 Versão 3: Estilo Desafio de Lógica
> 🧪 *Você precisa calcular o desempenho de um candidato com base em três provas, cada uma com peso diferente. Receba as três notas e os três pesos e exiba a média ponderada final.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "media_ponderada"
var
   nota1, nota2, nota3, peso1, peso2, peso3, media: real
inicio
   escreva("Digite a nota 1: ")
   leia(nota1)
   escreva("Digite o peso da nota 1: ")
   leia(peso1)

   escreva("Digite a nota 2: ")
   leia(nota2)
   escreva("Digite o peso da nota 2: ")
   leia(peso2)

   escreva("Digite a nota 3: ")
   leia(nota3)
   escreva("Digite o peso da nota 3: ")
   leia(peso3)

   media <- (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3)
   escreval("A média ponderada é: ", media)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite o peso da nota 1: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite o peso da nota 2: ");
        double peso2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite o peso da nota 3: ");
        double peso3 = scanner.nextDouble();

        double media = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3);
        System.out.printf("A média ponderada é: %.2f%n", media);
    }
}
```

**Compilação:**
```bash
javac MediaPonderada.java
java MediaPonderada
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite a nota 1: ")
    val nota1 = readLine()!!.toDouble()
    print("Digite o peso da nota 1: ")
    val peso1 = readLine()!!.toDouble()

    print("Digite a nota 2: ")
    val nota2 = readLine()!!.toDouble()
    print("Digite o peso da nota 2: ")
    val peso2 = readLine()!!.toDouble()

    print("Digite a nota 3: ")
    val nota3 = readLine()!!.toDouble()
    print("Digite o peso da nota 3: ")
    val peso3 = readLine()!!.toDouble()

    val media = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3)
    println("A média ponderada é: %.2f".format(media))
}
```

**Compilação:**
```bash
kotlinc MediaPonderada.kt -include-runtime -d MediaPonderada.jar
java -jar MediaPonderada.jar
```

---

## 🐍 Implementação em Python

```python
nota1 = float(input("Digite a nota 1: "))
peso1 = float(input("Digite o peso da nota 1: "))

nota2 = float(input("Digite a nota 2: "))
peso2 = float(input("Digite o peso da nota 2: "))

nota3 = float(input("Digite a nota 3: "))
peso3 = float(input("Digite o peso da nota 3: "))

media = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3)
print("A média ponderada é: {:.2f}".format(media))
```

**Execução:**
```bash
python3 media_ponderada.py
```

---

## 🧙 Implementação em Pascal

```pascal
program MediaPonderada;
var
  nota1, nota2, nota3, peso1, peso2, peso3, media: real;
begin
  write('Digite a nota 1: ');
  readln(nota1);
  write('Digite o peso da nota 1: ');
  readln(peso1);

  write('Digite a nota 2: ');
  readln(nota2);
  write('Digite o peso da nota 2: ');
  readln(peso2);

  write('Digite a nota 3: ');
  readln(nota3);
  write('Digite o peso da nota 3: ');
  readln(peso3);

  media := (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3);
  writeln('A média ponderada é: ', media:0:2);
end.
```

**Compilação:**
```bash
fpc media_ponderada.pas
./media_ponderada  # ou media_ponderada.exe no Windows
```

---

## 🧠 Dica do Professor
> Teste com pesos diferentes e observe o quanto uma nota pode influenciar mais que outra no resultado da média. 🎯

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
