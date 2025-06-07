# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Cálculo seguro da área de um triângulo

### Versão 1 - Redação simples
Crie um programa que calcule a área de um triângulo. O programa deve **validar os dados de entrada**, impedindo que o usuário informe medidas menores ou iguais a zero para a base ou altura.

---

## 💬 Portugol

```portugol
algoritmo "area_triangulo_com_validacao"
var
  base, altura, area: real
inicio
  repita
    escreva("Informe a base do triângulo: ")
    leia(base)
    se base <= 0 entao
      escreval("Valor inválido! A base deve ser maior que zero.")
    fimse
  ate base > 0

  repita
    escreva("Informe a altura do triângulo: ")
    leia(altura)
    se altura <= 0 entao
      escreval("Valor inválido! A altura deve ser maior que zero.")
    fimse
  ate altura > 0

  area <- (base * altura) / 2
  escreval("A área do triângulo é: ", area:0:2)
fimalgoritmo
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
