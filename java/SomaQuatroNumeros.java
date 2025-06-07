import java.util.Scanner;

public class SomaQuatroNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        System.out.print("Digite o quarto número: ");
        int num4 = scanner.nextInt();

        int soma = num1 + num2 + num3 + num4;
        System.out.println("A soma é: " + soma);
    }
}