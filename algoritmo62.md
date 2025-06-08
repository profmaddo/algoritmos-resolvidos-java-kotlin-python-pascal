# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 🧠 Situação Problema: Cálculo de Comissão e Relatório de Vendas

### Versão 1 — Redação direta
Uma loja de artesanato com um único vendedor comercializa dez tipos de objetos. O vendedor recebe salário fixo de R$ 545,00 e comissão de 5% sobre o valor total das vendas. O programa deve armazenar os preços unitários e quantidades vendidas em vetores, e gerar um relatório com os detalhes de cada item, o total de vendas, a comissão do vendedor, e destacar o objeto mais vendido e sua posição.

### Versão 2 — Redação com orientação a dados
Você deve desenvolver um programa para uma pequena loja com um vendedor. A loja vende 10 tipos de produtos. Para cada produto, o valor unitário e a quantidade vendida devem ser armazenados em vetores. No final, apresente um relatório detalhado com os totais por item, valor geral de vendas, comissão do vendedor e o item mais vendido.

### Versão 3 — Redação contextualizada
Imagine que você é responsável pelo sistema de vendas de uma loja artesanal. Há 10 tipos de produtos à venda, e um único vendedor, que ganha R$ 545,00 fixos por mês e 5% de comissão sobre as vendas. Seu programa deve receber os preços e as quantidades vendidas, calcular os totais, e exibir um relatório com os detalhes, incluindo qual foi o produto mais vendido.

---

## 💬 Portugol

```portugol
algoritmo "relatorio_vendas_loja"
var
  preco: vetor[1..10] de real
  quantidade: vetor[1..10] de inteiro
  total_item: real
  total_vendas: real
  comissao: real
  i, mais_vendido, qtd_mais_vendida: inteiro
inicio
  total_vendas <- 0
  qtd_mais_vendida <- 0
  para i de 1 ate 10 faca
    escreva("Informe o preço do item ", i, ": ")
    leia(preco[i])
    escreva("Informe a quantidade vendida do item ", i, ": ")
    leia(quantidade[i])
  fimpara

  escreval("RELATÓRIO DE VENDAS")
  para i de 1 ate 10 faca
    total_item <- preco[i] * quantidade[i]
    escreval("Item ", i, ": ", quantidade[i], " unidades x R$ ", preco[i]:2:2, " = R$ ", total_item:2:2)
    total_vendas <- total_vendas + total_item
    se quantidade[i] > qtd_mais_vendida entao
      qtd_mais_vendida <- quantidade[i]
      mais_vendido <- i
    fimse
  fimpara

  comissao <- total_vendas * 0.05

  escreval("Total de vendas: R$ ", total_vendas:2:2)
  escreval("Comissão do vendedor: R$ ", comissao:2:2)
  escreval("Item mais vendido: ", mais_vendido, " com ", qtd_mais_vendida, " unidades.")
fimalgoritmo
```

---

## 🌐 Redes do Professor Marco Maddo

- YouTube: [Professor Marco Maddo](https://www.youtube.com/@ProfessorMarcoMaddo)
- LinkedIn: [Marco Maddo](https://www.linkedin.com/in/marcomaddo/)
- GitHub: [@profmaddo](https://github.com/profmadddo)
- GitLab: [@profmaddo](https://gitlab.com/profmaddo)
- Udemy: [Cursos Marco Maddo](https://www.udemy.com/user/marcomaddo/)

---

## 🚀 Acesse também:

- 🌐 Site oficial do professor: [www.marcomaddo.com.br](https://www.marcomaddo.com.br)
- 🧑‍💼 Empresa TSSTI Tecnologia: [www.tssti.com.br](https://www.tssti.com.br)
