
# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
🎓 Bem-vindo(a) ao nosso projeto de estudos de **Algoritmos e Programação Multilíngue**!

Neste documento, você encontrará o passo a passo para instalar todas as ferramentas necessárias para compilar, testar e executar os algoritmos desenvolvidos em **Portugol**, **Java**, **Kotlin**, **Python**, **C++**, **JavaScript**, **TypeScript**, **Go Lang**  e **Pascal**, além de configurar o **Git** para versionamento dos seus projetos. O conteúdo contempla os sistemas **Linux**, **macOS** e **Windows**. 🧠💻

---

## 💻 Orientação Geral: Sem IDEs! Terminal é Poder! ⚡

Neste treinamento, **não utilizaremos IDEs pesadas como Visual Studio Code, IntelliJ, Eclipse ou PyCharm**. A proposta é que você aprenda a dominar a arte de programar com o terminal.

Por quê?

🧠 Porque queremos que você:
- Entenda **como o código é compilado**.
- Aprenda a **navegar com comandos**.
- Desenvolva a habilidade de **escrever e executar shell scripts**.
- Torne-se um(a) desenvolvedor(a) independente de ferramentas gráficas.

---

## ✅ Estrutura Recomendada de Pastas

```bash
algoritmos/
├── algoritmo01.md
├── algoritmo02.md
├── ...
├── java/
├── kotlin/
├── python/
├── pascal/
├── portugol/
└── ...

```

---

## 🛠️ Instalação do Git

### Linux (Debian/Ubuntu/Mint)

```bash
sudo apt update
sudo apt install git -y
```

### macOS (via Homebrew)

```bash
brew install git
```

### Windows

Baixe o instalador em: [https://git-scm.com/download/win](https://git-scm.com/download/win) e siga o assistente de instalação.

Verifique com:

```bash
git --version
```

---

## ☕ Instalação do Java (JDK)

### Linux

```bash
sudo apt install default-jdk -y
```

### macOS

```bash
brew install openjdk
```

Adicione ao PATH (macOS):

```bash
echo 'export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"' >> ~/.zprofile
```

### Windows

Baixe o JDK em: [https://jdk.java.net/](https://jdk.java.net/) ou [https://adoptium.net/](https://adoptium.net/)

Verifique com:

```bash
java -version
```

---

## 💙 Instalação do Kotlin

### Linux/macOS/Windows

Use o compilador de linha de comando:

```bash
brew install --cask kotlin-native # instalação com homebrews no macOS.
sdk install kotlin       # se tiver SDKMAN (Linux/macOS)
kotlinc                  # verifica se está instalado
```

Ou baixe de:
[https://kotlinlang.org/docs/command-line.html](https://kotlinlang.org/docs/command-line.html)

Para compilar:

```bash
kotlinc exemplo.kt -include-runtime -d exemplo.jar
java -jar exemplo.jar
```

---

## 🐍 Instalação do Python

### Linux

```bash
sudo apt install python3 python3-pip -y
```

### macOS

```bash
brew install python
```

### Windows

Baixe de: [https://www.python.org/downloads/](https://www.python.org/downloads/)

Verifique com:

```bash
python3 --version
```

Execute com:

```bash
python3 exemplo.py
```

---

## 🧙 Instalação do Pascal (Free Pascal Compiler - fpc)

### Linux

```bash
sudo apt install fpc -y
```

### macOS (com Homebrew)

```bash
brew install fpc
```

### Windows

Baixe o instalador em: [https://www.freepascal.org/](https://www.freepascal.org/)

Compile com:

```bash
fpc exemplo.pas
./exemplo         # Linux/macOS
exemplo.exe       # Windows
```
---

## 🔨 Instalação do Compilador C (gcc)

### Linux

```bash
sudo apt update
sudo apt install build-essential -y
```

### macOS (com Xcode Command Line Tools)

```bash
xcode-select --install
```

Ou com Homebrew:

```bash
brew install gcc
```

### Windows

Recomendado instalar o pacote MSYS2:
[https://www.msys2.org/](https://www.msys2.org/)

Depois de instalado, abra o terminal MSYS2 e execute:

```bash
pacman -Syu
pacman -S mingw-w64-x86_64-gcc
```

🔎 Verifique:

```bash
gcc --version
```

🚀 Compile e execute:

```bash
gcc exemplo.c -o exemplo
./exemplo
```

> 🎯 Aprender C é como aprender a programar na raiz! Ideal para entender ponteiros, memória e performance.

---

## 🧾 Recomendação de Editores de Texto Simples

Você pode usar qualquer editor de texto puro. Recomendamos os seguintes:

- 🧠 **VS Codium** (alternativa open source ao VS Code)
  - [https://vscodium.com/](https://vscodium.com/)
- 📝 **Notepad++** (Windows)
  - [https://notepad-plus-plus.org/](https://notepad-plus-plus.org/)
- 🧙 **Geany** (leve e poderoso, multiplataforma)
  - Linux: `sudo apt install geany`
- 🔧 **GNU nano** (terminal, simples e direto)
  - Linux/macOS: já vem instalado!

> 💡 Todos esses editores são leves, rápidos, e compatíveis com as linguagens deste curso.

---

## 🤖 Criando um Shell Script para Compilar em Java

Vamos criar um script chamado `compilar-java.sh` para compilar e rodar um programa `.java` no terminal.

### Conteúdo do arquivo `compilar-java.sh`:

```bash
#!/bin/bash

if [ -z "$1" ]; then
  echo "❌ Uso: ./compilar-java.sh NomeDoPrograma.java"
  exit 1
fi

arquivo=$1
classe=$(basename "$arquivo" .java)

echo "📦 Compilando $arquivo..."
javac "$arquivo"

if [ $? -eq 0 ]; then
  echo "🚀 Executando $classe..."
  java "$classe"
else
  echo "❌ Erro na compilação. Corrija o código."
fi
```

### Como usar:

1. Dê permissão de execução:

```bash
chmod +x compilar-java.sh
```

2. Execute:

```bash
./compilar-java.sh MeuPrograma.java
```

> 🛠️ Este script ajuda você a compilar e rodar com um único comando. Excelente para automatizar tarefas repetitivas!

---

## 🧠 Instalação do Portugol Studio (Visual para algoritmos)

Download: [https://portugol-webstudio.cubos.io/](https://portugol-webstudio.cubos.io/)

* Alternativamente, use o [Visualg](http://visualg3.com.br/) no Windows.

> ⚠️ Portugol WebStudio pode ser usado diretamente no navegador. Ideal para treinar algoritmos em pseudo-código!

---

## 🌐 Redes do Professor Marco Maddo

* YouTube: [Professor Marco Maddo](https://www.youtube.com/@ProfessorMarcoMaddo)
* LinkedIn: [Marco Maddo](https://www.linkedin.com/in/marcomaddo/)
* GitHub: [@profmaddo](https://github.com/profmaddo)
* GitLab: [@profmaddo](https://gitlab.com/profmaddo)
* Udemy: [Cursos Marco Maddo](https://www.udemy.com/user/marcomaddo/)

---

## 🚀 Acesse também:

* 🌐 Site oficial do professor: [www.marcomaddo.com.br](https://www.marcomaddo.com.br)
* 🧑‍💼 Empresa TSSTI Tecnologia: [www.tssti.com.br](https://www.tssti.com.br)

Vamos juntos nessa jornada de aprendizado! ✨

---

---

## 🦫 Instalação do Go (Golang)

### Linux

```bash
sudo apt update
sudo apt install golang-go -y
```

### macOS

```bash
brew install go
```

### Windows

Baixe o instalador em: [https://go.dev/dl/](https://go.dev/dl/) e siga o assistente.

🔎 Verifique a instalação:

```bash
go version
```

🚀 Para testar:

```bash
go run exemplo.go
```

> ✨ O Go é incrível para criar aplicações rápidas e concisas! Perfeito para quem quer aprender concorrência, APIs e muito mais.

---

## 🌟 Instalação do JavaScript (Node.js)

JavaScript é executado no navegador, mas para usar no terminal (backend ou scripts), instale o Node.js:

### Linux (Debian/Ubuntu/Mint)

```bash
sudo apt update
sudo apt install nodejs npm -y
```

### macOS

```bash
brew install node
```

### Windows

Baixe de: [https://nodejs.org/](https://nodejs.org/)

🔎 Verifique a instalação:

```bash
node -v
npm -v
```

🚀 Para rodar um arquivo:

```bash
node exemplo.js
```

> 🧠 O Node.js transforma o JavaScript em uma super ferramenta de automação e criação de servidores!

---

## 🧪 Instalação do TypeScript

TypeScript é uma versão turbinada do JavaScript com tipagem!

### Requer Node.js instalado!

Instale com o gerenciador `npm`:

```bash
npm install -g typescript
```

🔎 Verifique:

```bash
tsc -v
```

🚀 Para compilar:

```bash
tsc exemplo.ts
node exemplo.js
```

> 💡 O TypeScript ajuda a evitar erros antes mesmo do código rodar. Ótimo para quem quer código limpo e seguro!

---

## 🐘 Instalação do PHP

### Linux

```bash
sudo apt update
sudo apt install php -y
```

### macOS

```bash
brew install php
```

### Windows

Baixe de: [https://www.php.net/downloads](https://www.php.net/downloads)

🔎 Verifique a versão:

```bash
php -v
```

🚀 Para rodar um script PHP:

```bash
php exemplo.php
```

> 🎯 PHP é amplamente usado para criar sites e sistemas web. Simples, poderoso e muito usado no mercado!

---

## 🎯 Instalação do Dart (para Terminal)

### Linux

```bash
sudo apt update
sudo apt install apt-transport-https
sudo sh -c 'wget -qO- https://dl-ssl.google.com/linux/linux_signing_key.pub | gpg --dearmor > /usr/share/keyrings/dart.gpg'
sudo sh -c 'echo "deb [signed-by=/usr/share/keyrings/dart.gpg] https://storage.googleapis.com/download.dartlang.org/linux/debian stable main" > /etc/apt/sources.list.d/dart_stable.list'
sudo apt update
sudo apt install dart -y
```

### macOS

```bash
brew tap dart-lang/dart
brew install dart
```

### Windows

Baixe o SDK: [https://dart.dev/get-dart](https://dart.dev/get-dart)

🔎 Verifique a instalação:

```bash
dart --version
```

🚀 Para rodar um arquivo:

```bash
dart exemplo.dart
```

> 💬 Dart é a linguagem por trás do Flutter! Mas você pode usá-lo sozinho para scripts e apps via terminal!

---
