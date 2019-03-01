import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {
    Dice dice = new Dice();
    @Test
    public void roll() {

       dice.roll(3);
//        System.out.println(dice.getDie1());
//        System.out.println(dice.getDie2());

    }

    @Test
    public void getDie1() {
        dice.roll(2);
  //  System.out.println(dice.getDie1());
    }

    @Test
    public void getDie2() {
        dice.roll(3);
//        System.out.println(dice.getDie1());
    }

    @Test
    public void total() {
        dice.roll(3);
        System.out.println(dice.getDie1());
        System.out.println(dice.getDie2());
        System.out.println(dice.getTotal());
    }
}