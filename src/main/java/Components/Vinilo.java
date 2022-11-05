package Components;

import Interfaces.Playable;

public class Vinilo extends SelectorDispositivo {


    public Vinilo(Playable song) {
        super(song);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("ON vinyl");
    }

    @Override
    public String getName() {
        return super.getName();
    }

}
