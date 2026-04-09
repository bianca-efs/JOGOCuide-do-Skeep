 🦕 Skeep — O Jogo do Dinossauro

Skeep é um jogo de terminal em Java onde você cuida de um dinossauro chamado **Skeep**. Tome decisões sábias para mantê-lo vivo!

---

 Como Jogar

A cada rodada, as características do Skeep são exibidas na tela. Escolha uma ação digitando a letra correspondente:

| Tecla | Ação |
|-------|------|
| `P` | Pular |
| `C` | Correr |
| `M` | Comer |
| `A` | Cantar |
| `S` | Tomar Sol |
| `O` | Ficar na Sombra |

---

 Regras

Skeep morre se qualquer uma das condições abaixo ocorrer:

- ❤️ **Energia** chegar abaixo de `0`
- 💨 **Velocidade** chegar abaixo de `0`
- 🌡️ **Temperatura** chegar abaixo de `0`
- 🔥 **Temperatura** passar de `100`

---

 Características do Skeep

| Atributo | Descrição |
|----------|-----------|
| `energia` | Nível de energia do dinossauro |
| `velocidade` | Velocidade atual |
| `temperatura` | Temperatura corporal |
| `humor` | Estado emocional |

---

  Estrutura do Projeto

```
skeep/
├── Dinossauro.java   # Classe com atributos e comportamentos do Skeep
└── Main.java        # Classe principal com o menu e loop do jogo
```
---

Conceitos Aplicados

- Orientação a Objetos (Classes e Objetos)
- Encapsulamento (atributos `private` com getters e setters)
- Herança (base para extensão futura)
- Estruturas de controle (`while`, `switch`)
- Leitura de entrada do usuário com `Scanner`

---

Melhorias Futuras

- [ ] Adicionar nível de dificuldade
- [ ] Sistema de pontuação
- [ ] Mais tipos de dinossauros
- [ ] Interface gráfica

---

Feito com Java.
