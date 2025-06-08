# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Tabela de fatoriais com base em múltiplos números

Neste quadragésimo sexto exercício, você criará um programa que:
- Leia um número inteiro e positivo **N**, indicando a quantidade de valores que serão digitados.
- Para cada um dos **N** valores, calcule e mostre seu fatorial.
- Exiba uma tabela com duas colunas: número digitado e seu fatorial.

---

### 💡 Versão 1: Leitura em sequência com `for`
> 🔄 *Processa N entradas e exibe tabela com laço direto.*

### 💡 Versão 2: Armazena os valores numa lista
> 📋 *Recebe os dados antes, processa depois e exibe em ordem.*

### 💡 Versão 3: Leitura com `while` e contagem manual
> ⏳ *Exercício prático com controle manual de laços.*

---

## 💬 Portugol

```portugol
algoritmo "tabela_fatoriais"
var
   N, i, j, valor, fatorial: inteiro
inicio
   escreva("Quantos números serão digitados? ")
   leia(N)

   para i de 1 ate N faca
      escreva("Digite o ", i, "º número: ")
      leia(valor)

      fatorial <- 1
      para j de 1 ate valor faca
         fatorial <- fatorial * j
      fimpara

      escreval("Número: ", valor, " - Fatorial: ", fatorial)
   fimpara
fimalgoritmo
```

---

## ☕ Java

```java
import java.util.Scanner;

public class TabelaFatoriais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números serão digitados? ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int valor = sc.nextInt();
            long fatorial = 1;

            for (int j = 1; j <= valor; j++) {
                fatorial *= j;
            }

            System.out.println("Número: " + valor + " - Fatorial: " + fatorial);
        }
    }
}
```

---

## 💙 Kotlin

```kotlin
fun main() {
    print("Quantos números serão digitados? ")
    val N = readLine()!!.toInt()

    for (i in 1..N) {
        print("Digite o $iº número: ")
        val valor = readLine()!!.toInt()
        var fatorial = 1L

        for (j in 1..valor) {
            fatorial *= j
        }

        println("Número: $valor - Fatorial: $fatorial")
    }
}
```

---

## 🐍 Python

```python
N = int(input("Quantos números serão digitados? "))

for i in range(1, N + 1):
    valor = int(input(f"Digite o {i}º número: "))
    fatorial = 1
    for j in range(1, valor + 1):
        fatorial *= j
    print(f"Número: {valor} - Fatorial: {fatorial}")
```

---

## 🧙 Pascal

```pascal
program TabelaFatoriais;
uses sysutils;
var
  N, i, j, valor, fatorial: integer;
begin
  write('Quantos números serão digitados? ');
  readln(N);

  for i := 1 to N do
  begin
    write('Digite o ', i, 'º número: ');
    readln(valor);
    fatorial := 1;
    for j := 1 to valor do
      fatorial := fatorial * j;
    writeln('Número: ', valor, ' - Fatorial: ', fatorial);
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
