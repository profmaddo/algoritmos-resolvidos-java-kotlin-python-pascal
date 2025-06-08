# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Duração de um Jogo

Neste trigésimo oitavo exercício, o programa deve:

- Receber a **hora de início** e a **hora de término** de um jogo (formadas por dois inteiros: hora e minuto).
- Calcular e mostrar a **duração total** do jogo (em horas e minutos).
- Considerar que o jogo pode ultrapassar a meia-noite, mas sempre terá no máximo 24 horas.

---

### 🕹️ Versão 1: Duração Simples de Jogo
> ⏱️ *Crie um programa que calcule o tempo de duração de uma partida com base nas horas e minutos iniciais e finais.*

---

### 🎮 Versão 2: Cálculo Preciso de Partidas
> 🕰️ *Receba a hora de início e fim de um jogo e mostre quanto tempo ele durou, mesmo que ultrapasse a meia-noite.*

---

### ⏳ Versão 3: Jogo que Vira a Madrugada
> 🌙 *Implemente a lógica que determina a duração total de um jogo, mesmo que comece em um dia e termine no outro.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "duracao_jogo"
var
   hora_inicio, minuto_inicio, hora_fim, minuto_fim: inteiro
   total_min_inicio, total_min_fim, duracao_min, duracao_h, duracao_m: inteiro
inicio
   escreva("Hora e minuto de início: ")
   leia(hora_inicio, minuto_inicio)

   escreva("Hora e minuto de término: ")
   leia(hora_fim, minuto_fim)

   total_min_inicio <- hora_inicio * 60 + minuto_inicio
   total_min_fim <- hora_fim * 60 + minuto_fim

   se total_min_fim < total_min_inicio então
      total_min_fim <- total_min_fim + 1440
   fimse

   duracao_min <- total_min_fim - total_min_inicio
   duracao_h <- duracao_min div 60
   duracao_m <- duracao_min mod 60

   escreval("Duração do jogo: ", duracao_h, "h ", duracao_m, "min")
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class DuracaoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hi, mi, hf, mf;

        System.out.print("Hora e minuto de início: ");
        hi = sc.nextInt(); mi = sc.nextInt();

        System.out.print("Hora e minuto de término: ");
        hf = sc.nextInt(); mf = sc.nextInt();

        int inicio = hi * 60 + mi;
        int fim = hf * 60 + mf;

        if (fim < inicio)
            fim += 24 * 60;

        int duracao = fim - inicio;
        System.out.printf("Duração do jogo: %dh %dmin%n", duracao / 60, duracao % 60);
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Hora e minuto de início: ")
    val (hi, mi) = readLine()!!.split(" ").map { it.toInt() }

    print("Hora e minuto de término: ")
    val (hf, mf) = readLine()!!.split(" ").map { it.toInt() }

    var inicio = hi * 60 + mi
    var fim = hf * 60 + mf

    if (fim < inicio) fim += 1440

    val duracao = fim - inicio
    println("Duração do jogo: ${duracao / 60}h ${duracao % 60}min")
}
```

---

## 🐍 Implementação em Python

```python
hi, mi = map(int, input("Hora e minuto de início: ").split())
hf, mf = map(int, input("Hora e minuto de término: ").split())

inicio = hi * 60 + mi
fim = hf * 60 + mf

if fim < inicio:
    fim += 24 * 60

duracao = fim - inicio
print(f"Duração do jogo: {duracao // 60}h {duracao % 60}min")
```

---

## 🧙 Implementação em Pascal

```pascal
program DuracaoJogo;
var
  hi, mi, hf, mf: integer;
  inicio, fim, duracao: integer;
begin
  write('Hora e minuto de início: ');
  readln(hi, mi);
  write('Hora e minuto de término: ');
  readln(hf, mf);

  inicio := hi * 60 + mi;
  fim := hf * 60 + mf;

  if fim < inicio then
    fim := fim + 1440;

  duracao := fim - inicio;
  writeln('Duração do jogo: ', duracao div 60, 'h ', duracao mod 60, 'min');
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
