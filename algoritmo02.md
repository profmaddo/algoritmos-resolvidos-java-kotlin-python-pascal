# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Média de Três Notas

Neste segundo exercício, vamos desenvolver algoritmos e programas que recebem **três notas** e retornam a **média aritmética**. Veja abaixo três formas diferentes de apresentar o mesmo problema:

---

### 📘 Versão 1: Contexto Escolar
> 🎓 *Imagine que um professor precisa calcular a média de um aluno com base em três notas trimestrais. Crie um programa que receba essas três notas e exiba a média aritmética final do estudante.*

---

### 🧪 Versão 2: Linguagem Neutra e Didática
> 📏 *Desenvolva um programa que leia três valores numéricos reais representando notas. Em seguida, o programa deve calcular e mostrar a média aritmética dessas três notas.*

---

### 🎯 Versão 3: Estilo Gamificado
> 🕹️ *Você está participando de um torneio de desafios lógicos e precisa avaliar o desempenho de um competidor. Cada fase do torneio tem uma nota. Crie um algoritmo que receba as três notas e exiba a média final.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "media_tres_notas"
var
   nota1, nota2, nota3, media: real
inicio
   escreva("Digite a primeira nota: ")
   leia(nota1)
   escreva("Digite a segunda nota: ")
   leia(nota2)
   escreva("Digite a terceira nota: ")
   leia(nota3)
   media <- (nota1 + nota2 + nota3) / 3
   escreval("A média é: ", media)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class MediaTresNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A média é: %.2f%n", media);
    }
}
```

**Compilação:**
```bash
javac MediaTresNotas.java
java MediaTresNotas
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toDouble()

    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()

    print("Digite a terceira nota: ")
    val nota3 = readLine()!!.toDouble()

    val media = (nota1 + nota2 + nota3) / 3
    println("A média é: %.2f".format(media))
}
```

**Compilação:**
```bash
kotlinc MediaTresNotas.kt -include-runtime -d MediaTresNotas.jar
java -jar MediaTresNotas.jar
```

---

## 🐍 Implementação em Python

```python
nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))
nota3 = float(input("Digite a terceira nota: "))

media = (nota1 + nota2 + nota3) / 3
print("A média é: {:.2f}".format(media))
```

**Execução:**
```bash
python3 media_tres_notas.py
```

---

## 🧙 Implementação em Pascal

```pascal
program MediaTresNotas;
var
  nota1, nota2, nota3, media: real;
begin
  write('Digite a primeira nota: ');
  readln(nota1);

  write('Digite a segunda nota: ');
  readln(nota2);

  write('Digite a terceira nota: ');
  readln(nota3);

  media := (nota1 + nota2 + nota3) / 3;
  writeln('A média é: ', media:0:2);
end.
```

**Compilação:**
```bash
fpc media_tres_notas.pas
./media_tres_notas  # ou media_tres_notas.exe no Windows
```

---

## 🧠 Dica do Professor
> Você pode testar com diferentes números, incluindo casas decimais, para verificar se o programa arredonda corretamente! 😉

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
