# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Estatísticas de um Campeonato de Futebol

### Versão 1 - Redação clara
Desenvolva um programa para um campeonato com **cinco times**, cada um com **onze jogadores**. Para cada jogador, registre a **idade**, o **peso** e a **altura**, e ao final exiba:
- A quantidade de jogadores com menos de 18 anos.
- A média de idade dos jogadores de cada time.
- A média de altura de todos os jogadores.
- A porcentagem de jogadores com mais de 80 kg no campeonato.

### Versão 2 - Redação acadêmica
Implemente um programa que processe os dados de um campeonato de futebol composto por **5 times com 11 jogadores cada**. Para cada jogador serão informados: **idade**, **peso** e **altura**. Ao final, calcule e exiba:
- Total de jogadores com idade < 18 anos.
- Média de idade por time.
- Média de altura geral.
- Porcentagem de jogadores com peso > 80 kg.

### Versão 3 - Redação esportiva
🏟️ Em um campeonato de futebol com 5 times e 11 jogadores por equipe, crie um programa que leia **idade**, **peso** e **altura** dos atletas e mostre:
- Quantos são menores de idade.
- Qual a média de idade de cada time.
- Qual a média geral de altura.
- E a porcentagem dos que estão acima dos 80 kg. ⚽💪

---

## 💬 Portugol

```portugol
algoritmo "estatisticas_futebol"
var
  idade, peso, altura: real
  i, j, menores18, acima80kg: inteiro
  somaAltura, mediaAltura, totalJogadores: real
  somaIdadeTime: real
inicio
  menores18 <- 0
  acima80kg <- 0
  somaAltura <- 0
  totalJogadores <- 0

  para i de 1 ate 5 faca
    somaIdadeTime <- 0
    escreval("Time ", i)
    para j de 1 ate 11 faca
      escreval("Jogador ", j)
      escreva("Idade: ") ; leia(idade)
      escreva("Peso: ") ; leia(peso)
      escreva("Altura: ") ; leia(altura)

      se idade < 18 entao
        menores18 <- menores18 + 1
      fimse

      se peso > 80 entao
        acima80kg <- acima80kg + 1
      fimse

      somaAltura <- somaAltura + altura
      somaIdadeTime <- somaIdadeTime + idade
    fimpara
    escreval("Média de idade do time ", i, ": ", somaIdadeTime / 11)
  fimpara

  totalJogadores <- 5 * 11
  mediaAltura <- somaAltura / totalJogadores
  escreval("Jogadores com menos de 18 anos: ", menores18)
  escreval("Média geral de altura: ", mediaAltura)
  escreval("Porcentagem com mais de 80kg: ", (acima80kg / totalJogadores) * 100, "%")
fimalgoritmo
```

---

## ☕ Java

```java
import java.util.Scanner;

public class CampeonatoFutebol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menores18 = 0, acima80kg = 0;
        double somaAltura = 0;
        int totalJogadores = 0;

        for (int time = 1; time <= 5; time++) {
            double somaIdadeTime = 0;
            System.out.println("Time " + time);
            for (int jogador = 1; jogador <= 11; jogador++) {
                System.out.print("Jogador " + jogador + " - Idade: ");
                int idade = sc.nextInt();
                System.out.print("Peso: ");
                double peso = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();

                if (idade < 18) menores18++;
                if (peso > 80) acima80kg++;
                somaAltura += altura;
                somaIdadeTime += idade;
                totalJogadores++;
            }
            System.out.println("Média de idade do time " + time + ": " + (somaIdadeTime / 11));
        }

        System.out.println("Menores de 18: " + menores18);
        System.out.println("Média de altura: " + (somaAltura / totalJogadores));
        System.out.println("Porcentagem acima de 80kg: " + (acima80kg * 100.0 / totalJogadores) + "%");
    }
}
```

---

## 💙 Kotlin

```kotlin
fun main() {
    var menores18 = 0
    var acima80kg = 0
    var somaAltura = 0.0
    val totalJogadores = 5 * 11

    for (time in 1..5) {
        var somaIdadeTime = 0
        println("Time $time")
        for (jogador in 1..11) {
            print("Jogador $jogador - Idade: ")
            val idade = readLine()!!.toInt()
            print("Peso: ")
            val peso = readLine()!!.toDouble()
            print("Altura: ")
            val altura = readLine()!!.toDouble()

            if (idade < 18) menores18++
            if (peso > 80) acima80kg++
            somaAltura += altura
            somaIdadeTime += idade
        }
        println("Média de idade do time $time: ${somaIdadeTime / 11.0}")
    }

    println("Menores de 18: $menores18")
    println("Média de altura: ${somaAltura / totalJogadores}")
    println("Porcentagem acima de 80kg: ${acima80kg * 100.0 / totalJogadores}%")
}
```

---

## 🐍 Python

```python
menores18 = 0
acima80kg = 0
somaAltura = 0
totalJogadores = 5 * 11

for time in range(1, 6):
    somaIdadeTime = 0
    print(f"Time {time}")
    for jogador in range(1, 12):
        idade = int(input(f"Jogador {jogador} - Idade: "))
        peso = float(input("Peso: "))
        altura = float(input("Altura: "))

        if idade < 18:
            menores18 += 1
        if peso > 80:
            acima80kg += 1
        somaAltura += altura
        somaIdadeTime += idade

    print(f"Média de idade do time {time}: {somaIdadeTime / 11:.2f}")

print(f"Menores de 18: {menores18}")
print(f"Média de altura: {somaAltura / totalJogadores:.2f}")
print(f"Porcentagem acima de 80kg: {(acima80kg / totalJogadores) * 100:.2f}%")
```

---

## 🧙 Pascal

```pascal
program CampeonatoFutebol;
var
  idade, i, j, menores18, acima80kg: integer;
  peso, altura, somaAltura, somaIdade: real;
begin
  menores18 := 0;
  acima80kg := 0;
  somaAltura := 0.0;

  for i := 1 to 5 do
  begin
    somaIdade := 0.0;
    writeln('Time ', i);
    for j := 1 to 11 do
    begin
      write('Jogador ', j, ' - Idade: '); readln(idade);
      write('Peso: '); readln(peso);
      write('Altura: '); readln(altura);

      if idade < 18 then menores18 := menores18 + 1;
      if peso > 80 then acima80kg := acima80kg + 1;
      somaAltura := somaAltura + altura;
      somaIdade := somaIdade + idade;
    end;
    writeln('Média de idade do time ', i, ': ', somaIdade / 11:0:2);
  end;

  writeln('Menores de 18: ', menores18);
  writeln('Média de altura: ', somaAltura / (5 * 11):0:2);
  writeln('Porcentagem acima de 80kg: ', (acima80kg * 100.0) / (5 * 11):0:2, '%');
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
