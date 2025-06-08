
# Algoritmo 77 — Lojas, Produtos e Preços
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
## 💡 Situação-problema Reformulada (Versão 1)
Você trabalha como analista de preços em uma rede de lojas e precisa identificar quais produtos estão sendo vendidos por até R$ 300,00 em diferentes lojas. Para isso, será necessário coletar os nomes de oito lojas, quatro produtos e seus respectivos preços em uma matriz. Ao final, o sistema deverá exibir apenas as combinações de produto e loja cujo valor não ultrapasse R$ 300,00.

## 💡 Situação-problema Reformulada (Versão 2)
Crie um sistema de consulta de preços entre produtos e lojas. O sistema deve receber uma lista de lojas, uma lista de produtos e uma matriz com os preços de cada produto em cada loja. Exiba as lojas que vendem cada produto por R$ 300,00 ou menos.

## 💡 Situação-problema Reformulada (Versão 3)
Imagine que você está desenvolvendo um software para comparar preços de produtos em diversas lojas. O programa deve armazenar os nomes das lojas, os produtos à venda e seus preços em uma matriz. Mostre somente as opções de compra em que o produto está custando no máximo R$ 300,00.

---

## 🧠 Lógica do Programa

1. Criar um vetor de 8 posições com os nomes das lojas.
2. Criar um vetor de 4 posições com os nomes dos produtos.
3. Criar uma matriz 8x4 onde cada célula representa o preço de um produto em uma loja.
4. Mostrar todas as combinações (produto — loja) onde o preço não ultrapassa R$ 300,00.

---

## 🧾 Código em Portugol

```portugol
programa
{
    funcao inicio()
    {
        cadeia lojas[8]
        cadeia produtos[4]
        real precos[8][4]
        inteiro i, j

        // Entrada das lojas
        escreva("Digite o nome das 8 lojas:\n")
        para (i = 0; i < 8; i++)
        {
            escreva("Loja ", i+1, ": ")
            leia(lojas[i])
        }

        // Entrada dos produtos
        escreva("\nDigite o nome dos 4 produtos:\n")
        para (j = 0; j < 4; j++)
        {
            escreva("Produto ", j+1, ": ")
            leia(produtos[j])
        }

        // Entrada dos preços
        escreva("\nDigite os preços dos produtos em cada loja:\n")
        para (i = 0; i < 8; i++)
        {
            para (j = 0; j < 4; j++)
            {
                escreva("Preço de ", produtos[j], " na loja ", lojas[i], ": R$ ")
                leia(precos[i][j])
            }
        }

        // Exibir produtos com preço até R$ 300,00
        escreva("\nRelação de produtos com preço até R$ 300,00:\n")
        para (i = 0; i < 8; i++)
        {
            para (j = 0; j < 4; j++)
            {
                se (precos[i][j] <= 300)
                {
                    escreva("Produto: ", produtos[j], " | Loja: ", lojas[i], " | Preço: R$ ", precos[i][j], "\n")
                }
            }
        }
    }
}
```
