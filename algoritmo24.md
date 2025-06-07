# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Convertendo Hora Real para Minutos

Neste vigésimo quarto exercício, o programa deve:

- Receber um número real representando hora e minutos (por exemplo, 4.30 representa 4 horas e 30 minutos);
- Calcular e mostrar a **hora convertida em minutos totais**;
- Lembrar que:
  - A parte inteira representa as horas;
  - A parte decimal representa os minutos (ex: `.30` → 30 minutos).

---

### 🕓 Versão 1: Conversão de Hora para Minutos
> ⏱ *Faça um programa que receba um número real representando uma hora (como 4.30) e mostre o total de minutos correspondentes.*

---

### 📏 Versão 2: Somando os Minutos do Relógio
> 🧮 *Elabore um algoritmo que interprete uma hora real digitada no formato H.MM e calcule o total de minutos decorridos desde 00:00.*

---

### ⏳ Versão 3: Calculadora de Minutos
> 📆 *Desenvolva um programa para converter uma hora com minutos representada como número real em quantidade total de minutos.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "hora_para_minutos"
var
   horaReal: real
   horas, minutos, totalMinutos: inteiro
inicio
   escreva("Digite a hora no formato H.MM (ex: 4.30): ")
   leia(horaReal)

   horas <- inteiro(horaReal)
   minutos <- inteiro((horaReal - horas) * 100)
   totalMinutos <- (horas * 60) + minutos

   escreval("Total de minutos: ", totalMinutos)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class HoraParaMinutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora no formato H.MM (ex: 4.30): ");
        double horaReal = scanner.nextDouble();

        int horas = (int) horaReal;
        int minutos = (int) ((horaReal - horas) * 100);
        int totalMinutos = (horas * 60) + minutos;

        System.out.println("Total de minutos: " + totalMinutos);
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite a hora no formato H.MM (ex: 4.30): ")
    val horaReal = readLine()!!.toDouble()

    val horas = horaReal.toInt()
    val minutos = ((horaReal - horas) * 100).toInt()
    val totalMinutos = (horas * 60) + minutos

    println("Total de minutos: $totalMinutos")
}
```

---

## 🐍 Implementação em Python

```python
hora_real = float(input("Digite a hora no formato H.MM (ex: 4.30): "))

horas = int(hora_real)
minutos = int((hora_real - horas) * 100)
total_minutos = (horas * 60) + minutos

print("Total de minutos:", total_minutos)
```

---

## 🧙 Implementação em Pascal

```pascal
program HoraParaMinutos;
var
  horaReal: real;
  horas, minutos, totalMinutos: integer;
begin
  write('Digite a hora no formato H.MM (ex: 4.30): ');
  readln(horaReal);

  horas := trunc(horaReal);
  minutos := trunc((horaReal - horas) * 100);
  totalMinutos := (horas * 60) + minutos;

  writeln('Total de minutos: ', totalMinutos);
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
