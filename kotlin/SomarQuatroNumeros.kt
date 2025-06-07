fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()

    print("Digite o terceiro número: ")
    val num3 = readLine()!!.toInt()

    print("Digite o quarto número: ")
    val num4 = readLine()!!.toInt()

    val soma = num1 + num2 + num3 + num4
    println("A soma é: $soma")
}