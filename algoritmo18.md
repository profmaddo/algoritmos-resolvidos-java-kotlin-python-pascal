# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Consumo de Ração por Gatos

Neste décimo oitavo exercício, o programa deve:

- Receber o **peso do saco de ração (em quilos)**;
- Receber a **quantidade de ração fornecida diariamente a cada gato (em gramas)**;
- Calcular o total de ração consumida por dois gatos durante cinco dias;
- Calcular e mostrar quanto restará de ração no saco após esse período (em quilos).

---

### 🐱 Versão 1: Dois Gatinhos Famintos
> 🐾 *Pedro comprou um saco de ração e fornece diariamente ração para dois gatos. Crie um programa que calcule quanto restará no saco após 5 dias de alimentação.*

---

### 🐾 Versão 2: Linguagem Didática e Neutra
> 📦 *Faça um algoritmo que leia o peso do saco de ração (em kg) e a quantidade diária consumida por dois gatos (em gramas). Mostre quanto restará de ração após 5 dias.*

---

### 🧮 Versão 3: Estilo Controle de Estoque Pet
> 🐕‍🦺 *Você está desenvolvendo um sistema para controle de estoque de ração. Calcule o consumo diário de dois gatos por 5 dias e mostre o que restará no saco de ração.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "consumo_racao_gatos"
var
   pesoSacoKg, qtdGatoGr, totalConsumidoGr, restanteKg: real
inicio
   escreva("Digite o peso do saco de ração (kg): ")
   leia(pesoSacoKg)

   escreva("Digite a quantidade de ração diária por gato (g): ")
   leia(qtdGatoGr)

   totalConsumidoGr <- 2 * qtdGatoGr * 5
   restanteKg <- pesoSacoKg - (totalConsumidoGr / 1000)

   escreval("Após 5 dias restará ", restanteKg, " kg de ração no saco.")
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class ConsumoRacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso do saco de ração (kg): ");
        double pesoSacoKg = scanner.nextDouble();

        System.out.print("Digite a quantidade de ração diária por gato (g): ");
        double qtdGatoGr = scanner.nextDouble();

        double totalConsumidoGr = 2 * qtdGatoGr * 5;
        double restanteKg = pesoSacoKg - (totalConsumidoGr / 1000);

        System.out.printf("Após 5 dias restará %.2f kg de ração no saco.%n", restanteKg);
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o peso do saco de ração (kg): ")
    val pesoSacoKg = readLine()!!.toDouble()

    print("Digite a quantidade de ração diária por gato (g): ")
    val qtdGatoGr = readLine()!!.toDouble()

    val totalConsumidoGr = 2 * qtdGatoGr * 5
    val restanteKg = pesoSacoKg - (totalConsumidoGr / 1000)

    println("Após 5 dias restará %.2f kg de ração no saco.".format(restanteKg))
}
```

---

## 🐍 Implementação em Python

```python
peso_saco_kg = float(input("Digite o peso do saco de ração (kg): "))
qtd_gato_gr = float(input("Digite a quantidade de ração diária por gato (g): "))

total_consumido_gr = 2 * qtd_gato_gr * 5
restante_kg = peso_saco_kg - (total_consumido_gr / 1000)

print("Após 5 dias restará {:.2f} kg de ração no saco.".format(restante_kg))
```

---

## 🧙 Implementação em Pascal

```pascal
program ConsumoRacao;
var
  pesoSacoKg, qtdGatoGr, totalConsumidoGr, restanteKg: real;
begin
  write('Digite o peso do saco de ração (kg): ');
  readln(pesoSacoKg);

  write('Digite a quantidade de ração diária por gato (g): ');
  readln(qtdGatoGr);

  totalConsumidoGr := 2 * qtdGatoGr * 5;
  restanteKg := pesoSacoKg - (totalConsumidoGr / 1000);

  writeln('Após 5 dias restará ', restanteKg:0:2, ' kg de ração no saco.');
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
