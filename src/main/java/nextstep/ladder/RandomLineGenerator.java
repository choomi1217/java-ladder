package nextstep.ladder;

import java.util.Random;

public class RandomLineGenerator {
    private final Random random = new Random();

    private RandomLineGenerator() {}

    public static RandomLineGenerator getInstance() {
        return RandomLineGeneratorHolder.INSTANCE;
    }

    public Boolean randomLine(){
        return random.nextBoolean();
    }


    private static class RandomLineGeneratorHolder{
        private static final RandomLineGenerator INSTANCE = new RandomLineGenerator();
    }
}
