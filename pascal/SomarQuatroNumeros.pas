program SomaQuatroNumeros;
var
  num1, num2, num3, num4, soma: integer;
begin
  write('Digite o primeiro número: ');
  readln(num1);

  write('Digite o segundo número: ');
  readln(num2);

  write('Digite o terceiro número: ');
  readln(num3);

  write('Digite o quarto número: ');
  readln(num4);

  soma := num1 + num2 + num3 + num4;
  writeln('A soma é: ', soma);
end.