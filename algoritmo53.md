# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Cálculo do índice de mortalidade infantil

### Versão 1 - Redação direta
Foi realizada uma pesquisa para calcular o índice de mortalidade infantil em determinado período. Para isso, é necessário:

- Informar o número total de crianças nascidas.
- Informar o sexo (M ou F) e o tempo de vida (em meses) de cada criança.
- Com base nesses dados, o programa deve calcular:
  - A porcentagem de crianças do sexo **feminino** que morreram no período;
  - A porcentagem de crianças do sexo **masculino** que morreram no período;
  - A porcentagem de crianças que viveram **até 24 meses**.

---

## 💬 Portugol

```portugol
algoritmo "indice_mortalidade_infantil"
var
  i, total, vida, mortesF, mortesM, ate24, totalF, totalM: inteiro
  sexo: caractere
  percF, percM, perc24: real
inicio
  escreva("Informe o número de crianças nascidas: ")
  leia(total)

  mortesF <- 0
  mortesM <- 0
  ate24 <- 0
  totalF <- 0
  totalM <- 0

  para i de 1 ate total faca
    escreva("Sexo da criança (M/F): ")
    leia(sexo)
    escreva("Tempo de vida em meses: ")
    leia(vida)

    se sexo = "F" entao
      totalF <- totalF + 1
      se vida = 0 entao
        mortesF <- mortesF + 1
      fimse
    senao
      totalM <- totalM + 1
      se vida = 0 entao
        mortesM <- mortesM + 1
      fimse
    fimse

    se vida <= 24 entao
      ate24 <- ate24 + 1
    fimse
  fimpara

  se totalF > 0 entao
    percF <- (mortesF * 100.0) / totalF
  fimse
  se totalM > 0 entao
    percM <- (mortesM * 100.0) / totalM
  fimse
  se total > 0 entao
    perc24 <- (ate24 * 100.0) / total
  fimse

  escreval("Percentual de mortes femininas: ", percF:0:2, "%")
  escreval("Percentual de mortes masculinas: ", percM:0:2, "%")
  escreval("Percentual de crianças com até 24 meses de vida: ", perc24:0:2, "%")
fimalgoritmo
```
---
## ☕ Implementação em Java
```java
import java.util.Scanner;

public class IndiceMortalidadeInfantil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total, vida, mortesF = 0, mortesM = 0, ate24 = 0, totalF = 0, totalM = 0;

        System.out.print("Informe o número de crianças nascidas: ");
        total = scanner.nextInt();

        for (int i = 1; i <= total; i++) {
            System.out.print("Sexo da criança (M/F): ");
            String sexo = scanner.next();
            System.out.print("Tempo de vida em meses: ");
            vida = scanner.nextInt();

            if (sexo.equalsIgnoreCase("F")) {
                totalF++;
                if (vida == 0) mortesF++;
            } else {
                totalM++;
                if (vida == 0) mortesM++;
            }

            if (vida <= 24) ate24++;
        }

        double percF = totalF > 0 ? (mortesF * 100.0) / totalF : 0;
        double percM = totalM > 0 ? (mortesM * 100.0) / totalM : 0;
        double perc24 = total > 0 ? (ate24 * 100.0) / total : 0;

        System.out.printf("Percentual de mortes femininas: %.2f%%
", percF);
        System.out.printf("Percentual de mortes masculinas: %.2f%%
", percM);
        System.out.printf("Percentual de crianças com até 24 meses: %.2f%%
", perc24);
    }
}
```

---

# 💙 Implementação em Kotlin
```kotlin
fun main() {
    var mortesF = 0
    var mortesM = 0
    var ate24 = 0
    var totalF = 0
    var totalM = 0

    print("Informe o número de crianças nascidas: ")
    val total = readLine()?.toIntOrNull() ?: 0

    for (i in 1..total) {
        print("Sexo da criança (M/F): ")
        val sexo = readLine()?.uppercase() ?: "M"

        print("Tempo de vida em meses: ")
        val vida = readLine()?.toIntOrNull() ?: 0

        if (sexo == "F") {
            totalF++
            if (vida == 0) mortesF++
        } else {
            totalM++
            if (vida == 0) mortesM++
        }

        if (vida <= 24) {
            ate24++
        }
    }

    val percF = if (totalF > 0) (mortesF * 100.0) / totalF else 0.0
    val percM = if (totalM > 0) (mortesM * 100.0) / totalM else 0.0
    val perc24 = if (total > 0) (ate24 * 100.0) / total else 0.0

    println("Percentual de mortes femininas: %.2f%%".format(percF))
    println("Percentual de mortes masculinas: %.2f%%".format(percM))
    println("Percentual de crianças com até 24 meses de vida: %.2f%%".format(perc24))
}
```
---

## 🐍 Implementação em Python
```python
# Programa: índice de mortalidade infantil

total = int(input("Informe o número de crianças nascidas: "))

mortesF = 0
mortesM = 0
ate24 = 0
totalF = 0
totalM = 0

for i in range(1, total + 1):
    sexo = input("Sexo da criança (M/F): ").strip().upper()
    vida = int(input("Tempo de vida em meses: "))

    if sexo == 'F':
        totalF += 1
        if vida == 0:
            mortesF += 1
    else:
        totalM += 1
        if vida == 0:
            mortesM += 1

    if vida <= 24:
        ate24 += 1

# Cálculo dos percentuais
percF = (mortesF * 100.0) / totalF if totalF > 0 else 0
percM = (mortesM * 100.0) / totalM if totalM > 0 else 0
perc24 = (ate24 * 100.0) / total if total > 0 else 0

# Resultados
print(f"Percentual de mortes femininas: {percF:.2f}%")
print(f"Percentual de mortes masculinas: {percM:.2f}%")
print(f"Percentual de crianças com até 24 meses de vida: {perc24:.2f}%")
```
---
## 🧙 Implementação em Pascal
```pascal
program IndiceMortalidadeInfantil;

uses crt;

var
  i, total, vida, mortesF, mortesM, ate24, totalF, totalM: integer;
  sexo: char;
  percF, percM, perc24: real;

begin
  clrscr;
  write('Informe o número de crianças nascidas: ');
  readln(total);

  mortesF := 0;
  mortesM := 0;
  ate24 := 0;
  totalF := 0;
  totalM := 0;

  for i := 1 to total do
  begin
    write('Sexo da criança (M/F): ');
    readln(sexo);
    sexo := upcase(sexo);
    write('Tempo de vida em meses: ');
    readln(vida);

    if sexo = 'F' then
    begin
      totalF := totalF + 1;
      if vida = 0 then
        mortesF := mortesF + 1;
    end
    else
    begin
      totalM := totalM + 1;
      if vida = 0 then
        mortesM := mortesM + 1;
    end;

    if vida <= 24 then
      ate24 := ate24 + 1;
  end;

  if totalF > 0 then
    percF := (mortesF * 100.0) / totalF
  else
    percF := 0;

  if totalM > 0 then
    percM := (mortesM * 100.0) / totalM
  else
    percM := 0;

  if total > 0 then
    perc24 := (ate24 * 100.0) / total
  else
    perc24 := 0;

  writeln;
  writeln('Percentual de mortes femininas: ', percF:0:2, '%');
  writeln('Percentual de mortes masculinas: ', percM:0:2, '%');
  writeln('Percentual de criancas com até 24 meses de vida: ', perc24:0:2, '%');

  readln;
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
