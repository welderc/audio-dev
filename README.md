<h1>Gerenciador de Áudio</h1>

<h2>:thinking: Sobre</h2>
<p>Este projeto é um gerenciador de áudio em Java que permite organizar e gerenciar músicas e podcasts de forma intuitiva. O projeto utiliza a Programação Orientada a Objetos (POO) para modelar os diferentes tipos de áudios e suas características. Ele foi desenvolvido com base no aprendizado do curso "Java: aplicando a Orientação a Objetos" da Alura, que me proporcionou as ferramentas e os conhecimentos necessários para criar um sistema estruturado e eficiente.</p>

**Funcionalidades:**

* **Gerenciamento de Músicas:**
    * Adicionar novas músicas com informações como título, artista, álbum, gênero e descrição.
    * Reproduzir músicas.
    * Curtir músicas.
    * Visualizar informações detalhadas sobre cada música.
* **Gerenciamento de Podcasts:**
    * Adicionar novos podcasts com informações como título, apresentador, descrição e episódios.
    * Reproduzir podcasts.
    * Curtir podcasts.
    * Visualizar informações detalhadas sobre cada podcast.
* **Listas de Preferidos:**
    * Criar listas de áudios favoritos, incluindo músicas e podcasts.
    * Visualizar a lista de preferidos.
    * Remover áudios da lista de preferidos.

**Principais Conceitos:**

* **Herança:** As classes `Musica` e `Podcast` herdam atributos e métodos da classe `Audio`, reutilizando código e definindo comportamentos específicos.
* **Polimorfismo:** Os métodos para reproduzir e curtir áudios são implementados nas subclasses `Musica` e `Podcast`, permitindo que diferentes tipos de áudio sejam tratados de forma uniforme.
* **Encapsulamento:** Os atributos das classes são privados, acessíveis apenas através de métodos públicos, garantindo a integridade e segurança dos dados.
* **Sobrescrita de Métodos (Override):** As classes `Musica` e `Podcast` sobrescrevem o método `getClassificacao()` da classe `Audio`, fornecendo implementações específicas para determinar a classificação de músicas e podcasts.

**Interface do Usuário:**

* **Telas de Detalhes:**
    * Exibe informações detalhadas sobre cada áudio (música ou podcast), incluindo atributos e informações adicionais.

**Exemplo de Interação:**

1. O aplicativo exibe uma lista de músicas, ou permite adicionar uma nova música.
1. O usuário escolhe uma música para reproduzir.
1. A música é reproduzida e o aplicativo mostra informações sobre ela.
1. O usuário pode curtir a música, adicionar à lista de preferidos e outras ações.

**Observações:**

* A interface do usuário pode ser customizada para atender às necessidades específicas do usuário.
* O projeto pode ser ampliado com novas funcionalidades, como a capacidade de organizar áudios em playlists, sincronizar com serviços de streaming de música, etc.

## :robot: Tecnologias

![Java](https://img.shields.io/badge/Java-ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)




