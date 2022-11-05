package Components;

import Interfaces.Playable;

public class MP4 extends SelectorDispositivo {


    public MP4(Playable song) {
        super(song);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("ON MP4");
    }

    @Override
    public String getName() {
        return super.getName();
    }


}
