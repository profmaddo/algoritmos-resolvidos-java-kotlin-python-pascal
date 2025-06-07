# Aprenda algoritmos com o Professor Marco Maddo

🎯 **Situação Problema Reformulada**:

### Versão 1:
Imagine que você esteja desenvolvendo um aplicativo de matemática interativa. O sistema precisa receber uma lista com cinco valores reais e permitir que o usuário escolha uma forma de exibição desses valores: normalmente ou de trás para frente.

### Versão 2:
Um professor de lógica pediu que seus alunos criassem um programa que armazenasse cinco valores decimais e, dependendo do código digitado, exibisse esses números na ordem original ou na ordem inversa.

### Versão 3:
Você está criando um sistema de visualização de dados que recebe uma lista com cinco números reais. O usuário poderá decidir como quer ver os dados: do jeito que foram digitados ou do último para o primeiro.

---

## ✏️ Enunciado original
Faça um programa que leia um vetor com cinco posições para números reais e, depois, um código inteiro.  
Se o código for zero, finalize o programa;  
Se for 1, mostre o vetor na ordem direta;  
Se for 2, mostre o vetor na ordem inversa.

---

## 💬 Portugol

```portugol
algoritmo "algoritmo72"
var
   numeros: vetor[1..5] de real
   i: inteiro
   codigo: inteiro
inicio
   para i de 1 ate 5 faca
      escreva("Digite o ", i, "º número real: ")
      leia(numeros[i])
   fimpara

   escreva("Digite o código (0 - sair, 1 - ordem direta, 2 - ordem inversa): ")
   leia(codigo)

   se codigo = 0 entao
      escreval("Programa finalizado.")
   senao
      se codigo = 1 entao
         escreval("Ordem direta:")
         para i de 1 ate 5 faca
            escreval(numeros[i])
         fimpara
      senao
         se codigo = 2 entao
            escreval("Ordem inversa:")
            para i de 5 ate 1 passo -1 faca
               escreval(numeros[i])
            fimpara
         senao
            escreval("Código inválido.")
         fimse
      fimse
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

Vamos juntos nessa jornada de aprendizado! ✨
