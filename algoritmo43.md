# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Operações matemáticas com dois números

Neste quadragésimo terceiro exercício, o programa irá:
- Receber dois números fornecidos pelo usuário.
- Mostrar um menu de operações:
  a) Elevar o primeiro número ao segundo.
  b) Calcular a raiz quadrada de cada número.
  c) Calcular a raiz cúbica de cada número.
- Executar a operação selecionada.
- Informar erro se a opção for inválida.

---

### 🔢 Versão 1: Potência entre os números
> 📈 *Mostra o resultado do primeiro número elevado ao segundo.*

### 📉 Versão 2: Raiz Quadrada
> 🧮 *Mostra a raiz quadrada dos dois números.*

### 🔺 Versão 3: Raiz Cúbica
> 🧪 *Mostra a raiz cúbica dos dois números.*

---

## 💬 Portugol

```portugol
algoritmo "operacoes_avancadas"
var
   num1, num2, raiz1, raiz2: real
   opcao: caractere
inicio
   escreva("Digite o primeiro número: ")
   leia(num1)
   escreva("Digite o segundo número: ")
   leia(num2)

   escreval("Escolha a operação:")
   escreval("a) Potência (num1 ^ num2)")
   escreval("b) Raiz quadrada de cada número")
   escreval("c) Raiz cúbica de cada número")
   leia(opcao)

   escolha opcao
      caso "a"
         escreval("Resultado: ", potencia(num1, num2))
      caso "b"
         escreval("Raiz quadrada de num1: ", raizq(num1))
         escreval("Raiz quadrada de num2: ", raizq(num2))
      caso "c"
         escreval("Raiz cúbica de num1: ", num1 ^ (1/3))
         escreval("Raiz cúbica de num2: ", num2 ^ (1/3))
      outrocaso
         escreval("Opção inválida.")
   fimescolha
fimalgoritmo
```

---

## ☕ Java

```java
import java.util.Scanner;

public class OperacoesAvancadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("a) Potência (num1 ^ num2)");
        System.out.println("b) Raiz quadrada");
        System.out.println("c) Raiz cúbica");

        char opcao = sc.next().charAt(0);

        switch (opcao) {
            case 'a':
                System.out.println("Resultado: " + Math.pow(num1, num2));
                break;
            case 'b':
                System.out.println("Raiz quadrada de num1: " + Math.sqrt(num1));
                System.out.println("Raiz quadrada de num2: " + Math.sqrt(num2));
                break;
            case 'c':
                System.out.println("Raiz cúbica de num1: " + Math.cbrt(num1));
                System.out.println("Raiz cúbica de num2: " + Math.cbrt(num2));
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
```

---

## 💙 Kotlin

```kotlin
fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toDouble()
    print("Digite o segundo número: ")
    val num2 = readLine()!!.toDouble()

    println("Escolha a operação:")
    println("a) Potência (num1 ^ num2)")
    println("b) Raiz quadrada")
    println("c) Raiz cúbica")
    val opcao = readLine()!!.lowercase()

    when (opcao) {
        "a" -> println("Resultado: ${Math.pow(num1, num2)}")
        "b" -> {
            println("Raiz quadrada de num1: ${Math.sqrt(num1)}")
            println("Raiz quadrada de num2: ${Math.sqrt(num2)}")
        }
        "c" -> {
            println("Raiz cúbica de num1: ${Math.cbrt(num1)}")
            println("Raiz cúbica de num2: ${Math.cbrt(num2)}")
        }
        else -> println("Opção inválida.")
    }
}
```

---

## 🐍 Python

```python
import math

num1 = float(input("Digite o primeiro número: "))
num2 = float(input("Digite o segundo número: "))

print("Escolha a operação:")
print("a) Potência (num1 ^ num2)")
print("b) Raiz quadrada")
print("c) Raiz cúbica")
opcao = input("Opção: ").lower()

if opcao == "a":
    print("Resultado:", math.pow(num1, num2))
elif opcao == "b":
    print("Raiz quadrada de num1:", math.sqrt(num1))
    print("Raiz quadrada de num2:", math.sqrt(num2))
elif opcao == "c":
    print("Raiz cúbica de num1:", num1 ** (1/3))
    print("Raiz cúbica de num2:", num2 ** (1/3))
else:
    print("Opção inválida.")
```

---

## 🧙 Pascal

```pascal
program OperacoesAvancadas;
uses math;
var
  num1, num2: real;
  opcao: char;
begin
  write('Digite o primeiro número: ');
  readln(num1);
  write('Digite o segundo número: ');
  readln(num2);

  writeln('Escolha a operação:');
  writeln('a) Potência');
  writeln('b) Raiz quadrada');
  writeln('c) Raiz cúbica');
  readln(opcao);

  case opcao of
    'a': writeln('Resultado: ', power(num1, num2):0:2);
    'b': begin
           writeln('Raiz quadrada de num1: ', sqrt(num1):0:2);
           writeln('Raiz quadrada de num2: ', sqrt(num2):0:2);
         end;
    'c': begin
           writeln('Raiz cúbica de num1: ', exp(ln(num1)/3):0:2);
           writeln('Raiz cúbica de num2: ', exp(ln(num2)/3):0:2);
         end;
  else
    writeln('Opção inválida.');
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
