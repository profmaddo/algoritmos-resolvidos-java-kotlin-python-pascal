import 'dart:io';

void main() {
  int soma = 0, qtd = 0, pares = 0, somaPares = 0, impares = 0;
  int maior = -99999, menor = 99999;

  print('Digite números inteiros (100000 encerra):');

  while (true) {
    stdout.write('Número: ');
    String? input = stdin.readLineSync();
    if (input == null) continue;

    int num = int.tryParse(input) ?? 0;

    if (num == 100000) break;

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

  if (qtd > 0) {
    double media = soma / qtd;
    print('Soma: $soma');
    print('Quantidade: $qtd');
    print('Média: ${media.toStringAsFixed(2)}');
    print('Maior número: $maior');
    print('Menor número: $menor');

    if (pares > 0) {
      double mediaPares = somaPares / pares;
      print('Média dos pares: ${mediaPares.toStringAsFixed(2)}');
    } else {
      print('Nenhum número par digitado.');
    }

    double porcentagemImpares = (impares * 100) / qtd;
    print('Porcentagem de ímpares: ${porcentagemImpares.toStringAsFixed(2)}%');
  } else {
    print('Nenhum número válido digitado.');
  }
}
