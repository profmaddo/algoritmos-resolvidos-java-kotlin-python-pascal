# Guia de Instalação e Execução de Algoritmos em Dart no Terminal

Este guia mostra como instalar o **Dart SDK** e executar programas Dart via **terminal**, ideal para estudar **algoritmos** em macOS, Linux ou Windows.

---

## ✅ Por que usar **Dart** e não **Flutter**?

| Recurso                      | Dart CLI (terminal)              | Flutter SDK (UI)                 |
|-----------------------------|----------------------------------|----------------------------------|
| ✅ Foco                     | Algoritmos, scripts, terminal    | Interfaces gráficas (apps)      |
| 📦 Tamanho                  | Leve (~200 MB)                   | Pesado (>1 GB)                  |
| 🧩 Dependências             | Nenhuma                          | Android SDK, CocoaPods, etc.     |
| ⚡ Velocidade para aprender | Alta (executa direto no terminal)| Baixa (depende de projeto Flutter) |
| 🧪 Execução simples         | `dart run arquivo.dart`          | `flutter run` precisa de projeto |

🧠 **Para aprender algoritmos no terminal, Dart puro é a melhor escolha.**

---

## 📦 Instalar Dart

### 🍎 macOS (via Homebrew)

```bash
brew tap dart-lang/dart
brew install dart
```

### 🐧 Linux (Debian/Ubuntu)

```bash
sudo apt update
sudo apt install apt-transport-https
sudo sh -c 'wget -qO- https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add -'
sudo sh -c 'wget -qO- https://storage.googleapis.com/download.dartlang.org/linux/debian/dart_stable.list > /etc/apt/sources.list.d/dart_stable.list'
sudo apt update
sudo apt install dart
```

### 🪟 Windows

1. Acesse: https://dart.dev/get-dart
2. Baixe o instalador `.exe`
3. Siga o assistente e finalize a instalação

---

## ✅ Verifique a instalação

```bash
dart --version
```

---

## ▶️ Como executar o programa

### 1. Salve o código como:

```bash
estatisticas_numeros.dart
```

### 2. Execute diretamente:

```bash
dart run estatisticas_numeros.dart
```

---

## 📌 Dica Extra

Você pode redirecionar entradas com:

```bash
dart run estatisticas_numeros.dart < entradas.txt
```

---

## ✍️ Autor

Arquivo gerado por Professor Marco Maddo  
🔗 Canal no YouTube: [Marco Maddo](https://www.youtube.com/@marcomaddo)  
📘 Curso: Algoritmos em Dart, Go, Java, Python, Kotlin  
🧠 Repositório: https://github.com/profmaddo/algoritmos-resolvidos-java-kotlin-python-pascal
