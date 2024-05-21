import audio.modelo.MinhasPreferidas;
import audio.modelo.Musica;
import audio.modelo.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Saturn - Sleeping At Last");
        minhaMusica.setCantor("Ryan");

        for (int i = 0; i < 3000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Fala, Fred!");
        meuPodcast.setApresentador("Freed");

        for (int i = 0; i < 4000 ; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 5000; i++) {
            meuPodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}