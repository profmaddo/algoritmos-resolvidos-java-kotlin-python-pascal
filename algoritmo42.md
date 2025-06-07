# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Quadrante de um Ângulo e Número de Voltas

Neste quadragésimo segundo exercício, o objetivo é:

- Receber um ângulo (em graus), que pode ser positivo ou negativo.
- Reduzir esse ângulo dentro do intervalo de 0° a 360°.
- Calcular o número de voltas completas dadas pelo ângulo.
- Informar o **sentido da volta**: horário (ângulo negativo) ou anti-horário (ângulo positivo).
- Determinar em qual **quadrante da trigonometria** o ângulo está localizado:
  - 1º Quadrante: de 0° a 90°
  - 2º Quadrante: de 90° a 180°
  - 3º Quadrante: de 180° a 270°
  - 4º Quadrante: de 270° a 360°

---

### 🔄 Versão 1: Determinação do Quadrante
> 🧭 *Dado um ângulo, indique em qual quadrante ele se encontra.*

---

### 📉 Versão 2: Sentido e Número de Voltas
> 🔁 *Determine o sentido (horário/anti-horário) e quantas voltas completas foram dadas.*

---

### 📐 Versão 3: Redução de Ângulo com Análise Completa
> 🧠 *Mostre o ângulo reduzido, sentido, número de voltas e o quadrante correspondente.*

---

## 💬 Portugol

```portugol
algoritmo "quadrante_angulo"
var
   angulo, reduzido: real
   voltas: inteiro
inicio
   escreva("Digite o valor do ângulo (graus): ")
   leia(angulo)

   voltas <- abs(trunc(angulo / 360))
   reduzido <- angulo mod 360
   se reduzido < 0 então
      reduzido <- reduzido + 360
   fimse

   escreval("Número de voltas: ", voltas)
   se angulo < 0 então
      escreval("Sentido: horário")
   senao
      escreval("Sentido: anti-horário")
   fimse

   escreval("Ângulo reduzido: ", reduzido)

   se reduzido > 0 e reduzido < 90 então
      escreval("1º Quadrante")
   senao se reduzido = 90 então
      escreval("Entre 1º e 2º Quadrante")
   senao se reduzido < 180 então
      escreval("2º Quadrante")
   senao se reduzido = 180 então
      escreval("Entre 2º e 3º Quadrante")
   senao se reduzido < 270 então
      escreval("3º Quadrante")
   senao se reduzido = 270 então
      escreval("Entre 3º e 4º Quadrante")
   senao
      escreval("4º Quadrante")
   fimse
fimalgoritmo
```

---

## ☕ Java

```java
import java.util.Scanner;

public class QuadranteAngulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do ângulo (graus): ");
        double angulo = sc.nextDouble();

        int voltas = (int) Math.abs(angulo / 360);
        double reduzido = angulo % 360;
        if (reduzido < 0) reduzido += 360;

        System.out.println("Número de voltas: " + voltas);
        System.out.println("Sentido: " + (angulo < 0 ? "horário" : "anti-horário"));
        System.out.println("Ângulo reduzido: " + reduzido);

        if (reduzido > 0 && reduzido < 90)
            System.out.println("1º Quadrante");
        else if (reduzido == 90)
            System.out.println("Entre 1º e 2º Quadrante");
        else if (reduzido < 180)
            System.out.println("2º Quadrante");
        else if (reduzido == 180)
            System.out.println("Entre 2º e 3º Quadrante");
        else if (reduzido < 270)
            System.out.println("3º Quadrante");
        else if (reduzido == 270)
            System.out.println("Entre 3º e 4º Quadrante");
        else
            System.out.println("4º Quadrante");
    }
}
```

---

## 💙 Kotlin

```kotlin
fun main() {
    print("Digite o valor do ângulo (graus): ")
    val angulo = readLine()!!.toDouble()

    val voltas = kotlin.math.abs((angulo / 360).toInt())
    var reduzido = angulo % 360
    if (reduzido < 0) reduzido += 360

    println("Número de voltas: $voltas")
    println("Sentido: ${if (angulo < 0) "horário" else "anti-horário"}")
    println("Ângulo reduzido: $reduzido")

    when {
        reduzido > 0 && reduzido < 90 -> println("1º Quadrante")
        reduzido == 90.0 -> println("Entre 1º e 2º Quadrante")
        reduzido < 180 -> println("2º Quadrante")
        reduzido == 180.0 -> println("Entre 2º e 3º Quadrante")
        reduzido < 270 -> println("3º Quadrante")
        reduzido == 270.0 -> println("Entre 3º e 4º Quadrante")
        else -> println("4º Quadrante")
    }
}
```

---

## 🐍 Python

```python
angulo = float(input("Digite o valor do ângulo (graus): "))

voltas = int(abs(angulo) // 360)
reduzido = angulo % 360
if reduzido < 0:
    reduzido += 360

print(f"Número de voltas: {voltas}")
print("Sentido:", "horário" if angulo < 0 else "anti-horário")
print(f"Ângulo reduzido: {reduzido}")

if 0 < reduzido < 90:
    print("1º Quadrante")
elif reduzido == 90:
    print("Entre 1º e 2º Quadrante")
elif reduzido < 180:
    print("2º Quadrante")
elif reduzido == 180:
    print("Entre 2º e 3º Quadrante")
elif reduzido < 270:
    print("3º Quadrante")
elif reduzido == 270:
    print("Entre 3º e 4º Quadrante")
else:
    print("4º Quadrante")
```

---

## 🧙 Pascal

```pascal
program QuadranteAngulo;
var
  angulo, reduzido: real;
  voltas: integer;
begin
  write('Digite o valor do ângulo (graus): ');
  readln(angulo);

  voltas := abs(trunc(angulo / 360));
  reduzido := angulo - trunc(angulo / 360) * 360;
  if reduzido < 0 then
    reduzido := reduzido + 360;

  writeln('Número de voltas: ', voltas);
  if angulo < 0 then
    writeln('Sentido: horário')
  else
    writeln('Sentido: anti-horário');

  writeln('Ângulo reduzido: ', reduzido:0:2);

  if (reduzido > 0) and (reduzido < 90) then
    writeln('1º Quadrante')
  else if reduzido = 90 then
    writeln('Entre 1º e 2º Quadrante')
  else if reduzido < 180 then
    writeln('2º Quadrante')
  else if reduzido = 180 then
    writeln('Entre 2º e 3º Quadrante')
  else if reduzido < 270 then
    writeln('3º Quadrante')
  else if reduzido = 270 then
    writeln('Entre 3º e 4º Quadrante')
  else
    writeln('4º Quadrante');
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
