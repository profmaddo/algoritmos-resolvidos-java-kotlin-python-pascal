# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Cálculo de salário com aumento progressivo

Neste quadragésimo quarto exercício, você irá criar um programa para calcular o salário atual de um funcionário que foi contratado em 2010 com R$ 3.000,00 e passou a receber aumentos anuais, conforme:

- 🏁 Em 2011: aumento de 4,25%.
- 🔁 A partir de 2012: o percentual de aumento dobra em relação ao ano anterior.
- 🎯 O objetivo é saber qual o **salário atual** (considerando o ano de execução do programa como o atual).

---

### 💡 Versão 1: Lógica de repetição baseada em anos
> 📅 *Calcula o aumento ano a ano até o presente.*

### 💡 Versão 2: Simulação com laço `while`
> 🔄 *Controla os anos e o percentual com repetição.*

### 💡 Versão 3: Percentuais armazenados numa lista ou dicionário
> 📋 *Organiza os dados para simulação ou debug.*

---

## 💬 Portugol

```portugol
algoritmo "salario_aumento_progressivo"
var
   ano: inteiro
   salario, percentual: real
inicio
   salario <- 3000
   percentual <- 4.25

   para ano de 2011 ate 2025 faca
      salario <- salario + (salario * percentual / 100)
      percentual <- percentual * 2
   fimpara

   escreval("Salário atual em 2025: R$", salario)
fimalgoritmo
```

---

## ☕ Java

```java
public class SalarioProgressivo {
    public static void main(String[] args) {
        double salario = 3000.0;
        double percentual = 4.25;

        for (int ano = 2011; ano <= 2025; ano++) {
            salario += salario * (percentual / 100);
            percentual *= 2;
        }

        System.out.printf("Salário atual em 2025: R$ %.2f\n", salario);
    }
}
```

---

## 💙 Kotlin

```kotlin
fun main() {
    var salario = 3000.0
    var percentual = 4.25

    for (ano in 2011..2025) {
        salario += salario * (percentual / 100)
        percentual *= 2
    }

    println("Salário atual em 2025: R$ %.2f".format(salario))
}
```

---

## 🐍 Python

```python
salario = 3000.0
percentual = 4.25

for ano in range(2011, 2026):
    salario += salario * (percentual / 100)
    percentual *= 2

print(f"Salário atual em 2025: R$ {salario:.2f}")
```

---

## 🧙 Pascal

```pascal
program SalarioProgressivo;
uses sysutils;
var
  salario, percentual: real;
  ano: integer;
begin
  salario := 3000.0;
  percentual := 4.25;

  for ano := 2011 to 2025 do
  begin
    salario := salario + (salario * percentual / 100);
    percentual := percentual * 2;
  end;

  writeln('Salário atual em 2025: R$ ', FormatFloat('0.00', salario));
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
