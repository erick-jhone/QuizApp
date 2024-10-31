# QuizApp

**QuizApp** é um aplicativo Android desenvolvido para testar conhecimentos em diferentes áreas como Esportes, Tecnologia e Filmes. Este projeto foi criado utilizando Android SDK e segue um padrão modularizado para facilitar a manutenção e extensão.

## Funcionalidades

- **Quiz de Esportes:** Teste seus conhecimentos sobre eventos e figuras esportivas históricas.
- **Quiz de Tecnologia:** Avalie seu entendimento sobre inovações tecnológicas e marcos históricos.
- **Quiz de Filmes:** Desafie-se com perguntas sobre diretores famosos, filmes icônicos e séries populares.
- **Pontuação:** Calcule e exiba a pontuação final após a conclusão de cada quiz.
- **Feedback Imediato:** Receba feedback imediato sobre suas respostas, indicando acertos e erros.
- **Navegação Intuitiva:** Interface de usuário simples e limpa com navegação fácil entre as atividades.

## Estrutura do Projeto

O projeto é dividido em várias atividades e utilitários:

- **Activities:**
  - `SportActivity`: Gerencia o quiz de esportes.
  - `TechActivity`: Gerencia o quiz de tecnologia.
  - `MovieActivity`: Gerencia o quiz de filmes.
  - `ScoreActivity`: Exibe a pontuação final do usuário.

- **Utils:**
  - `CorrectAnswersKeys`: Armazena as respostas corretas para todas as perguntas.
  - `QuizUtils`: Fornece métodos utilitários para verificar respostas e desabilitar grupos de rádio.
  - `NavigationUtils`: Facilita a navegação entre atividades, padronizando as chaves de navegação e criando métodos reutilizáveis.
  - `AppFeedBackUI`: Utilitário de feedbacks na tela que possam ser reaproveitados, como Toasts padrões. 

## Layouts

Cada atividade possui um layout específico, projetado para ser responsivo e acessível em dispositivos de diferentes tamanhos. Todos os layouts utilizam `ScrollView` para garantir que o conteúdo seja rolável em telas menores.

## Como Executar o Projeto

### Pré-requisitos

- Android Studio instalado
- Android SDK configurado

### Clonar o Repositório

```bash
git clone https://github.com/seu-usuario/quizapp.git
```

### Importar o Projeto no Android Studio

1. Abra o Android Studio.
2. Selecione "Open an existing Android Studio project".
3. Navegue até o diretório do projeto clonado e selecione-o.

### Executar o Aplicativo

1. Conecte um dispositivo Android ou inicie um emulador.
2. Clique em "Run" no Android Studio para compilar e executar o aplicativo.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests para melhorias e novas funcionalidades.


## Contato

Para mais informações, entre em contato com [erickjh.dev@gmail.com](mailto:erickjh.dev@gmail.com).
