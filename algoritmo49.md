# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Série personalizada com padrão alternado

### Versão 1 - Redação direta
Crie um programa que leia o número de termos desejado pelo usuário e mostre os valores da seguinte série:
**2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567, 768...**

### Versão 2 - Redação explicativa
Construa um algoritmo que, dado um número inteiro N, exiba os N primeiros termos da seguinte sequência matemática:  
O padrão da série alterna entre um número base, um multiplicado e um triplo.

### Versão 3 - Redação investigativa
Você consegue decifrar a lógica desta série? 🤔 Programe uma solução para mostrar os **N primeiros termos** da sequência:
**2, 7, 3, 4, 21, 12, 8, 63, 48...**  
Observe os padrões e implemente de forma iterativa!

---

## 💬 Portugol

```portugol
algoritmo "serie_personalizada"
var
  N, i: inteiro
  termo: inteiro
inicio
  escreva("Digite o número de termos: ")
  leia(N)
  termo <- 2
  para i de 1 ate N faca
    escreval(termo)
    se i mod 3 = 0 entao
      termo <- termo * 3
    senao
      termo <- termo + 1
    fimse
  fimpara
fimalgoritmo
```

---

## ☕ Java

```java
import java.util.Scanner;

public class SeriePersonalizada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de termos: ");
        int N = sc.nextInt();
        int termo = 2;

        for (int i = 1; i <= N; i++) {
            System.out.print(termo + " ");
            if (i % 3 == 0)
                termo *= 3;
            else
                termo += 1;
        }
    }
}
```

---

## 💙 Kotlin

```kotlin
fun main() {
    print("Digite o número de termos: ")
    val N = readLine()!!.toInt()
    var termo = 2

    for (i in 1..N) {
        print("$termo ")
        termo = if (i % 3 == 0) termo * 3 else termo + 1
    }
}
```

---

## 🐍 Python

```python
N = int(input("Digite o número de termos: "))
termo = 2

for i in range(1, N + 1):
    print(termo, end=' ')
    if i % 3 == 0:
        termo *= 3
    else:
        termo += 1
```

---

## 🧙 Pascal

```pascal
program SeriePersonalizada;
var
  N, i, termo: integer;
begin
  write('Digite o número de termos: ');
  readln(N);
  termo := 2;

  for i := 1 to N do
  begin
    write(termo, ' ');
    if (i mod 3 = 0) then
      termo := termo * 3
    else
      termo := termo + 1;
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
