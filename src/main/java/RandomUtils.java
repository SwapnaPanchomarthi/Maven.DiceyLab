import java.util.Random;

public class RandomUtils {
    private static final Random random = new Random();

    public static Double createDouble(Integer min, Integer max) {
        return random.nextDouble() * (max - min) + min;
    }

    public static Integer createInteger(Integer min, Integer max) {
        return createDouble(min, max).intValue();
    }

    public static Character createCharacter(char min, char max) {
        return (char) createInteger((int) min, (int) max).intValue();
    }
}