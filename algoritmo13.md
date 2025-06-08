# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Conversão de Medidas em Pés

Neste décimo terceiro exercício, o programa deve receber uma **medida em pés (ft)** e fazer as seguintes conversões:

- a) Para **polegadas**, sabendo que 1 pé = 12 polegadas;
- b) Para **jardas**, sabendo que 1 jarda = 3 pés;
- c) Para **milhas**, sabendo que 1 milha = 1760 jardas.

---

### 📏 Versão 1: Medidas Imperiais
> ✍️ *Escreva um programa que leia uma medida em pés e mostre os valores equivalentes em polegadas, jardas e milhas.*

---

### 📐 Versão 2: Linguagem Didática Neutra
> 🧮 *Desenvolva um programa que converta uma distância em pés para três unidades diferentes: polegadas, jardas e milhas. Apresente os resultados com quatro casas decimais.*

---

### 🚀 Versão 3: Estilo Desafio de Engenharia
> 🧰 *Você está desenvolvendo um conversor de medidas. Crie um algoritmo que receba uma medida em pés e exiba a equivalência em polegadas, jardas e milhas.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "conversao_medidas"
var
   pes, polegadas, jardas, milhas: real
inicio
   escreva("Digite a medida em pés: ")
   leia(pes)

   polegadas <- pes * 12
   jardas <- pes / 3
   milhas <- jardas / 1760

   escreval("Polegadas: ", polegadas)
   escreval("Jardas: ", jardas)
   escreval("Milhas: ", milhas)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class ConversaoMedidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida em pés: ");
        double pes = scanner.nextDouble();

        double polegadas = pes * 12;
        double jardas = pes / 3;
        double milhas = jardas / 1760;

        System.out.printf("Polegadas: %.4f%n", polegadas);
        System.out.printf("Jardas: %.4f%n", jardas);
        System.out.printf("Milhas: %.6f%n", milhas);
    }
}
```

**Compilação:**
```bash
javac ConversaoMedidas.java
java ConversaoMedidas
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite a medida em pés: ")
    val pes = readLine()!!.toDouble()

    val polegadas = pes * 12
    val jardas = pes / 3
    val milhas = jardas / 1760

    println("Polegadas: %.4f".format(polegadas))
    println("Jardas: %.4f".format(jardas))
    println("Milhas: %.6f".format(milhas))
}
```

**Compilação:**
```bash
kotlinc ConversaoMedidas.kt -include-runtime -d ConversaoMedidas.jar
java -jar ConversaoMedidas.jar
```

---

## 🐍 Implementação em Python

```python
pes = float(input("Digite a medida em pés: "))

polegadas = pes * 12
jardas = pes / 3
milhas = jardas / 1760

print("Polegadas: {:.4f}".format(polegadas))
print("Jardas: {:.4f}".format(jardas))
print("Milhas: {:.6f}".format(milhas))
```

**Execução:**
```bash
python3 conversao_medidas.py
```

---

## 🧙 Implementação em Pascal

```pascal
program ConversaoMedidas;
var
  pes, polegadas, jardas, milhas: real;
begin
  write('Digite a medida em pés: ');
  readln(pes);

  polegadas := pes * 12;
  jardas := pes / 3;
  milhas := jardas / 1760;

  writeln('Polegadas: ', polegadas:0:4);
  writeln('Jardas: ', jardas:0:4);
  writeln('Milhas: ', milhas:0:6);
end.
```

**Compilação:**
```bash
fpc conversao_medidas.pas
./conversao_medidas  # ou conversao_medidas.exe no Windows
```

---

## 🧠 Dica do Professor
> Este tipo de conversão é muito comum em projetos com medidas de arquitetura e engenharia. Tente incluir mais unidades como centímetros ou metros como desafio extra! ✨

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
