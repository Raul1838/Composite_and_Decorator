package Components;

import Interfaces.Playable;

public class Song implements Playable {
    private String songName;
    private String artistName;

    public Song(String songName, String artistName) {
        this.songName = songName;
        this.artistName = artistName;
    }


    @Override
    public void play() {
        System.out.println("Escuchando..." + songName + " BY " + artistName);
    }

    @Override
    public String getName() {
        return songName;
    }


}
