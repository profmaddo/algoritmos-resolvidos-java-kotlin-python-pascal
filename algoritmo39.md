# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Aumento Salarial por Cargo

Neste trigésimo nono exercício, o programa deve:

- Receber o **código** de um cargo e o **salário atual** de um funcionário.
- Calcular e mostrar:
  - O **cargo correspondente**.
  - O **valor do aumento**.
  - O **novo salário**.

| Código | Cargo                | Percentual de Aumento |
|--------|----------------------|------------------------|
| 1      | Programador Júnior   | 50%                   |
| 2      | Analista de Sistemas | 35%                   |
| 3      | Tech Leader          | 20%                   |
| 4      | Analista de Redes    | 15%                   |
| 5      | Scrum Master         | 0%                    |

---

### 💼 Versão 1: Atualização Salarial por Cargo
> 💰 *Informe o código do cargo e o salário para calcular o aumento com base na função.*

---

### 🧾 Versão 2: Cargos e Reajustes
> 🧮 *O programa deve determinar o novo salário a partir de um código de cargo específico.*

---

### 🧠 Versão 3: Cálculo de Reajuste por Código
> 📈 *Com base no código do cargo, descubra o novo salário após aplicar o reajuste.*

---

## 💬 Portugol (pseudocódigo padrão)

```portugol
algoritmo "aumento_salarial"
var
   codigo: inteiro
   salario, aumento, novo_salario: real
inicio
   escreva("Digite o código do cargo (1 a 5): ")
   leia(codigo)
   escreva("Digite o salário atual: ")
   leia(salario)

   escolha codigo
      caso 1:
         aumento <- salario * 0.5
         escreval("Cargo: Programador Júnior")
      caso 2:
         aumento <- salario * 0.35
         escreval("Cargo: Analista de Sistemas")
      caso 3:
         aumento <- salario * 0.2
         escreval("Cargo: Tech Leader")
      caso 4:
         aumento <- salario * 0.15
         escreval("Cargo: Analista de Redes")
      caso 5:
         aumento <- 0
         escreval("Cargo: Scrum Master")
   fimescolha

   novo_salario <- salario + aumento

   escreval("Aumento: R$", aumento)
   escreval("Novo salário: R$", novo_salario)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.util.Scanner;

public class AumentoSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo;
        double salario, aumento = 0;
        String cargo = "";

        System.out.print("Digite o código do cargo (1 a 5): ");
        codigo = sc.nextInt();

        System.out.print("Digite o salário atual: ");
        salario = sc.nextDouble();

        switch (codigo) {
            case 1:
                cargo = "Programador Júnior";
                aumento = salario * 0.5;
                break;
            case 2:
                cargo = "Analista de Sistemas";
                aumento = salario * 0.35;
                break;
            case 3:
                cargo = "Tech Leader";
                aumento = salario * 0.2;
                break;
            case 4:
                cargo = "Analista de Redes";
                aumento = salario * 0.15;
                break;
            case 5:
                cargo = "Scrum Master";
                aumento = 0;
                break;
        }

        System.out.println("Cargo: " + cargo);
        System.out.println("Aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + (salario + aumento));
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
fun main() {
    print("Digite o código do cargo (1 a 5): ")
    val codigo = readLine()!!.toInt()

    print("Digite o salário atual: ")
    val salario = readLine()!!.toDouble()

    val (cargo, aumento) = when (codigo) {
        1 -> "Programador Júnior" to salario * 0.5
        2 -> "Analista de Sistemas" to salario * 0.35
        3 -> "Tech Leader" to salario * 0.2
        4 -> "Analista de Redes" to salario * 0.15
        5 -> "Scrum Master" to 0.0
        else -> "Cargo Inválido" to 0.0
    }

    println("Cargo: $cargo")
    println("Aumento: R$ $aumento")
    println("Novo salário: R$ ${salario + aumento}")
}
```

---

## 🐍 Implementação em Python

```python
codigo = int(input("Digite o código do cargo (1 a 5): "))
salario = float(input("Digite o salário atual: "))

if codigo == 1:
    cargo = "Programador Júnior"
    aumento = salario * 0.5
elif codigo == 2:
    cargo = "Analista de Sistemas"
    aumento = salario * 0.35
elif codigo == 3:
    cargo = "Tech Leader"
    aumento = salario * 0.2
elif codigo == 4:
    cargo = "Analista de Redes"
    aumento = salario * 0.15
elif codigo == 5:
    cargo = "Scrum Master"
    aumento = 0
else:
    cargo = "Código inválido"
    aumento = 0

print(f"Cargo: {cargo}")
print(f"Aumento: R$ {aumento:.2f}")
print(f"Novo salário: R$ {salario + aumento:.2f}")
```

---

## 🧙 Implementação em Pascal

```pascal
program AumentoSalarial;
var
  codigo: integer;
  salario, aumento: real;
  cargo: string;
begin
  write('Digite o código do cargo (1 a 5): ');
  readln(codigo);
  write('Digite o salário atual: ');
  readln(salario);

  case codigo of
    1: begin cargo := 'Programador Júnior'; aumento := salario * 0.5; end;
    2: begin cargo := 'Analista de Sistemas'; aumento := salario * 0.35; end;
    3: begin cargo := 'Tech Leader'; aumento := salario * 0.2; end;
    4: begin cargo := 'Analista de Redes'; aumento := salario * 0.15; end;
    5: begin cargo := 'Scrum Master'; aumento := 0; end;
    else begin cargo := 'Código inválido'; aumento := 0; end;
  end;

  writeln('Cargo: ', cargo);
  writeln('Aumento: R$ ', aumento:0:2);
  writeln('Novo salário: R$ ', (salario + aumento):0:2);
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
