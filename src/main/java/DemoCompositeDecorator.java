import Components.MP4;
import Components.PlayList;
import Components.Song;
import Components.Vinilo;

public class DemoCompositeDecorator {
    public static void main(String[] args) {
        PlayList sabinaPlayList = new PlayList("Sabina's hits");
        sabinaPlayList.add(new Vinilo(new Song("Princesa", "Joaquín Sabina")));
        sabinaPlayList.add(new Song("Calle melancolía", "Joaquín Sabina"));

        // Make "Manolo García's hits" playlist and add 3 song to it
        PlayList garciaPlaylist = new PlayList("Manolo Garcia's hits");
        garciaPlaylist.add(new MP4(new Song("Pájaros de barro", "Manolo García")));

        // Make "my songs" playlist; add the two playlists and one single song
        PlayList mySongs = new PlayList("My Songs");
        mySongs.add(sabinaPlayList);
        mySongs.add(garciaPlaylist);

        // Play all songs of each playlist
        mySongs.play();

    }
}
