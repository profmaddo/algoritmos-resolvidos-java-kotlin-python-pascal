# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Estatísticas de Acidentes de Trânsito em Cidades

Neste quadragésimo sétimo exercício, foi realizada uma pesquisa em **cinco cidades brasileiras** para levantar estatísticas sobre **acidentes de trânsito**. Para cada cidade, foram coletados os seguintes dados:
- Código da cidade;
- Número de veículos de passeio;
- Número de acidentes de trânsito com vítimas.

Com base nesses dados, o programa deve determinar:

---

### ✅ O que deve ser calculado:

a) Qual o **maior** e o **menor índice de acidentes de trânsito**, e a **cidade correspondente** a cada um;

b) Qual a **média de veículos de passeio** entre as cinco cidades;

c) Qual a **média de acidentes** nas cidades com **menos de 10.000 veículos de passeio**.

---

### 💡 Versão 1: Estrutura direta com vetores simples

### 💡 Versão 2: Uso de estrutura de registros (objetos ou structs)

### 💡 Versão 3: Solução com listas e funções reutilizáveis

---

## 💬 Portugol

```portugol
algoritmo "estatistica_acidentes"
var
  codigo, veiculos, acidentes, i: inteiro
  somaVeiculos, somaAcidentesMenor10k, contadorMenor10k: inteiro
  maiorIndice, menorIndice, cidadeMaior, cidadeMenor: inteiro
inicio
  somaVeiculos <- 0
  somaAcidentesMenor10k <- 0
  contadorMenor10k <- 0
  maiorIndice <- -1
  menorIndice <- 1000000

  para i de 1 ate 5 faca
    escreva("Código da cidade: ")
    leia(codigo)
    escreva("Nº de veículos: ")
    leia(veiculos)
    escreva("Nº de acidentes: ")
    leia(acidentes)

    somaVeiculos <- somaVeiculos + veiculos

    se acidentes > maiorIndice entao
      maiorIndice <- acidentes
      cidadeMaior <- codigo
    fimse

    se acidentes < menorIndice entao
      menorIndice <- acidentes
      cidadeMenor <- codigo
    fimse

    se veiculos < 10000 entao
      somaAcidentesMenor10k <- somaAcidentesMenor10k + acidentes
      contadorMenor10k <- contadorMenor10k + 1
    fimse
  fimpara

  escreval("Maior índice: ", maiorIndice, " - Cidade: ", cidadeMaior)
  escreval("Menor índice: ", menorIndice, " - Cidade: ", cidadeMenor)
  escreval("Média de veículos: ", somaVeiculos / 5)
  se contadorMenor10k > 0 entao
    escreval("Média acidentes (menos de 10.000 veículos): ", somaAcidentesMenor10k / contadorMenor10k)
  senão
    escreval("Nenhuma cidade com menos de 10.000 veículos.")
  fimse
fimalgoritmo
```

---

## ☕ Java

```java
import java.util.Scanner;

public class EstatisticaAcidentes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, veiculos, acidentes;
        int somaVeiculos = 0, somaAcidentesMenor10k = 0, contMenor10k = 0;
        int maiorIndice = -1, menorIndice = Integer.MAX_VALUE;
        int cidadeMaior = 0, cidadeMenor = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Código da cidade: ");
            codigo = sc.nextInt();
            System.out.print("Nº de veículos: ");
            veiculos = sc.nextInt();
            System.out.print("Nº de acidentes: ");
            acidentes = sc.nextInt();

            somaVeiculos += veiculos;

            if (acidentes > maiorIndice) {
                maiorIndice = acidentes;
                cidadeMaior = codigo;
            }

            if (acidentes < menorIndice) {
                menorIndice = acidentes;
                cidadeMenor = codigo;
            }

            if (veiculos < 10000) {
                somaAcidentesMenor10k += acidentes;
                contMenor10k++;
            }
        }

        System.out.println("Maior índice: " + maiorIndice + " - Cidade: " + cidadeMaior);
        System.out.println("Menor índice: " + menorIndice + " - Cidade: " + cidadeMenor);
        System.out.println("Média de veículos: " + (somaVeiculos / 5));

        if (contMenor10k > 0)
            System.out.println("Média acidentes (menos de 10.000 veículos): " + (somaAcidentesMenor10k / contMenor10k));
        else
            System.out.println("Nenhuma cidade com menos de 10.000 veículos.");
    }
}
```

---

## 💙 Kotlin

```kotlin
fun main() {
    var somaVeiculos = 0
    var somaAcidentesMenor10k = 0
    var contMenor10k = 0
    var maiorIndice = -1
    var menorIndice = Int.MAX_VALUE
    var cidadeMaior = 0
    var cidadeMenor = 0

    repeat(5) {
        print("Código da cidade: ")
        val codigo = readLine()!!.toInt()
        print("Nº de veículos: ")
        val veiculos = readLine()!!.toInt()
        print("Nº de acidentes: ")
        val acidentes = readLine()!!.toInt()

        somaVeiculos += veiculos

        if (acidentes > maiorIndice) {
            maiorIndice = acidentes
            cidadeMaior = codigo
        }

        if (acidentes < menorIndice) {
            menorIndice = acidentes
            cidadeMenor = codigo
        }

        if (veiculos < 10000) {
            somaAcidentesMenor10k += acidentes
            contMenor10k++
        }
    }

    println("Maior índice: $maiorIndice - Cidade: $cidadeMaior")
    println("Menor índice: $menorIndice - Cidade: $cidadeMenor")
    println("Média de veículos: ${somaVeiculos / 5}")
    if (contMenor10k > 0)
        println("Média acidentes (menos de 10.000 veículos): ${somaAcidentesMenor10k / contMenor10k}")
    else
        println("Nenhuma cidade com menos de 10.000 veículos.")
}
```

---

## 🐍 Python

```python
soma_veiculos = 0
soma_acidentes_menor10k = 0
cont_menor10k = 0
maior_indice = -1
menor_indice = float('inf')
cidade_maior = cidade_menor = 0

for i in range(5):
    codigo = int(input("Código da cidade: "))
    veiculos = int(input("Nº de veículos: "))
    acidentes = int(input("Nº de acidentes: "))

    soma_veiculos += veiculos

    if acidentes > maior_indice:
        maior_indice = acidentes
        cidade_maior = codigo

    if acidentes < menor_indice:
        menor_indice = acidentes
        cidade_menor = codigo

    if veiculos < 10000:
        soma_acidentes_menor10k += acidentes
        cont_menor10k += 1

print(f"Maior índice: {maior_indice} - Cidade: {cidade_maior}")
print(f"Menor índice: {menor_indice} - Cidade: {cidade_menor}")
print(f"Média de veículos: {soma_veiculos / 5}")
if cont_menor10k > 0:
    print(f"Média acidentes (<10.000 veículos): {soma_acidentes_menor10k / cont_menor10k}")
else:
    print("Nenhuma cidade com menos de 10.000 veículos.")
```

---

## 🧙 Pascal

```pascal
program EstatisticaAcidentes;
uses sysutils;
var
  codigo, veiculos, acidentes, i: integer;
  somaVeiculos, somaAcidentesMenor10k, contMenor10k: integer;
  maiorIndice, menorIndice, cidadeMaior, cidadeMenor: integer;
begin
  somaVeiculos := 0;
  somaAcidentesMenor10k := 0;
  contMenor10k := 0;
  maiorIndice := -1;
  menorIndice := 1000000;

  for i := 1 to 5 do
  begin
    write('Código da cidade: '); readln(codigo);
    write('Nº de veículos: '); readln(veiculos);
    write('Nº de acidentes: '); readln(acidentes);

    somaVeiculos := somaVeiculos + veiculos;

    if acidentes > maiorIndice then
    begin
      maiorIndice := acidentes;
      cidadeMaior := codigo;
    end;

    if acidentes < menorIndice then
    begin
      menorIndice := acidentes;
      cidadeMenor := codigo;
    end;

    if veiculos < 10000 then
    begin
      somaAcidentesMenor10k := somaAcidentesMenor10k + acidentes;
      contMenor10k := contMenor10k + 1;
    end;
  end;

  writeln('Maior índice: ', maiorIndice, ' - Cidade: ', cidadeMaior);
  writeln('Menor índice: ', menorIndice, ' - Cidade: ', cidadeMenor);
  writeln('Média de veículos: ', somaVeiculos div 5);
  if contMenor10k > 0 then
    writeln('Média acidentes (<10.000 veículos): ', somaAcidentesMenor10k div contMenor10k)
  else
    writeln('Nenhuma cidade com menos de 10.000 veículos.');
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
