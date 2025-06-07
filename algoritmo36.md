# Aprenda algoritmos com o Professor Marco Maddo

## 🧠 Situação Problema: Exibição da Data e Hora do Sistema

Neste trigésimo sexto exercício, o programa deve:

- Capturar a **data e hora atual do sistema**.
- Exibir a data nos seguintes formatos:
  - `DD/MM/AAAA`
  - `Dia MêsPorExtenso Ano – HH:MM`

---

### 🕒 Versão 1: Calendário Digital Básico
> 📆 *Crie um programa que leia a data e hora atual e as mostre nos formatos padrão e por extenso.*

---

### 🧾 Versão 2: Apresentação Estilizada do Relógio
> 🕰️ *Implemente um código que exiba a data com mês por extenso e hora com minutos, como um painel de relógio digital.*

---

### 🔢 Versão 3: Interface de Calendário Amigável
> 💡 *Mostre ao usuário a data no formato brasileiro e a hora atual com clareza e estilo.*

---

## 💬 Portugol (pseudocódigo padrão)

> ⚠️ Portugol Studio não possui suporte nativo a data/hora do sistema. Recomendamos simulação manual com variáveis.

```portugol
algoritmo "exibe_data_hora"
var
   dia, mes, ano, hora, minuto: inteiro
inicio
   // Simulação da data/hora
   dia <- 10
   mes <- 6
   ano <- 2025
   hora <- 14
   minuto <- 30

   escreval("Data: ", dia, "/", mes, "/", ano)
   escreval("Data por extenso: ", dia, " de junho de ", ano, " – ", hora, ":", minuto)
fimalgoritmo
```

---

## ☕ Implementação em Java

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataHoraSistema {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy – HH:mm", new Locale("pt", "BR"));

        System.out.println("Data padrão: " + agora.format(formato1));
        System.out.println("Data por extenso: " + agora.format(formato2));
    }
}
```

---

## 💙 Implementação em Kotlin

```kotlin
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

fun main() {
    val agora = LocalDateTime.now()
    val formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val formato2 = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy – HH:mm", Locale("pt", "BR"))

    println("Data padrão: ${agora.format(formato1)}")
    println("Data por extenso: ${agora.format(formato2)}")
}
```

---

## 🐍 Implementação em Python

```python
from datetime import datetime
import locale

locale.setlocale(locale.LC_TIME, 'pt_BR.UTF-8')  # Pode precisar de configuração local

agora = datetime.now()
print("Data padrão:", agora.strftime("%d/%m/%Y"))
print("Data por extenso:", agora.strftime("%d de %B de %Y – %H:%M"))
```

---

## 🧙 Implementação em Pascal

> ⚠️ Pascal puro não possui suporte extenso a datas localizadas, mas pode ser feito parcialmente:

```pascal
program DataHoraSistema;
uses SysUtils;
begin
  writeln('Data padrão: ', FormatDateTime('dd/mm/yyyy', Now));
  writeln('Data e hora: ', FormatDateTime('dd "de" mmmm "de" yyyy – hh:nn', Now));
end.
```

---

## 🌐 Redes do Professor Marco Maddo

- YouTube: [Professor Marco Maddo](https://www.youtube.com/@ProfessorMarcoMaddo)
- LinkedIn: [Marco Maddo](https://www.linkedin.com/in/marcomaddo/)
- GitHub: [@profmaddo](https://github.com/profmaddo)
- GitLab: [@profmaddo](https://gitlab.com/profmaddo)
- Udemy: [Cursos Marco Maddo](https://www.udemy.com/user/marcomaddo/)

---

## 🚀 Acesse também:

- 🌐 Site oficial do professor: [www.marcomaddo.com.br](https://www.marcomaddo.com.br)
- 🧑‍💼 Empresa TSSTI Tecnologia: [www.tssti.com.br](https://www.tssti.com.br)

---
