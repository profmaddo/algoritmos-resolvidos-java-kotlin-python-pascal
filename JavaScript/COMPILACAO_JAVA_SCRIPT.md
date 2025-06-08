# Guia de Execução de Programas JavaScript no Terminal

Este guia mostra como executar programas JavaScript via terminal no **macOS**, **Linux** e **Windows**, com diferentes opções de ambiente de execução.

---

## ✅ Requisitos

Você precisa de:
- Um editor de texto (VS Code, Notepad++, nano etc.)
- Terminal ou prompt de comando
- Node.js instalado

---

## 📦 Instalar Node.js

### 🐧 Linux (Debian/Ubuntu/Mint)

```bash
sudo apt update
sudo apt install nodejs npm
```

### 🍎 macOS (com Homebrew)

```bash
brew install node
```

### 🪟 Windows

1. Acesse: https://nodejs.org
2. Baixe o instalador LTS
3. Siga os passos e finalize

Verifique com:

```bash
node -v
npm -v
```

---

## ▶️ Rodar o programa

### 1. Salve o código em um arquivo chamado:

```bash
estatisticas_numeros.js
```

### 2. Execute com Node.js:

```bash
node estatisticas_numeros.js
```

---

## ⚙️ Outras opções de execução

### ✅ Opção 1: Executar via VS Code

1. Instale a extensão “Code Runner”
2. Abra o arquivo `.js`
3. Pressione `Ctrl+Alt+N` (Windows/Linux) ou `Cmd+Alt+N` (macOS)

### ✅ Opção 2: Usar Replit (online)

1. Acesse: https://replit.com/
2. Crie um novo projeto Node.js
3. Cole o código no `index.js`
4. Clique em “Run”

---

## 🧠 Observações

- O código usa `readline` do Node.js para entrada no terminal.
- Se desejar simular entradas automáticas, é possível redirecionar de um arquivo:

```bash
node estatisticas_numeros.js < entradas.txt
```

---

## ✍️ Autor

Arquivo gerado por Professor Marco Maddo  
🔗 Canal no YouTube: [Marco Maddo](https://www.youtube.com/@marcomaddo)  
📘 Curso: Algoritmos em JS, Java, Kotlin, Python, Pascal  
🧠 Repositório: https://github.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal
