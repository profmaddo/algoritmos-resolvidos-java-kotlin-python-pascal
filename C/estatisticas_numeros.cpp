#include <iostream>
#include <limits>

using namespace std;

int main() {
    int num, soma = 0, qtd = 0, pares = 0, somaPares = 0, impares = 0;
    int maior = -99999, menor = 99999;
    float media = 0.0, mediaPares = 0.0, porcentagemImpares = 0.0;

    cout << "Digite números inteiros (100000 encerra):" << endl;

    do {
        cout << "Número: ";
        cin >> num;

        if (num != 100000) {
            soma += num;
            qtd++;

            if (num > maior) maior = num;
            if (num < menor) menor = num;

            if (num % 2 == 0) {
                pares++;
                somaPares += num;
            } else {
                impares++;
            }
        }
    } while (num != 100000);

    if (qtd > 0) {
        media = static_cast<float>(soma) / qtd;
        cout << "Soma: " << soma << endl;
        cout << "Quantidade: " << qtd << endl;
        cout << "Média: " << media << endl;
        cout << "Maior número: " << maior << endl;
        cout << "Menor número: " << menor << endl;

        if (pares > 0) {
            mediaPares = static_cast<float>(somaPares) / pares;
            cout << "Média dos pares: " << mediaPares << endl;
        } else {
            cout << "Nenhum número par digitado." << endl;
        }

        porcentagemImpares = (static_cast<float>(impares) * 100) / qtd;
        cout << "Porcentagem de ímpares: " << porcentagemImpares << "%" << endl;
    } else {
        cout << "Nenhum número válido digitado." << endl;
    }

    return 0;
}
