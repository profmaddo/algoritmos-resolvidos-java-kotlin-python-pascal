# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Separando Parte Inteira, Fracionária e Arredondando um Número

Neste vigésimo terceiro exercício, o programa deve:

- Receber um número real digitado pelo usuário;
- Calcular e mostrar:
  a) A **parte inteira** do número;
  b) A **parte fracionária** (diferença entre o número e sua parte inteira);
  c) O **arredondamento** do número para o inteiro mais próximo.

---

### 🧮 Versão 1: Separando Números
> 🔢 *Crie um programa que leia um número real e exiba sua parte inteira, fracionária e o número arredondado.*

---

### 📏 Versão 2: Explorando a Natureza dos Reais
> 📐 *Faça um algoritmo que leia um número real e demonstre suas características numéricas: inteiro, fração e valor arredondado.*

---

### 🔬 Versão 3: Analisador de Casas Decimais
> 🧪 *Implemente um programa para analisar a estrutura de um número real e exibir seu comportamento ao arredondar e extrair partes.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "partes_numero_real"
var
   numero, parteFracionaria: real
   parteInteira, arredondado: inteiro
inicio
   escreva("Digite um número real: ")
   leia(numero)

   parteInteira <- inteiro(numero)
   parteFracionaria <- numero - parteInteira
   arredondado <- arred(num)

   escreval("Parte inteira: ", parteInteira)
   escreval("Parte fracionária: ", parteFracionaria)
   escreval("Número arredondado: ", arredondado)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class PartesNumeroReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();

        int parteInteira = (int) numero;
        double parteFracionaria = numero - parteInteira;
        long arredondado = Math.round(numero);

        System.out.println("Parte inteira: " + parteInteira);
        System.out.println("Parte fracionária: " + parteFracionaria);
        System.out.println("Número arredondado: " + arredondado);
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite um número real: ")
    val numero = readLine()!!.toDouble()

    val parteInteira = numero.toInt()
    val parteFracionaria = numero - parteInteira
    val arredondado = Math.round(numero)

    println("Parte inteira: $parteInteira")
    println("Parte fracionária: $parteFracionaria")
    println("Número arredondado: $arredondado")
}
```

---

## 🐍 Implementação em Python

```python
numero = float(input("Digite um número real: "))

parte_inteira = int(numero)
parte_fracionaria = numero - parte_inteira
arredondado = round(numero)

print("Parte inteira:", parte_inteira)
print("Parte fracionária:", parte_fracionaria)
print("Número arredondado:", arredondado)
```

---

## 🧙 Implementação em Pascal

```pascal
program PartesNumero;
uses Math;
var
  numero, fracionaria: real;
  inteira, arredondado: integer;
begin
  write('Digite um número real: ');
  readln(numero);

  inteira := trunc(numero);
  fracionaria := numero - inteira;
  arredondado := round(numero);

  writeln('Parte inteira: ', inteira);
  writeln('Parte fracionária: ', fracionaria:0:4);
  writeln('Número arredondado: ', arredondado);
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
