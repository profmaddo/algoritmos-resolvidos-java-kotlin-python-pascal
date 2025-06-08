# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Comparação de Datas

Neste trigésimo sétimo exercício, o programa deve:

- Receber **duas datas** fornecidas pelo usuário, compostas por:
  - Dia
  - Mês
  - Ano
- Comparar as datas e determinar qual delas é **cronologicamente maior**.
- Exibir a data mais recente.

---

### 📅 Versão 1: Desempate de Datas
> 📆 *Escreva um programa que recebe duas datas e determina qual delas é a mais recente.*

---

### 🔍 Versão 2: Comparador de Calendário
> 📊 *Compare duas datas dadas pelo usuário e mostre a data cronologicamente posterior.*

---

### 📆 Versão 3: Decisor Temporal
> 🧠 *Faça um programa que analise duas datas e informe qual vem depois no tempo.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "compara_datas"
var
   d1, m1, a1, d2, m2, a2: inteiro
inicio
   escreva("Digite a primeira data (dia mês ano): ")
   leia(d1, m1, a1)

   escreva("Digite a segunda data (dia mês ano): ")
   leia(d2, m2, a2)

   se (a1 > a2) ou (a1 = a2 e m1 > m2) ou (a1 = a2 e m1 = m2 e d1 > d2) então
      escreval("A primeira data é a mais recente.")
   senao
      escreval("A segunda data é a mais recente.")
   fimse
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class ComparaDatas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1, m1, a1, d2, m2, a2;

        System.out.print("Digite a primeira data (dia mês ano): ");
        d1 = sc.nextInt(); m1 = sc.nextInt(); a1 = sc.nextInt();

        System.out.print("Digite a segunda data (dia mês ano): ");
        d2 = sc.nextInt(); m2 = sc.nextInt(); a2 = sc.nextInt();

        if (a1 > a2 || (a1 == a2 && m1 > m2) || (a1 == a2 && m1 == m2 && d1 > d2))
            System.out.println("A primeira data é a mais recente.");
        else
            System.out.println("A segunda data é a mais recente.");
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite a primeira data (dia mês ano): ")
    val (d1, m1, a1) = readLine()!!.split(" ").map { it.toInt() }

    print("Digite a segunda data (dia mês ano): ")
    val (d2, m2, a2) = readLine()!!.split(" ").map { it.toInt() }

    if (a1 > a2 || (a1 == a2 && m1 > m2) || (a1 == a2 && m1 == m2 && d1 > d2))
        println("A primeira data é a mais recente.")
    else
        println("A segunda data é a mais recente.")
}
```

---

## 🐍 Implementação em Python

```python
print("Digite a primeira data (dia mês ano): ")
d1, m1, a1 = map(int, input().split())

print("Digite a segunda data (dia mês ano): ")
d2, m2, a2 = map(int, input().split())

if (a1 > a2) or (a1 == a2 and m1 > m2) or (a1 == a2 and m1 == m2 and d1 > d2):
    print("A primeira data é a mais recente.")
else:
    print("A segunda data é a mais recente.")
```

---

## 🧙 Implementação em Pascal

```pascal
program ComparaDatas;
var
  d1, m1, a1, d2, m2, a2: integer;
begin
  write('Digite a primeira data (dia mes ano): ');
  readln(d1, m1, a1);

  write('Digite a segunda data (dia mes ano): ');
  readln(d2, m2, a2);

  if (a1 > a2) or ((a1 = a2) and (m1 > m2)) or ((a1 = a2) and (m1 = m2) and (d1 > d2)) then
    writeln('A primeira data é a mais recente.')
  else
    writeln('A segunda data é a mais recente.');
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
