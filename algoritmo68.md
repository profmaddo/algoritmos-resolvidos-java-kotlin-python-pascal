# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Aumento Salarial Condicional

### Versão 1 — Redação direta
Faça um programa que leia os nomes, salários e tempos de serviço de cinco funcionários. O programa deve identificar quem terá ou não aumento com base nos seguintes critérios: salário inferior a R$ 1800,00 ou tempo de serviço superior a 5 anos. Exiba dois relatórios: um com quem não terá aumento e outro com nomes e novos salários dos que receberão aumento.

### Versão 2 — Redação explicativa
Desenvolva um algoritmo para registrar dados de cinco funcionários, utilizando três vetores: um para nomes, outro para salários e outro para tempo de serviço. O sistema deve calcular quais funcionários têm direito a aumento (com base em tempo de serviço superior a 5 anos ou salário abaixo de R$ 1800,00), e aplicar as regras de reajuste. Exiba relatórios com os nomes dos funcionários sem aumento e, separadamente, nomes e novos salários dos que receberão aumento.

### Versão 3 — Redação contextualizada
Imagine que você está desenvolvendo um sistema de recursos humanos para automatizar a verificação de aumentos salariais. Seu programa deve armazenar os nomes, salários e tempos de serviço de cinco funcionários. Após analisar os critérios de elegibilidade (tempo de serviço > 5 anos ou salário < R$ 1800,00), o sistema deve gerar dois relatórios: um com os nomes de quem não terá aumento, e outro com os nomes e os novos salários daqueles que terão reajuste conforme as regras definidas.

---

## 💬 Portugol

```portugol
algoritmo "aumento_funcionarios"
var
  nomes: vetor[1..5] de caractere
  salarios, novos_salarios: vetor[1..5] de real
  tempos: vetor[1..5] de inteiro
  i: inteiro
inicio
  // Entrada de dados
  para i de 1 ate 5 faca
    escreva("Nome do funcionário ", i, ": ")
    leia(nomes[i])
    escreva("Salário de ", nomes[i], ": R$ ")
    leia(salarios[i])
    escreva("Tempo de serviço (anos) de ", nomes[i], ": ")
    leia(tempos[i])
  fimpara

  escreval("
Funcionários sem direito a aumento:")
  para i de 1 ate 5 faca
    se NOT ((tempos[i] > 5) OU (salarios[i] < 1800)) entao
      escreval(nomes[i])
    fimse
  fimpara

  escreval("
Funcionários com aumento e seus novos salários:")
  para i de 1 ate 5 faca
    se (tempos[i] > 5) E (salarios[i] < 1800) entao
      novos_salarios[i] <- salarios[i] * 1.15
    senao
      se tempos[i] > 5 entao
        novos_salarios[i] <- salarios[i] * 1.20
      senao
        se salarios[i] < 1800 entao
          novos_salarios[i] <- salarios[i] * 1.10
        fimse
      fimse
    fimse

    se novos_salarios[i] > salarios[i] entao
      escreval(nomes[i], " - Novo salário: R$ ", novos_salarios[i]:4:2)
    fimse
  fimpara
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
