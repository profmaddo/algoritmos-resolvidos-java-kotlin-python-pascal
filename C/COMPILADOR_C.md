# Guia de Instalação e Compilação de Programas C/C++

Este guia explica como **compilar e executar** programas escritos em **C ou C++** utilizando o compilador `g++`, compatível com os principais sistemas operacionais: **Linux**, **macOS** e **Windows**.

---

## 📦 Requisitos

Você precisa de:
- Um editor de texto (Visual Studio Code, Sublime, Notepad++, nano etc.)
- Um terminal ou prompt de comando
- O compilador **GCC/G++**

---

## 🐧 Linux (Ubuntu, Mint, Debian etc.)

### ✅ Instalar o compilador

```bash
sudo apt update
sudo apt install g++
```

### ⚙️ Compilar

```bash
g++ nome_do_arquivo.cpp -o nome_programa
```

Exemplo:
```bash
g++ estatisticas_numeros.cpp -o estatisticas_numeros
```

### ▶️ Executar

```bash
./estatisticas_numeros
```

---

## 🍎 macOS (com Homebrew instalado)

### ✅ Instalar o compilador

```bash
brew install gcc
```

> O executável pode se chamar `g++-13`, `g++-14`, etc.

### ⚙️ Compilar

```bash
g++ estatisticas_numeros.cpp -o estatisticas_numeros
```

Ou:

```bash
g++-13 estatisticas_numeros.cpp -o estatisticas_numeros
```

### ▶️ Executar

```bash
./estatisticas_numeros
```

---

## 🪟 Windows

### ✅ Opção 1: Usar o MSYS2

1. Baixe e instale o [MSYS2](https://www.msys2.org/)
2. Abra o terminal `MSYS2 MinGW 64-bit`
3. Instale o compilador:

```bash
pacman -Syu
pacman -S mingw-w64-x86_64-gcc
```

### ⚙️ Compilar e Executar

```bash
g++ estatisticas_numeros.cpp -o estatisticas_numeros.exe
./estatisticas_numeros.exe
```

---

### ✅ Opção 2: Usar o Code::Blocks

1. Baixe o instalador com MinGW incluso:
   👉 [Download Code::Blocks com MinGW](http://www.codeblocks.org/downloads/26)
2. Instale e abra o Code::Blocks
3. Crie um novo projeto → Console Application → C++
4. Copie o código para o `main.cpp`
5. Pressione **F9** para compilar e executar

---

## ✅ Teste rápido

Crie um arquivo chamado `teste.cpp` com o seguinte conteúdo:

```cpp
#include <iostream>
using namespace std;

int main() {
    cout << "Olá, C++!\n";
    return 0;
}
```

Compile e execute conforme as instruções acima.

---

## ✍️ Autor

Arquivo gerado por Professor Marco Maddo  
🔗 Canal no YouTube: [Marco Maddo](https://www.youtube.com/@marcomaddo)  
📘 Curso: Algoritmos em C++, Java, Kotlin, Python, Pascal  
🧠 Repositório: https://github.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal
