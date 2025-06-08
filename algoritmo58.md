# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Cálculo do salário líquido dos professores

### Versão 1 - Redação simples
Crie um programa que leia os dados dos professores de uma universidade: código, sexo e número de horas/aula dadas no mês.  
O programa deve calcular e exibir:
- o código do professor;
- o salário bruto (R$ 50,00 por hora/aula);
- o salário líquido (com desconto: 12% para homens, 57% para mulheres).

A leitura termina quando o código informado for 1212.  
Ao final, exiba também:
- a média dos salários líquidos dos professores do sexo masculino;
- a média dos salários líquidos dos professores do sexo feminino.

---

## 💬 Portugol

```portugol
algoritmo "salario_professores"
var
  codigo: inteiro
  sexo: caractere
  horas: inteiro
  bruto, liquido: real
  somaMasculino, somaFeminino: real
  contMasculino, contFeminino: inteiro
inicio
  somaMasculino <- 0
  somaFeminino <- 0
  contMasculino <- 0
  contFeminino <- 0

  escreval("Digite os dados dos professores. Código 1212 encerra.")

  repita
    escreva("Código: ")
    leia(codigo)

    se codigo <> 1212 entao
      escreva("Sexo (M/F): ")
      leia(sexo)
      escreva("Horas/aula: ")
      leia(horas)

      bruto <- horas * 50

      se sexo = "M" ou sexo = "m" entao
        liquido <- bruto * 0.88
        somaMasculino <- somaMasculino + liquido
        contMasculino <- contMasculino + 1
      senao
        liquido <- bruto * 0.43
        somaFeminino <- somaFeminino + liquido
        contFeminino <- contFeminino + 1
      fimse

      escreval("Código: ", codigo)
      escreval("Salário bruto: R$ ", bruto:0:2)
      escreval("Salário líquido: R$ ", liquido:0:2)
      escreval("-----------------------------")
    fimse
  ate codigo = 1212

  se contMasculino > 0 entao
    escreval("Média salário líquido (Homens): R$ ", (somaMasculino / contMasculino):0:2)
  fimse
  se contFeminino > 0 entao
    escreval("Média salário líquido (Mulheres): R$ ", (somaFeminino / contFeminino):0:2)
  fimse
fimalgoritmo
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    var codigo: Int
    var sexo: String
    var horas: Int
    var bruto: Double
    var liquido: Double
    var somaMasculino = 0.0
    var somaFeminino = 0.0
    var contMasculino = 0
    var contFeminino = 0

    println("Digite os dados dos professores. Código 1212 encerra.")

    do {
        print("Código: ")
        codigo = readln().toInt()

        if (codigo != 1212) {
            print("Sexo (M/F): ")
            sexo = readln()
            print("Horas/aula: ")
            horas = readln().toInt()

            bruto = horas * 50.0

            if (sexo.equals("M", ignoreCase = true)) {
                liquido = bruto * 0.88
                somaMasculino += liquido
                contMasculino++
            } else {
                liquido = bruto * 0.43
                somaFeminino += liquido
                contFeminino++
            }

            println("Código: $codigo")
            println("Salário bruto: R$ %.2f".format(bruto))
            println("Salário líquido: R$ %.2f".format(liquido))
            println("-----------------------------")
        }
    } while (codigo != 1212)

    if (contMasculino > 0)
        println("Média salário líquido (Homens): R$ %.2f".format(somaMasculino / contMasculino))
    if (contFeminino > 0)
        println("Média salário líquido (Mulheres): R$ %.2f".format(somaFeminino / contFeminino))
}


```

---

## 🐍 Implementação em Python

```python
print("Digite os dados dos professores. Código 1212 encerra.")

soma_masculino = 0
soma_feminino = 0
cont_masculino = 0
cont_feminino = 0

while True:
    codigo = int(input("Código: "))
    if codigo == 1212:
        break

    sexo = input("Sexo (M/F): ").strip().upper()
    horas = int(input("Horas/aula: "))

    bruto = horas * 50.0

    if sexo == 'M':
        liquido = bruto * 0.88
        soma_masculino += liquido
        cont_masculino += 1
    else:
        liquido = bruto * 0.43
        soma_feminino += liquido
        cont_feminino += 1

    print(f"Código: {codigo}")
    print(f"Salário bruto: R$ {bruto:.2f}")
    print(f"Salário líquido: R$ {liquido:.2f}")
    print("-----------------------------")

if cont_masculino > 0:
    print(f"Média salário líquido (Homens): R$ {soma_masculino / cont_masculino:.2f}")
if cont_feminino > 0:
    print(f"Média salário líquido (Mulheres): R$ {soma_feminino / cont_feminino:.2f}")


```

---

## 🧙 Implementação em Pascal

```pascal
program SalarioProfessores;

uses crt;

var
  codigo, horas: integer;
  sexo: char;
  bruto, liquido: real;
  somaMasculino, somaFeminino: real;
  contMasculino, contFeminino: integer;

begin
  clrscr;
  somaMasculino := 0;
  somaFeminino := 0;
  contMasculino := 0;
  contFeminino := 0;

  writeln('Digite os dados dos professores. Código 1212 encerra.');

  repeat
    write('Código: ');
    readln(codigo);

    if codigo <> 1212 then
    begin
      write('Sexo (M/F): ');
      readln(sexo);
      sexo := upcase(sexo);

      write('Horas/aula: ');
      readln(horas);

      bruto := horas * 50;

      if sexo = 'M' then
      begin
        liquido := bruto * 0.88;
        somaMasculino := somaMasculino + liquido;
        contMasculino := contMasculino + 1;
      end
      else
      begin
        liquido := bruto * 0.43;
        somaFeminino := somaFeminino + liquido;
        contFeminino := contFeminino + 1;
      end;

      writeln('Código: ', codigo);
      writeln('Salário bruto: R$ ', bruto:0:2);
      writeln('Salário líquido: R$ ', liquido:0:2);
      writeln('-----------------------------');
    end;
  until codigo = 1212;

  if contMasculino > 0 then
    writeln('Média salário líquido (Homens): R$ ', (somaMasculino / contMasculino):0:2);
  if contFeminino > 0 then
    writeln('Média salário líquido (Mulheres): R$ ', (somaFeminino / contFeminino):0:2);

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
