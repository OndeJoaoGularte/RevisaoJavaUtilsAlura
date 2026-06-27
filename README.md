# 🧰 Revisão de (alguns) Utilitários em Java

![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-success)

Este repositório contém uma série de scripts desenvolvidos para revisar e fixar os conceitos fundamentais de (alguns) utilitários essenciais e APIs nativas do Java. Cada arquivo foca em um utilitário específico com o objetivo de aprofundar o conhecimento na manipulação de tempo, estruturas de dados avançadas e no processamento funcional de coleções.

---

## 🗂️ Arquivos e Conteúdos

* **`RevisaoData.java`**: Focado no domínio da `java.time` (Data/Time API). 
  * Manipulação de datas e horas atuais (`LocalDate`, `LocalTime`).
  * Formatação customizada com `DateTimeFormatter`.
  * Operações matemáticas de tempo (adição/subtração de dias e meses, cálculo de `Duration`).
  * Trabalhando com fusos horários globais utilizando `ZonedDateTime` e `ZoneId`.
  * Casos práticos: controle de expediente (horas extras), prazos de entrega e lembretes de vencimento.

* **`RevisaoCollections.java`**: Focado no *Java Collections Framework* (`java.util`) e no processamento de dados com a **Stream API**.
  * **Estruturas de Dados:** Uso de listas dinâmicas (`ArrayList`), conjuntos com elementos únicos (`HashSet`) e mapeamento de chave-valor (`HashMap`).
  * **Stream API:** Operações encadeadas para manipulação funcional de dados utilizando `.filter()` (seleção), `.map()` (transformação) e `.reduce()` (agregação/soma).
  * **Estatísticas:** Uso avançado de `DoubleSummaryStatistics` para extrair métricas automáticas (média, valor mínimo e máximo) de uma coleção de valores.

---

## 🛠️ Tecnologias Utilizadas

* **Java (JDK 25)**
* **IntelliJ IDEA**
