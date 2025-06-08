package main

import (
    "fmt"
)

func main() {
    var num, soma, qtd, pares, somaPares, impares int
    maior := -99999
    menor := 99999
    var media, mediaPares, porcentagemImpares float64

    fmt.Println("Digite números inteiros (100000 encerra):")

    for {
        fmt.Print("Número: ")
        fmt.Scan(&num)

        if num == 100000 {
            break
        }

        soma += num
        qtd++

        if num > maior {
            maior = num
        }
        if num < menor {
            menor = num
        }

        if num%2 == 0 {
            pares++
            somaPares += num
        } else {
            impares++
        }
    }

    if qtd > 0 {
        media = float64(soma) / float64(qtd)
        fmt.Printf("Soma: %d\n", soma)
        fmt.Printf("Quantidade: %d\n", qtd)
        fmt.Printf("Média: %.2f\n", media)
        fmt.Printf("Maior número: %d\n", maior)
        fmt.Printf("Menor número: %d\n", menor)

        if pares > 0 {
            mediaPares = float64(somaPares) / float64(pares)
            fmt.Printf("Média dos pares: %.2f\n", mediaPares)
        } else {
            fmt.Println("Nenhum número par digitado.")
        }

        porcentagemImpares = (float64(impares) * 100) / float64(qtd)
        fmt.Printf("Porcentagem de ímpares: %.2f%%\n", porcentagemImpares)
    } else {
        fmt.Println("Nenhum número válido digitado.")
    }
}
