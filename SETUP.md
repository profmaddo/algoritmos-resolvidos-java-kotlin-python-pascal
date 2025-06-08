# Aprenda algoritmos com o Professor Marco Maddo
![Mestre dos Algoritmos](https://raw.githubusercontent.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal/main/images/mestre-dos-algoritmos-02.jpeg)
🎓 Bem-vindo(a) ao nosso projeto de estudos de **Algoritmos e Programação Multilíngue**!

Neste documento, você encontrará o passo a passo para instalar todas as ferramentas necessárias para compilar, testar e executar os algoritmos desenvolvidos em **Portugol**, **Java**, **Kotlin**, **Python** e **Pascal**, além de configurar o **Git** para versionamento dos seus projetos. O conteúdo contempla os sistemas **Linux**, **macOS** e **Windows**. 🧠💻

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
└── portugol/
```

Todos os arquivos markdown estarão disponíveis para download em:

📦 [Repositório GitHub - profmaddo/algoritmos](https://github.com/profmaddo/algoritmos)
📦 [Repositório GitLab - profmaddo/algoritmos](https://gitlab.com/profmaddo/algoritmos)
📥 [Download direto deste arquivo SETUP.md (GitHub)](https://raw.githubusercontent.com/profmaddo/algoritmos/main/SETUP.md)

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
