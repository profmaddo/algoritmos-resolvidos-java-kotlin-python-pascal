# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Comparação de investimentos entre Maddo e Chris

### Versão 1 - Redação objetiva
Maddo investe seu salário integralmente na caderneta de poupança, com rendimento de 1.7% ao mês.  
Chris, que recebe um terço do salário de Maddo, investe seu salário integralmente em um fundo de renda fixa, com rendimento de 8% ao mês.  
Crie um programa que calcule e mostre em quantos meses o valor acumulado por Chris igualará ou ultrapassará o valor de Maddo.

---

## 💬 Portugol

```portugol
algoritmo "investimento_maddo_chris"
var
  salarioMaddo, salarioChris, totalMaddo, totalChris: real
  meses: inteiro
inicio
  escreva("Informe o salário de Maddo: ")
  leia(salarioMaddo)

  salarioChris <- salarioMaddo / 3
  totalMaddo <- salarioMaddo
  totalChris <- salarioChris
  meses <- 1

  enquanto totalChris < totalMaddo faca
    totalMaddo <- totalMaddo + (totalMaddo * 0.017)
    totalChris <- totalChris + (totalChris * 0.08)
    meses <- meses + 1
  fimenquanto

  escreval("Chris alcançará ou ultrapassará o valor de Maddo em ", meses, " meses.")
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
