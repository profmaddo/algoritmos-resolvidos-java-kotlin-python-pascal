# Aprenda algoritmos com o Professor Marco Maddo
## algoritmo70.md
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
### Versão 1 - Linguagem clara e direta
Faça um programa que leia seis números inteiros. Em seguida, mostre apenas os números pares, calcule e mostre a soma dos pares. Depois, exiba os números ímpares e quantos deles foram digitados.
### Versão 2 - Estilo desafio
Desenvolva um algoritmo que solicite ao usuário seis números inteiros. O programa deverá identificar e exibir os pares e a soma deles, além dos ímpares e a quantidade desses valores informados.
### Versão 3 - Situação real aplicada
Imagine que você está analisando dados de uma pequena pesquisa com seis participantes. Crie um programa que leia seis números inteiros representando as respostas e depois mostre: os números pares informados, a soma desses pares, os ímpares informados e quantos ímpares foram registrados.

### Solução em Portugol

```portugol
Algoritmo "Numeros pares e impares"
Var
   numeros: vetor[1..6] de inteiro
   i, somaPares, qtdImpares: inteiro

Inicio
   somaPares <- 0
   qtdImpares <- 0

   Para i de 1 até 6 faca
      Escreva("Digite o ", i, "º número: ")
      Leia(numeros[i])
   FimPara

   Escreva("Números pares digitados: ")
   Para i de 1 até 6 faca
      Se numeros[i] % 2 = 0 entao
         Escreva(numeros[i], " ")
         somaPares <- somaPares + numeros[i]
      FimSe
   FimPara
   Escreval("Soma dos números pares: ", somaPares)

   Escreva("Números ímpares digitados: ")
   Para i de 1 até 6 faca
      Se numeros[i] % 2 <> 0 entao
         Escreva(numeros[i], " ")
         qtdImpares <- qtdImpares + 1
      FimSe
   FimPara
   Escreval("Quantidade de números ímpares: ", qtdImpares)

Fimalgoritmo
```

Siga o professor no YouTube, Github, Gitlab, Udemy e Linkedin:

- YouTube: https://www.youtube.com/@ProfessorMarcoMaddo
- Linkedin: https://www.linkedin.com/in/marcomaddo/
- GitLab: https://gitlab.com/profmaddo
- GitHub: https://github.com/profmaddo
- Udemy: https://www.udemy.com/user/marcomaddo/

---

Acesse também:

- 🌐 Site oficial do professor: [www.marcomaddo.com.br](https://www.marcomaddo.com.br)
- 🧑‍💼 Empresa TSSTI Tecnologia: [www.tssti.com.br](https://www.tssti.com.br)
