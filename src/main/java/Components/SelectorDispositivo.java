package Components;

import Interfaces.Playable;

public abstract class SelectorDispositivo implements Playable {
    private Playable song;


    public SelectorDispositivo(Playable song) {
        this.song = song;
    }

    @Override
    public void play() {
        song.play();
    }

    @Override
    public String getName() {
        return song.getName();
    }

}
