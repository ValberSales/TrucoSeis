# Truco Seis

## Descrição
O **Truco Seis** é um aplicativo Android desenvolvido para atuar como um contador de pontos prático e eficiente para partidas de truco. O objetivo principal é automatizar a marcação de pontos, permitindo que os jogadores acompanhem o placar da rodada e o histórico total de vitórias de forma simples.

Este aplicativo foi criado como **projeto avaliativo** na disciplina de **Programação para Dispositivos Móveis**, ministrada pelo professor **Robisom Cris Brito**.

## Funcionalidades
* **Contagem de Pontos Dinâmica**: Botões para incrementar o placar em +1, +3, +6, +9 e +12 pontos para ambas as equipes ("Nós" e "Eles").
* **Verificação de Vencedor**: O sistema identifica automaticamente quando uma equipe atinge ou ultrapassa 12 pontos, disparando um alerta visual (`Toast`) e registrando a vitória.
* **Histórico de Vitórias**: Uma tela dedicada para visualizar quantas partidas cada equipe venceu no total.
* **Gestão de Placar**: Opções para zerar tanto o placar atual quanto o histórico de vitórias acumulado.

## Tecnologias e Conceitos Utilizados
* **Kotlin**: Toda a lógica de controle e manipulação de dados foi escrita em Kotlin.
* **ConstraintLayout**: As interfaces das atividades (`activity_main.xml` e `activity_historico.xml`) utilizam o `ConstraintLayout` para garantir um posicionamento flexível e responsivo dos elementos visuais.
* **Recursos de String (`@string`)**: O projeto segue boas práticas de desenvolvimento Android, centralizando todos os textos e legendas no arquivo `strings.xml`. Isso facilita futuras traduções e a manutenção do código.
* **Intents**: Utilizados para a navegação entre telas e para a transferência de dados (como o número de vitórias) de uma Activity para outra.
* **Material Design 3**: Aplicação do tema Material 3 para proporcionar uma interface moderna e compatível com as diretrizes visuais atuais do Android.

## Pré-requisitos
* **Android SDK**: Mínimo de API 26 (Android 8.0).
* **Build System**: Gradle 9.3.1.
