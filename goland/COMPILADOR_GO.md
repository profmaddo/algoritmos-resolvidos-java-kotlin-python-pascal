# Guia de Instalação e Compilação de Programas em Go (Golang)

Este documento apresenta como instalar o compilador **Go** e compilar/executar um programa como o exemplo `estatisticas_numeros.go` em **Linux**, **macOS** e **Windows**.

---

## 📦 Requisitos

Você precisa de:
- Editor de texto (VS Code, nano, Notepad++)
- Terminal ou prompt de comando
- Go Lang instalado (versão 1.20+ recomendada)

---

## 🐧 Linux

### ✅ Instalar o Go

```bash
sudo apt update
sudo apt install golang-go
```

> Verifique a instalação com:

```bash
go version
```

### ▶️ Compilar e Executar

```bash
go run estatisticas_numeros.go
```

Ou para compilar binário:

```bash
go build estatisticas_numeros.go
./estatisticas_numeros
```

---

## 🍎 macOS

### ✅ Instalar o Go via Homebrew

```bash
brew install go
```

> Verifique com:

```bash
go version
```

### ▶️ Compilar e Executar

```bash
go run estatisticas_numeros.go
```

Ou:

```bash
go build estatisticas_numeros.go
./estatisticas_numeros
```

---

## 🪟 Windows

### ✅ Instalar o Go

1. Acesse: https://go.dev/dl/
2. Baixe o instalador `.msi` para Windows
3. Siga os passos e finalize a instalação
4. Reinicie o terminal e teste com:

```cmd
go version
```

### ▶️ Compilar e Executar

```cmd
go run estatisticas_numeros.go
```

Ou:

```cmd
go build estatisticas_numeros.go
estatisticas_numeros.exe
```

---

## ✍️ Teste rápido

Crie um arquivo `ola.go` com:

```go
package main
import "fmt"
func main() {
    fmt.Println("Olá, Go Lang!")
}
```

Execute com:

```bash
go run ola.go
```

---

## ✍️ Autor

Arquivo gerado por Professor Marco Maddo  
🔗 Canal no YouTube: [Marco Maddo](https://www.youtube.com/@marcomaddo)  
📘 Curso: Algoritmos em Go, Java, Kotlin, Python, Pascal  
🧠 Repositório: https://github.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal
