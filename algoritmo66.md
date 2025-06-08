# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Eficiência de Consumo de Carros

### Versão 1 — Redação direta
Crie um programa que leia os modelos de cinco carros e seus respectivos consumos (em km/l). O programa deve identificar o modelo mais econômico e calcular quantos litros cada carro gastaria para percorrer 2500 km.

### Versão 2 — Redação explicativa
Desenvolva um programa que registre cinco modelos de automóveis e seus respectivos consumos de combustível (quantos km percorrem com 1 litro). Em seguida, mostre o carro mais econômico e a quantidade de litros necessária para cada carro percorrer 2500 km.

### Versão 3 — Redação contextualizada
Uma empresa de transporte está avaliando cinco modelos de carros para sua frota. Para isso, deseja um programa que registre os nomes desses modelos e seus consumos em km/l. O sistema deve indicar qual carro é o mais econômico e quantos litros cada um consumiria em uma viagem de 2500 km.

---

## 💬 Portugol

```portugol
algoritmo "consumo_carros"
var
  modelo: vetor[1..5] de caractere
  consumo: vetor[1..5] de real
  litros: vetor[1..5] de real
  i, posMaisEconomico: inteiro
  menorConsumo: real
inicio
  para i de 1 ate 5 faca
    escreval("Digite o modelo do carro ", i, ": ")
    leia(modelo[i])
    escreval("Digite o consumo do carro ", i, " (km/l): ")
    leia(consumo[i])
  fimpara

  menorConsumo <- consumo[1]
  posMaisEconomico <- 1

  para i de 1 ate 5 faca
    se consumo[i] > menorConsumo entao
      menorConsumo <- consumo[i]
      posMaisEconomico <- i
    fimse
  fimpara

  escreval("
Carro mais econômico: ", modelo[posMaisEconomico])

  para i de 1 ate 5 faca
    litros[i] <- 2500 / consumo[i]
    escreval("Modelo: ", modelo[i], " - Consome: ", litros[i], " litros para 2500 km")
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
