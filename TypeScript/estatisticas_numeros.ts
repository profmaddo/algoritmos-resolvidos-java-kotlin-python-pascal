import * as readline from 'readline';

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let soma = 0, qtd = 0, pares = 0, somaPares = 0, impares = 0;
let maior = -99999, menor = 99999;

console.log("Digite números inteiros (100000 encerra):");

function perguntar(): void {
    rl.question("Número: ", (input: string) => {
        const num = parseInt(input);

        if (num === 100000) {
            rl.close();

            if (qtd > 0) {
                const media = soma / qtd;
                console.log("Soma:", soma);
                console.log("Quantidade:", qtd);
                console.log("Média:", media.toFixed(2));
                console.log("Maior número:", maior);
                console.log("Menor número:", menor);

                if (pares > 0) {
                    const mediaPares = somaPares / pares;
                    console.log("Média dos pares:", mediaPares.toFixed(2));
                } else {
                    console.log("Nenhum número par digitado.");
                }

                const porcentagemImpares = (impares * 100) / qtd;
                console.log("Porcentagem de ímpares:", porcentagemImpares.toFixed(2) + "%");
            } else {
                console.log("Nenhum número válido digitado.");
            }
        } else {
            soma += num;
            qtd++;

            if (num > maior) maior = num;
            if (num < menor) menor = num;

            if (num % 2 === 0) {
                pares++;
                somaPares += num;
            } else {
                impares++;
            }

            perguntar(); // próxima entrada
        }
    });
}

perguntar();
