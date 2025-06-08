# Guia de Instalação e Compilação de Programas C/C++

Este guia explica como **compilar e executar** programas escritos em **C ou C++** utilizando o compilador `gcc` ou `g++`, compatível com os principais sistemas operacionais: **Linux**, **macOS** e **Windows**.

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

> Verifique a instalação:
```bash
g++ --version
```

### ⚙️ Compilar C++ (.cpp)

```bash
g++ nome_do_arquivo.cpp -o nome_programa
```

### ⚙️ Compilar C puro (.c)

```bash
gcc nome_do_arquivo.c -o nome_programa
```

### ▶️ Executar

```bash
./nome_programa
```

---

## 🍎 macOS (com Homebrew)

### ✅ Instalar o compilador

```bash
brew install gcc
```

> Verifique:
```bash
g++ --version
```

### ⚙️ Compilar C++ (.cpp)

```bash
g++ nome_do_arquivo.cpp -o nome_programa
```

Se houver múltiplas versões, tente:
```bash
g++-13 nome_do_arquivo.cpp -o nome_programa
```

### ▶️ Executar

```bash
./nome_programa
```

---

## 🪟 Windows

### ✅ Opção 1: Usar MSYS2

1. Baixe e instale o [MSYS2](https://www.msys2.org/)
2. Abra o terminal `MSYS2 MinGW 64-bit`
3. Execute:

```bash
pacman -Syu
pacman -S mingw-w64-x86_64-gcc
```

### ⚙️ Compilar e Executar

```bash
g++ nome_do_arquivo.cpp -o nome_programa.exe
./nome_programa.exe
```

---

### ✅ Opção 2: Usar Code::Blocks com MinGW

1. Baixe o instalador completo:
   👉 [Download Code::Blocks com MinGW](http://www.codeblocks.org/downloads/26)
2. Crie um novo projeto Console
3. Cole seu código em `main.cpp`
4. Pressione F9 para compilar e executar

---

## ⚠️ Erros comuns e como resolver

### ❌ `fatal error: 'iostream' file not found`

- Esse erro ocorre ao tentar compilar código C++ com `gcc`, que é para C.
- Solução: use `g++` em vez de `gcc`.

### ✅ Correto:

```bash
g++ estatisticas_numeros.cpp -o estatisticas_numeros
```

---

### ❌ `no such file or directory: 'arquivo.cpp'`

- O arquivo com esse nome **não existe no diretório atual**.

### ✅ Solução:

1. Use `ls` para listar arquivos:

```bash
ls *.cpp
```

2. Renomeie corretamente:

```bash
mv estatisticas_numeros.c estatisticas_numeros.cpp
```

---

### ❌ `./estatisticas_numeros: No such file or directory`

- Isso acontece se o programa **não foi compilado corretamente**.

### ✅ Verifique:

```bash
g++ estatisticas_numeros.cpp -o estatisticas_numeros
```

---

## ✅ Teste rápido

Crie um arquivo `teste.cpp` com:

```cpp
#include <iostream>
using namespace std;

int main() {
    cout << "Olá, C++!\n";
    return 0;
}
```

Compile e execute:

```bash
g++ teste.cpp -o teste
./teste
```

---

## ✍️ Autor

Arquivo gerado por Professor Marco Maddo  
🔗 Canal no YouTube: [Marco Maddo](https://www.youtube.com/@marcomaddo)  
📘 Curso: Algoritmos em C++, Java, Kotlin, Python, Pascal  
🧠 Repositório: https://github.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal
