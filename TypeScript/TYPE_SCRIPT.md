# Guia de Instalação e Execução de Programas TypeScript via Terminal

Este guia ensina como instalar e executar programas escritos em **TypeScript** utilizando o terminal em **macOS**, **Linux** e **Windows**.

---

## 📦 Instalação

### ✅ 1. Instale o Node.js

#### macOS (via Homebrew)

```bash
brew install node
```

#### Linux (Debian/Ubuntu)

```bash
sudo apt update
sudo apt install nodejs npm
```

#### Windows

- Acesse: https://nodejs.org
- Baixe e instale a versão LTS

---

### ✅ 2. Instale o TypeScript Compiler

```bash
npm install -g typescript
```

Verifique:

```bash
tsc -v
```

---

## ▶️ Execução

### 1. Crie um arquivo `estatisticas_numeros.ts` com o código

### 2. Compile para JavaScript

```bash
tsc estatisticas_numeros.ts
```

Isso cria o arquivo `estatisticas_numeros.js`

### 3. Execute com Node.js

```bash
node estatisticas_numeros.js
```

---

## 🚀 Alternativa: Execute diretamente com ts-node

### Instale o ts-node:

```bash
npm install -g ts-node
```

### Execute diretamente:

```bash
ts-node estatisticas_numeros.ts
```

---

## 📌 Observações

- O código usa `readline` do Node.js para entrada no terminal.
- Para testes automatizados, você pode redirecionar um arquivo `.txt` com entradas simuladas:

```bash
ts-node estatisticas_numeros.ts < entradas.txt
```

---

## ✍️ Autor

Arquivo gerado por Professor Marco Maddo  
🔗 Canal no YouTube: [Marco Maddo](https://www.youtube.com/@marcomaddo)  
📘 Curso: Algoritmos em TypeScript, JavaScript, Python, Kotlin, Pascal  
🧠 Repositório: https://github.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal
