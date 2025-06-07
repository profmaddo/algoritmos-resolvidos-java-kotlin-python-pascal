# Aprenda algoritmos com o Professor Marco Maddo

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
