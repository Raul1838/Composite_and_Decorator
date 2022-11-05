package Components;

import Interfaces.Playable;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements Playable {
    private String name;
    private final List<Playable> songs = new ArrayList<>();


    public PlayList(String name) {
        this.name = name;
    }

    public void add(Playable playable) {
        songs.add(playable);
    }


    @Override
    public void play() {
        for (Playable song : songs) {
            System.out.println("-----" + name + "-----");
            song.play();
        }
    }

    @Override
    public String getName() {
        return name;
    }


    public void remove(Playable song) {
        songs.remove(song);
    }
}
