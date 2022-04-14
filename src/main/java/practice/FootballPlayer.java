package practice;

import lombok.Data;

@Data
public class FootballPlayer extends Player{
    @Override
    void play() {
        System.out.println("play football");
    }

    private int exp;
    private int talent;
    private int rate;
}
