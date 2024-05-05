package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        return new Ball(ColorSuplier.getRandomColor(), new Random().nextInt(100));
    }
}