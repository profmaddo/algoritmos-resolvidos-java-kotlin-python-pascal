# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Cálculo de salário e produtividade por classes em uma fábrica

### Versão 1 - Redação objetiva
Em uma fábrica trabalham 15 operários (homens e mulheres). Cada trabalhador recebe um salário baseado no número de peças que fabrica por mês, de acordo com três classes:

- **Classe 1**: até 30 peças – recebe **salário mínimo**.
- **Classe 2**: de 31 a 50 peças – recebe salário mínimo + **3% por peça excedente**.
- **Classe 3**: mais de 50 peças – recebe salário mínimo + **5% por peça excedente**.

O programa deve:
- Receber o número do operário, quantidade de peças produzidas e sexo.
- Calcular e exibir:
  - o salário e o número do operário;
  - o total da folha de pagamento;
  - o total de peças produzidas;
  - a média de peças feitas por homens;
  - a média de peças feitas por mulheres;
  - o operário com **maior salário**.

---

## 💬 Portugol

```portugol
algoritmo "folha_pagamento_fabrica"
constante SALARIO_MINIMO = 1320
var
  i, pecas, totalPecas, totalHomens, totalMulheres: inteiro
  numOperario, maiorSalarioOperario: inteiro
  sexo: caractere
  salario, folhaPagamento, maiorSalario: real
  mediaHomens, mediaMulheres: real
inicio
  totalPecas <- 0
  folhaPagamento <- 0
  totalHomens <- 0
  totalMulheres <- 0
  maiorSalario <- 0

  para i de 1 ate 15 faca
    escreva("Número do operário: ")
    leia(numOperario)
    escreva("Peças fabricadas: ")
    leia(pecas)
    escreva("Sexo (M/F): ")
    leia(sexo)

    se pecas <= 30 entao
      salario <- SALARIO_MINIMO
    senao se pecas <= 50 entao
      salario <- SALARIO_MINIMO + (pecas - 30) * (SALARIO_MINIMO * 0.03)
    senao
      salario <- SALARIO_MINIMO + (pecas - 30) * (SALARIO_MINIMO * 0.05)
    fimse

    escreval("Operário ", numOperario, " - Salário: R$", salario:0:2)

    folhaPagamento <- folhaPagamento + salario
    totalPecas <- totalPecas + pecas

    se sexo = "M" entao
      totalHomens <- totalHomens + 1
      mediaHomens <- mediaHomens + pecas
    senao
      totalMulheres <- totalMulheres + 1
      mediaMulheres <- mediaMulheres + pecas
    fimse

    se salario > maiorSalario entao
      maiorSalario <- salario
      maiorSalarioOperario <- numOperario
    fimse
  fimpara

  se totalHomens > 0 entao
    mediaHomens <- mediaHomens / totalHomens
  fimse

  se totalMulheres > 0 entao
    mediaMulheres <- mediaMulheres / totalMulheres
  fimse

  escreval("Folha total: R$", folhaPagamento:0:2)
  escreval("Total de peças: ", totalPecas)
  escreval("Média peças homens: ", mediaHomens:0:2)
  escreval("Média peças mulheres: ", mediaMulheres:0:2)
  escreval("Operário com maior salário: ", maiorSalarioOperario)
fimalgoritmo
```

---

## ☕ Implementação em Java
```java
import java.util.Scanner;

public class FolhaPagamentoFabrica {

    public static void main(String[] args) {
        final double SALARIO_MINIMO = 1320.0;
        int pecas, totalPecas = 0;
        int totalHomens = 0, totalMulheres = 0;
        int numOperario = 0, maiorSalarioOperario = 0;
        char sexo;
        double salario, folhaPagamento = 0, maiorSalario = 0;
        double mediaHomens = 0, mediaMulheres = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 15; i++) {
            System.out.print("Número do operário: ");
            numOperario = scanner.nextInt();
            System.out.print("Peças fabricadas: ");
            pecas = scanner.nextInt();
            System.out.print("Sexo (M/F): ");
            sexo = scanner.next().toUpperCase().charAt(0);

            // Cálculo do salário conforme a produtividade
            if (pecas <= 30) {
                salario = SALARIO_MINIMO;
            } else if (pecas <= 50) {
                salario = SALARIO_MINIMO + (pecas - 30) * (SALARIO_MINIMO * 0.03);
            } else {
                salario = SALARIO_MINIMO + (pecas - 30) * (SALARIO_MINIMO * 0.05);
            }

            System.out.printf("Operário %d - Salário: R$ %.2f%n", numOperario, salario);

            folhaPagamento += salario;
            totalPecas += pecas;

            if (sexo == 'M') {
                totalHomens++;
                mediaHomens += pecas;
            } else {
                totalMulheres++;
                mediaMulheres += pecas;
            }

            if (salario > maiorSalario) {
                maiorSalario = salario;
                maiorSalarioOperario = numOperario;
            }
        }

        if (totalHomens > 0) {
            mediaHomens = mediaHomens / totalHomens;
        }

        if (totalMulheres > 0) {
            mediaMulheres = mediaMulheres / totalMulheres;
        }

        System.out.printf("Folha total: R$ %.2f%n", folhaPagamento);
        System.out.println("Total de peças: " + totalPecas);
        System.out.printf("Média peças homens: %.2f%n", mediaHomens);
        System.out.printf("Média peças mulheres: %.2f%n", mediaMulheres);
        System.out.println("Operário com maior salário: " + maiorSalarioOperario);

        scanner.close();
    }
}

```

**Compilação:**
```bash
javac FolhaPagamentoFabrica.java
java FolhaPagamentoFabrica
```

---

## 💙 Implementação em Kotlin
```kotlin
fun main() {
    val salarioMinimo = 1320.0
    var totalPecas = 0
    var totalHomens = 0
    var totalMulheres = 0
    var somaHomens = 0
    var somaMulheres = 0
    var folhaPagamento = 0.0
    var maiorSalario = 0.0
    var maiorSalarioOperario = 0

    for (i in 1..15) {
        print("Número do operário: ")
        val numOperario = readLine()!!.toInt()
        print("Peças fabricadas: ")
        val pecas = readLine()!!.toInt()
        print("Sexo (M/F): ")
        val sexo = readLine()!!.uppercase()

        val salario = when {
            pecas <= 30 -> salarioMinimo
            pecas <= 50 -> salarioMinimo + (pecas - 30) * (salarioMinimo * 0.03)
            else -> salarioMinimo + (pecas - 30) * (salarioMinimo * 0.05)
        }

        println("Operário $numOperario - Salário: R$ %.2f".format(salario))

        folhaPagamento += salario
        totalPecas += pecas

        if (sexo == "M") {
            totalHomens++
            somaHomens += pecas
        } else {
            totalMulheres++
            somaMulheres += pecas
        }

        if (salario > maiorSalario) {
            maiorSalario = salario
            maiorSalarioOperario = numOperario
        }
    }

    val mediaHomens = if (totalHomens > 0) somaHomens.toDouble() / totalHomens else 0.0
    val mediaMulheres = if (totalMulheres > 0) somaMulheres.toDouble() / totalMulheres else 0.0

    println("Folha total: R$ %.2f".format(folhaPagamento))
    println("Total de peças: $totalPecas")
    println("Média peças homens: %.2f".format(mediaHomens))
    println("Média peças mulheres: %.2f".format(mediaMulheres))
    println("Operário com maior salário: $maiorSalarioOperario")
}
```

**Compilação:**
```bash
kotlinc FolhaPagamentoFabrica.kt -include-runtime -d FolhaPagamentoFabrica.jar
java -jar FolhaPagamentoFabrica.jar
```

---

## 🐍 Implementação em Python
```python
salario_minimo = 1320.0
total_pecas = total_homens = total_mulheres = 0
soma_homens = soma_mulheres = 0
folha_pagamento = maior_salario = 0.0
maior_salario_operario = 0

for i in range(15):
    num_operario = int(input("Número do operário: "))
    pecas = int(input("Peças fabricadas: "))
    sexo = input("Sexo (M/F): ").upper()

    if pecas <= 30:
        salario = salario_minimo
    elif pecas <= 50:
        salario = salario_minimo + (pecas - 30) * (salario_minimo * 0.03)
    else:
        salario = salario_minimo + (pecas - 30) * (salario_minimo * 0.05)

    print(f"Operário {num_operario} - Salário: R$ {salario:.2f}")

    folha_pagamento += salario
    total_pecas += pecas

    if sexo == "M":
        total_homens += 1
        soma_homens += pecas
    else:
        total_mulheres += 1
        soma_mulheres += pecas

    if salario > maior_salario:
        maior_salario = salario
        maior_salario_operario = num_operario

media_homens = soma_homens / total_homens if total_homens else 0
media_mulheres = soma_mulheres / total_mulheres if total_mulheres else 0

print(f"Folha total: R$ {folha_pagamento:.2f}")
print(f"Total de peças: {total_pecas}")
print(f"Média peças homens: {media_homens:.2f}")
print(f"Média peças mulheres: {media_mulheres:.2f}")
print(f"Operário com maior salário: {maior_salario_operario}")
```

---

## 🧙 Implementação em Pascal
```pascal
program FolhaPagamentoFabrica;
uses crt;
var
  i, pecas, totalPecas, totalHomens, totalMulheres, numOperario, maiorSalarioOperario: integer;
  sexo: char;
  salario, folhaPagamento, maiorSalario, mediaHomens, mediaMulheres: real;
begin
  totalPecas := 0;
  folhaPagamento := 0;
  totalHomens := 0;
  totalMulheres := 0;
  maiorSalario := 0;

  for i := 1 to 15 do
  begin
    write('Número do operário: ');
    readln(numOperario);
    write('Peças fabricadas: ');
    readln(pecas);
    write('Sexo (M/F): ');
    readln(sexo);

    if pecas <= 30 then
      salario := 1320
    else if pecas <= 50 then
      salario := 1320 + (pecas - 30) * (1320 * 0.03)
    else
      salario := 1320 + (pecas - 30) * (1320 * 0.05);

    writeln('Operário ', numOperario, ' - Salário: R$ ', salario:0:2);

    folhaPagamento := folhaPagamento + salario;
    totalPecas := totalPecas + pecas;

    if (sexo = 'M') or (sexo = 'm') then
    begin
      totalHomens := totalHomens + 1;
      mediaHomens := mediaHomens + pecas;
    end
    else
    begin
      totalMulheres := totalMulheres + 1;
      mediaMulheres := mediaMulheres + pecas;
    end;

    if salario > maiorSalario then
    begin
      maiorSalario := salario;
      maiorSalarioOperario := numOperario;
    end;
  end;

  if totalHomens > 0 then
    mediaHomens := mediaHomens / totalHomens;
  if totalMulheres > 0 then
    mediaMulheres := mediaMulheres / totalMulheres;

  writeln('Folha total: R$ ', folhaPagamento:0:2);
  writeln('Total de peças: ', totalPecas);
  writeln('Média peças homens: ', mediaHomens:0:2);
  writeln('Média peças mulheres: ', mediaMulheres:0:2);
  writeln('Operário com maior salário: ', maiorSalarioOperario);
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
